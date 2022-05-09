package bootcamp.basic.arrays;

import java.util.Scanner;

public class Ex2_C {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// question 1: Input 10 numbers into an array, print only the even values ​​in the array
		int[] array = new int[10];

		for(int i=0 ; i<array.length ; i++)
		{
			System.out.println("Enter number:");
			array[i] = scanner.nextInt();
		}
		for(int i=0 ; i<array.length ; i++)
		{
			if(array[i]%2==0) {
				System.out.print(array[i]+" ");
			}
		}
		scanner.close();

	}

}
