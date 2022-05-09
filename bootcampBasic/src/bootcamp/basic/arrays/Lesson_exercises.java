package bootcamp.basic.arrays;

public class Lesson_exercises {

	public static void main(String[] args) {
		
		//Print array
	/*	int[][]	arr = {
				{1,2},
				{4,5,6,8,9},
				{0,1,2}
		      };
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		// the same usong FOR-EACH:
		System.out.println();
		for(int[] row:arr) // row "i" in the do-array
		{
			for(int element:row)// element "j" in the row 
			{
				System.out.print(element);
			}
			System.out.println();
		}
		
	*/
		
		//Deep copy array
		int[] originalArr = {3,7,0 ,-4, 5};
		int[] arrCopy = new int[5];

		for(int i=0 ; i<originalArr.length ; i++)
		{
			arrCopy[i] = (originalArr[i]*originalArr[i]);
		}
		for(int element:originalArr) 
		{
			System.out.print(element+" ");
		}
		System.out.println();
		for(int element:arrCopy) 
		{
			System.out.print(element+" ");
		}

	}

}
