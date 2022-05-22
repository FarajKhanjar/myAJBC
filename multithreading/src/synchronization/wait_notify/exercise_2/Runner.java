package synchronization.wait_notify.exercise_2;

import java.util.LinkedList;
import java.util.Queue;

public class Runner {

	public static void main(String[] args) 
	{
		Queue<String> queue = new LinkedList<>();

		Thread producer = new Thread(new Producer(queue), "myProducer");
		Thread consumer = new Thread(new Consumer(queue), "myConsumer");

		producer.start();
		consumer.start();
	}
}
