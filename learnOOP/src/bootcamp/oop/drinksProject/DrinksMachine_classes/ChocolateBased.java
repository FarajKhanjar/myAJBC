package bootcamp.oop.drinksProject.DrinksMachine_classes;

/**
 * In this class we are interested in realizing a drink that based on a Chocolate,
 * and according to its fields and data. 
 * @author Faraj.
 * This class "ChocolateBased" is based on the father class "HotDrink". 
 */
public abstract class ChocolateBased extends HotDrink 
{
	// field  
		protected ChocolateBasedType chocolateBasedType;
				
	//constructor
		/**
		 * Construct a ChocolateBased Drink object from 7 parameters.
		 * @param volume of the drink.
		 * @param price of the drink.
		 * @param drinkTypeIndex: Hot
	     * @param temperature: random value.
	     * @param quantityOfSugar: A random value of the quantity of Sugar.
	     * @param HotTypeIndex: ChocolateBased.
	     * @param chocolateBasedTypeIndex: HotChocolate.
		 */	
		public ChocolateBased(float volume, float price, int drinkTypeIndex, float temperature, float quantityOfSugar, int hotTypeIndex, int chocolateBasedIndex)
		{
			super(volume, price, drinkTypeIndex, temperature ,quantityOfSugar,hotTypeIndex);
			this.chocolateBasedType = ChocolateBasedType.values()[chocolateBasedIndex];
		}
		
		
		public enum ChocolateBasedType //The constant/enam values
		{
			Chocolate;	
		}
		
		public ChocolateBasedType getCoffeeBasedDrinkType()
		{
			return this.chocolateBasedType;
		}
		
		public abstract float getWaterVolume();
		
		public abstract float getMilkVolume();

}
