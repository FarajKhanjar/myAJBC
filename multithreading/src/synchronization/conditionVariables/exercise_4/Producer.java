package synchronization.conditionVariables.exercise_4;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class Producer
{
	private final int QUEUE_MAX_SIZE = 5;
	private final int PRODUCINT_TIME = 2000;
	private Lock lock;
	private Condition condition;
	private final Queue<String> reports;

	public Producer(Queue<String> reports, Lock lock, Condition condition) 
	{
		this.reports = reports;
		this.lock = lock;
		this.condition = condition; 
	}


	protected void produceData()  
	{
			lock.lock();
			if (reports.size() == QUEUE_MAX_SIZE) {
				System.out.println("Manufacturer is waiting");
				try {
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("report" + reports.size() + " got produced");
			reports.add("report " + reports.size());
			try {
				Thread.sleep(PRODUCINT_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (reports.size() == 1)
				condition.signal();
			lock.unlock();
	}
}
