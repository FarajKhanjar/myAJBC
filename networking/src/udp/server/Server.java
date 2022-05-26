package udp.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * This is an implementation of a UDP server
 */
public class Server 
{
	private static final int INPUT_BUFFER_SIZE = 1024;
	private static final int OUTPUT_BUFFER_SIZE = 1024;
	
	public static void main(String[] args)
	{
		int serverPort = 4444;
		try {
			DatagramSocket serverSocket = new DatagramSocket(serverPort);
			System.out.println("Server started on port "+serverPort);
			
			//handle data
			System.out.println("[Server] Waiting for incoming messages on port " + serverPort + " ...");
			
			while(true) 
			{
				//renew info buffer
				byte[] receiveDataBuffer = new byte[INPUT_BUFFER_SIZE];
				DatagramPacket receivedPacket = new DatagramPacket(receiveDataBuffer , INPUT_BUFFER_SIZE);
				
				// wait for incoming packets
				serverSocket.receive(receivedPacket);
				// Extract received packet data
				//get client address info
				InetAddress clientIPAddress = receivedPacket.getAddress();
				int clientPort = receivedPacket.getPort();
				//get clientMsg
				//.trim() = without spaces/zeros.
				String clientMsg = new String(receivedPacket.getData()).trim();
				//print client msg from 
				System.out.println("[Client] Received data from " + clientIPAddress + "sent: "+clientMsg);
				
				// send response/packet back to the client
				byte[] myBytesSendData = clientMsg.getBytes();

				DatagramPacket packetToSend = new DatagramPacket(myBytesSendData, myBytesSendData.length, clientIPAddress, clientPort);
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

}
