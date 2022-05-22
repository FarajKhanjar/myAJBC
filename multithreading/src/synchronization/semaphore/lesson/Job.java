package synchronization.semaphore.lesson;

public class Job 
{
	private final int work;

    public Job(int work) {
        this.work = work;
    }

    public int getWork() {
        return work;
    }

}
