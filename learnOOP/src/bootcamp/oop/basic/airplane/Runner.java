package bootcamp.oop.basic.airplane;

import java.time.LocalDate;
import java.time.LocalTime;

public class Runner 
{

	public static void main(String[] args) 
	{
		final long flightNumber = 32156420;

		float duration = 3.05f;
		int delay = 5; // late 5 minutes.
		
		LocalTime deparatureTime;
		LocalTime actualDeparatureTime;
		LocalDate deparatureDate;
		
	//	Airplane airplane = new Airplane(flightNumber, deparatureTime, deparatureDate, duration);
	//	airplane.delayTime(delay);
	//	LocalTime arrivingTime = airplane.exactTimeToArrive();
	//	System.out.println("The airplane will arrived in the date: "+airplane.getDeparatureDate()+"\n"
	//			+ "at: "+arrivingTime);
	}
}
