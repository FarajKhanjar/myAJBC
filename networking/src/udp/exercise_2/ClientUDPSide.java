package udp.exercise_2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientUDPSide 
{
	protected Scanner scanner;
	private final static int INPUT_BUFFER_SIZE = 1024;

	private int clientPort;
	private static String serverName;
	private static int serverPort;

	private static DatagramSocket clientSocket;
	protected static String dataToSend;
	protected static String serverMsg;

	public ClientUDPSide(int clientPort, String serverName, int serverPort) 
	{
		this.clientPort = clientPort;
		this.serverName = serverName;
		this.serverPort = serverPort;

		scanner = new Scanner(System.in);
		clientSocket = null;
		dataToSend = null;
	}

	public void runClient() 
	{
		try {
			// creating client socket
			clientSocket = new DatagramSocket(clientPort);
			System.out.println("[Client] started on port " + clientPort);

			System.out.print("Welcome to our Forecast weather system\n");
			do {
				System.out.print("Please enter your city: ");
				inputForecast();	
				
			} while (!Character.isLetter(serverMsg.charAt(0)));
			
			inputForecast();
			
		} catch (SocketException e) {
			System.err.println("[Client] socket creation failed.");
			e.printStackTrace();
		} catch (UnknownHostException e) {
			System.err.println("[Server] address could not be found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("[Client] failed to send data.");
			e.printStackTrace();
		} finally {
			System.out.println("[Client] disconnected from system.");
			scanner.close();
			if (clientSocket != null) {
				clientSocket.close();
			}
		}
	}

	private void inputForecast() throws IOException 
	{
		dataToSend = scanner.nextLine();
		sendData();
		receiveData();
		System.out.println("[Server] response: " + serverMsg);

	}

	public static void sendData() throws IOException 
	{
		// creating datagram
		byte[] messageBytes = dataToSend.getBytes();
		DatagramPacket packetToSend = new DatagramPacket(messageBytes, messageBytes.length,
				InetAddress.getByName(serverName), serverPort);

		// send packet
		clientSocket.send(packetToSend);
	}

	public static void receiveData() throws IOException 
	{
		// prepare packet for receiving data from server
		byte[] buffer = new byte[INPUT_BUFFER_SIZE];
		DatagramPacket receivedPacket = new DatagramPacket(buffer, INPUT_BUFFER_SIZE);

		// receive data from server
		clientSocket.receive(receivedPacket);

		// extract message from packet
		serverMsg = new String(receivedPacket.getData(), receivedPacket.getOffset(), receivedPacket.getLength()).trim();
	}

	public static void main(String[] args) {
		int clientPort = 5551;
		String serverName = "localhost";
		int serverPort = 5555;
		ClientUDPSide client = new ClientUDPSide(clientPort, serverName, serverPort);
		client.runClient();
	}
}
