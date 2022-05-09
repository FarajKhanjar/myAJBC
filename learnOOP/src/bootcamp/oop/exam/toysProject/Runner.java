package bootcamp.oop.exam.toysProject;

import java.time.LocalDate;
import java.util.Scanner;

import bootcamp.oop.exam.toysProject_classes.BrokenToy;
import bootcamp.oop.exam.toysProject_classes.Electric;
import bootcamp.oop.exam.toysProject_classes.Hard;
import bootcamp.oop.exam.toysProject_classes.Soft;
import bootcamp.oop.exam.toysProject_classes.Toy;


public class Runner 
{
	public static Scanner scanner = new Scanner(System.in);
	
	public static Toy[] arrayOfToys()
	{
	//	LocalDate kidBirthDate ; 
	//	Kid kid1 = new kid1("Rami" , kidBirthDate);
		Toy[] toysArray = new Toy[7];
		String name;
		LocalDate purchaseDate = null;
		int index=0;
		
		name = "TeddyBear";
		long serialNumber0 = (int)(Math.random()*1000);
		Toy toy0 = new BrokenToy(serialNumber0, name, purchaseDate, 3 , 0);
		toysArray[index] = toy0;		

		index++;
		float ageOfToy = (int)(Math.random()*12); // months between 0 -> 12
		name = "TeddyBear";
		long serialNumber1 = (int)(Math.random()*1000);
		Toy toy1 = new Soft(serialNumber1, name, purchaseDate, ageOfToy, 1 , 0 , 0 , 5 , 0 , 0);
		toysArray[index] = toy1;
		
		index++;
		ageOfToy = (int)(Math.random()*3); // a year age between 0 -> 3
		name = "WinnieThePooh";
		long serialNumber2 = (int)(Math.random()*1000);
		Toy toy2 = new Soft(serialNumber2, name, purchaseDate, ageOfToy, 1 , 0 , 0 , 5 , 0 , 1);
		toysArray[index] = toy2;
		
		index++;
		ageOfToy = (int)(Math.random()*3); // a year age between 0 -> 3
		name = "LitePuzzle";
		long serialNumber3 = (int)(Math.random()*1000);
		Toy toy3 = new Hard(serialNumber3, name, purchaseDate, ageOfToy, 1 , 0 , 1 , 2 , 1 , 1);
		toysArray[index] = toy3;
		
		index++;
		name = "Barbie";
		ageOfToy = (int)(Math.random()*3); // a year age between 0 -> 3
		long serialNumber4 = (int)(Math.random()*1000);
		Toy toy4 = new Hard(serialNumber4, name, purchaseDate, ageOfToy, 1 , 0 , 1 , 6 , 1 , 0);
		toysArray[index] = toy4;
		
		index++;
		name = "GUITAR";
		ageOfToy = (int)(Math.random()*3); // a year age between 0 -> 3
		long serialNumber5 = (int)(Math.random()*1000);
		Toy toy5 = new Electric(serialNumber5, name, purchaseDate, ageOfToy, 1 , 0 , 1 , 2 , 1, 1);
		toysArray[index] = toy5;
		
		index++;
		name = "Dinosaur";
		ageOfToy = (int)(Math.random()*3); // a year age between 0 -> 3
		long serialNumber6 = (int)(Math.random()*1000);
		Toy toy6 = new Electric(serialNumber6, name, purchaseDate, ageOfToy, 1 , 0 , 1 , 5 , 1, 2);
		toysArray[index] = toy6;
			
		return toysArray;
		
	}



	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to our Toys Place :) \n");
		
		int totalDirtiness=0;
		Toy[] toysArray = arrayOfToys();
		
		// Playable toy = createtoy();    
		// toy.print();
		    
		for (Toy toy : toysArray) 
		{
			System.out.println(toy.toString());
		}
				
		scanner.close();

	}

}
