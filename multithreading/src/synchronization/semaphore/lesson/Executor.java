package synchronization.semaphore.lesson;

public class Executor 
{
	
	public void submit(Job job) throws InterruptedException 
	{
        System.out.println("1. Launching job " + job.getWork());
        Runner.semaphore.acquire(); //taking a lock

        Thread t = new Thread(() -> {
            try {
                System.out.println("2. Executing job " + job.getWork());
                Thread.sleep(job.getWork());

                Runner.semaphore.release(); //releasing lock
                System.out.println("3. Job finished with id " + job.getWork());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t.start();
    }

}
