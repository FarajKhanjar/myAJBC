package udp.server_client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServerSide 
{
	private static final int INPUT_BUFFER_SIZE = 1024;
	private static final int OUTPUT_BUFFER_SIZE = 1024;
	private DatagramSocket serverSocket;
	private int serverPort;

	public ServerSide(int serverPort) 
	{
		this.serverPort = serverPort;
		try 
		{
			serverSocket = new DatagramSocket(serverPort);
			System.out.println("[UDP Server] Server started on port " + serverPort);
		} catch (SocketException e) {
			System.out.println("Server socket creation failed");
			e.printStackTrace();
		}

	}

	public void echoData() 
	{
		//handle data
		System.out.println("[Server] Waiting for incoming messages on port " + serverPort + " ...");
		
		try 
		{
			while (true) 
			{
				// renew info buffer
				byte[] receiveDataBuffer = new byte[INPUT_BUFFER_SIZE];
				DatagramPacket receivedPacket = new DatagramPacket(receiveDataBuffer, INPUT_BUFFER_SIZE);

				// wait for incoming packets
				serverSocket.receive(receivedPacket);
				// Extract received packet data
				// get client address info
				InetAddress clientIPAddress = receivedPacket.getAddress();
				int clientPort = receivedPacket.getPort();
				// get clientMsg
				// .trim() = without spaces/zeros.
				String clientMsg = new String(receivedPacket.getData()).trim();
				// print client msg from
				System.out.println("[Client] Received data from " + clientIPAddress + "sent: " + clientMsg);

				// send response/packet back to the client
				byte[] myBytesSendData = clientMsg.getBytes();

				DatagramPacket packetToSend = new DatagramPacket(myBytesSendData, myBytesSendData.length,
						clientIPAddress, clientPort);
				serverSocket.send(packetToSend);
				System.out.println("Server echo response sent");
			}

		} catch (SocketException e) {
			System.err.println("Server Connection failed");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Server failed to connect with client");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
		int serverPort = 55555;
		ServerSide server = new ServerSide(serverPort);
		server.echoData();
	}

}
