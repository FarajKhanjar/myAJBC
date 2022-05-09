package bootcamp.hello.firstday;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World"); //syso
		//double myDou = 9.87;
		//int myInt = (int) myDou ; //casting. myDou = 9
		
		// ++var // מקדם את הערך של var+1 ומכניס את הערך שיצא לתוך result
		// var++ // הפוך
		// final //מוסכמה שהערך קבוע ולא משתנה. משתנה באותיות 
		// %.5f // print number with deook 5 bits after isronit point
		// -10e6 // 10 b7ezka 6 
		// -10e-6 // 10 b7ezka -6
		
		double price = 10e3 + (10e2)*7.5d;
		System.out.printf("Price of computer:%0+,12.2f",price); //Exercise
	}
}