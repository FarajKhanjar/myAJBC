package basic.groups.exercise_3;

public class Runner 
{
	static int num = 1;
	
	public static void main(String[] args) throws InterruptedException 
	{
		ThreadGroup myGroup = new ThreadGroup("Group1");

		Thread thread_1 = new Thread(myGroup, new thisThread(), "One");
		Thread thread_2 = new Thread(myGroup, new thisThread(), "Two");
		Thread thread_3 = new Thread(myGroup, new thisThread(), "Three");
		
		thread_1.start();
		thread_2.start();
		thread_3.start();

		System.out.println("Sleeping 2 sec:");
		Thread.sleep(2000);

		myGroup.interrupt();
	}

	static class thisThread extends Thread 
	{
		@Override
		public void run() 
		{
			while (true) 
			{
				try {
					Thread.sleep(100); //ms
					num*=2;
					System.out.println(Thread.currentThread().getName()+": The value of num = " + num);
				} 
				catch (InterruptedException e) 
				{
					System.out.println("The exception has been encountered " + e); 
					return;
				}
			}
		}
	}
}
