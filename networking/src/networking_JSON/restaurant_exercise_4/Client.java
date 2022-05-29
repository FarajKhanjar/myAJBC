package networking_JSON.restaurant_exercise_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import com.google.gson.Gson;

public class Client 
{
	private String serverName;
	private int serverPort;
	
	private Socket clientSocket = null;
	private PrintWriter writer = null;
	private BufferedReader bufferReader = null;
	
	private restaurantDataBase restaurantDB;

	public Client(String serverName, int serverPort) 
	{
		this.serverName = serverName;
		this.serverPort = serverPort;
		restaurantDB = new restaurantDataBase();		
	}

	public void run() throws IOException 
	{
		try 
		{
			clientSocket = new Socket(serverName, serverPort);
			writer = new PrintWriter(clientSocket.getOutputStream(), true);
			bufferReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			System.out.println("[Client] is Connected to [Server]");
			
			restaurantDB.run();
			
			for(Order order: restaurantDataBase.ordersList)
			{
				sendData(order);
				//System.out.println(order.toString());
				System.out.println(bufferReader.readLine());
			}
			
		} catch (UnknownHostException e) {
			System.err.println("[Server] is not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Socket failed");
			e.printStackTrace();
		} finally {
			if (clientSocket != null) {
				clientSocket.close();
			}
			if (writer != null) {
				writer.close();
			}
			if (bufferReader != null) {
				bufferReader.close();
			}
			System.out.println("Disconnected");
		}
	}
	
	private void sendData(Order order) throws IOException 
	{
		Gson gson = new Gson();
		String jsonOrder = gson.toJson(order,Order.class);
		
		writer = new PrintWriter(clientSocket.getOutputStream(), true);
		writer.println(jsonOrder);
	}
	
	public static void main(String[] args) throws IOException 
	{
		String serverName = "localHost";
		int serverPort = 8080;
		Client client = new Client(serverName, serverPort);
		client.run();
	}
}