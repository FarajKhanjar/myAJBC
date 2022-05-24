package pools.exercise_4;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Runner 
{
	private static final String BASIC_WORD = "java";
	private static final int NUM_THREADS = 3;
	private static List<Future<Integer>> futures = new ArrayList<Future<Integer>>();

	public static void main(String[] args) throws MalformedURLException, IOException
	{
		URLConnection link = new URL("https://en.wikipedia.org/wiki/Java_(programming_language)").openConnection();
		Scanner scan = new Scanner(link.getInputStream());

		ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);

		while (scan.hasNext()) 
		{
			String line = scan.nextLine().toLowerCase();
			futures.add(executorService.submit(() -> {
				int cnt = 0;
				for (String word : line.replaceAll("[™,f,d,b,n,s,w,:,-,?,!,.,`,;,',),(,--]", " ").split(" ")) 
				{
					if (word.equals(BASIC_WORD))
					{
						System.out.println(word);
						cnt++;
					}
				}
				return cnt;
			}));
		}
		
		printResult();
		
		executorService.shutdown();
		try 
		{
			executorService.awaitTermination(1, TimeUnit.SECONDS);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	private static void printResult()
	{
		int sum = 0;
		for (Future<Integer> oneFuture : futures) 
		{
			try 
			{
				sum += oneFuture.get();
			} 
			  catch (InterruptedException e) {

				e.printStackTrace();
			} catch (ExecutionException e) {

				e.printStackTrace();
			}
		}

		System.out.println("The word: '"+BASIC_WORD+"' appesrs: ["+sum+"] times in the link.");
	}
}
