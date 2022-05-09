package bootcamp.oop.drinksProject.DrinksMachine_classes;

/**
 * In this class we are interested in realizing a OrangeJuice drink according to its fields and data. 
 * @author Faraj.
 * This class "OrangeJuice" is based on the father class "SoftColdDrink".
 * The OrangeJuice drink have The soft cold drink fields. 
 */
public class OrangeJuice extends SoftColdDrink
{
	// field  
	
	//constructor
	/**
	 * Construct a OrangeJuice object from 7 parameters.
	 * @param volume of the OrangeJuice drink.
	 * @param price of the OrangeJuice drink.
	 * @param drinkTypeIndex: Cold
     * @param temperature: random value.
     * @param coldTypeIndex: Soft.
     * @param squeezedDrinkIndex: It can be squeezed by a Machine or Pasteurize. (random value) 
     * @param softDrinkTypeIndex: OrangeJuice.
	 */
		public OrangeJuice(float volume, float price, int drinkTypeIndex, float temperature, int coldTypeIndex, int purchasedDrinkIndex, int softDrinkTypeIndex)
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
		* @return volume of the milk inside the drink.
		*/
		public float getMilkVolume()
		{			
				return 0;			
		}
		
		/**
		* This method 
		* @return volume of the water inside the drink.
		*/
		public float getWaterVolume() {
			
			return this.volume;
		}
}
