package bootcamp.oop.drinksProject.DrinksMachine_classes;

/**
 * In this class we are interested in realizing a Hot Chocolate drink,
 * According to its fields and data. 
 * @author Faraj.
 * This class "Chocolate" is based on the father class "ChocolateBased".
 * In addition of the hot drink fields, the HotChocolate drink have:
 * a Two kinds of made off: Milk or Water.
 */
public class Chocolate extends ChocolateBased 
{
	// field 
	    protected ChoclateDrinkType choclateDrinkType;
	    protected float waterVolume, milkVolume; //Its a parameter that help us know how much milk and water there is in the cup.
	
	//constructor
	    /**
	     * Construct a HotChocolate Drink object from 8 parameters.
	     * @param volume of the HotChocolate drink.
	     * @param price of the HotChocolate drink.
	     * @param drinkTypeIndex: Hot.
	     * @param temperature: A Random value.
	     * @param quantityOfSugar: A random value of the quantity of Sugar.
	     * @param hotTypeIndex: ChocolateBased.
	     * @param chocolateBasedTypeIndex: HotChocolate.
	     * @param choclateDrinkTypeIndex: It can be made off Milk or water. (A Random value).
	     */
	    public Chocolate(float volume, float price, int drinkTypeIndex, float temperature, float quantityOfSugar, int hotTypeIndex, int chocolateBasedTypeIndex,int choclateDrinkTypeIndex)
		{
			super(volume, price, drinkTypeIndex, temperature ,quantityOfSugar,hotTypeIndex,chocolateBasedTypeIndex);
			this.choclateDrinkType = ChoclateDrinkType.values()[choclateDrinkTypeIndex];
			if(choclateDrinkTypeIndex==0) {
				this.waterVolume = volume;
				this.milkVolume=0;
			} else {
				this.milkVolume = volume;
				this.waterVolume=0;
			}
		}
	    
	    public enum ChoclateDrinkType //The constant/enam values
		{
			Water,
			Milk;	
		}
	    
	    @Override
		public String toString() {
			return "You choose to drink a '"+ drinkType +"'-'" + chocolateBasedType + "', its made off '" + choclateDrinkType + "' drink,\n"
					+ "The temperature is='"+ temperature + " degrees', and the volume '" + volume + "cc'.\n"
							+ "With a '"+quantityOfSugar+"' tea-spoons of sugar.\n"
							+ "The price is '" + price+"' NIS. Thank you and have a nice day :)";
		}
	    
	    /**
		* This method 
		* @return the Chocolate Based Type (water or milk)
		* in the case of Cappuccino its a Double.
		*/
	    public ChoclateDrinkType getChocolateBasedType()
		{
			return this.choclateDrinkType;
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
			return this.waterVolume;	
		}	
	    
	    /**
		* This method 
		* @return volume of the milk inside the drink.
		*/
	    public float getMilkVolume()
		{			
			return this.milkVolume;			
		}
	
}
