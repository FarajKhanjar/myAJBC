package xml.Cars_project;

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
	public String toString() {
		return "LicencePlate [NUMBER=" + LICENCE_PLATE_NUMBER + ", color=" + color + "]";
	}
}