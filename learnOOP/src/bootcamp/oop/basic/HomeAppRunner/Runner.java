package bootcamp.oop.basic.HomeAppRunner;

import java.time.LocalTime;

import bootcamp.oop.basic.Inheritance.Television;

//package bootcamp.oop.basic.Inheritance.HomeAppliance;

public class Runner {

	public static void main(String[] args) {

		//1)
	//  HomeAppliance homeApp1 = new HomeAppliance("TUSHIBA", 2001, 200);
		
		//2)
	//	HomeAppliance homeApp2 = new HomeAppliance("Tushiba", 222, 100);
		//int totalPowerConsumption2 = homeApp2.totalPowerConsumption(numOfHours*3);
		//System.out.println("total Power Consumption homeApp2: ",totalPowerConsumption2);
		
		//3)
		//homeApp1.display();
		//homeApp2.display();
		//System.out.println(homeApp1);
		//System.out.println(homeApp2);
		
		//4)
		Television tv1 = new Television("TUSHIBA",2001 ,200 ,6.7f, "IR");
		tv1.setModel("G45");

		
		Television tv2 = new Television("Panasonic",201 ,100 ,1f, "IR");
		tv2.setModel("3333");
		
		//tv1.display();
		//tv2.display();
		System.out.println(tv1);
		System.out.println(tv2);
		
		//5)
		int result = tv1.isBigger(tv2);
		String resText = "The same as";
		if(result==1)
			resText = "Bigger than";
		else if(result == -1)
			resText = "Smaller than";
		
		resText = "TV1 is "+resText+" TV2";
		System.out.println(resText);
		
		resText ="TV1 is "+resText+" TV2";
		System.out.println(resText);
		
		LocalTime onTime = tv1.turnOn();
		tv1.turnOff(onTime);
		
		System.out.println("TV1 is flat? "+ tv1.isFlat());
		System.out.println("TV1 is smart? "+tv1.isSmart());
	}
}
