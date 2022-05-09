package bootcamp.oop.drinksProject.DrinksMachine_classes;

/**
 * In this class we are interested in realizing a Soda drink according to its fields and data. 
 * @author Faraj.
 * This class "SodaColdDrink" is based on the father class "ColdDrink".
 * In addition of the cold drink fields, the soda drink have:
 * a Purchased Type and Two kinds of soda drinks. 
 */
public abstract class SodaColdDrink extends ColdDrink
{
	// field  
	        protected PurchasedType purchasedDrink;
			protected SodaType sodaDrinkType;
			
	//constructor
			/**
			 * Construct a SodaDrink object from 7 parameters.
			 * @param volume of the drink.
			 * @param price of the drink.
			 * @param drinkTypeIndex: Cold
		     * @param temperature: random value.
		     * @param coldTypeIndex: Soda.
		     * @param squeezedDrinkIndex: It can be buy as a Can or Bottle.
		     * @param softDrinkTypeIndex: Cola or Sprite.
			 */
			public SodaColdDrink(float volume, float price, int drinkTypeIndex, float temperature, int coldTypeIndex, int purchasedDrinkIndex, int sodaDrinkTypeIndex)
			{
				super(volume, price, drinkTypeIndex, temperature ,coldTypeIndex);
				this.purchasedDrink = PurchasedType.values()[purchasedDrinkIndex];
				this.sodaDrinkType = SodaType.values()[sodaDrinkTypeIndex];
			}
			
			public float getDrinkVolume()
			{
				return this.volume;
			}
			
						
			public PurchasedType getPurchasedDrinkType()
			{
				return this.purchasedDrink;
			}
			
			public enum PurchasedType //The constant/enam values
			{
				Can,
				Bottle;	
			}
			
			public SodaType getSoftDrinkType()
			{
				return this.sodaDrinkType;
			}
			
			public enum SodaType //The constant/enam values
			{
				Cola,
				Sprite;	
			}
			
			public abstract float getWaterVolume();
			
			public abstract float getMilkVolume();

}
