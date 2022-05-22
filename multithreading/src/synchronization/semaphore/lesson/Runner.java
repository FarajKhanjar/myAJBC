package synchronization.semaphore.lesson;

import java.util.concurrent.Semaphore;

public class Runner 
{
    protected static Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) throws InterruptedException {

        Executor executor = new Executor();

        executor.submit(new Job(1001));
        executor.submit(new Job(1002));
        executor.submit(new Job(1003));

        executor.submit(new Job(1004));
        executor.submit(new Job(1005));
    }
}