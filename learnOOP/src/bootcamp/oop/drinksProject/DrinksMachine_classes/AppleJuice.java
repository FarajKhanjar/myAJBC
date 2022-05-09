package bootcamp.oop.drinksProject.DrinksMachine_classes;

/**
 * In this class we are interested in realizing a AppleJuice drink according to its fields and data. 
 * @author Faraj.
 * This class "AppleJuice" is based on the father class "SoftColdDrink".
 * The AppleJuice drink have The soft cold drink fields. 
 */
public class AppleJuice extends SoftColdDrink
{
	// field  
	
	//constructor
		/**
		 * Construct a AppleJuice object from 7 parameters.
		 * @param volume of the AppleJuice drink.
		 * @param price of the AppleJuice drink.
		 * @param drinkTypeIndex: Cold
	     * @param temperature: random value.
	     * @param coldTypeIndex: Soft.
	     * @param squeezedDrinkIndex: It can be squeezed by a Machine or Pasteurize. (random value) 
	     * @param softDrinkTypeIndex: AppleJuice.
		 */
		public AppleJuice(float volume, float price, int drinkTypeIndex, float temperature, int coldTypeIndex, int purchasedDrinkIndex, int softDrinkTypeIndex)
		{
			super(volume, price, drinkTypeIndex, temperature ,coldTypeIndex,purchasedDrinkIndex, softDrinkTypeIndex);
		}
		
		
		@Override
		public String toString() {
			return "You choose to drink a '"+drinkType+"' - '" + squeezedDrink + "' of '" + softDrinkType + "', its a '" + coldDrinkType + "" + "' drink,\n"
					+ "his temperature is='"+ temperature + " degrees', and volume '" + volume + "cc'.\n"
							+ "The price is '" + price+"' NIS. Thank you and have a nice day :)";
		}
		
		/**
		* This method 
		* @return volume of the drink.
		*/
		public float getDrinkVolume()
		{
			return this.volume;
		}
		
		/**
		* This method 
		* @return volume of the milk inside this drink.
		*/
		public float getMilkVolume()
		{			
				return 0;			
		}
		
		/**
		* This method 
		* @return volume of the water inside the drink.
		*/
		public float getWaterVolume() 
		{
			
			return this.volume;
		}
		
}
