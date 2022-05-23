package pools.exercise_2;

import java.util.concurrent.RecursiveTask;

public class SumData extends RecursiveTask<Double>
{
	private static final long serialVersionUID = 1L;
    double[] values = Runner.array;
	private final int left;
	private final int right;
    
	public SumData(int left, int right) 
	{
		this.left = left;
		this.right = right;
	}

	@Override
	protected Double compute() 
	{
		double sum = 0;
        if ((right - left) == 1) 
        {
            for (int i = left; i < right; i++)
            {
                sum += values[i];
            }
        }
        else {
        	int mid = (left + right) / 2;
        	
            SumData task_1 = new SumData(left, mid);
            SumData task_2 = new SumData(mid, right);
  
            task_1.fork();
            task_2.fork();
  
            sum = task_1.join() + task_2.join();
        }
        return sum;
	}
}