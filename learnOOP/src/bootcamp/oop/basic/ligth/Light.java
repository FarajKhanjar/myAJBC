package bootcamp.oop.basic.ligth;

   public class Light {	
	// field  
		private boolean status;
		private int numBulbs;
				
	//method	
		public void turnOn()  //setStateToOn
		{
			this.status = true;
		    printState();
		}
		
		public void turnOff() //setStateToTOff
		{
		    this.status = false;
		    printState();
		}
		
		public void printState() 
		{
			String strStatus="On";
			if (!status) {
				strStatus="Off";
			}			
     	   System.out.println("This light is: "+strStatus);
		}
		
		public void printNumOfLight() 
		{
		    System.out.println("The number of bulbs is: "+numBulbs);
		}
		
		///////////
		
		public void setStatus(boolean status)
		{
			this.status = status;
		}
		public void setNumBulbs(int numBulbs)
		{
			if(numBulbs>0 &&numBulbs<=50) {
				this.numBulbs=numBulbs;
			}
		}		
		public boolean getStatus()
		{
			return status;
		}
		public int getNumOfLights()
		{
			return numBulbs;
		}
			
	//constructors
		public Light(int numBulbs, boolean status) {
			this.status = status;
			this.numBulbs = numBulbs;
		}
		public Light() {			
		/*	numBulbs = 3;     // default value
			status = true; // default value
		*/
			this(3,true);
		}
		
		public void toggle(Light light) //This method get as input a light object.
		{
			light.status = (!light.status);			
		}
		public void toggle() //This method Overload the “ toggle ” method by using empty brackets.
		{
			toggle(this);		
		}
}