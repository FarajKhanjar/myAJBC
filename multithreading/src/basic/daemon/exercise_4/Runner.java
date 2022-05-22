package basic.daemon.exercise_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner 
{
	final static int SIZE = 1000;
	final static int NEGATIVE_NUMBER = -10;
	final static int INDEX_OF_ELEMENT = 500;
	static List<Integer> list_1 = new ArrayList<Integer>(SIZE);
	static List<Integer> list_2 = new ArrayList<Integer>(SIZE);

	public static void main(String[] args) 
	{
		for(int i=0; i<SIZE; i++)
		{
			list_1.add(i);
			list_2.add(i+SIZE);
		}
		
		list_1.set(INDEX_OF_ELEMENT, NEGATIVE_NUMBER); //Change the elements in index '500' to a negative value.
		
		CheckNegative checkingNumber = new CheckNegative();
		Thread thread_1 = new Thread(checkingNumber);
		thread_1.setName("Thread #1");
		
		Thread thread2 = new Thread(hasCommon, "Thread #2");
		
		thread2.setDaemon(true);

		thread_1.start();
		thread2.start();
	}
	
	static Runnable hasCommon = () -> {
		//assuming the list_2 is sorted - if not simply sort it before.
		list_2.forEach((i) -> {
			int result = Collections.binarySearch(list_1, i);
			if (result>=0) {
				System.out.println("The system found this negative number[" + result + "] Of: " + Thread.currentThread().getName());
				return;
			}
		});
		System.out.println(Thread.currentThread().getName() + " found that there is no common integer");
	};

	static class CheckNegative implements Runnable 
	{
		boolean isNegative = false;
		@Override
		public void run() 
		{		
			for (Integer number : list_1) 
			{
				try {
					Thread.sleep(1);
					if (number < 0) {
						System.out.println("The system found this negative number[" + number + "] in place [" + list_1.indexOf(number) + "] Of: " + Thread.currentThread().getName());
						isNegative = true;
						return;
					}
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
					System.out.println("The exception has been encountered " + e); 
				}				
			}
			System.out.println("The system didn't found any negative number.");
		};
	}
}