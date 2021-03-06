package bootcamp.basic.methods;

import java.util.Scanner;

public class Ex_6 {

	public static int getPlusOneNumber(int number) //This method returned a new number +1 for each digit.	
	{		
		int moduloDigit,newDigit,multiply=1,result=0;
		 while(number !=0) {
			 moduloDigit = number%10;
			 newDigit = moduloDigit + 1;
			 if(newDigit==10) {
				 newDigit=0;
			 }
			 result+=(newDigit*multiply);
			 multiply*=10;
			 number/=10;
		 }
			return result;			
	}
	
	public static int checkDigitsOfTwoNumbers(int number1,int number2) //This method check if the number of the digits of two numbers are the same and returned a new number.
	{	
		final int defaultNumber=-1; //basicValue
		int saveNum1=number1,saveNum2=number2; //saving the source numbers.
		int cnt1=0,cnt2=0; //count the number of digits in each number.
		int moduloDigit,moduloDigit2,newDigit,multiply=1;//Auxiliary variables for calculation.
		int result=0;	//the final new number.
		 while(number1 !=0) {
			 moduloDigit = number1%10;
			 cnt1++;
			 number1/=10;
		 }
		 while(number2 !=0) {
			 moduloDigit = number2%10;
			 cnt2++;
			 number2/=10;
		 }
		 if(cnt1!=cnt2)
		 {
			 return defaultNumber;
		 }
		 else {		 
			 while(saveNum2 !=0) {
				 moduloDigit = saveNum1%10;
				 moduloDigit2 = saveNum2%10;
				 if(moduloDigit<=moduloDigit2) {
					 newDigit=moduloDigit;
				 }
				 else {
					 newDigit=moduloDigit2;
				 }
				 result+=(newDigit*multiply);
				 multiply*=10;
				 saveNum2/=10;
				 saveNum1/=10;
			 }
		 }
		 return result;
				
	}
	
	public static boolean checkMeshukhlalNumber(int number) //This method check if the number is a 'Meshukhlal-Number' or not.
	{	
	
		int sum=0; //sum of all digits with modulo  0 - int the number
		for(int i=2; i<number; i++)
		{
			if(number%i==0) {
				sum+=i;
			}		
		}
		sum+=1;
		if(sum==number)
		{
			return true;
		}
		else
		{
			return false;
		}				
	}
	
	public static int getSumOfNumberDigits(int number) //This method returned the sum of the digits of the number.
	{	
		int sum=0;
		int moduloDigit; //Auxiliary variable.
		 while(number !=0) {
			 moduloDigit = number%10;
			 sum+=moduloDigit; //the sum so far.
			 number/=10;
		 }
			return sum;			
	}
	
	public static int checkSumOfArrayElements(int[] array,int number) //This method returned the count of the elements in the array that there sum of the digits are 10.
	{	
		int elementSum; //Auxiliary variable.
		int cnt=0; //counter
		for(int i=0; i<number; i++)
		{
			elementSum = getSumOfNumberDigits(array[i]);
			if(elementSum == 10) {
				cnt++; 
			}
		}
		return cnt;
	}

	public static void printRhombusByChar(int number, String sign) //This method print a Rhombus By input sign char.
	{
		int saveNumber1 = number,saveNumber2 = number;
		final String defaultSign="_"; //basicValue 
		for(int i=0; i<number-1; i++)
		{
			System.out.print(sign);
			for(int j=0; j<saveNumber1; j++)
			{
			  if(j==(saveNumber1-1))
			  {		
				  for(int k=0; k<(i*2); k++)
				  {
					  System.out.print(defaultSign);
				  }	 
			  }
			  else {
				  System.out.print(sign);
			  }
			}
			saveNumber1-=1;
			for(int j=0; j<saveNumber2; j++)
			{
			  if(i==(saveNumber2-1))
			  {
				  System.out.print(defaultSign);
				  
				
			  }
			  else {
				  System.out.print(sign);
			  }
			}
			saveNumber2-=1;
			System.out.println();
		}
		
		int saveNumber3 = 2;
			for(int i=1;i<=number;i++)
               {
                for(int j=1;j<=saveNumber3-1;j++)                  
                {
                       System.out.print(sign);
                }            
	            for(int j=1;j<=number-i;j++)
                {
                  System.out.print(defaultSign);
                  System.out.print(defaultSign);
                }
                for(int j=1;j<=saveNumber3-1;j++)
                {
                  System.out.print(sign);
                }
                   
                System.out.println();
                saveNumber3+=1;
                   
               } 
		}
	
	public static boolean checkSumOfArrayElements(int[][] matrix) //This method check if the number is a 'Meshukhlal-Number' or not.
	{	
		int sum1=0; //sum of all elements in the row i
		int sum2=0; //sum of all elements in the col j
		int length = matrix[0].length;
		for(int i=0; i<length; i++)
		{
		  for(int j=0; j<length; j++)
		  {
			  sum1+=matrix[i][j];
			  sum2+=matrix[j][i];
			  		  
		  }
		  if(sum1!=sum2) {
			  return false;
		  }	
		  sum1=0;
		  sum2=0;
		}
		return true;					
	}
			  				
	public static boolean checkMirrorMatrix(int[][] matrix) //This method return true/false if the the Matrix is a 'Mirror-Matrix'.
	{	
		int cols=matrix[0].length; //number of columns in matrix.;
		int halfMatrix=cols/2;
		int index;
		for(int i=0; i<halfMatrix; i++)
		{
		  index = cols-i-1;
		    // System.out.println("col["+i+"]=col["+index+"]");      //self check
		  for(int[] row:matrix)
		  {
			//  System.out.println("["+row[i]+"]=["+row[index]+"]"); //self check.
			  if(row[i] != row[index])
			  {
				  return false;
			  }
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
	
	public static int[] add(int[] array1, int[] array2) //This method returned sum of two input arrays by a new build array.
	{
		int lengthArray1=array1.length; //number of element in array1;
		int lengthArray2=array2.length; //number of element in array2;
		int sum=0; //sum two numbers.
		int moduloDigit, placeDigit=1; //Auxiliary variable.
			
		for (int i = lengthArray1-1; i>=0; i--) {
			moduloDigit = (array1[i]*placeDigit); 
			sum+=moduloDigit;
			placeDigit*=10;
		}
		placeDigit=1;
		for (int i = lengthArray2-1; i>=0; i--) {
			moduloDigit = (array2[i]*placeDigit); 
			sum+=moduloDigit;
			placeDigit*=10;
		}
		System.out.println("The sum of the two numbers is:"+sum);
		int maxLength = getNumberOfNumberDigits(sum); //the new length of the new sum array.
		int[] sumArray=new int[maxLength];
		sumArray = buildArrayOfNumberDigits(sum,maxLength);
		return sumArray; //the final result.
	}
	 
	public static int checkLeftTopMatrix(int[][] matrix) //This method check and return the size of the left-top rectangle.
	{	
		int cnt=0,row=0,col=0,index=0,tmp1,tmp2;
		int size = matrix[0].length;
		while(index<=size) {
			if(matrix[row][col]!=0) {
				return cnt;
			}
			tmp1=row;
			row++;
			if(matrix[row][col]!=0) {
				return cnt;
			}
			tmp2=col;
			col++;
			if(matrix[tmp1][col]!=0) {
				return cnt;
			}
			row++;
			tmp2++;
			if(matrix[row][tmp2]!=0) {
				return cnt;
			}
			row++;
			col=0;
			index++;
			cnt++;
		}
		return cnt;
				
	}
	
	public static void main(String[] args) {
	
		
	/*	//Question 1: 
		//Write a method that returned a new number, that make +1 for each digit.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = scanner.nextInt();
		int newNumber=getPlusOneNumber(number);
		System.out.println("The new number is: "+newNumber);
		scanner.close();
	*/
		
		
	/*	//Question 2: 
		//Write a method that check if the number of the digits of two numbers are the same,
		//and returned a new number that each digit is the smeller between the two digits.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		int number2 = scanner.nextInt();
		int newNumber=checkDigitsOfTwoNumbers(number1,number2);
		System.out.println(newNumber);
		scanner.close();
	*/
		
		
	/*	//Question 3: 
		//Write a method that check if the number is a 'Meshukhlal-Number' or not.		
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter your number:");
		//int number = scanner.nextInt();	
		for(int i=1; i<=10000; i++)
		{
			boolean result=checkMeshukhlalNumber(i);
			if(result==true) {
			System.out.println(result+" - "+i);
			}
		}
		scanner.close();
	*/
		
		
	/*	//Question 4: 
		// a)Write a method that return the sum of the digits of the number.
		// b)Write a new method that count the number of 
		//   elements in the array that there sum of the digits are 10.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = scanner.nextInt();	
		int sum,elementCounter;
		sum=getSumOfNumberDigits(number);
		System.out.println("the sum of number digits is: "+sum);
		System.out.println();
		
		System.out.println("Enter the array length:");
		int arraySize = scanner.nextInt();	
		int[] array = new int[arraySize];
		System.out.print("Enter "+arraySize+" numbers: ");
		for(int i=0 ; i<arraySize ; i++)
		{
			array[i] = scanner.nextInt();
		}
		elementCounter=checkSumOfArrayElements(array,arraySize);
		System.out.println("the number of elements in the array that there sum of the digits are 10: "+elementCounter);
		scanner.close();
	*/
		
		//Question 5: 
		//Write a method that print a Rhombus By input sign char.
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = scanner.nextInt();
		System.out.println("Enter your sign char:");
		String sign = scanner.next();
		printRhombusByChar(number,sign);
		scanner.close();
	*/
		
		//Question 6: 
		// Write a method that return true/false if the sum of the rows and
		// the Columns are equal.
	/*	Scanner scanner = new Scanner(System.in);
	 * 
	 
	*	int[][] matrix = {
		           {1,2,3,4},
		           {2,9,6,4},
		           {3,6,10,2},
		           {4,3,2,1}
		                  };
	*
		int[][] matrix = {
		           {2,1,5},
		           {6,7,3},
		           {0,8,0}
		                  };
	          
		boolean result;
		result=checkSumOfArrayElements(matrix);
		System.out.println(result);
		scanner.close();

	*/
		
		
		//Question 7: 
		// Write a method that return true/false if the the Matrix is a 'Mirror-Matrix'.
	/* 	Scanner scanner = new Scanner(System.in);
 
		// True-Matrix Example:
		   int[][] matrix = {          
			           {2,1,5,1,2},
			           {6,7,3,7,6},
			           {0,8,0,8,0},
			                  };
				
		// True-Matrix Example:
		/*   int[][] matrix = {        
			           {2,1,5,5,1,2},
			           {6,7,3,3,7,6},
			           {0,8,0,0,8,0}
			                  };
		*/	                  
			//False-Matrix Example:
		/*	int[][] matrix = {       
			           {2,1,5,1,5},
			           {6,7,3,8,3},
			           {0,8,0,8,0}
			                  };
		 */        
	/*		boolean result;
    		result=checkMirrorMatrix(matrix);
			System.out.println(result);
			scanner.close();
	*/
	
		
		
		//Question 8: 
		//Write a method that build a new array of the digits of the sum of two another arrays.
		
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		int number1 = scanner.nextInt();
		System.out.println("Enter second number:");
		int number2 = scanner.nextInt();
		int cnt1=getNumberOfNumberDigits(number1);
		int cnt2=getNumberOfNumberDigits(number2);
		int[] array1=new int[cnt1];
		int[] array2=new int[cnt2];
		
		array1 = buildArrayOfNumberDigits(number1,cnt1);
		array2 = buildArrayOfNumberDigits(number2,cnt2);

		int[] sumArray=add(array1,array2);
		for(int element:sumArray) 
		{
			System.out.print(element+" ");
		}
		scanner.close();
	
		
		
		
		//Question 9: ------ NOT COMPLETED!!!!!!!!!!!!!!!!!!!!!!
		//Write a method that check and return the size of the left-top rectangle.
	/*
		int[][] matrix = {
		           {0,0,0,0},
		           {0,0,0,0},
		           {0,5,100,0},
		           {0,0,0,10}
		                  };
	
		int[][] matrix = {
		           {0,0,0},
		           {0,0,0},
		           {0,0,0}
		                  };
	
		Scanner scanner = new Scanner(System.in);
		int sizeResult;
		sizeResult=checkLeftTopMatrix(matrix);
		System.out.println(sizeResult);
		scanner.close();
	*/
		
		
		//Question 11: 
		//Murble Puzzle

	}

}
