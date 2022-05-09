package bootcamp.oop.basic.library_Runner;

import java.util.Random;
import java.util.Scanner;

import bootcamp.oop.basic.library.Book;
import bootcamp.oop.basic.library.Borrowable_Book;
import bootcamp.oop.basic.library.Purchasable_Book;
import bootcamp.oop.basic.library.Readable_Book;
import bootcamp.oop.basic.library.Returning_Book;

public class Runner {

	public static Scanner scanner = new Scanner(System.in);

	public static Book[] arrayOfBooks()
	{
		Book[] booksArray = new Book[8];
		int index=0, quantity,borrowingDays;
		float price;
		String title,authorName,gender;
		Random rand = new Random();
		int randIndex;
		
			title = "'The future'";
			quantity = (int) (Math.random()*5);
			authorName = "David Goren";
			gender = "m";
			randIndex = (int)(Math.random()*3);
			Book book1 = new Readable_Book(randIndex, title, quantity, authorName, gender);
			booksArray[index] = book1;
			
			index++;
			title = "'The secret'";
			quantity = (int) (Math.random()*3);
			authorName = "Sarah Amr";
			gender = "f";
			randIndex = (int)(Math.random()*3);
			borrowingDays = (int)(Math.random()*30);
			Book book2 = new Borrowable_Book(randIndex, title, quantity, authorName, gender,borrowingDays);
			booksArray[index] = book2;
			
			index++;
			title = "'What if?'";
			quantity = (int) (Math.random()*2);
			authorName = "David geary";
			gender = "m";
			randIndex = (int)(Math.random()*3);
			price = (int)(Math.random()*60);
			Book book3 = new Readable_Book(randIndex, title, quantity, authorName, gender);
			booksArray[index] = book3;
			
			index++;			
			title = "'Computer science'";
			quantity = (int) (Math.random()*10);
			authorName = "Oren Goren";
			gender = "m";
			randIndex = (int)(Math.random()*3);
			price = (int)(Math.random()*100);
			Book book4 = new Purchasable_Book(randIndex, title, quantity, authorName, gender,price);
			booksArray[index] = book4;
			
			index++;
			title = "'Math an Matlab'";
			quantity = 0;
			authorName = "Ariela Granut";
			gender = "f";
			randIndex = (int)(Math.random()*3);
			//Book book5 = new Returning_Book(randIndex, title, quantity, authorName, gender);
			Book book5 = new Borrowable_Book(randIndex, title, quantity, authorName, gender);	
			booksArray[index] = book5;
			
			index++;
			title = "'Here I am'";
			quantity = (int) (Math.random()*8);
			authorName = "Nera bob";
			gender = "f";
			randIndex = (int)(Math.random()*3);
			borrowingDays = (int)(Math.random()*60);
			Book book6 = new Borrowable_Book(randIndex, title, quantity, authorName, gender,borrowingDays);
			booksArray[index] = book6;
			
			index++;			
			title = "'Love is a losing game'";
			quantity = (int) (Math.random()*3);
			authorName = "Amy Ashel";
			gender = "f";
			randIndex = (int)(Math.random()*3);
			borrowingDays=(int)(Math.random()*60);
			Book book7 = new Borrowable_Book(randIndex, title, quantity, authorName, gender,borrowingDays);
			booksArray[index] = book7;
			
			index++;
			title = "'Solaredge'";
			quantity = 1;
			authorName = "Sami Shimo";
			gender = "m";
			randIndex = (int)(Math.random()*3);
			Book book8 = new Purchasable_Book(randIndex, title, quantity, authorName, gender,price);
			booksArray[index] = book8;
		
		return booksArray;
		
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to our laibrary :) \n");
		
		int totalQuantityOfBooks=0;
		Book[] booksArray = arrayOfBooks();
		
		for(int i=0;i<booksArray.length;i++){
			
			totalQuantityOfBooks+=booksArray[i].getBookQuantity();
		}
		System.out.println("---->>>>The total quantity Of our Books today is: "+totalQuantityOfBooks);
		System.out.println("----------------------------------------------------");
		for (Book book : booksArray) {
			System.out.println(book.toString());
		}
		System.out.println("\n-------------------------------------------");
		System.out.println("In the end of the day:");		
		for (Book book : booksArray) {
			book.approach();
		}
		System.out.println("-------------------------------------------\n");
		for (Book book : booksArray) {
			System.out.println(book.toString()+"\n");
		}
		
		System.out.println();
		totalQuantityOfBooks=0;
		for(int i=0;i<booksArray.length;i++)
		{
			totalQuantityOfBooks+=booksArray[i].getBookQuantity();
		}
		System.out.println("---->>>>The total quantity Of the Books right now: "+totalQuantityOfBooks);
		System.out.println("-----------------------------------------------------");
		System.out.println("\nThanks! and have a nice day :)");
		
		scanner.close();
	}
}
