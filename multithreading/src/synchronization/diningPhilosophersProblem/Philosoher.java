package synchronization.diningPhilosophersProblem;

import java.util.concurrent.Semaphore;

public class Philosoher implements Runnable 
{
	private final int id;
    //without using semaphore we will get a deadlock
    private final Semaphore semaphore;

    public Philosoher(int id, Semaphore semaphore) 
    {
        this.id = id;
        this.semaphore = semaphore;
    }

	@Override
	public void run() 
	{
		think();
        pick_forks();
        eat();
        put_forks();
	}
	
	private void pick_forks() 
	 {
		 try {
             semaphore.acquire();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

		 Runner.forks.get(id).lock();
         System.out.println("Philospher " + id + " picked the right fork");
         Runner.forks.get((id + 1) % Runner.NUM_PHILO).lock();
         System.out.println("Philospher " + id + " picked the left fork");
		
	}
		
	 private void put_forks() 
	 {
		 Runner.forks.get(id).unlock();
		 System.out.println("Philospher " + id + " puted the right fork");
		 Runner.forks.get((id + 1) % Runner.NUM_PHILO).unlock();
		 System.out.println("Philospher " + id + " puted the right fork");

        semaphore.release();
		
	}

	 private void think() 
	 {
         System.out.println("Philospher " + id + " is thinking about the world");
     }

	 private void eat() 
     {
         System.out.println("Philospher " + id + " eats");
     }

}
