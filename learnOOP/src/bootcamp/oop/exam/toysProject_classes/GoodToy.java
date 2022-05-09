package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;

public abstract class GoodToy extends Toy
{
	protected Type goodPlayType;

	public GoodToy(long serialNumber, String name, LocalDate purchaseDate, float ageOfToy, int toyTypeIndex, int playIndex) 
	{
		super(serialNumber, name, purchaseDate, ageOfToy, toyTypeIndex);
		// TODO Auto-generated constructor stub
	}
	
	public enum Type //The constant/enam values
	{
		Appropriate,
		AdoultOnly;	
	}

}
