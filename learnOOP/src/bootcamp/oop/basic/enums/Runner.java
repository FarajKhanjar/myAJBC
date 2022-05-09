package bootcamp.oop.basic.enums;

import bootcamp.oop.basic.enums.StatusCode.Status;

public class Runner {

	public static void main(String[] args) {
		
		StatusCode.Status status = Status.FAIL;
		
		for(Status stat : Status.values()) 
		{
		System.out.println(stat); //the status in place i
		//System.out.println(Status.valueOf(stat.toString())); // also the value
		System.out.println(stat.code); // the value of the status in place i
		System.out.println(stat.txt);
		}	
		
	/*	Level lev = Level.HIGH;
		//Level.values() -> Array!
		for(Level level : Level.values()) 
		{
		System.out.println(level);
		}
	*/

	}
	
	public static int numByLevel(Level lev) {
		switch(lev) {
		case HIGH:
			return 1;
			
		case MEDIUM:
			return 2;
			
		case LOW:
			return 3;
		}
		return 0;		
	}
	
	public static Level cheakTemperture(double temp)
	{
		if(temp>100)
			return Level.HIGH;
		else
			return Level.LOW;
	}

}

enum Level {
	LOW, MEDIUM, HIGH;
}
