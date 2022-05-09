package bootcamp.oop.basic.ligth;

public class Runner {

	
	public static void main(String[] args) {
		
		//Create 2 Light: 
		Light light1 = new Light(6,true); //constructor 1
		Light light2 = new Light();  //constructor 2
		
		//Print their state, and number:
		light1.printState();
		light1.printNumOfLight();
		light2.printState();
		light2.printNumOfLight();

		System.out.println();
		System.out.println("After change:");
		light1.setStatus(false);
		light2.setNumBulbs(10);
		light1.printState();
		light1.printNumOfLight();
		light2.printState();
		light2.printNumOfLight();
		
		System.out.println();
		System.out.println("Turn both On:");
		light1.turnOn();
		light2.turnOn();
		
		System.out.println();
		System.out.println("Turn both Off:");
		light1.turnOff();
		light2.turnOff();	
		
		light1.toggle(light2);
		light1.toggle();
		System.out.println();
		light1.printState();
		light2.printState();
	
	}

}
