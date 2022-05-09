package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;


public abstract class AppropriateAge extends GoodToy
{
	protected PlayingTypeOfToy playingTypeOfToy;

	public AppropriateAge(long serialNumber, String name, LocalDate purchaseDate, float ageOfToy, int toyTypeIndex,
			                int playIndex, int playingTypeOfToyIndex) 
	{
		super(serialNumber, name, purchaseDate, ageOfToy, toyTypeIndex, playIndex);
		this.playingTypeOfToy = PlayingTypeOfToy.values()[playingTypeOfToyIndex];
	}
	
	public enum PlayingTypeOfToy //The constant/enam values
	{
		Doll,
		Electric;	
	}
}
