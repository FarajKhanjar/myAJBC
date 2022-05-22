package basic.exceptions.exercise_5;

import java.util.ArrayList;
import java.util.List;

public class Runner 
{
	//NOT FINISH IT !!!!
	
	static final int SIZE = 1000;
	static List<Integer> randomList = new ArrayList<>(SIZE);
	static List<Integer> doubleValuesList = new ArrayList<>();
	static List<String> stringList = new ArrayList<>();
	static List<Double> doubleDivideListValues = new ArrayList<>();

	public static void main(String[] args) 
	{
		for (int i = 0; i < SIZE; i++) 
		{
			randomList.add(i);
		}
		
		randomList.set(10, null);
		randomList.set(100, null);
		randomList.set(500, null);
		
		DoubleValue doubleIt = new DoubleValue();
		Thread thread_1 = new Thread(doubleIt);
		thread_1.setName("Thread #1");
				
		Thread thread_2 = new Thread(stringValues);
		thread_2.setName("Thread #2");
		
		Thread thread_3 = new divideValues();
		thread_3.setName("Thread #3");
		
		
		thread_2.setUncaughtExceptionHandler((thread, exception) -> {
			System.out.println("Found Null in " + Thread.currentThread().getName());
			System.out.println("String value list size: " + stringList.size());
		});
		
		Thread.setDefaultUncaughtExceptionHandler((thread, exception) -> {
		System.out.println(exception.getMessage());
		System.out.println("Found Null in " + Thread.currentThread().getName());
		System.out.println("Divide values list size: " + doubleDivideListValues.size());
				});
		
		thread_1.start();
		thread_2.start();
		thread_3.start();

	}
	
	static class DoubleValue implements Runnable 
	{
		@Override
		public void run() 
		{		
			for (Integer i : randomList) 
			{
				try {
					doubleValuesList.add(i * 2);
				} 
				catch (NullPointerException e) {
				//	System.out.println("The exception has been encountered ");
					System.out.println(Thread.currentThread().getName() +"-> Found Null ");	
				}
			}
			System.out.println("double Values List size: " + doubleValuesList.size());
		};
	}
	
	public static Runnable stringValues = () -> {
		for (Integer i : randomList) 
		{
			stringList.add("" + (i + 1));
		}
		System.out.println("String value list size: " + stringList.size());
	};
	
	static class divideValues extends Thread 
	{
		@Override
		public void run() 
		{
			for (int i = 0; i < randomList.size(); i++) 
			{
				doubleDivideListValues.add((double) i / 5);	
			}
		}
	}	
}