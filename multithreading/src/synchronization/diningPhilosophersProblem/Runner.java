package synchronization.diningPhilosophersProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * The goal is to come up with a scheme/protocol that helps the philosophers 
 * achieve their goal of eating and thinking without getting starved to death.
 */

public class Runner 
{
	protected static final int NUM_PHILO = 5;
	protected static List<Lock> forks = new ArrayList<>();

	public static void main(String[] args) 
	{
		for (int i = 0; i < NUM_PHILO; i++) 
		{
			forks.add(new ReentrantLock());
		}

		Semaphore semaphore = new Semaphore(NUM_PHILO - 1);

		for (int i = 0; i < NUM_PHILO; i++) 
		{
			new Thread(new Philosoher(i, semaphore)).start();
		}
	}
}

/*
 * The design of the problem was to illustrate the challenges of avoiding deadlock, 
 * a deadlock state of a system is a state in which no progress of system is possible. 
 * Consider a proposal where each philosopher is instructed to behave as follows:
 * The philosopher is instructed to think till the left fork is available, when it is available, hold it.
 * The philosopher is instructed to think till the right fork is available, when it is available, hold it.
 * The philosopher is instructed to eat when both forks are available.
 * then, put the right fork down first
 * then, put the left fork down next
 * repeat from the beginning.
 */

