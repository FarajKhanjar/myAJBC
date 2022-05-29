package networking_JSON.restaurant_exercise_4;

public enum Dish 
{
	HAMBURGER(82),
	SPAGHETTI(80),
	CHICKEN(62),
	SALMON(90),
	OMELETTE(48),
	BEEF(86),
	SOUP(37),
	PIZZA(35),
	MALABI(44),
	HOT_CHOCOLATE_SOUFFLE(46),
	FRIES(20),
	POTATO(23),
	COLA(10),
	SPRITE(10),
	COPATCHINO(12),
	ESPRESSO(7);
	

	private float price;

	Dish(float price) 
	{
		this.price = price;
	}

	public float getPrice() 
	{
		return price;
	}
}
