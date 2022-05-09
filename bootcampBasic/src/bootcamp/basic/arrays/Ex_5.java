package bootcamp.basic.arrays;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	/*	// question 1: Input two arrays of size 5, checking whether the two arrays are opposite.
		int[] array1 = new int[5];
		int[] array2 = new int[5];

		System.out.println("Enter numbers for the first Array:" );
		for(int i=0 ; i<array1.length ; i++)
		{
			array1[i] = scanner.nextInt();
		}
		System.out.println("Enter numbers for the second Array:" );
		for(int i=0 ; i<array2.length ; i++)
		{
			array2[i] = scanner.nextInt();
		}
		
		for(int element:array1) 
		{
			System.out.print(element+" ");
		}
		System.out.println();
		for(int element:array2) 
		{
			System.out.print(element+" ");
		}
		
		int j=array2.length; //Auxiliary variable.
		String result=" ";
		for(int i=0 ; i<array1.length ; i++)
		{
			j=j-1;
				if(array1[i] != array2[j]) {
					result=" NOT ";
					break;
				}
				else {
					continue;
				}				
		}
		System.out.println();
		System.out.println("The two arrays are"+result+"opposite");
	*/
		
		
		
	/*	// question 3: Input 2 numbers in the two-first places in the array,
		fill in the other elements of the array so that the value of each element 
		will be the sum of the two elements before. */
		
	/*	int[] array = new int[10];
		System.out.println("Enter the first number in the Array:" );
		array[0] = scanner.nextInt();
		System.out.println("Enter the second number in the Array:" );
		array[1] = scanner.nextInt();		
	//	for(int element:array)         //self check
	//	{
	//		System.out.print(element+" ");
	//	}
	
		for(int i=0 ; i<(array.length-2) ; i++)
		{
			array[i+2] = (array[i]+array[i+1]);
		}
		System.out.println();
		for(int element:array) 
		{
			System.out.print(element+" ");
		}
	*/	
		
	
	
	/*	// question 5: The program will display whether the values ​​of
	    the second collection members are identical in their order to
	    the values ​​of the first collection, but with a deviation of One limb to the right. */
	/*	int[] array1 = new int[5];
		int[] array2 = new int[5];
		boolean flag=true; 

		System.out.println("Enter numbers for the first Array:" );
		for(int i=0 ; i<array1.length ; i++)
		{
			array1[i] = scanner.nextInt();
		}
		System.out.println("Enter numbers for the second Array:" );
		for(int i=0 ; i<array2.length ; i++)
		{
			array2[i] = scanner.nextInt();
		}
		
		for(int i=0 ; i<array2.length ; i++)
		{
			int j=(i+1)%array2.length;
				if(array2[j] != array1[i]) {
					flag = false;
					break;
				}			
		}
		for(int element:array1) 
		{
			System.out.print(element+" ");
		}
		System.out.println();
		for(int element:array2) 
		{
			System.out.print(element+" ");
		}
		System.out.println();	
		System.out.println(flag);
	*/

		
	
		
		
		
	/*	//question 7: Copy to the third array each entry,
		Which appears in both the first array and the second array. */
		
	/*	int[] array1 = new int[5];
		int[] array2 = new int[5];
		int[] array3 = new int[5];

		System.out.println("Enter numbers for the first Array:" );
		for(int i=0 ; i<array1.length ; i++)
		{
			array1[i] = scanner.nextInt();
		}
		System.out.println("Enter numbers for the second Array:" );
		for(int i=0 ; i<array2.length ; i++)
		{
			array2[i] = scanner.nextInt();
		}
		int index=0;
		for(int i=0; i<array1.length; i++)
		{
			for(int j=0; j<array2.length; j++)
			{
				if(array1[i]==array2[j]) {
					array3[index] = array1[i];
					index+=1;
				}
			}
			System.out.println();
		}
		for(int element:array3) 
		{
			System.out.print(element+" ");
		}
		System.out.println('\n'+"the number of the elements is: "+index);
	*/
		
			
		
		/* question 9: For 2 arrays received as input,
		 * check and display a message whether the sum of the digits
		 *  is the same in the elements in matching locations. */
	/*	
		int[] array1 = new int[3];
		int[] array2 = new int[3];

		System.out.println("Enter numbers for the first Array:" );
		for(int i=0 ; i<array1.length ; i++)
		{
			array1[i] = scanner.nextInt();
		}
		System.out.println("Enter numbers for the second Array:" );
		for(int i=0 ; i<array2.length ; i++)
		{
			array2[i] = scanner.nextInt();
		}
		
		int sum1=0,sum2=0; //the sum of the digits of the elements in Array1 and Array2
		String result=" "; 
		for(int i=0 ; i<array1.length-1 ; i++)
		{
			int tmp1 = (array1[i]); //Auxiliary variable.
			while(tmp1 != 0)
			{
				sum1+=tmp1%10;
				tmp1/=10;
			}
			int tmp2 = (array2[i]); //Auxiliary variable.
			while(tmp2 != 0)
			{
				sum2+=tmp2%10;
				tmp2/=10;
			}
			
			if(sum1 != sum2) {
				result=" NOT "; 
				break; 
			}
			else {
				continue;
			}				
	    }
	    System.out.println("The two arrays are"+result+"opposite");
	*/
		
		
		
		/* question 11: 
		 * Matrix printing based on the number of rows and columns entered as input,
		 * calculating the maximum number in the outer frame of the matrix. */
		
	/*	int[][] matrix = {
				           {1,62,100,-6,101,6,0,5,34,20},
				           {4,5,6,8,9,7,2,100,30,20},
				           {77,1,23,-1,-7,0,30,20,2,22},
				           {1,2,100,-6,107,6,0,5,30,52},
				           {45,5,6,85,9,1,12,100,30,20},
				           {0,1,23,-1,-7,0,30,20,2,28},
	                       {11,2,10,-6,101,6,0,5,30,23},
			         	   {40,5,6,8,9,1,2,100,30,20},
			        	   {0,1,23,-1,-7,0,3,2,2,22},
			        	   {14,5,152,8,90,1,2,100,30,105}
		                 };
	  */

	/*	System.out.println("Enter number of rows:");
		int rows = scanner.nextInt();
		if(rows>10) {
			System.out.println("Value of rows should be between 1-10, Try again");
			rows = scanner.nextInt();
		}
		System.out.println("Enter number of cols:");
		int cols = scanner.nextInt();
		if(cols>10) {
			System.out.println("Value of cols should be between 1-10, Try again");
			cols = scanner.nextInt();
		}
		
		int dimension=cols*rows;
	 	System.out.print("Enter "+dimension+" numbers:" );
	 	
	 	int[][] matrix = new int[rows][cols]; 	
		for(int i=0; i<rows; i++)
		{		
			for(int j=0; j<cols; j++)
			{
				matrix[i][j] = scanner.nextInt();			
			}		
		}
		  
	    int maxElement=matrix[0][0];
		for(int i=0; i<rows; i++)
		{		
			for(int j=0; j<cols; j++)
			{
				System.out.print(matrix[i][j]+"  ");
				if(matrix[i][j]>=maxElement && (i==0||j==0||i==(rows-1)||j==(cols-1))) {
					maxElement=matrix[i][j];
				}	
			}
			System.out.println();
		}
		System.out.println("The max element is: "+maxElement);
	*/	
		
		
		
		
		// Question 15: Input numbers for a square matrix, 
		// printing the matrix, and checking whether it is a 'Mkopelet-Rashit' matrix.
	
	/*	
		int[][] matrix = {
		           {9,2,3,4},
		           {2,9,6,3},
		           {3,6,9,2},
		           {4,3,2,9}
		                  };
		
		int[][] matrix = {
		           {9,2,4},
		           {2,9,7},
		           {4,7,9}
		                  };
	 
	*/	          
		   System.out.println("Enter number of dimension: (matrix is N*N)");
			int dimension = scanner.nextInt();
			int numberOfElements=(dimension*dimension);
		 	System.out.print("Enter "+numberOfElements+" numbers:");
		 	
		 	int[][] matrix = new int[dimension][dimension]; 	
			for(int i=0; i<dimension; i++)
			{		
				for(int j=0; j<dimension; j++)
				{
					matrix[i][j] = scanner.nextInt();			
				}		
			}
		
			for(int i=0; i<matrix.length; i++)
			{
				for(int j=0; j<matrix[i].length; j++)
				{
					System.out.print(matrix[i][j]+"  ");
				}
				System.out.println();
			}
			
			String result=" ";
			for(int i=0; i<dimension; i++)
			{		
				for(int j=0; j<dimension; j++)
				{
					if(j==(dimension-1)) {
						break;
					}
					if(matrix[i][j+1]!=matrix[j+1][i]) {
						result=" NOT ";
						break;
					}
					else {
					//	System.out.println(matrix[i][j+1]+" ~ "+matrix[j+1][i]); //self check
						continue;
					}				
				}
			}
			System.out.println("The matrix is"+result+"'Mkopelet-Rashit'");
			  
		scanner.close();

	}

}
