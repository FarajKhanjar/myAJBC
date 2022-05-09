package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;

import bootcamp.oop.exam.toysProject_classes.Soft.SoftToyType;

public class Electric extends AppropriateAge
{

	protected int batteriesNumber;
	protected int soundLevel;
	protected ElectricToyType electricToyType;
	
	public Electric(long serialNumber, String name, LocalDate purchaseDate, float ageOfToy, int toyTypeIndex,
			int playIndex, int playingTypeOfToyIndex, int batteriesNumber, int soundLevel ,int electricToyTypeIndex) 
	{
		super(serialNumber, name, purchaseDate, ageOfToy, toyTypeIndex, playIndex, playingTypeOfToyIndex);
		this.batteriesNumber=batteriesNumber;
		this.soundLevel=soundLevel;
		this.electricToyType = ElectricToyType.values()[electricToyTypeIndex];
	}
	
	@Override
	public String toString() {
		return "Electric [batteriesNumber=" + batteriesNumber + ", soundLevel=" + soundLevel + ", electricToyType="
				+ electricToyType + ", playingTypeOfToy=" + playingTypeOfToy + ", goodPlayType=" + goodPlayType
				+ ", serialNumber=" + serialNumber + ", name=" + name + ", purchaseDate=" + purchaseDate + ", ageOfToy="
				+ ageOfToy + ", toyType=" + toyType + "]";
	}

	public enum ElectricToyType //The constant/enam values
	{
		Ride,
		Dinosaur,
		GUITAR;	
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
