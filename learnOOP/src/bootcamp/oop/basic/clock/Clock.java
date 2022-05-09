package bootcamp.oop.basic.clock;

public class Clock {
	// field  
	int timeInMin;
	
	//method	
		public void printTime() {
		int hours = timeInMin/60;
		int minutes = timeInMin%60;
		System.out.printf("%02d:%02d", hours,minutes);
		}
		
	//constructors
	public Clock(int time) {
		timeInMin = time;
	}

	public Clock() {
		//timeInMin // default value=0
		timeInMin = 396; // default value=06:36
	}	
	
	public Clock(int hours, int minutes) {
		timeInMin = minutes;
		timeInMin+= 60*minutes;
		
	}

}
