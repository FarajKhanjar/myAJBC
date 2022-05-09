package bootcamp.oop.basic.airplane;

import java.time.LocalTime;
import java.time.LocalDate;

public class Airplane 
{
	// fields  
		private final long FLIGHT_NUMBER;
		private static int counter = 0;
		protected LocalTime deparatureTime;
		protected LocalTime actualDeparatureTime;
		protected LocalDate deparatureDate;
		private float duration;
		protected int minutesOfDelay;
		protected FrequentFlyer[] frequentFlyers = new FrequentFlyer[200];
		protected float flightMilesNumber;
		
	//constructor
		public Airplane(long FLIGHT_NUMBER, LocalTime deparatureTime, LocalDate date, float duration)
		{
		this.FLIGHT_NUMBER = FLIGHT_NUMBER;
		this.deparatureTime = deparatureTime;
		this.setDuration(duration);
		this.minutesOfDelay = 0;
		actualDeparatureTime = this.deparatureTime;
		}
			
	//method
		public LocalTime getDeparatureTime() {
			return deparatureTime;
		}
		public void setDeparatureTime(LocalTime deparatureTime) {
			this.deparatureTime = deparatureTime;
		}
		
		public LocalDate getDeparatureDate() {
			return deparatureDate;
		}
		
		public void setDeparatureDate(LocalDate deparatureDate) {
			this.deparatureDate = deparatureDate;
		}


		public long getFlightNumber() {
			return FLIGHT_NUMBER;
		}


		public float getDuration() {
			return duration;
		}


		public void setDuration(float duration) {
			this.duration = duration;
		}


		
		public void delayTime(float minutesOfDelay)
		{
			this.minutesOfDelay += minutesOfDelay;
			//actualDeparatureTime = deparatureTime.plusMinutes(minutesOfDelay);
		}
		
		public LocalTime exactTimeToArrive()
		{			
			return actualDeparatureTime;
		}
		
		public void setFrequentFlyer(FrequentFlyer frequentFlyer)
		{
			//this.frequentFlyers[FrequentFlyer-=FF_number] = frequentFlyer;
		}
		
		public void setCredit(Credit credit)
		{
			credit.creditBonus +=duration;

		}
}
