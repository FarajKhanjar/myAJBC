package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;


public class Soft extends Doll
{
	protected SoftToyType softToyType;


	public Soft(long serialNumber, String name, LocalDate purchaseDate, float ageOfToy, int toyTypeIndex, int playIndex,
			int playingTypeOfToyIndex ,int dirtyScale, int dollToyTypeIndex, int softToyTypeIndex) {
		super(serialNumber, name, purchaseDate, ageOfToy, toyTypeIndex, playIndex, playingTypeOfToyIndex,dirtyScale,dollToyTypeIndex);
		this.softToyType = SoftToyType.values()[softToyTypeIndex];
	}
	
	@Override
	public String toString() 
	{
		return "Soft [softToyType=" + softToyType + ", dollToyType=" + dollToyType + ", dirtyScale=" + dirtyScale
				+ ", playingTypeOfToy=" + playingTypeOfToy + ", goodPlayType=" + goodPlayType + ", serialNumber="
				+ serialNumber + ", name=" + name + ", purchaseDate=" + purchaseDate + ", ageOfToy=" + ageOfToy
				+ ", toyType=" + toyType + "]";
	}

	public enum SoftToyType //The constant/enam values
	{
		TeddyBear,
		WinnieThePooh,
		JellyCat;	
	}

	@Override
	public float getWaterVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getMilkVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
