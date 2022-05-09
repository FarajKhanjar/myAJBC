package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;

	/**
	 * In this class we are interested in realizing a Toy according to its fields and data. 
	 * @author Faraj
	 * Any toy has:  
	 */
public abstract class Toy // implements Produceable 
{
		// fields 
	    protected final long serialNumber;
		protected final String name; 
		protected LocalDate purchaseDate;
		protected float ageOfToy;
		protected Type toyType; 
		
		//constructor
		public Toy(long serialNumber, String name,LocalDate purchaseDate, float ageOfToy, int toyTypeIndex)
		{
			this.serialNumber = serialNumber;
			this.name = name;
			this.purchaseDate = purchaseDate;
			this.ageOfToy= ageOfToy;		
			this.toyType = Type.values()[toyTypeIndex];
		}
		
		@Override
		public String toString() {
			return "Toy [serialNumber=" + serialNumber + ", name=" + name + ", purchaseDate=" + purchaseDate
					+ ", ageOfToy=" + ageOfToy + ", toyType=" + toyType + "]";
		}

		public enum Type //The constant/enam values
		{
			BrokenToy,
			GoodToy;	
		}		
		
		/**
		 * This method
		 * @return The type of this drink (Broken or Good)
		 */
		public Type getToyType()
		{
			return this.toyType;
		}
		
		public void play()
		{
			System.out.println(this.toString()+"\n");
			
		}

		public abstract float getWaterVolume();
		
		public abstract float getMilkVolume();
	

}
