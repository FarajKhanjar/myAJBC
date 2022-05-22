package synchronization.wait_notify.exercise_2;

import java.util.Queue;

class Producer implements Runnable 
{
	private final int QUEUE_MAX_SIZE = 5;
	private final int PRODUCINT_TIME = 2000;
	
	private final Queue<String> queue;

	public Producer(Queue<String> queue) 
	{
		this.queue = queue;
	}

	@Override
	public void run() 
	{
		while (true) 
		{
			try {
				produceData();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void produceData() throws InterruptedException 
	{
		synchronized (queue) 
		{
			while (queue.size() == QUEUE_MAX_SIZE) 
			{
				System.out.println("In producer, waiting...");
				queue.wait();
			}

			Thread.sleep(PRODUCINT_TIME);

			System.out.println(Thread.currentThread().getName()+" is producing data with id " + queue.size());
			queue.add("element_" + queue.size());

			if (queue.size() == 1) 
			{
				queue.notify();
			}
		}
	}
}
