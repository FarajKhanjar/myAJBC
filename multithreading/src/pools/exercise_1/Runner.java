package pools.exercise_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;

public class Runner 
{
	private static final int CORE_THREADS = 2;
	private static final int MAX_POOL_SIZE = 4;
	private static final int KEEP_ALIVE_TIME = 1;
	private static final int CAPACITY = 3;
	private static final int FIRST_ID = 1;
	
	private static final BlockingQueue<Runnable> tasks = new ArrayBlockingQueue<>(CAPACITY);
	private static CallerRunsPolicy handler = new ThreadPoolExecutor.CallerRunsPolicy();
	private static Map<String, Integer> textCountMap = new HashMap<>();

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{
		ThreadPoolExecutor pool = new ThreadPoolExecutor(CORE_THREADS, MAX_POOL_SIZE,
				                                         KEEP_ALIVE_TIME, TimeUnit.SECONDS,          	                         tasks, handler);
		String line = "";

			FileReader file = new FileReader("myFiles/alice.txt");
			BufferedReader input = new BufferedReader(file);
			try {
				while ((line = input.readLine()) != null) 
				{
					String[] words = line.replaceAll("[:,-,?,!,.,`,;,',),(,--]", " ").split(" ");
					
					pool.execute(() -> {
						for (String word : words) 
						{
							if(word.isEmpty()) // word=" ";
								continue;
							
							if(!textCountMap.containsKey(word)) 
							{
								textCountMap.put(word, FIRST_ID);
							}
							else {
								if(textCountMap.get(word)==null)
									continue;
								textCountMap.put(word, FIRST_ID + textCountMap.get(word));
							}
						}
					});
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}

		pool.shutdown(); // gracefully shutdown

		pool.awaitTermination(30, TimeUnit.SECONDS);
		
		textCountMap.entrySet().stream().forEach((word) ->
		             System.out.println(word.getKey() + "\n           =>[" + word.getValue()+"]"));
	}

}