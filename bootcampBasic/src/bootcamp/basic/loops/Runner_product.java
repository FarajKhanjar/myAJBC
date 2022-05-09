package bootcamp.basic.loops;

import java.util.Scanner;

public class Runner_product {

	public static void main(String[] args) {
		
		/*
		 Multiplication of positive numbers received as input,
		 the program stops when a negative number that is not included in the product is received as input, 
		 or is received Zero input that included in the product.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a num:");
		int num  = scanner.nextInt();
		int pro=1;
		if(num<0){
			pro =0;
			System.out.println("Product is:"+pro);
		}
		else {
		  while(num>0)
	      {
			pro*=num;
			System.out.println("Enter a num:");
		    num  = scanner.nextInt();
			if(num==0){
				pro =0;
		              }
	   	  }			
			System.out.println("Product is:"+pro);
		     }
		    
		scanner.close();
	}
}
