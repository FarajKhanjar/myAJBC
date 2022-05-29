package networking_multi.expensesApp_exercise_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;


public class Server{
private final static int PORT = 8080;
	
	public static void main(String[] args) throws IOException {
	
		ServerSocket serverSocket = null;
		BufferedReader bufferReader = null;
		PrintWriter writer = null;
		try {
		
			//start server
			serverSocket = new ServerSocket(PORT);
			System.out.println("[App Server] started on port "+ PORT);
		
			while(true) {
				// 3 way handshake
				Socket clientSocket = serverSocket.accept();
				System.out.println("[User] is connected "+clientSocket.getInetAddress()+" port "+clientSocket.getPort());
				
				//create reader
				bufferReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				
				//reading data
				String line = bufferReader.readLine();
				System.out.println("[User] says: "+line);
				//processing data simulation
				processData();
				//sending data
				writer = new PrintWriter(clientSocket.getOutputStream(), true);
				writer.println("processing result done after ");
			}
		
		
		
		} catch (IOException e) {
			System.err.println("Failed to start server on port "+PORT);
			e.printStackTrace();
		}finally {
			if(serverSocket != null)
				serverSocket.close();
			if(bufferReader != null)
			bufferReader.close();
		}
		
		
		
	}

	private static void processData() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
