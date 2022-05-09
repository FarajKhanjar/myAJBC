package bootcamp.basic.methods;

import java.util.Scanner;

import java.lang.Math;
import java.util.Random;

public class Lesson_exercises {

	public static float averageOfThreeGrades() //This method returned the average of three grades
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first grade:");
		float num1 = scanner.nextFloat();
		System.out.println("Enter your second grade:");
		float num2 = scanner.nextFloat();
		System.out.println("Enter your third grade:");
		float num3 = scanner.nextFloat();
		
		float sum=num1+num2+num3;
		float avg = sum/3;
		scanner.close();
		return avg;
	}
	
	public static void printAverageOfThreeGrades(int num1,int num2,int num3) //This method print the average of three grades
	{
		float sum=num1+num2+num3;
		float avg = sum/3;
		
		System.out.println("The average is: "+avg);
	}
	
	public static int maxOfNumbers(int num1,int num2,int num3) //This method returned the max of three numbers.
	{		
		if(num1>=num2 && num1>=num3) {
			return num1;
		}
		else if (num2>=num1 && num2>=num3) {
			return num2;
		}
		else {
			return num3;
		}	
	}
	
	public static int maxOfNumbers(int num1,int num2) //This method returned the max of three numbers.
	{		
		if(num1>=num2) {
			return num1;
		}
		else {
			return num2;
		}	
	}
	
	public static int[] buildArrayWithRandomElements(int number) //This method returned an array (length number) with random elements.
	{		
		//Random rd = new Random();	    
		int[] array = new int[number];	
		for(int i=0; i<number; i++)
		{
		  // array[i] = rd.nextInt(100 + 100) -100; // storing random integers in an array, ((max - min)+1) - min)
			 array[i] = (int)(Math.random()*201) - 100; // another way.
		}
		return array;
	}
	
	public static void sumOfTheArrays(int[] array1,int[] array2) //This method returned the count of the elements in the array that there sum of the digits are 10.
	{	
		int lengthArr1=array1.length;
		int lengthArr2=array2.length;
		int[] elementSum = new int[lengthArr2];
		int[] finalArray;
		if(lengthArr1>=lengthArr2)
		{
			finalArray = new int[lengthArr1];
			for(int i=0; i<lengthArr1; i++)
			{
				elementSum = new int[lengthArr1];
				elementSum = buildNewArraySum(array1[i],finalArray);
			}
		}
		else
		{
			finalArray = new int[lengthArr2];
			for(int i=0; i<lengthArr2; i++)
			{
				elementSum = new int[lengthArr1];
				elementSum = buildNewArraySum(array2[i],finalArray);
			}
		}
		
		for(int i=0; i<elementSum.length; i++)
		{	
	         System.out.print(elementSum[i]+" "); // printing each array element
		}	
			
	}

	public static int[] buildNewArraySum(int element,int[] finalArray) //This method returned the sum of the digits of the number.
	{	
		int elementSum1, elementSum2; //Auxiliary variable.
		int arrayLength = finalArray.length;
		for(int i=0; i<arrayLength; i++)
		{
			finalArray[i] = element;
		}
		return finalArray;
			
	}
	
	public static int[] concatArr(int[] array1, int[] array2) //This method returned a new array of two input arrays. "SHERSHOR"
	{
		
		int lengthArray1=array1.length; //number of element in array1;
		int lengthArray2=array2.length; //number of element in array2;
		int arrayLength=lengthArray1+lengthArray2;
				
		int[] newArray=new int[arrayLength];
		
		for (int i = 0; i<lengthArray1; i++) {
			newArray[i]=array1[i];
		}
		for (int i = 0; i<lengthArray2; i++) {
			newArray[lengthArray1+i]=array2[i];									
		}
		return newArray;			
	}
	
	public static void main(String[] args) {
		
	//	float avg=averageOfThreeGrades();
	//	System.out.println("The average is: %.2f"+avg);
		
		Scanner scanner = new Scanner(System.in);
	/*	System.out.println("Enter your first grade/number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter your second grade/number:");
		int num2 = scanner.nextInt();
		System.out.println("Enter your third grade/number:");
		int num3 = scanner.nextInt();
	
		
		printAverageOfThreeGrades(num1,num2,num3);
		int maxNumber=maxOfNumbers(num1,num2,num3);
		int maxNumber2=maxOfNumbers(num1,num2);
		System.out.println("The Max is: "+maxNumber);
		System.out.println("The Max is: "+maxNumber2);
	*/
		
	/*	double x=10*Math.sin(Math.PI/4); //ex using Math.
		System.out.println(x);
		
		double y=Math.toRadians(120); //degrees to radian
		System.out.println(y); 
	*/	
		
	/*	System.out.println("Enter array length: ");
		int number = scanner.nextInt();
		
		int[] array = buildArrayWithRandomElements(number);

		for(int i=0; i<number; i++)
		{	
	         System.out.print(array[i]+" "); // printing each array element
		}
		
	*/
		
		int[] array1 = {3, 7, 0, -4, 5};
		int[] array2 = {10, -4, 14};
		int[] newArr = concatArr(array1,array2);
		for(int i=0; i<newArr.length; i++)
		{	
	         System.out.print(newArr[i]+" "); // printing each array element
		}
	
		
		
		scanner.close();
	}

}
