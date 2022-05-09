package bootcamp.oop.basic.Inheritance;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

import bootcamp.oop.basic.HomeApp_absttraction.Appliable; //interface

/**
 * This class describes an electrical Home Appliance.
 * Responsible for...
 * @author Faraj
 *
 */

public abstract class HomeAppliance implements Appliable {
	
	// field  
		protected String manufacturer;
		protected int purchaseYear;
		protected int powerConsumption; //[watts per hour]
		
		
	//constructor
		/**
		 * Construct a HomeAppliance object from 3 parameters.
		 * @param manufacturer: The name of the appliance manufacturer.
		 * @param purchaseYear: The exact year of buying this appliance.
		 * @param powerConsumption: a parameter for build a new Class.
		 */
		public HomeAppliance(String manufacturer, int purchaseYear, int powerConsumption) {
			setManufacturer(manufacturer);
			setPurchaseYear(purchaseYear);
			setPowerConsumption(powerConsumption);
			
		}
		
		public int getPowerConsumption()
		{
			return powerConsumption;
		}
		
		public void setPowerConsumption(int powerConsumption)
		{
			this.powerConsumption = powerConsumption;
		}
		
		/**
		 * Get the manufacturer name.
		 * @return the manufacturer name.
		 */
		private String getManufacturer()
		{
			return manufacturer;
		}
		
		public void setManufacturer(String manufacturer)
		{
			if(manufacturer!=null) 
			{
				this.manufacturer = manufacturer.toUpperCase();
			}
		}
		
		private int getPurchaseYear()
		{
			return purchaseYear;
		}
		
		/**
		 * Checks if the purchase year is valid (between current year and 1900),
		 * and if so sets this.purchaseYear to the given parameter value.
		 * @param purchaseYear: The exact year of buying this appliance.
		 */
		public void setPurchaseYear(int purchaseYear)
		{
			int currentYear = (Calendar.getInstance()).get(Calendar.YEAR);
			if(purchaseYear > 1900 && purchaseYear<=currentYear) 
			{
				this.purchaseYear = purchaseYear;
			}
			else
				this.purchaseYear = currentYear;				
		}
		
	/*	public void display()
		{
			String msg = "Manufacturer: "+manufacturer+" PurchaseYear: "+purchaseYear;
			System.out.println(msg);
		}
	*/
		
		
		//EX-part 9:
		public abstract int totalPowerConsumption(int numOfhours);
				
		
		@Override
		public String toString ()
		{
			return String.format("Manufacturer: "+manufacturer+" PurchaseYear: "+purchaseYear+" PowerConsumption: "+powerConsumption);
		}
		
		@Override
		public LocalTime turnOn()
		{
			System.out.println("Appliance was turned on at "+ LocalTime.now());
			return LocalTime.now();
		}
		
		@Override
		public long turnOff(LocalTime on)
		{
			long duration = on.until(LocalTime.now(), ChronoUnit.SECONDS);
			System.out.println("Appliance was turned off at "+ LocalTime.now()+" on duration[sec] = "+ duration);
			return duration;
		}
		
			

}
