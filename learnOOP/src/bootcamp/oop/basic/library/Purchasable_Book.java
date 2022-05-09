package bootcamp.oop.basic.library;

import java.util.Random;

import bootcamp.oop.basic.library_interfaces.Purchasable;

public class Purchasable_Book extends Borrowable_Book implements Purchasable 
{
	// field
		protected float price;
		
	//constructors:	
	public Purchasable_Book(int bookTypeIndex, String title, int quantity, String authorName, String gender,int borrowingDays, float price)
	{			
		super(bookTypeIndex, title, quantity, authorName, gender, borrowingDays);
		setPrice(price);
	}
	
	public Purchasable_Book(int bookTypeIndex, String title, int quantity, String authorName, String gender, int borrowingDays)
	{			
		super(bookTypeIndex, title, quantity, authorName, gender, borrowingDays);
		setPrice(0);
	}
	
	public Purchasable_Book(int bookTypeIndex, String title, int quantity, String authorName, String gender, float price)
	{			
		super(bookTypeIndex, title, quantity, authorName, gender);
		setPrice(price);
	}
	
	public Purchasable_Book(int bookTypeIndex, String title, int quantity, String authorName, String gender)
	{			
		super(bookTypeIndex, title, quantity, authorName, gender);
		setPrice(0);
	}
	
	
	
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price >= 0) {
            this.price = price;
        } else {
            price = 0;
        }
    }
    
	public void pringMsg()
	{
		String msg = ("");
	    System.out.print(msg+toString());
	}

	@Override
	public String toString() 
	{
		String purchasStr = super.toString();
		purchasStr += String.format("The price of the purchas "+title+" is: "+price+" NIS.");		
		return purchasStr;
	}
	
	 public void buying_toString() {
	        if (quantity > 0) {
	            System.out.println("The price of the purchas "+title+" is: "+price+" NIS.");
	            quantity--;
	        } else {
	            System.out.println("Soory! there is No book of "+title+" to buy right now.");
	        }
	    }
	
	    public void approach() 
	 {
	        Random rand = new Random();
	        if (rand.nextBoolean()) {
	            if (rand.nextBoolean()) {
	            	borrowing_toString();
	            } else {
	                buying_toString();
	            }
	        } else {
	            super.reading_toString();
	        }
	    }

}
