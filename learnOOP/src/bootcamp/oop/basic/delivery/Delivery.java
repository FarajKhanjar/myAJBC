package bootcamp.oop.basic.delivery;

public abstract class Delivery {
	
	       private static long counter=0;
	
	// field  
			private String clientName;
			private String address;
			private final long IDnumber;
			
	//constructor
		public Delivery(String clientName, String address)
		{
			this.clientName = clientName;
			this.address = address;
			this.IDnumber = counter++;
		}
						
	//method			
		public void deliver()
		{
			String msg = ("Hi I have a ");
			System.out.print(msg+toString ());
		}

	@Override
		public String toString ()
		{
			return String.format("delivery number #%d for %s at %s \n", IDnumber , clientName , address);
		}			
}
