package synchronization.wait_notify;

import java.util.LinkedList;
import java.util.Queue;

public class Runner {

	private static final Object obj = new Object();

//    public static void main(String[] args) throws InterruptedException {
//
//        // Thread 1
//        synchronized (obj) {
//            obj.wait();
//            System.out.println("Next instructions");
//        }
//
//        // Thread 2
//        synchronized (obj) {
//            obj.notifyAll();
//            System.out.println("Next instructions");
//        }
//    }

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		Thread producer1 = new Thread(new Producer(queue), "Producer 1");
//		Thread producer2 = new Thread(new Producer(queue), "Producer 2");
		Thread consumer = new Thread(new Consumer(queue));

		producer1.start();
//		producer2.start();
		consumer.start();
	}

	static class Producer implements Runnable {
		private final Queue<String> queue;

		public Producer(Queue<String> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			while (true) {
				try {
					produceData();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		private void produceData() throws InterruptedException {
			synchronized (queue) {
				while (queue.size() == 10) {
					System.out.println("In producer, waiting...");
					queue.wait();
				}

				Thread.sleep(500);

				System.out.println(Thread.currentThread().getName()+" is producing data with id " + queue.size());
				queue.add("element_" + queue.size());

				//let consumer know that there is already 1 element in queue to consume
				if (queue.size() == 1) {
					queue.notify();
				}
//				queue.notify();
			}
		}
	}

	static class Consumer implements Runnable {

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

		private void consumeData() throws InterruptedException {
			synchronized (queue) {
				//wait id there's nothing to consume
				while (queue.isEmpty()) {
					System.out.println("Consumer is waiting...");
					queue.wait();
				}

				Thread.sleep(500);

				String data = queue.remove();
				System.out.println("Consumed data: " + data);

				//let producer know that the consuming started
				if (queue.size() == 9) {
					queue.notify();
				}

//				queue.notify();

			}
		}
	}
}