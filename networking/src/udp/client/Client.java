package networking.udp.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client 
{
	private static final int INPUT_BUFFER_SIZE = 1024;



	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String serverName = "localHost";
		int serverPort = 4444;
		int clientPort = 4445;
		DatagramSocket clientSocket = null ;
		
		try 
		{
			//creating client socket
			clientSocket = new DatagramSocket(clientPort);
			System.out.println("Client started on port "+clientPort);
			
			String dataToSend = null;
			do {
			
			//creating data
			System.out.println("Enter a message to send");
			dataToSend = sc.nextLine();
			
			//creating datagram
			byte[] msgBytes = dataToSend.getBytes();
			InetAddress localInetAddress = InetAddress.getByName(serverName);
			DatagramPacket packetToSend = new DatagramPacket(msgBytes, msgBytes.length, localInetAddress, serverPort);
			
			//send packet
			clientSocket.send(packetToSend);
			
			//prepare packet for receiving data
			byte[] buffer = new byte[INPUT_BUFFER_SIZE];
			DatagramPacket receivePacket = new DatagramPacket(buffer, INPUT_BUFFER_SIZE);
			
			//receive data from server
			clientSocket.receive(receivePacket);
			//extract msg from packet

			String serverMsg = new String(receivePacket.getData(),receivePacket.getOffset(),receivePacket.getLength()).trim();
			System.out.println("[SERVER] response: "+serverMsg);
			
			
			} while(!dataToSend.toLowerCase().equals("quit"));
			
		} catch (SocketException e) {
			System.out.println("Client socket creation failed");
			e.printStackTrace();
		} catch (UnknownHostException e) {
			System.out.println("Server address could not be found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Client failed to send datagram");
			e.printStackTrace();
		} 
		finally {
			System.out.println("Client disconnected");
			if(clientSocket!=null)
				clientSocket.close();	
			sc.close();
		}
	
	}

}
