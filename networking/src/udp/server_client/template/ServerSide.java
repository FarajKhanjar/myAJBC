package networking.udp.server_client.template;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * This is an implementation of a UDP server
 */
public class ServerSide 
{
	private int serverPort;
	private DatagramSocket serverSocket;
	private String clientMsg;
	private InetAddress clientAddress;
	int clientPort;
	private final static int INPUT_BUFFER_SIZE = 1024;

	public ServerSide(int serverPort) 
	{
		this.serverPort = serverPort;
	}

	public void run() 
	{
		try {
			serverSocket = new DatagramSocket(serverPort);
			System.out.println("[Server] started on port " + serverPort);
			System.out.println("[Server] is Waiting for incoming messages on port " + serverPort);

			// listening to clients
			while (true) 
			{
				receiveData();
				System.out.println("[Client] " + clientAddress + " sent: " + clientMsg);
				sendData();
				System.out.println("Server echo response sent");
			}

		} catch (SocketException e) {
			System.err.println("[Server connection failed]");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[Server failed to connect with client]");
			e.printStackTrace();
		}
	}

	public void receiveData() throws IOException 
	{
		// renew info buffer
		byte[] inputBuffer = new byte[INPUT_BUFFER_SIZE];
		DatagramPacket recievedPacket = new DatagramPacket(inputBuffer, INPUT_BUFFER_SIZE);

		// this is a blocking method
		// wait for incoming packets
		serverSocket.receive(recievedPacket);
		// Extract received packet data
		// get client address info
		clientAddress = recievedPacket.getAddress();
		clientPort = recievedPacket.getPort();

		// get client message
		clientMsg = new String(recievedPacket.getData()).trim();
	}

	public void sendData() throws IOException 
	{
		// prepare packet for sending
		// send response/packet back to the client
		byte[] myBytes = clientMsg.getBytes();
		DatagramPacket packetToSend = new DatagramPacket(myBytes, myBytes.length, clientAddress, clientPort);

		// send packet back to client
		serverSocket.send(packetToSend);
	}

	public static void main(String[] args) 
	{
		int serverPort = 55555;
		ServerSide server = new ServerSide(serverPort);
		server.run();
	}
}