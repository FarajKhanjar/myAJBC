package networking_multi.expensesApp_exercise_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiUserTrackingApp implements Runnable 
{
	private final int ID;
	private Map<Category, Double> expenses;
	private CountDownLatch latch;
	private static Random random = new Random();

	private final static String SERVER_NAME = "localhost";
	private final static int SERVER_PORT = 8080;

	public MultiUserTrackingApp(int id, CountDownLatch latch) 
	{
		ID = id;
		this.latch = latch;
		basicExpensesData();
	}

	private void basicExpensesData() 
	{
		expenses = new HashMap<>();

		for (Category category : Category.values()) 
		{
			expenses.put(category, 0.0);
		}
	}

	@Override
	public void run() 
	{
		int index = random.nextInt(Category.getSize());
		Category category = Category.getValue(index);
		double amount = random.nextDouble(10, 1000);

		try {
			latch.countDown();
			latch.await();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		try (Socket clientSocket = new Socket(SERVER_NAME, SERVER_PORT);
				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
				BufferedReader bufferReader = new BufferedReader(
						new InputStreamReader(clientSocket.getInputStream()));) {

			System.out.println("[User] %d Connected to [Server]".formatted(ID));

			writer.println("%d;%s;%f".formatted(ID, category, amount));

			String toUpdateMap = bufferReader.readLine();
			if (toUpdateMap.equals("true")) {
				expenses.put(category, amount + expenses.get(category));
			
				//lock
				synchronized (latch) 
				{
					System.out.println("\n[User] " + ID + " :");
					expenses.forEach((key, val) -> System.out.println("%s : %.2f NIS".formatted(key, val)));
				}
			} else {
				System.out.println("[User] " + ID + " : The oparation failed");
			}

		} catch (UnknownHostException e) {
			System.err.println("[Server] is not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Socket failed");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException 
	{
		final int NUM_USERS = 1000;
		final int NUM_CALLS = 100;
		
		int id;
		List<MultiUserTrackingApp> users =new ArrayList<>(NUM_USERS);
		CountDownLatch latch = new CountDownLatch(NUM_CALLS);
		
		for (int i = 0; i < NUM_CALLS; i++) 
		{
			id = random.nextInt(NUM_USERS);
			users.add(new MultiUserTrackingApp(id, latch));
		}
		
		ExecutorService executorService = Executors.newFixedThreadPool(NUM_CALLS);
		
		users.forEach(user -> executorService.execute(user));
		executorService.shutdown();
		executorService.awaitTermination(20, TimeUnit.SECONDS);
	}
}