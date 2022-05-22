package synchronization.keyword.exercise_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {

	private static final int SIZE = 1000, NUM_THREADS = 5;
	static Object lock = new Object();
	private List<Integer> list;
	private int sum;

	public Runner() {
		this.list = new ArrayList<>();
	}

	public void initList() {
		for (int i = 0; i < SIZE; i++) {
			list.add(i);
		}
	}

	public void sumList() {
		list.forEach(x -> sum += x);
	}

	public void printSum() {
		System.out.println("This is the serial sum result : " + sum);
	}

	

	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.initList();
		runner.sumList();
		runner.printSum();
		runner.sum = 0;

		int listSlice = SIZE / NUM_THREADS;
		List<Thread> threads = new ArrayList<>(NUM_THREADS);

		for (int i = 0; i < NUM_THREADS; i++) {
			Thread thread = new Thread(new SumListSection(i * listSlice, (i + 1) * listSlice, runner));
			thread.start();
			threads.add(thread);
		}

		threads.forEach(x -> {
			try {
				x.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		System.out.println("This is the parallel sum result : " + runner.sum);

	}
	
	// in a method
	public synchronized void addToSum1(int addition) 
	{		
		sum += addition;	
	}
	
	// in a block
	public void addToSum2(int addition) 
	{		
		sum += addition;	
	}
}
