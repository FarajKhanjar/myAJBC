package networking.udp.exercise_2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.time.LocalDateTime;

public class ServerUDPSide 
{
	protected final static int INPUT_BUFFER_SIZE = 1024;
	protected int serverPort;
	protected static int clientPort;
	protected static String clientMsg;

	protected static DatagramSocket serverSocket;
	protected static InetAddress clientAddress;

	protected static SystemDataBase serviceDataBase;
	protected static String respondMsg;
	
	protected WeatherSystem weatherSystem;


	public ServerUDPSide(int port) 
	{
		this.serverPort = port;
		serviceDataBase = new SystemDataBase();
		serviceDataBase.dataBase();
		weatherSystem = new WeatherSystem();
	}

	public void runServer() 
	{
		try {
			serverSocket = new DatagramSocket(serverPort);
			System.out.println("[Server] started on port " + serverPort);
			System.out.println("[Server] waiting for incoming messages on port " + serverPort);

			// listening to clients
			while (true) 
			{
				receiveData();
				// print client msg from server.
				System.out.println("[Client] " + clientAddress + " sent: " + clientMsg);
				
				//run our system to check Forecast
				weatherSystem.runSystem();
				
				System.out.println("[Server] response sent to [Client] at: {"+LocalDateTime.now()+"}");
			}

		} catch (SocketException e) {
			System.err.println("[Server] connection failed");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[Server] failed to connect with client");
			e.printStackTrace();
		}
	}

	public static void receiveData() throws IOException 
	{
		// renew info buffer
		byte[] inputBuffer = new byte[INPUT_BUFFER_SIZE];
		DatagramPacket recievedPacket = new DatagramPacket(inputBuffer, INPUT_BUFFER_SIZE);

		//Extract received packet data - wait for incoming packets
		serverSocket.receive(recievedPacket);

		// get client address info & message
		clientAddress = recievedPacket.getAddress();
		clientPort = recievedPacket.getPort();
		clientMsg = new String(recievedPacket.getData()).trim();
	}

	public static void sendData() throws IOException 
	{
		// prepare packet for sending
		byte[] myBytes = respondMsg.getBytes();
		DatagramPacket packetToSend = new DatagramPacket(myBytes, myBytes.length, clientAddress, clientPort);

		//send response/packet back to the client
		serverSocket.send(packetToSend);
	}

	public static void main(String[] args) 
	{
		int serverPort = 5555;
		ServerUDPSide server = new ServerUDPSide(serverPort);
		server.runServer();
	}
}
