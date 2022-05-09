package bootcamp.oop.basic.bicycle;

public class Bicycle {
	
	// field 
	//A bike has different number of gears
	private int numGears;
	
	//constructors
	public Bicycle () 
	{
	numGears = 3;
	}
	
	public Bicycle(int numOfgears) 
	{
		numGears = numOfgears;
	}
	
	
	public void setNumGears(int numOfgears)
	{
		if(numOfgears>10) {
			numOfgears=10;
		}
		if(numOfgears<10) {
			return;
		}
		numGears=numOfgears;
	}
	
	public int getNumGears()
	{
		return numGears;
	}



}
