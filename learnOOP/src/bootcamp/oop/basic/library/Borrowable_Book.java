package bootcamp.oop.basic.library;

import java.util.Random;

import bootcamp.oop.basic.library_interfaces.Borrowable;

public class Borrowable_Book extends Readable_Book implements Borrowable 
{
	// field
	protected int borrowingDays;
	
	//constructor	
	public Borrowable_Book(int bookTypeIndex, String title, int quantity, String authorName, String gender, int borrowingDays)
	{			
		super(bookTypeIndex, title, quantity, authorName, gender);
		setBorrowedDays(borrowingDays);
	}
	
	public Borrowable_Book(int bookTypeIndex, String title, int quantity, String authorName, String gender)
	{			
		super(bookTypeIndex, title, quantity, authorName, gender);
		setBorrowedDays(0);
	}
	
	public int getBorrowedDays() {
        return borrowingDays;
    }

    public void setBorrowedDays(int borrowingDays) {
        if (borrowingDays >= 0) {
            this.borrowingDays = borrowingDays;
        } else {
        	borrowingDays = 0;
        }
    }
	
			

	@Override
	public String toString() 
	{
		String borrowingStr = super.toString();
		borrowingStr += String.format("Time for Borrowing "+title+" book, is: "+borrowingDays+" days. \n");		
		return borrowingStr;
	}
	
	public void borrowing_toString() {
        if (quantity > 0) {
      //      Random rand = new Random();
      //      setBorrowedDays(rand.nextInt(20));
            System.out.println("Borrowing " + title + " " + bookType + " book for " + borrowingDays + " days");
            quantity--;
        } else {
            System.out.println("Soory! there is No book of "+title+" for borrowing");
        }
    }
	
	public void returnBorrowing() {

        System.out.println("Thanks for, Returning " + title + " - " + bookType + " book");
        quantity++;
    }
	
	@Override
    public void approach() {
        Random rand = new Random();
        if (rand.nextBoolean()) {
            if (rand.nextBoolean()) {
                borrowing_toString();
            } else {
                returnBorrowing();
            }
        } else {
            super.reading_toString();
        }
    }

}
