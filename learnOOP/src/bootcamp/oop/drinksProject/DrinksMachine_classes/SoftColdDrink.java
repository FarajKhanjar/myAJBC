package bootcamp.oop.drinksProject.DrinksMachine_classes;

/**
 * In this class we are interested in realizing a Soft drink according to its fields and data. 
 * @author Faraj
 * This class "SoftColdDrink" is based on the father class "ColdDrink".
 * In addition of the cold drink fields, the soft drink have:
 * a Squeezed Type and Two kinds of soft drinks. 
 */
public abstract class SoftColdDrink extends ColdDrink 
{
	// field  
		
		protected SqueezedType squeezedDrink;
		protected SoftType softDrinkType;
		
	//constructor
		/**
		 * Construct a SoftDrink object from 7 parameters.
		 * @param volume of the drink.
		 * @param price of the drink.
		 * @param drinkTypeIndex: Cold
		 * @param temperature: random value.
		 * @param coldTypeIndex: Soft.
		 * @param squeezedDrinkIndex: It can be squeezed by a Machine or Pasteurize.
		 * @param softDrinkTypeIndex: Apple or Orange Juice.
		 */
		public SoftColdDrink(float volume, float price, int drinkTypeIndex, float temperature, int coldTypeIndex, int squeezedDrinkIndex, int softDrinkTypeIndex)
		{
			super(volume, price, drinkTypeIndex, temperature ,coldTypeIndex);
			this.squeezedDrink = SqueezedType.values()[squeezedDrinkIndex];
			this.softDrinkType = SoftType.values()[softDrinkTypeIndex];
		}
		
		public enum SqueezedType //The constant/enam values
		{
			Machine,
			Pasteurized;	
		}
		
		public enum SoftType //The constant/enam values
		{
			OrangeJuice,
			AppleJuice;	
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
		* @return the Squeezed Drink Type
		*/
		public SqueezedType getSqueezedDrinkType()
		{
			return this.squeezedDrink;
		}
		
		/**
		* This method 
		* @return the Soft Drink Type
		*/
		public SoftType getSoftDrinkType()
		{
			return this.softDrinkType;
		}
		
			
		public abstract float getWaterVolume();
		
		public abstract float getMilkVolume();
}
