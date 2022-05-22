package synchronization.conditionVariables.exercise_4;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Consumer  
{
	private final int QUEUE_MAX_SIZE = 5;
	private final int COUNSUMING_TIME = 1000;
	private Lock lock;
	private Condition condition;
	private final Queue<String> reports;

	public Consumer(Queue<String> reports, Lock lock, Condition condition) 
	{
		this.reports = reports;
		this.lock = lock;
		this.condition = condition; 
	}

	protected void consumeData()
	{
			lock.lock();
			if (reports.isEmpty()) {
				System.out.println("Marketing is waiting for available reports");
				try {
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("report" + reports.size() + " got supplied to customer");
			reports.remove();
			try {
				Thread.sleep(COUNSUMING_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (reports.size() == QUEUE_MAX_SIZE - 1)
				condition.signal();

			lock.unlock();
		
	}
}

