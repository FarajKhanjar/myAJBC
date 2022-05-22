package synchronization.conditionVariables.exercise_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner 
{

	public static void main(String[] args) 
	{
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		
		Queue<String> queue = new LinkedList<>();

		Producer service  = new Producer(queue,lock,condition);
		Consumer marketing  = new Consumer(queue,lock,condition);

		MarkingThreads exeObj = new MarkingThreads(service , marketing );
		exeObj.run();
	}
	

}