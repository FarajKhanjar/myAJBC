package bootcamp.oop.drinksProject.DrinksMachine;

import java.util.Scanner;

import bootcamp.oop.drinksProject.DrinksMachine_classes.AppleJuice;
import bootcamp.oop.drinksProject.DrinksMachine_classes.Cappuccino;
import bootcamp.oop.drinksProject.DrinksMachine_classes.Chocolate;
import bootcamp.oop.drinksProject.DrinksMachine_classes.Cola;
import bootcamp.oop.drinksProject.DrinksMachine_classes.Drink;
import bootcamp.oop.drinksProject.DrinksMachine_classes.Espresso;
import bootcamp.oop.drinksProject.DrinksMachine_classes.Latte;
import bootcamp.oop.drinksProject.DrinksMachine_classes.OrangeJuice;
import bootcamp.oop.drinksProject.DrinksMachine_classes.Sprite;
import bootcamp.oop.drinksProject.DrinksMachine_interfaces.Produceable;

public class Runner 
{
	public static Scanner scanner = new Scanner(System.in);
	
	/**
	 * In this method we build a new drink by a basic and random values.
	 * @param index of which drink is chosen.
	 * @return a new drink.
	 */
	public static Drink createOneDrinkByIndexInput(int index)
	{
		float volume = (int)(Math.random()*151) + 50; //A random value between 50->200 cc.
		float price = (int)(Math.random()*11)+5; //A random value between 5->15 NIS.		
		float temperature;
		int drinkTypeIndex;
		if(index == 1) //Create new HotChocolate.
		{
			drinkTypeIndex = 1; // Hot drink.
			temperature = (int)(Math.random()*31) + 60; //A random value of the hot temperature between 30->60 degrees
			int quantityOfSugar = (int) (Math.random()*5); //A random value of the quantity of Sugar.
			int hotTypeIndex = 1; //A Chocolate-Based Hot drink.
			int chocolateBasedTypeIndex = 0; //There is one hot drink that based on chocolate (water and milk). 
			int choclateDrinkType = (int) (Math.random()*2); //A random value of the chocolate-based type, (Water or Milk).
			Drink drink = new Chocolate(volume, price, drinkTypeIndex, temperature, quantityOfSugar, hotTypeIndex,chocolateBasedTypeIndex,choclateDrinkType);
			return drink;										
		}
		if(index == 2) //Create new Espresso.
		{
			drinkTypeIndex = 1;
			temperature = (int)(Math.random()*31) + 60; //A random value of the hot temperature between 30->60 degrees
			int quantityOfSugar = (int) (Math.random()*5); //A random value of the quantity of Sugar.
			int hotTypeIndex = 0; //A Coffee-Based Hot drink.				
			int coffeeBasedTypeIndex = 0; // Coffee type, Espresso hot drink.
			
			int shotEspressoTypeIndex = (int) (Math.random()*3);// A random value of the quantity of the shots in the Espresso drink, (Single or Double or Triple).			
			Drink drink = new Espresso(volume, price, drinkTypeIndex, temperature, quantityOfSugar, hotTypeIndex, coffeeBasedTypeIndex, shotEspressoTypeIndex);
			return drink;
		}
															
		if(index == 3) //Create new Cappuccino.
		{
			drinkTypeIndex = 1;
			temperature = (int)(Math.random()*31) + 60; //A random value of the hot temperature between 30->60 degrees
			int quantityOfSugar = (int) (Math.random()*5); //A random value of the quantity of Sugar.
			int hotTypeIndex = 0; //A Coffee-Based Hot drink.				
			int coffeeBasedTypeIndex = 1; //A random value of the Coffee type, (Espresso or Cappuccino or Late) hot drink.
			volume = (int)(Math.random()*101) + 100; //A random value between 100->200 cc.
			Drink drink = new Cappuccino(volume, price, drinkTypeIndex, temperature, quantityOfSugar, hotTypeIndex, coffeeBasedTypeIndex);
			return drink;
			}
		if(index == 4) //Create new Latte.
		{
			drinkTypeIndex = 1;
			temperature = (int)(Math.random()*31) + 60; //A random value of the hot temperature between 30->60 degrees
			int quantityOfSugar = (int) (Math.random()*5); //A random value of the quantity of Sugar.
			int hotTypeIndex = 0; //A Coffee-Based Hot drink.				
			int coffeeBasedTypeIndex = 1; //A random value of the Coffee type, (Espresso or Cappuccino or Late) hot drink.
			
			volume = (int)(Math.random()*51) + 150; //A random value between 150->200 cc.
			Drink drink = new Latte(volume, price, drinkTypeIndex, temperature, quantityOfSugar, hotTypeIndex, coffeeBasedTypeIndex);
			return drink;
		}
		
		if(index == 5) //Create new Cola.
		{
			drinkTypeIndex = 0; // Cold drink.
			temperature = (int)(Math.random()*4)+2; //A random value of the cold temperature between 2->5 degrees.
			int coldTypeIndex = 0; //A Soda cold drink.
			int sodaDrinkTypeIndex = 0; //A Cola cold drink.
			int purchasedDrinkIndex = (int) (Math.random()*2); //A random value -> Can or Bottle purchased drink.
				
			Drink drink = new Cola(volume, price, drinkTypeIndex, temperature, coldTypeIndex, purchasedDrinkIndex, sodaDrinkTypeIndex);
			return drink;
		}
		
		if(index == 6) //Create new Sprite.
		{
			drinkTypeIndex = 0; // Cold drink.
			temperature = (int)(Math.random()*4)+2; //A random value of the cold temperature between 2->5 degrees.
			int coldTypeIndex = 0; //A Soda cold drink.
			int sodaDrinkTypeIndex = 1; //A Sprite cold drink.
			int purchasedDrinkIndex = (int) (Math.random()*2); //A random value -> Can or Bottle purchased drink.
				
			Drink drink = new Sprite(volume, price, drinkTypeIndex, temperature, coldTypeIndex, purchasedDrinkIndex, sodaDrinkTypeIndex);
			return drink;
		}
		
		if(index == 7) //Create new Orange Juice.
		{
			drinkTypeIndex = 0; // Cold drink.
			temperature = (int)(Math.random()*4)+2; //A random value of the cold temperature between 2->5 degrees.
			int coldTypeIndex = 1; //A Soft cold drink.
			int softDrinkTypeIndex = 0; //A Orange Juice cold drink.
			int squeezedDrinkIndex = (int) (Math.random()*2); //A random value -> Machine or Pasteurized Squeeze drink.
			
			Drink drink = new OrangeJuice(volume, price, drinkTypeIndex, temperature, coldTypeIndex, squeezedDrinkIndex, softDrinkTypeIndex);
			return drink;
		}
		
		if(index == 8) //Create new Apple Juice.
		{
			drinkTypeIndex = 0; // Cold drink.
			temperature = (int)(Math.random()*4)+2; //A random value of the cold temperature between 2->5 degrees.
			int coldTypeIndex = 1; //A Soft cold drink.
			int softDrinkTypeIndex = 1; //A Apple Juice cold drink.
			int squeezedDrinkIndex = (int) (Math.random()*2); //A random value -> Machine or Pasteurized Squeeze drink.
			
			Drink drink = new AppleJuice(volume, price, drinkTypeIndex, temperature, coldTypeIndex, squeezedDrinkIndex, softDrinkTypeIndex);
			return drink;
		}
		return null;			
	}

	/** Drink[] arrayOfDrinks: {Its another way to solve this Ex.}
	 * This method build a array of drinks.
	 * @return A array of the whole drinks, length: 8
	 * The values ​​of the drinks as required in the exercise, 
	 * and some with random values ​​as well as required.  
	 */
	public static Drink[] arrayOfDrinks()
	{
		Drink[] drinksArray = new Drink[8];
		
		for(int i=0; i<drinksArray.length; i++)
		{
		float volume = (int)(Math.random()*151) + 50; //A random value between 50->200 cc.
		float price = (int)(Math.random()*11)+5; //A random value between 5->15 NIS.
		int drinkTypeIndex = (int) (Math.random()*2); //A random value -> Hot or Cold drink.
		float temperature;
		
		if(drinkTypeIndex==0) 
		{
			temperature = (int)(Math.random()*4)+2; //A random value of the cold temperature between 2->5 degrees.
			int coldTypeIndex = (int) (Math.random()*2); //A random value -> Soda or Soft cold drink.
			
			if(coldTypeIndex==0)
			{
				int sodaDrinkTypeIndex = (int) (Math.random()*2); //A random value -> Cola or Sprite cold drink.
				int purchasedDrinkIndex = (int) (Math.random()*2); //A random value -> Can or Bottle purchased drink.
				
				Drink drink1 = new Cola(volume, price, drinkTypeIndex, temperature, coldTypeIndex, purchasedDrinkIndex, sodaDrinkTypeIndex);
				drinksArray[i] = drink1;

				Drink drink2 = new Sprite(volume, price, drinkTypeIndex, temperature, coldTypeIndex, purchasedDrinkIndex, sodaDrinkTypeIndex);
				drinksArray[i] = drink2;					
			}
			else
			{			
				int softDrinkTypeIndex = (int) (Math.random()*2); //A random value -> Apple or Orange juice cold drink.
				int squeezedDrinkIndex = (int) (Math.random()*2); //A random value -> Machine or Pasteurized Squeeze drink.
				Drink drink3 = new AppleJuice(volume, price, drinkTypeIndex, temperature, coldTypeIndex, squeezedDrinkIndex, softDrinkTypeIndex);
				drinksArray[i] = drink3;
				Drink drink4 = new OrangeJuice(volume, price, drinkTypeIndex, temperature, coldTypeIndex, squeezedDrinkIndex, softDrinkTypeIndex);
				drinksArray[i] = drink4;
			}			
		}
		else
		{
			temperature = (int)(Math.random()*31) + 60; //A random value of the hot temperature between 30->60 degrees
			int quantityOfSugar = (int) (Math.random()*5); //A random value of the quantity of Sugar.
			int hotTypeIndex = (int) (Math.random()*2); //A random value -> Coffee-Based or Chocolate-Based Hot drink.
			
			if(hotTypeIndex==0)
			{				
				int coffeeBasedTypeIndex = (int) (Math.random()*3); //A random value of the Coffee type, (Espresso or Cappuccino or Late) hot drink.
				if(coffeeBasedTypeIndex==0)
				{
					int shotEspressoTypeIndex = (int) (Math.random()*3);// A random value of the quantity of the shots in the Espresso drink, (Single or Double or Triple).			
					Drink drink5 = new Espresso(volume, price, drinkTypeIndex, temperature, quantityOfSugar, hotTypeIndex, coffeeBasedTypeIndex, shotEspressoTypeIndex);
					drinksArray[i] = drink5;
				}
				else if(coffeeBasedTypeIndex==1) {
				volume = (int)(Math.random()*101) + 100; //A random value between 100->200 cc.
				Drink drink6 = new Cappuccino(volume, price, drinkTypeIndex, temperature, quantityOfSugar, hotTypeIndex, coffeeBasedTypeIndex);
				drinksArray[i] = drink6;
				}
				else {
				volume = (int)(Math.random()*51) + 150; //A random value between 150->200 cc.
				Drink drink7 = new Latte(volume, price, drinkTypeIndex, temperature, quantityOfSugar, hotTypeIndex, coffeeBasedTypeIndex);
				drinksArray[i] = drink7;
				}
			}
			else
			{
				int chocolateBasedTypeIndex = 0; //There is one hot drink that based on chocolate (water and milk). 
				int choclateDrinkType = (int) (Math.random()*2); //A random value of the chocolate-based type, (Water or Milk).
				Drink drink8 = new Chocolate(volume, price, drinkTypeIndex, temperature, quantityOfSugar, hotTypeIndex,chocolateBasedTypeIndex,choclateDrinkType);
				drinksArray[i] = drink8;
			}				
		}				
	}							
		return drinksArray;		
}
		
	public static int milkQtt;
	public static int waterQtt;
	static {
	  milkQtt = 1000; //The maximum of the milk in the machine.
	  waterQtt = 2000; //The maximum of the water in the machine.
	}
	
	/**
	 * In our main We allow the customer to choose a drink to buy it,
	 * We present to the customer the remaining state of the water and milk in the machine. 
	 */
	public static void main(String[] args) 
	{	
		System.out.println("Welcome to our Drinks Vending Machine :)");
		System.out.println("----------------------------------------");
		while(milkQtt > 0 && waterQtt > 0) 
		  {
		    showMenu();
		    int opt = Integer.parseInt(scanner.next());
		    if(opt == 0)
		      break;
		    Produceable drink = createDrink(opt);    
		    drink.produce();
		    waterQtt-=drink.getWaterVolume();
		    milkQtt-=drink.getMilkVolume();
		    System.out.println("-->>>>The total quantity of Water that left in the machine: "+waterQtt+" cc");
		    System.out.println("-->>>>The total quantity of Milk that left in the machine: "+milkQtt+" cc");
		    System.out.println("----------------------------------------------------");		    
		  }
		System.out.println("Sorry we're done for today, we'll restock our machine soon.\n"
				+ "We invite you to try again later :)");
	
	/**
	  * Here I have another way to solve: Array of drinks.
		Drink[] drinksArray = arrayOfDrinks();
		for (Drink drink : drinksArray) 
		{				
			System.out.println(drink.toString()+"\n");
			waterQtt-=drink.getWaterVolume();
			milkQtt-=drink.getMilkVolume();
			System.out.println("-->>>>The total quantity of Water that left in the machine: "+waterQtt+" cc");
			System.out.println("-->>>>The total quantity of Milk that left in the machine: "+milkQtt+" cc");
			System.out.println("----------------------------------------------------");						
		}
		*/
					
	scanner.close();
	
	}

		/**
		 * In this method we are interested in building a one drink based on the index that entered as input.
		 * @param opt: index that entered as input. 
		 * @return a new drink.
		 */
		private static Produceable createDrink(int opt) {
		  switch(opt){
		  case 0: return(createOneDrinkByIndexInput(0));
		  case 1: return(createOneDrinkByIndexInput(1));
		  case 2: return(createOneDrinkByIndexInput(2));
		  case 3: return(createOneDrinkByIndexInput(3));
		  case 4: return(createOneDrinkByIndexInput(4));
		  case 5: return(createOneDrinkByIndexInput(5));
		  case 6: return(createOneDrinkByIndexInput(6));
		  case 7: return(createOneDrinkByIndexInput(7));
		  case 8: return(createOneDrinkByIndexInput(8));
		  }
		return null;
		}
	
		/**
		 * In this method we show the drink machine menu over and over again,
		 * so the customer knows what to choose by index that he/she entered as input. 
		 */
		public static void showMenu() 
		{
		  System.out.println("Please select a drink or enter 0 to exit:");
		  System.out.println("1. Hot Chocolate\n" + "2. Hot Espresso\n" + "3. Hot Cappuccino\n" + "4. Hot Latte\n"
		+ "5. Cola\n" + "6. Sprite\n" + "7. Orange Juice\n" + "8. Apple Juice");
		}
}
		
		