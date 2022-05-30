package networking_multi.expensesApp_exercise_5;

public enum Category 
{
	FOOD,
	CLOTHING,
	UTILITIES ,
	TRANSPORTATION;
	
	public static Category getValue(int i) 
	{
		return Category.values()[i];
	}
	
	public static int getSize() 
	{
		return Category.values().length;
	}

}
