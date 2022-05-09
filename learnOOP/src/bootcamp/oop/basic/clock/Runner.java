package bootcamp.oop.basic.clock;

public class Runner {

	public static void main(String[] args) {
		Clock clk1 = new Clock(100); //constructor
		Clock clk2 = new Clock(); //constructor
		Clock clk3 = new Clock(2,20); //constructor
	//	clk1.timeInMin = 100;
		clk1.printTime();
		System.out.println();
		clk2.printTime();
		System.out.println();
		clk3.printTime();
	}
}
