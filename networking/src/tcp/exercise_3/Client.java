package tcp.exercise_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

public class Client 
{
	private String serverName;
	private int serverPort;
	private Socket clientSocket = null;
	private PrintWriter writer = null;
	private BufferedReader bufferReader = null;
	private TrackingDevice device;
	private float longitude = 0;
	private float altitude = 0;

	public Client(String serverName, int serverPort) 
	{
		this.serverName = serverName;
		this.serverPort = serverPort;
		device = new TrackingDevice();
	}

	public void run() throws IOException 
	{
		try 
		{
			clientSocket = new Socket(serverName, serverPort);
			writer = new PrintWriter(clientSocket.getOutputStream(), true);
			bufferReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			System.out.println("[Client] is Connected to [Server]");

			while (true) 
			{
				longitude += 0.5f;
				altitude -= 0.5f;
				device.updateLocation(longitude, altitude, LocalDateTime.now());
				writer.println(device.toString());
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			System.err.println("[Server] is not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Socket failed");
			e.printStackTrace();
		} 
		finally 
		{
			if (clientSocket != null) {
				clientSocket.close();
			}
			if (writer != null) {
				writer.close();
			}
			if (bufferReader != null) {
				bufferReader.close();
			}
		}
	}

	public static void main(String[] args) throws IOException 
	{
		String serverName = "localHost";
		int serverPort = 8080;
		Client client = new Client(serverName, serverPort);
		client.run();
	}
}