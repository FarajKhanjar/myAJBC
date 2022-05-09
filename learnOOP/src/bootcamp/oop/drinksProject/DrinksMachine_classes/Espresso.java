package bootcamp.oop.drinksProject.DrinksMachine_classes;

/**
 * In this class we are interested in realizing a Hot Espresso drink according to its fields and data. 
 * @author Faraj.
 * This class "Espresso" is based on the father class "CoffeeBased".
 * In addition of the hot drink fields, the Espresso drink have:
 * a Three kinds of shotVolume: Single or Double or Triple.
 */
public class Espresso extends CoffeeBased
{
	// field 
		protected ShotType shotEspressoType; 
		protected float shotVolume = 50f; //Its given in the exercise.
		protected int shotEspressoTypeIndex; //Single or Double or Triple.
				
	//constructor
		/**
		 * Construct a HotEspresso Drink object from 8 parameters.
		 * @param volume of the HotEspresso drink.
		 * @param price of the HotEspresso drink.
		 * @param drinkTypeIndex: Hot
		 * @param temperature: A Random value.
		 * @param quantityOfSugar: A random value of the quantity of Sugar.(0 to 5)
		 * @param hotTypeIndex: CoffeeBased.
		 * @param coffeeBasedTypeIndex: Espresso.
		 * @param shotEspressoTypeIndex: Single or Double or Triple.
		 */
		public Espresso(float volume, float price, int drinkTypeIndex, float temperature, float quantityOfSugar, int hotTypeIndex, int coffeeBasedTypeIndex, int shotEspressoTypeIndex)
		{
			super(volume, price, drinkTypeIndex, temperature ,quantityOfSugar,hotTypeIndex,coffeeBasedTypeIndex);
			this.shotEspressoType = ShotType.values()[shotEspressoTypeIndex];
			this.shotEspressoTypeIndex = shotEspressoTypeIndex;
		}
		
		public enum ShotType //The constant/enam values
		{
			Single,
			Double,
			Triple;	
		}
		
		@Override
		public String toString() {
			return "You choose to drink a '"+ drinkType +"'-'" + coffeeBasedType + "', with a '"+ shotEspressoType + "'-'" + hotDrinkType + "' shot,\n"
					+ "his temperature is:'"+ temperature + " degrees', and the volume is:'" + volume + "cc'.\n"
							+ "With a '"+quantityOfSugar+"' tea-spoons of sugar.\n"
							+ "The price is: '" + price+"' NIS. Thank you and have a nice day :)";
		}
		
		/**
		* This method 
		* @return volume of the water inside the drink.
		*/
		public float getdrinkVolume()
		{					    
			return (getWaterVolume());											
		}
		    
		/**
		* This method 
		* @return volume of the milk inside the drink.
		*/	  		
		public float getMilkVolume()
		{			
				return 0;	//without milk		
		}
		
		/**
		* This method 
		* @return volume of the water inside the drink.
		*/
		public float getWaterVolume()
		{
			if(shotEspressoTypeIndex==0)
			{
				return this.shotVolume;
			}
			else if(shotEspressoTypeIndex==1)
			{
				return (this.shotVolume*2);
			}
			else
			{
				return (this.shotVolume*3);
			}			
		}
		
		
		/**
		* This method 
		* @return the number of the shots inside the drink.
		* in the case of Espresso it can be Single or Double or Triple.
		*/
		public ShotType getShotEspressoType()
		{
			return this.shotEspressoType;
		}
		
}
