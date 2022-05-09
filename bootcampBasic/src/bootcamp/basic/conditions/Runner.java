package bootcamp.basic.conditions;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
       
	  /*
	   //Exercise A: 
	   final int DIVISOR=12;
       System.out.println("please enter a number:");
       int num = scanner.nextInt();
       String result="";
       //   if(num%1==0 && num%2==0 && num%3==0 && num%4==0)
       if(num%DIVISOR==0)
       {
    	   System.out.println(num+ " is "+result+ "divisible by 1, 2, 3 and 4");	   
       }
       else
       {
        result="NOT";
 	    System.out.println(num+ " is "+result+ " divisible by 1, 2, 3 and 4");
       }
       System.out.println("Goodbye");
	 */
		
     /*
	   //Exercise B: 
	   final int DIVISOR=12;
       System.out.println("please enter a number:");
       int num = scanner.nextInt();
       String result = ((num%DIVISOR)==0) ? "is divisible by 1, 2, 3 and 4" : "is NOT divisible by 1, 2, 3 and 4";
	   System.out.println(num+" "+result);
	   System.out.println("Goodbye");
	*/
		
	   System.out.println("Enter first number:");
	   int num1 = scanner.nextInt();
	   System.out.println("Enter second number:");
	   int num2 = scanner.nextInt();
	   System.out.println("Enter third number:");
	   int num3 = scanner.nextInt();
	   
	   String str2="";
	   String str1="";
	   if(num3<num2)
	   {
		   str1 = "range "+num3+" to "+num2;
	   }
	   else if(num3>num2)
	   {
		   str2 = "range "+num2+" to "+num3;
	   }
	   
	   if((num3<num1 && num2>num1))
	   {	   
		   System.out.println(num1+" is in the "+str1);	   
	   }
	   else if((num3>num1 && num2<num1))
	   {	  
		   System.out.println(num1+" is in the "+str2);
	   }
	   else if(num1<num2 && num1<num3)
	   {
		   System.out.println(num1+" is smaller than the "+str1);
	   }
	   else if(num1>num2 && num1>num3)
	   {
		   System.out.println(num1+" is greater than the "+str2);
	   }
     
       scanner.close();
	}

}
