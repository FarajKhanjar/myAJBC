package bootcamp.basic.conditions;

import java.util.Scanner;

public class EX_ifElse_GH {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//check if a number is in range.
				int numToCheck, start, end;
				System.out.println("First: ");
				numToCheck = scanner.nextInt();
				System.out.println("Second: ");
				start = scanner.nextInt();
				System.out.println("Third: ");
				end = scanner.nextInt();
				// swap 
				if(start>end) {
					int temp = end;			
					end = start;
					start = temp;
				}
				
				String res = "";
				if (numToCheck < start) {
					res = "Smaller than ";
				}else if(numToCheck > end) 
				{
					res = "Greather than ";
				}else {
					res = "in " ;
				}
				
				String finalRes = numToCheck + " is "+res+"the range "+start +" to "+end;
				System.out.println(finalRes);
				scanner.close();
	}

}
