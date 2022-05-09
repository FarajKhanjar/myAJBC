package bootcamp.basic.loops;

import java.util.Scanner;

public class Runner_for {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
       	//Check if the number received as input is a Prime number or not.
			System.out.println("Enter number:");
			int num = scanner.nextInt();
			String isPrime = "prime";
			
			for(int i=2; i<num; i++)
			{
				if(num%i == 0) {
					isPrime = "Not prime";
				}
			}
			System.out.println("the number "+num+" is "+isPrime);
			scanner.close();
	}
 
}
