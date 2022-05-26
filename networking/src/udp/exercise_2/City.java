package networking.udp.exercise_2;

public enum City 
{
	VIENNA,//("Vienna cita italiana"),
	SOFIA,//"Sofia the wize city"),
	ZAGREB,
	PARIS,
	BATUMI,
	BUDAPEST,
	ROME,
	TOKYO,
	AMSTERDAM,
	OSLO,
	MOSCOW,
	MADRID,
	LONDON,
	BERLIN,
	TELAVIV;

//	String title;
//	City(String title) 
//	{
//		this.title = title;
//	}
//	public String getTitle() 
//	{
//		return title;
//	}
//	
//	@Override
//	public String toString()
//	{
//		return getTitle();
//	}
	public static String getNameOfCity(City city) 
	{
		switch (city) 
		{
		case BATUMI:
			return "BATUMI";

		case LONDON:
			return "LONDON";

		case BERLIN:
			
			return "BERLIN";
		
		case TELAVIV:
			return "TELAVIV";
		
		case PARIS:
			return "PARIS";
		default:
			break;
		}
		return "however";
	}
}