package synchronization.conditionVariables.exercise_4;

public class MarkingThreads implements Runnable
{
	private static final int CAPACITY = 5;
	private Producer producer;
	private Consumer consumer;

	public MarkingThreads(Producer producer, Consumer consumer) {
		this.producer = producer;
		this.consumer = consumer;
	}

	@Override
	public void run() 
	{
		Thread serviceThread = new Thread(() -> {
			while (true)
				producer.produceData();
		}, "Analysis Service Thread");
		
		Thread marketingThread = new Thread(() -> {
			while (true)
				consumer.consumeData();
		}, "Marketing Thread");
		
		serviceThread.start();
		marketingThread.start();
	}


}
