package bootcamp.oop.drinksProject.DrinksMachine_classes;

/**
 * In this class we are interested in realizing a Sprite drink according to its fields and data. 
 * @author Faraj.
 * This class "Sprite" is based on the father class "SodaColdDrink".
 * The Sprite drink have The soda cold drink fields. 
 */
public class Sprite extends SodaColdDrink
{
	// field  
			
	//constructor
	/**
	 * Construct a Sprite object from 7 parameters.
	 * @param volume of the Sprite drink.
	 * @param price of the Sprite drink.
	 * @param drinkTypeIndex: Cold
     * @param temperature: random value.
     * @param coldTypeIndex: Soda.
     * @param squeezedDrinkIndex: It can be buy as a Can or Bottle. (random value) 
     * @param softDrinkTypeIndex: Sprite.
	 */
		public Sprite(float volume, float price, int drinkTypeIndex, float temperature, int coldTypeIndex, int purchasedDrinkIndex, int softDrinkTypeIndex)
		{
			super(volume, price, drinkTypeIndex, temperature ,coldTypeIndex,purchasedDrinkIndex, softDrinkTypeIndex);
		}
				
		@Override
		public String toString() {
			return "You choose to drink a '"+drinkType+"' - '" + purchasedDrink + "' of '" + sodaDrinkType + "', its a '" + coldDrinkType + "" + "' drink,\n"
					+ "The temperature is='"+ temperature + " degrees', and volume '" + volume + "cc'.\n"
							+ "The price is '" + price+"' NIS. Thank you and have a nice day :)";
		}
		
		/**
		* This method 
		* @return volume of the water inside the drink.
		*/
		public float getWaterVolume()
		{
			return this.volume;
		}
		
		/**
		* This method 
		* @return volume of the milk inside the drink.
		*/
		public float getMilkVolume()
		{			
				return 0;			
		}
}
