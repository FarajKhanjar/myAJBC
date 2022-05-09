package bootcamp.oop.basic.delivery_Runner;

import java.util.Random;
import bootcamp.oop.basic.delivery.Delivery;
import bootcamp.oop.basic.delivery.ParcelDelivery;
import bootcamp.oop.basic.delivery.PizzaDelivery;

public class Runner {

	public static void main(String[] args) 
	{
		System.out.println("Sitting in my home office, I suddenly heard the doorbell.\n"
				+ "I wonder who might it be ?");
		
		String clientName = "Faraj Khanjar";
		String address = "Tel Aviv";
		//long IDnumber=1593852456;
		
		//Delivery delivery1 = new Delivery(clientName, address);
		Delivery delivery = null;
		
		Random rand = new Random();
		int opt = rand.nextInt();

		if (opt%2 == 0) 
		{
			System.out.println("Great it's the pizza guy! \n");
			String[] description = {"A tomato and mushrom", "A zukini with extra cheese", "Very hot pizza"};
			float bill = 110f;
			delivery = new PizzaDelivery(clientName, address, description, bill);		
			//pizza.deliver();
			//System.out.println(pizzaDelivery1);
		}
		else 
		{
			System.out.println("Oh I totally forgot I'd ordered this! \n");
			int numItems = 2;
			boolean isDoorside = false;
			delivery = new ParcelDelivery(clientName, address, numItems, isDoorside);
			//parcel.deliver();
			//System.out.println(parcelDelivery1);
		}
		
		delivery.deliver();
		System.out.println("\nGreat, thanks a lot");
		
	}
}
