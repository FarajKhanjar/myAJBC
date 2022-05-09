package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;

public class BrokenToy extends Toy
{
		
	public BrokenToy(long serialNumber, String name, LocalDate purchaseDate, float ageOfToy, int toyTypeIndex) 
	{
		super(serialNumber, name, purchaseDate, ageOfToy, toyTypeIndex);

	}

	@Override
	public String toString() 
	{
		return ("Sorry! its a BrokenToy because its a more than a year old: "+ageOfToy);
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
