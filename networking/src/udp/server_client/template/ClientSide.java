package networking.udp.server_client.template;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClientSide 
{
	private InetAddress localInetAddress;
	private InetAddress serverInetAddress;
	private String serverName;
	private int serverPort;
	private int clientPort;
	private Scanner sc;
	private DatagramSocket clientSocket = null;
	private final int INPUT_BUFFER_SIZE = 1024;
	
	public ClientSide(String serverName, int serverPort, int localPort) 
	{
		this.serverName = serverName;
		this.serverPort = serverPort;
		this.clientPort = localPort;

	}
	
	public void run()
	{
		try 
		{
			//creating client socket
			clientSocket = new DatagramSocket(clientPort);
			System.out.println("Client started on port "+clientPort);
			
			 sc = new Scanner(System.in);
			
			serverInetAddress = InetAddress.getByName(serverName);
			localInetAddress = InetAddress.getLocalHost();
			sendData();
			
		} catch (SocketException e) {
			System.out.println("Client socket creation failed");
			e.printStackTrace();
		} catch (UnknownHostException e) {
			System.out.println("Server address could not be found");
			e.printStackTrace();
		}	
	}
	
	
	public void sendData() 
	{
		try 
		{
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
			
		} 
		catch (IOException e) {
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

	
	public static void main(String[] args) throws SocketException, UnknownHostException
	{
		
		String serverName = "localHost";
		int serverPort = 55555;
		int localPort = 55554;
		ClientSide client = new ClientSide(serverName, serverPort, localPort);
		client.run();
	}
}