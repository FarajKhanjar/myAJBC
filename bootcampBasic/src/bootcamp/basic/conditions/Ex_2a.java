package bootcamp.basic.conditions;

import java.util.Scanner;

public class Ex_2a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*	// question 1: age of person
			System.out.println("Enter your age:");
			float age = scanner.nextFloat();
			if(age>=18)
			{
				System.out.println("you are Adult");
			}
			else
			{
				System.out.println("you are Under-age!");
			}
	    */
			
			
			
		/*	// question 3: two digit of number
			System.out.println("Enter the two digit number:");
			int num = scanner.nextInt();
			String result = (num%10 == (num/10)) ? " " : " NOT "; 	
			System.out.println("the two digits are"+result+"simelar ("+(num%10)+") ~ ("+((int) num/10)+")");
		*/	
			
			
			// question 5: follow digits of decimal number		 	
			System.out.println("Enter a decimal number:");
			int num = scanner.nextInt();
			int right=num%10;
			int left= num/10;
			String result = ((right-left)==1) ? " " : " NOT ";
			System.out.println("the two digits are"+result+"following each other ("+left+") ~> ("+right+")");
			
			
			
		/*	// question 7: Amount of fuel in the vehicle
			
			System.out.println("How much fuel is in your tank?:");
			float fuel = scanner.nextFloat();
			System.out.println("What is the size of the tank in your car?:");
			float size = scanner.nextFloat();
			float remainingFuel=size*0.15f;	
			if(fuel<=remainingFuel)
			{
				System.out.println("Note! You need to refuel, the fuel that remain is below only 15%  - ("+remainingFuel);
			}
		*/	
			
			
		/*	// question 9: the date
			System.out.println("Enter the date number:");
			int date = scanner.nextInt();
			int year = date%10000;
			date/=10000;
			int month = date%100;
			int day= date/100;
			System.out.println("The year is "+year+", the month is "+month+", and the day is "+day);
		*/	
			scanner.close();
	}

}
