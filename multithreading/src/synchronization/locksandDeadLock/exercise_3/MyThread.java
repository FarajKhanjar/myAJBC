package synchronization.locksandDeadLock.exercise_3;

import java.util.Iterator;
import java.util.List;

public class MyThread extends Thread 
{
	private int start;
	private int end;
	private Exe3 exeObj;

	public MyThread(int start, int end, Exe3 exeObj) {
		this(start, end, exeObj, Thread.currentThread().getName());
	}

	public MyThread(int start, int end, Exe3 exeObj, String name) {
		super(name);
		this.start = start;
		this.end = end;
		this.exeObj = exeObj;
	}

	@Override
	public void run() {
		// in a block
//		sumList();
		// in a method
		exeObj.sumList(start, end);
	}

	private void sumList() 
	{
		List<Integer> subList = exeObj.list.subList(start, end);
		for (Iterator<Integer> iterator = subList.iterator(); iterator.hasNext();) {
			exeObj.lock.lock();
			Runner.sum += iterator.next();
			exeObj.lock.unlock();
		}
	}
};

