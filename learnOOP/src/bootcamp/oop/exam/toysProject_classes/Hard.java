package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;

public class Hard extends Doll
{	
	protected HardToyType hardToyType;

	public Hard(long serialNumber, String name, LocalDate purchaseDate, float ageOfToy, int toyTypeIndex, int playIndex,
			int playingTypeOfToyIndex ,int dirtyScale, int dollToyTypeIndex, int hardToyTypeIndex)
	{
		super(serialNumber, name, purchaseDate, ageOfToy, toyTypeIndex, playIndex, playingTypeOfToyIndex,dirtyScale,dollToyTypeIndex);
		this.hardToyType = HardToyType.values()[hardToyTypeIndex];
	}
	
	@Override
	public String toString() {
		return "Hard [hardToyType=" + hardToyType + ", dollToyType=" + dollToyType + ", dirtyScale=" + dirtyScale
				+ ", playingTypeOfToy=" + playingTypeOfToy + ", goodPlayType=" + goodPlayType + ", serialNumber="
				+ serialNumber + ", name=" + name + ", purchaseDate=" + purchaseDate + ", ageOfToy=" + ageOfToy
				+ ", toyType=" + toyType + "]";
	}

	public enum HardToyType //The constant/enam values
	{
		Barbie,
		LitePuzzle,
		MusicalToy;	
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
