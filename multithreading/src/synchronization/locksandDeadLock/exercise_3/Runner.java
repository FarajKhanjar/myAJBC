package synchronization.locksandDeadLock.exercise_3;

import java.util.ArrayList;
import java.util.List;

public class Runner 
{
	protected static int sum = 0;
	protected static final int BOUND = 1000, NUM_THREADS = 2, SIZE = 50;

	public static void main(String[] args) throws InterruptedException 
	{
		Exe3 exeObj = new Exe3();
		exeObj.initList();
		System.out.println("serialized result = " + exeObj.sumList());

		List<Thread> threads = new ArrayList<>();
		int sectionSize = SIZE / NUM_THREADS;
		for (int i = 0; i < NUM_THREADS; i++) {
			Thread thread = new MyThread(i * sectionSize, (i + 1) * sectionSize, exeObj, "MyThread + " + (i + 1));
			thread.start();
			threads.add(thread);
		}
		for (Thread thread : threads) {
			thread.join();
		}
		System.out.println("parallel result = " + sum);
	}

	
}
