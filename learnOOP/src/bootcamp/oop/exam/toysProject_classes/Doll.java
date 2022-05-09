package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;

public abstract class Doll extends AppropriateAge
{
	protected DollToyType dollToyType;
	protected int dirtyScale;

	public Doll(long serialNumber, String name, LocalDate purchaseDate, float ageOfToy, int toyTypeIndex, int playIndex,
			int playingTypeOfToyIndex, int dirtyScale, int dollToyTypeIndex) 
	{
		super(serialNumber, name, purchaseDate, ageOfToy, toyTypeIndex, playIndex, playingTypeOfToyIndex);
		this.dirtyScale = dirtyScale;
		this.dollToyType = DollToyType.values()[dollToyTypeIndex];
	}
	
	public enum DollToyType //The constant/enam values
	{
		Soft,
		Hard;	
	}
	
	
	

}
