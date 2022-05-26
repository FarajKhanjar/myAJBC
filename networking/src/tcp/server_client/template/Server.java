package tcp.server_client.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import udp.server_client.template.ServerSide;

public class Server {
	private final static int SERVICE_PORT = 8080;
	private static ServerSocket serverSocket;
	private static BufferedReader bufferReader;
	private static PrintWriter writer;
	private static Socket clientSocket;

	public Server() {
		this.serverSocket = null;
		this.bufferReader = null;
		this.writer = null;
	}

	public void run() 
	{
		try 
		{
			// start server
			serverSocket = new ServerSocket(SERVICE_PORT);
			System.out.println("[Server] started on part: " + SERVICE_PORT);

			while (true) 
			{
				// 3 way handshake7
				Socket clientSocket = serverSocket.accept();
				System.out.println("[Client] is connected " + clientSocket.getInetAddress() + " on port "
						+ clientSocket.getPort());

				// create reader
				InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
				bufferReader = new BufferedReader(isr);

				// reading data
				String line = bufferReader.readLine();
				System.out.println("[Client] says: " + line);

				writer = new PrintWriter(clientSocket.getOutputStream(), true);
				writer.println("I must have called a thousend times");

			}

		} catch (IOException e) {
			System.out.println("Failed to start server on port " + SERVICE_PORT);
		}
	}

	public static void main(String[] args) 
	{
		Server server = new Server();
		server.run();
	}
}