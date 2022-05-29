package networking_JSON.restaurant_exercise_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.google.gson.Gson;

public class Server 
{
	private final int SERVER_PORT;

	private ServerSocket serverSocket = null;
	private BufferedReader bufferReader = null;
	private PrintWriter writer = null;

	public Server(int serverPort) 
	{
		SERVER_PORT = serverPort;
	}

	public void run() throws IOException 
	{
		try 
		{
			// start server
			serverSocket = new ServerSocket(SERVER_PORT);
			System.out.println("[Server] started on port " + SERVER_PORT);

			while (true) 
			{
				// 3 way handshake
				Socket clientSocket = serverSocket.accept();
				System.out.println(
						"[Client] is connected " + clientSocket.getInetAddress() + " port " + clientSocket.getPort());

				bufferReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				writer = new PrintWriter(clientSocket.getOutputStream(), true);

				recieveData(clientSocket);
			}
		} catch (IOException e) {
			System.err.println("Failed to start server on port " + SERVER_PORT);
			e.printStackTrace();
		} finally {

			if (serverSocket != null) {
				serverSocket.close();
			}
			if (bufferReader != null) {
				bufferReader.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
	}
	
	private void recieveData(Socket clientSocket) throws IOException
	{
		Gson gson = new Gson();

		while (!clientSocket.isClosed()) {
			String json = bufferReader.readLine();
			
			if(json == null) {
				clientSocket.close();
				continue;
			}
			
			Order order = gson.fromJson(json, Order.class);
			float price = restaurantDataBase.handleGetTotalPrice(order);
			writer.println("Total price of order: "+price+" NIS");
			System.out.println("[Server] Recieved: " + order);
		}
	}

	public static void main(String[] args) throws IOException 
	{
		int serverPort = 8080;
		Server server = new Server(serverPort);
		server.run();
	}
}
