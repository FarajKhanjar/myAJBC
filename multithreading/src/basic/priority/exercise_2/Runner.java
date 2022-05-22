package basic.priority.exercise_2;

public class Runner 
{
	static int num = 10;
	static final int NUM_LOOPS = 3;

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Start num = " + num);
		
		Thread thread1 = new doubleNumber();
		thread1.setName("Thread #1");
		
		AddToNumber2 thread_2 = new AddToNumber2();
		Thread thread2 = new Thread(thread_2);
		thread2.setName("Thread #2");
		
		Thread thread3 = new Thread(() -> divideNumberBy2());
		thread3.setName("Thread #3");
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(5);
		thread3.setPriority(Thread.MAX_PRIORITY);
		
		thread1.start();
		thread2.start();
		thread3.start();

		thread1.join();
		thread2.join();
		thread3.join();
		
		System.out.println("Final num = " + num);

	}

	static class doubleNumber extends Thread 
	{
		@Override
		public void run() 
		{
			for (int i = 0; i < NUM_LOOPS; i++) 
			{
				num *= 2;
				System.out.println(Thread.currentThread().getName() + ": num = " + num);
			}
		}
	}

	static class AddToNumber2 implements Runnable 
	{
		@Override
		public void run() 
		{
			for (int i = 0; i < NUM_LOOPS; i++) 
			{
				num += 2;
				System.out.println(Thread.currentThread().getName() + ": num = " + num);
			}
		}
	}

	public static void divideNumberBy2() 
	{
		Thread thread = Thread.currentThread();
		
		for (int i = 0; i < NUM_LOOPS; i++) 
		{
			num /= 2;
			System.out.println(thread.getName() + ": num = " + num);
		}
	}
}
