package networking_multi.expensesApp_exercise_5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExpensesTrackingServer 
{
	private static final int SERVER_PORT = 8080;
	private ExecutorService executorService;
	private Map<Integer, List<Expense>> dataBase;

	public ExpensesTrackingServer() 
	{
		executorService = Executors.newCachedThreadPool();
		dataBase = new HashMap<>();
	}

	public void run() throws InterruptedException 
	{
		try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT);) 
		{
			System.out.println("[Server] connected");

			ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(2);
			scheduledExecutor.scheduleAtFixedRate(() -> {
				System.out.println("\n");
				dataBase.forEach((id, expenses) -> {
					System.out.println("[User] " + id);
					expenses.forEach(System.out::println);
				});
				System.out.println("\n");
			}, 5, 10, TimeUnit.SECONDS);

			while (true) {
				Socket socket = serverSocket.accept();
				executorService.execute(new UserTask(socket, dataBase));
			}

		} catch (IOException e) {
			System.err.println("Failed to start [Server] on port " + SERVER_PORT);
			e.printStackTrace();
		} finally {
			executorService.shutdown();
			executorService.awaitTermination(2, TimeUnit.SECONDS);
		}
	}

	public static void main(String[] args) throws InterruptedException 
	{
		ExpensesTrackingServer server = new ExpensesTrackingServer();
		server.run();
	}
}
