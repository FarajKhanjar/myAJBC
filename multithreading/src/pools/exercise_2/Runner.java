package pools.exercise_2;

import java.util.concurrent.*;

public class Runner 
{
	private static final int ARRAY_SIZE = 8;
	protected static double[] array = new double[ARRAY_SIZE];
	
    public static void main(String[] args) throws ExecutionException, InterruptedException 
    {
        ForkJoinPool pool = new ForkJoinPool();
        
        
        for (int i = 0; i < ARRAY_SIZE; i++) 
        {
        	array[i] = Math.random() * 10;
        	//System.out.println(array[i]);
        }
        
        SumData myTask = new SumData(0, array.length);
        Future<Double> future = pool.submit(myTask);
       
        pool.shutdown();
		pool.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("Sum =  " + future.get());
    }
}