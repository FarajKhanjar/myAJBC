package bootcamp.basic.Exam_070422;

import java.util.Scanner;

import java.lang.Math;

public class Runner {

	public static boolean checkPalindromeNumber(int[] array) //This method return true/false if the the Array is a 'PalindromeNumbe'.
	{	
		int length=array.length; //length of the array.;
		int index;
		for(int i=0; i<length; i++)
		{
		  index = length-i-1;
			  if(array[i] != array[index])
			  {
				  return false;
			  }		  
		}
		return true;	  				
	}
	
	public static int getNumberOfNumberDigits(int number) //This method returned the cnt-number of the digits of the number.
	{	
		int cnt=0; //counter
		int moduloDigit; //Auxiliary variable.
		 while(number !=0) {
			 moduloDigit = number%10;
			 cnt++; //the counter so far.
			 number/=10;
		 }
			return cnt;			
	}
	
	public static int[] buildArrayOfNumberDigits(int number, int arrayLength) //This method build and return new array by number input & length.
	{	
		int[] array=new int[arrayLength];
		int moduloDigit; //Auxiliary variable.
		for (int i = arrayLength-1; i>=0; i--) {
			moduloDigit = number%10;
			array[i]=moduloDigit;
			number/=10;
		}
			return array;			
	}
	
	//////// Q4:
	
	public static int[] add(int[] array1, int[] array2) //This method returned sum of two input arrays by a new build array.
	{
		int lengthArray1=array1.length; //number of element in array1;
		int lengthArray2=array2.length; //number of element in array2;
		int sum1=sum1array(array1); //sum of element in array1.
		int sum2=sum1array(array2); //sum of element in array2.
	
		int lengthTwoArray=lengthArray1+lengthArray2;
		int sumTwoArrays=sum1+sum2;
		int difTwoArrays=Math.abs(sum1-sum2); //absolute difference between two numbers.
		
		//System.out.println("The length of the New Array is:"+(lengthTwoArray+2));
		int[] newBuildArray=new int[lengthTwoArray+2];

		if(sum1>sum2) {	
			int minSum = lengthArray2;
			newBuildArray=concatArrays(array1,array2,minSum);
			//System.out.println(minSum);
		}
		else
		{
			int minSum = lengthArray1;
			newBuildArray=concatArrays(array2,array1,minSum);
		}

		newBuildArray[lengthTwoArray]=sumTwoArrays;
		newBuildArray[lengthTwoArray+1]=difTwoArrays;
		return newBuildArray; //the final result.
	}
	
	public static int sum1array(int[] array) //This method returned sum of the elements in the array.
	{
			
	int sum=0; //the sum of the elements in Array.
	for(int i=0 ; i<array.length ; i++)
	{
		sum+=array[i];
	}
	return sum;
	}
	
	public static int[] concatArrays(int[] array1, int[] array2,int index) //This method returned a new array of two input arrays. "SHERSHOR"
	{
		int lengthArray1=array1.length; //number of element in array1;
		int lengthArray2=array2.length; //number of element in array2;
		int arrayLength=lengthArray1+lengthArray2;
				
		int[] newBuildArray=new int[arrayLength+2];
		for(int i=0;i<lengthArray2;i++)
        {
			newBuildArray[i]=array2[i];
        }			
		for(int i=0;i<lengthArray1;i++)
        {
        	newBuildArray[index]=array1[i];
        	index++;
        }
		
		return newBuildArray;
	}

	public static void main(String[] args) {
		
	/* Question 1:
	  JDK is a software/Kit development.
	  JRE is a software that allows the code or the program to run. java Runtime Environment.
	  JVM is an environment for executing bytecode. 
	  Java Virtual Machine - this is what makes Java platform independent language.
	 	
	*/
		
		
     /* Question 2:
		  in the command prompt (cmd) on Windows we write our code.
		  we get a program ".java" extension.
		  
		  Compile our work - gives the javac command and the .java files are converted
		   into language understood by the Java virtual machine
		   Any compile time errors are raised here in this time.
		   after that the  program is loaded into memory;
		   i thinkk it can be loaded from your hard disk 
           in the end The bytecode verifier checks if the bytecode loaded are valid
           and we get The JVM interprets the program one bytecode at a time and runs the program.
	*/

		  
	
		
		//Question 3:
		//Write a method that check if a number is a parameter number.
		//Palindrome is a number that reads forward and backward in the same way.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Question 3:");
		System.out.println("Enter your number:");
		int number = scanner.nextInt();	
		int cnt=getNumberOfNumberDigits(number);
		int[] array=new int[cnt];		
		array = buildArrayOfNumberDigits(number,cnt);
		for(int element:array) 
		{
			System.out.print(element+" ");
		}
		
		boolean result;
		result=checkPalindromeNumber(array);
		System.out.println();
		System.out.println(result);
	//	scanner.close();		
	
		
		
		
	    //Question 4:
	//  Scanner scanner = new Scanner(System.in);
		int[] array1 = {7, 8, -4}; //length for example
		int[] array2 = {-5, 7, 3, 2}; //length for example
	//	int[] array1 = {17, 8, -4, 10, -5}; //length for example
	//	int[] array2 = {-14,15, 12,}; //length for example
		
		System.out.println("Question 4:");
		int[] finalArray=add(array1,array2);
		for(int element:finalArray) 
		{
			System.out.print(element+" ");
		}
		scanner.close();
	
	}

}