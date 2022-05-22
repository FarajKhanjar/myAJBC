package xml.Cars_project;

import java.util.Objects;

public class LicencePlate 
{
	//Fields:
	private final String LICENCE_PLATE_NUMBER;
	private String color;
	
	public LicencePlate(String lICENCE_PLATE_NUMBER, String color) 
	{
		LICENCE_PLATE_NUMBER = lICENCE_PLATE_NUMBER;
		this.color = color;
	}
	

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LicencePlate other = (LicencePlate) obj;
		return Objects.equals(LICENCE_PLATE_NUMBER, other.LICENCE_PLATE_NUMBER) && Objects.equals(color, other.color);
	}



	@Override
	public String toString() {
		return "LicencePlate [NUMBER=" + LICENCE_PLATE_NUMBER + ", color=" + color + "]";
	}
}