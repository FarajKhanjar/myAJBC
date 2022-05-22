package synchronization.locksandDeadLock.exercise_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Exe3 
{

	protected List<Integer> list;
	private Random rand;
	protected Lock lock;

	public Exe3() {

		list = new ArrayList<>();
		rand = new Random(123);
		lock = new ReentrantLock();
	}

	protected void initList() {
		for (int i = 0; i < Runner.SIZE; i++) {
			list.add(rand.nextInt(Runner.BOUND));
		}
	}

	protected int sumList() {
		return list.stream().reduce(0, (a, b) -> a + b);
	}

	protected void sumList(int start, int end) 
	{
		List<Integer> subList = list.subList(start, end);
		for (Iterator<Integer> iterator = subList.iterator(); iterator.hasNext();) {
			lock.lock();
			Runner.sum += iterator.next();
			lock.unlock();
		}
	}
}