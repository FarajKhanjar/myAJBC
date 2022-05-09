package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;

public abstract class AdoultAgeToy extends GoodToy 
{

	public AdoultAgeToy(long serialNumber, String name, LocalDate purchaseDate, float ageOfToy, int toyTypeIndex,
			int playIndex) {
		super(serialNumber, name, purchaseDate, ageOfToy, toyTypeIndex, playIndex);
	}

	@Override
	public String toString() {
		return "Sorry! its a toy for adoults only.";
	}
}
