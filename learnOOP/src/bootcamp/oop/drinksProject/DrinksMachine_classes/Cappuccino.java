package bootcamp.oop.drinksProject.DrinksMachine_classes;

import bootcamp.oop.drinksProject.DrinksMachine_classes.Espresso.ShotType;

/**
 * In this class we are interested in realizing a Hot Cappuccino drink according to its fields and data. 
 * @author Faraj.
 * This class "Cappuccino" is based on the father class "CoffeeBased".
 * In addition of the hot drink fields, the Cappuccino drink must have:
 * a Two shot of Espresso and the rest of the cup is Milk.
 */
public class Cappuccino extends CoffeeBased
{
	// field 
		protected ShotType shotCappuccinoType ;
		protected float milkVolume; //Its a parameter that help us know how much milk there is in the cup.
					
	//constructor
		/**
		 * Construct a HotCappuccino Drink object from 7 parameters.
		 * @param volume of the HotCappuccino drink.
		 * @param price of the HotCappuccino drink.
		 * @param drinkTypeIndex: Hot
		 * @param temperature: A Random value.
		 * @param quantityOfSugar: A random value of the quantity of Sugar.(0 to 5)
		 * @param hotTypeIndex: CoffeeBased.
		 * @param coffeeBasedTypeIndex: Cappuccino.
		 */
		public Cappuccino(float volume, float price, int drinkTypeIndex, float temperature, float quantityOfSugar, int hotTypeIndex, int coffeeBasedTypeIndex)
		{
			super(volume, price, drinkTypeIndex, temperature ,quantityOfSugar,hotTypeIndex,coffeeBasedTypeIndex);
			this.shotCappuccinoType = ShotType.values()[1];	//Double Shot.
			this.milkVolume = (volume - 100f); //The rest of the drink is hot milk.
		}
		
		@Override
		public String toString() {
			return "You choose to drink a '"+ drinkType +"'-'" + coffeeBasedType + "', with a '"+ shotCappuccinoType + "'-'" + hotDrinkType + "' shot,\n"
					+ "his temperature is:'"+ temperature + " degrees', and the volume is:'" + volume + "cc'.\n"
							+ "With a '"+quantityOfSugar+"' tea-spoons of sugar.\n"
							   + "The price is: '" + price+"' NIS. Thank you and have a nice day :)";
		}
		
		/**
		* This method 
		* @return the number of the shots inside the drink.
		* in the case of Cappuccino its a Double.
		*/
		public ShotType getshotCappuccinoType()
		{
			return this.shotCappuccinoType;
		}
		
		/**
		* This method 
		* @return volume of the drink.
		*/
		public float getdrinkVolume()
		{			
				return volume;								
		}
		
		/**
		* This method 
		* @return volume of the water inside the drink.
		*/
		public float getWaterVolume()
		{			
				return (100f); // Water = double shots of Espresso each one is 50cc.
				
		}
		
		/**
		* This method 
		* @return volume of the milk inside the drink.
		*/
		public float getMilkVolume()
		{			
			return milkVolume;	// The rest of the drink is hot milk.		
		}
		
}
