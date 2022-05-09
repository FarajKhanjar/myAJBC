package bootcamp.oop.basic.delivery;

import java.util.Arrays;

public class PizzaDelivery extends Delivery 
{
	
// field	
	protected String[] description;
	protected float bill;

//constructor	
	public PizzaDelivery(String clientName, String address, String[] description, float bill) {
		
		super(clientName, address);
		this.description = Arrays.copyOf(description, description.length); //saving the original description array.
		this.bill = bill;
	}
	
	public void deliver()
	{
		String msg = ("Hi! I have a pizza ");
	    System.out.print(msg+toString());
	}

	@Override
	public String toString() 
	{
		String pizzaStr = super.toString();
		pizzaStr += String.format("Total of pizzas is: "+description.length+"  \n");	
		for(String desc: description)
		{
			pizzaStr += String.format(desc+" \n");
		}
		pizzaStr +="Your total is "+bill+" \n";
		return pizzaStr;
	}

}
