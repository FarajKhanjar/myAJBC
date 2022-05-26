package tcp.exercise_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import networking.udp.server_client.template.ClientSide;

public class Client 
{
	private static String serverName;
	private static int serverPort;

	private Socket clientSocket = null;
	private PrintWriter writer = null;
	private BufferedReader bufferReader = null;

	public Client(String serverName, int serverPort) 
	{
		this.serverName = serverName;
		this.serverPort = serverPort;

		this.clientSocket = null;
		this.writer = null;
		this.bufferReader = null;
	}

	public void run() throws IOException 
	{
		try {
			clientSocket = new Socket(serverName, serverPort);
			System.out.println("Connected to [Server]");

			// sending data
			writer = new PrintWriter(clientSocket.getOutputStream(), true);
			writer.println("Hello from the other side");
			
			// create reader
			bufferReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			// reading
			String line = bufferReader.readLine();
			System.out.println("[Server] says: " + line);


		} catch (UnknownHostException e) {
			System.err.println("[Server] is not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Socket failed");
			e.printStackTrace();
		} 
		finally 
		{
			if (clientSocket != null) 
			{
				clientSocket.close();
			}
			if (writer != null) {
				writer.close();
			}
			if (bufferReader != null) 
			{
				bufferReader.close();
			}
		}
	}


	public static void main(String[] args) throws IOException {
		String serverName = "localHost";
		int serverPort = 8080;
		Client client = new Client(serverName, serverPort);
		client.run();
	}
}