package bootcamp.oop.basic.airplane;

public class FrequentFlyer 
{
	// fields 
	protected final long FrequentFlyerNumber;
	protected String firstName;
	protected String lastName;
	protected static int idCounter = 0;
	public int FF_number;
	
	protected Credit credit;
		
	//constructor
	public FrequentFlyer(long frequentFlyerNumber, String firstName, String lastName, Airplane airplane) 
	{
		//FF_Number = idCounter++;
		FrequentFlyerNumber = frequentFlyerNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	//public getId()
	//{
	//	return FF_Number;
	//}
	
	

}
