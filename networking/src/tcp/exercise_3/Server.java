package tcp.exercise_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * This is an implementation of a TCP server
 */
public class Server 
{
	private final int PORT;
	private Map<Long, List<Location>> dataBase;

	private ServerSocket serverSocket = null;
	private BufferedReader bufferReader = null;
	private PrintWriter writer = null;

	public Server(int port) 
	{
		PORT = port;
		dataBase = new HashMap<>();
	}

	public void run() throws IOException 
	{
		try 
		{
			// start server
			serverSocket = new ServerSocket(PORT);
			System.out.println("[Server] started on port " + PORT);

			while (true) 
			{
				// 3 way handshake
				Socket clientSocket = serverSocket.accept();
				System.out.println(
						"[Client] is connected " + clientSocket.getInetAddress() + " port " + clientSocket.getPort());

				// create reader
				bufferReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

				while (true) 
				{
					String line = bufferReader.readLine();
					recieveData(line);
					System.out.println("[Client] says: " + line);
				}
			}
		} catch (IOException e) 
		{
			System.err.println("Failed to start server on port " + PORT);
//			e.printStackTrace();
		
			
			dataBase.forEach((id, list) -> {
				System.out.println("Trcaking device ID: " + id);
				list.forEach(System.out::println);
			});
		} 
		finally 
		{
			if (serverSocket != null) {
				serverSocket.close();
			}
			if (bufferReader != null) {
				bufferReader.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
	}

	private void recieveData(String line) 
	{
		String[] dataValues = line.split(" ");
		Location location = new Location(Float.valueOf(dataValues[1]), Float.valueOf(dataValues[2]),
				LocalDateTime.parse(dataValues[3]));
		long id = Long.valueOf(dataValues[0]);

		if (dataBase.containsKey(id)) {
			dataBase.get(id).add(location);
		} else {
			List<Location> locations = new LinkedList<>();
			locations.add(location);
			dataBase.put(id, locations);
		}
	}

	public static void main(String[] args) throws IOException 
	{
		int serverPort = 8080;
		Server server = new Server(serverPort);
		server.run();
	}
}