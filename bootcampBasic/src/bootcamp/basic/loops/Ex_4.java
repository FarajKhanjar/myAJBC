package bootcamp.basic.loops;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* question 2: Input a positive integer,
		and produce a new number that contains only the digits in the even positions. 	*/
		
	/*	System.out.println("Enter number:");
		int number = scanner.nextInt();
		int cnt=1; //counter
		int tmp1=number/10; //Auxiliary variable for calculation
		int result=0; //The final result to print
		int j=1; //Auxiliary variable for calculation
		
		while(tmp1!=0) {
			cnt++;
			tmp1/=10;
		}
		for(int i=0; i<cnt; i++)
		{
			int tmp2 = number%10; //Auxiliary the Modulo of number.
			if(i%2==0) //check if the index is 
			{ 
			    result+=(tmp2*j);
				j*=10;
			}
			number/=10;
		}
		//System.out.println("number of digits "+cnt); //self check.
		System.out.println(result);
	*/	
		
		
		
		
		
	/*  question 6: Create a new number so that its digits are like the original number,
        and to the right The digits are in reverse order. */
		
	/*	System.out.println("Enter number:");
		int number = scanner.nextInt();
		int cnt=1; //counter
		int tmp1=number/10; //Auxiliary variable for calculation.
		int result=0; //The final result to print.
		
		while(tmp1!=0) {
			cnt++;
			tmp1/=10;
		}
		int pro=1; //Auxiliary variable for to place the original number on the left side of the new number. 
		for(int i=1; i<cnt; i++)
		{
			pro*=10;
		}
		//System.out.println(pro);	//self check.
		//System.out.println("number of digits "+cnt); //self check.
			System.out.print(number);
			 for(int i=cnt; i>0; i--)
				{
					int tmp2 = number%10; // Modulo of number.
					result+=(tmp2*pro);
					pro/=10;	
					number/=10;
				}
			 System.out.print(result);
	*/
		
		
	 // question 8: - NOT Complete !!!!!!!!!!!!!!!!!!!
		
	/*	for(int i=11; i<100; i++)
		{
			int numerator=0 , denominator=0;
			int tmp1 = i%10; //Auxiliary the Modulo of number.
			int tmp2 = i/10; //Auxiliary the Modulo of number.
			String printResult="";
			float valueResult=0f;
			//int cnt=0;
			for(int j=22; j<100; j++)
			{
				int tmp3 = j%10; //Auxiliary the Modulo of number.
				int tmp4 = j/10; //Auxiliary the Modulo of number.
				printResult="";
				
				if(tmp1<=tmp2 && tmp1!=0 && tmp2!=0) 
				{ 
					numerator=tmp1; 
				}
				else {
					numerator=tmp2;
				}
				if(tmp3<=tmp4 && tmp3!=0 && tmp4!=0) 
				{ 
					denominator=tmp3;
				}
				else {
					denominator=tmp4;
				}				
				 //  printResult=(numerator+"/"+denominator);
				   valueResult= numerator/denominator;
				  // System.out.print(printResult);
				//   System.out.println();
				   if(valueResult<1) {
					   System.out.print("*** "+numerator+"/"+denominator);
					   System.out.println("The number is smaller then 1: "+valueResult);
					  
				   }
				   break;  
				  // cnt++;	   
				}		
			}			
		
		//System.out.println(cnt);
	*/	
		
		
		
		
	/*	// question 10: - NOT Complete !!!!!!!!!!!!!!!!!!!
       	
       			
			System.out.println("Enter number:");
			int number = scanner.nextInt();
			System.out.println("Enter digit:");
			int digit = scanner.nextInt();
			
			int cnt=1; //counter
			int tmp1=number; //Auxiliary variable for calculation.
			int tmp2=number; //Auxiliary variable for calculation.
			int result=0;
			int numberOfDigits=0;
			int pro=1; //Auxiliary variable for to place the original number on the left side of the new number. 
			for(int i=1; i<digit; i++)
			{
				pro*=10;
			}
			int pro_save=pro;
			for(int i=0;i<digit; i++) 
			{
				result=0; //The final result to print.
				
				while(cnt<=digit && tmp2!=0) {
					cnt++;
					tmp1=tmp2%10;
					result=result+(tmp1*pro);
					//System.out.println(result);
					tmp2/=10;
					pro/=10;
					//System.out.println(pro);
					numberOfDigits++;
				}
				System.out.print(result);
				pro=pro_save;
				cnt=1;
			}
			System.out.println();
			System.out.println("number of digits is: "+numberOfDigits);
			int finalResult;
			while(result!=0)
			{
				finalResult=result%pro;
				result/=10;
				System.out.println(finalResult);
				
			}
			//System.out.print(result);
			 
	 */
		
		


        scanner.close();

	
	}

}
