package bootcamp.basic.loops;

import java.util.Scanner;

public class Runner_while {

	public static void main(String[] args) {

		//sum of numbers: 
		/*
		 Sum of positive numbers received as input,
		 the program stops when received as input a negative number that is not included in the answer.
		 */
		Scanner scanner = new Scanner(System.in);
		int num =0;
		int i=1;
		int res = 0;
		do
		{
		    i*=10;
		    res+=num;
			System.out.println("Enter a number:");
		    num = scanner.nextInt();
		}
		while(num>=0);
		System.out.println("Number res is:"+res);
		scanner.close();
		
		
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = scanner.nextInt();
		int finalNum=0,i=1,tmp=0;
		while(number>=0)
		{
			i=1;
			System.out.println("Enter number:");
		    number = scanner.nextInt();
		    finalNum=(number*i + tmp);
		    tmp=finalNum;
		    i*=10;
		}
		System.out.println(finalNum);
		scanner.close();
	 */	
	}
}
