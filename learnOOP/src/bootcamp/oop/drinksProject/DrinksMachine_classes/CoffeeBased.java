package bootcamp.oop.drinksProject.DrinksMachine_classes;

/**
 * In this class we are interested in realizing a drink that based on a Coffee,
 * and according to its fields and data. 
 * @author Faraj.
 * This class "CoffeeBased" is based on the father class "HotDrink".
 * In addition of the hot drink fields, the CoffeeBased drink have:
 * a three kinds of coffee based drinks. 
 */
public abstract class CoffeeBased extends HotDrink
{
	// field  
		protected CoffeeBasedType coffeeBasedType;
			
	//constructor
		/**
		 * Construct a CoffeeBased Drink object from 7 parameters.
		 * @param volume of the drink.
		 * @param price of the drink.
		 * @param drinkTypeIndex: Hot
	     * @param temperature: random value.
	     * @param quantityOfSugar: A random value of the quantity of Sugar.
	     * @param HotTypeIndex: CoffeeBased.
	     * @param coffeeBasedTypeIndex: HotEspresso or HotCappuccino or HotLatte.
		 */
		public CoffeeBased(float volume, float price, int drinkTypeIndex, float temperature, float quantityOfSugar, int hotTypeIndex, int coffeeBasedTypeIndex)
		{
			super(volume, price, drinkTypeIndex, temperature ,quantityOfSugar,hotTypeIndex);
			this.coffeeBasedType = CoffeeBasedType.values()[coffeeBasedTypeIndex];
		}
		
		public enum CoffeeBasedType //The constant/enam values
		{
			Espresso,
			Cappuccino,
			Latte;	
		}
		
		/**
		 * In this method 
		 * @return HotEspresso or HotCappuccino or HotLatte.
		 */
		public CoffeeBasedType getCoffeeBasedDrinkType()
		{
			return this.coffeeBasedType;
		}
				
		public abstract float getWaterVolume();
		
		public abstract float getMilkVolume();
}
