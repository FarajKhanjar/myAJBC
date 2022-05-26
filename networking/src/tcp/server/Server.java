package tcp.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
	private final static int PORT = 8080;

	public static void main(String[] args) 
	{
		ServerSocket serverSocket = null;
		BufferedReader bufferReader = null;
		PrintWriter writer = null;
		try 
		{
			// start server
			serverSocket = new ServerSocket(PORT);
			System.out.println("[Server] started on part: " + PORT);

			while (true) 
			{
				// 3 way handshake7
				Socket clientSocket = serverSocket.accept();
				System.out.println("[Client] is connected " + clientSocket.getInetAddress() + " on port "
						+ clientSocket.getPort());

				// create reader
				InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
				bufferReader = new BufferedReader(isr);
				System.out.println("Connection accepted");

				// reading data
				String line = bufferReader.readLine();
				System.out.println("[Client] says: "+line);

				writer = new PrintWriter(clientSocket.getOutputStream(), true);
				writer.println("I must have called a thousend times");
			}
		} catch (IOException e) {
			System.out.println("Failed to start server on port " + PORT);
		}
	}
}