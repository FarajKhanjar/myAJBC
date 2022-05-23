package pools.threadPoolExecutor;

import java.util.concurrent.*;

public class Runner 
{
	
	private static final int CORE_THREADS = 2; // number of threads in normal condition
	private static final int MAX_POOL_SIZE = 1; // in case of many tasks;
	private static final int KEEP_ALIVE_TIME = 1; // thread that idle - waiting for tasks will terminate after this time
	private static final int CAPACITY = 2;
	private static final BlockingQueue<Runnable> tasks = new ArrayBlockingQueue<>(CAPACITY);
	//array with max size (CAPACITY).
	public static void main(String[] args) throws InterruptedException 
	{
		
	//	ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_THREADS, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS, tasks);
		
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_THREADS, 
				MAX_POOL_SIZE, 
				KEEP_ALIVE_TIME, 
				TimeUnit.MINUTES,
				// new ArrayBlockingQueue<>(3) // 3 is the size of the Q . blocking Q uses locks and have threads wait if
				// the Q is empty and blocks tasks to be added if Q is full
				// new LinkedBlockingQueue<>() // for non bounded number of tasks - can cause
				// memory issues
				new SynchronousQueue<>(), // assigns a task to a thread - in case there is no thread available the task is rejected
//				(Runnable r, ThreadPoolExecutor t)->{
//					System.out.println("Default task rejection handler");
//				}
//				new ThreadPoolExecutor.AbortPolicy() //cancel task.
//				new ThreadPoolExecutor.DiscardOldestPolicy()
				new ThreadPoolExecutor.CallerRunsPolicy()
		);

		// threadPoolExecutor.prestartAllCoreThreads(); //create all core threads in
		// advanced to save init time

		threadPoolExecutor.execute(() -> System.out.println("Task 1"));
		// threadPoolExecutor.execute(() -> System.out.println("Task 2"));

		// System.out.println("Pool size after 2 tasks: " +
		// threadPoolExecutor.getPoolSize());

//		threadPoolExecutor.execute(() -> System.out.println("Task 3"));
//		threadPoolExecutor.execute(() -> System.out.println("Task 4"));
		// System.out.println("Pool size after 4 tasks: " +
		// threadPoolExecutor.getPoolSize());
		try {
			threadPoolExecutor.execute(() -> System.out.println("How to handle task rejection ??"));
		} catch (RejectedExecutionException e) {
			System.out.println("Signal that task got rejected");
		}
		Future<Integer> future = threadPoolExecutor.submit(new CallableTask()); // asynchronous operation
		System.out.println("Pool size after 6 tasks: " + threadPoolExecutor.getPoolSize());
		// Do other stuff

//        while(!future.isDone()) {
//          future.cancel(false);
//        	future.isCancelled();
//        }

		Integer result = null;
		try {
			result = future.get();// blocking operation
		} catch (InterruptedException | ExecutionException e) {
			// handle rejected task
		}
		System.out.println("result is " + result);

		threadPoolExecutor.shutdown(); // gracefully : 1. stops accepting new task 2. executes all existing tasks
		// threadPoolExecutor.shutdownNow(); //Not gracefully : 1. stops accepting new
		// task 2. sends interrupt message to all the threads
		threadPoolExecutor.awaitTermination(3, TimeUnit.SECONDS); // this is necessary because shutdown is non blocking
		
		//monitoring
//		 threadPoolExecutor.getPoolSize());
//		threadPoolExecutor.getActiveCount();
//		threadPoolExecutor.getTaskCount();
//		threadPoolExecutor.getCompletedTaskCount();
	}

	static class CallableTask implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			Thread.sleep(2000);
			return 4;
		}
	}
}