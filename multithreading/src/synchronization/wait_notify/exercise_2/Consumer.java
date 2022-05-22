package synchronization.wait_notify.exercise_2;

import java.util.Queue;

public class Consumer implements Runnable 
{
	private final int QUEUE_MAX_SIZE = 5;
	private final int COUNSUMING_TIME = 1000;

	private final Queue<String> queue;

	public Consumer(Queue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consumeData();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void consumeData() throws InterruptedException 
	{
		synchronized (queue) 
		{
			while (queue.isEmpty()) {
				System.out.println("Consumer is waiting...");
				queue.wait();
			}

			Thread.sleep(COUNSUMING_TIME);

			String data = queue.remove();
			System.out.println("Consumed data: " + data);

			//let producer know that the consuming started
			if (queue.size() == QUEUE_MAX_SIZE-1) {
				queue.notify();
			}

		}
	}
}

