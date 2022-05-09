package bootcamp.oop.basic.Inheritance;

import java.util.Calendar;

import bootcamp.oop.basic.HomeApp_absttraction.Flatable;
import bootcamp.oop.basic.HomeApp_absttraction.Smartable;
import bootcamp.oop.basic.HomeApp_RemoteControl.RemoteControl;

public class Television extends HomeAppliance implements Flatable, Smartable {
	
	protected float size;
	protected String model;
	protected RemoteControl remControl;
	//int numOfhours=3 ;
	
	//constructors:	
	public Television(String manufacturer, int purchaseYear, int powerConsumption, float size, String transmitMethod) {
		super(manufacturer,purchaseYear,powerConsumption); //constructor father.
		remControl = new RemoteControl(transmitMethod);
		setSize(size);
		setModel("A12");
	}
	
	public Television(float size) {
		this("Generic",((Calendar.getInstance()).get(Calendar.YEAR)), 100, size, "RF");		
	}
		
	public Television() {
		this(40);
	}


	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		if(size<2.5f || size>120f)
		{
			size = 10f;  //default size.
		}
		this.size = size;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		
		if(model.length()<3)
		{
			System.out.println("Exception in setModel");
			return;
		}
		
		char ch = model.charAt(0);
		//check if ch is okay
		if(!Character.isLetter(ch)) //the first digit is character.
			model = "A"+model;
		
		char ch1 = model.charAt(1);
		char ch2 = model.charAt(2);
		if(!Character.isDigit(ch1) || !Character.isDigit(ch2)) //the first digit is character.
		{
			model= ch +"00";		
		}	
		this.model = model.substring(0,3);
	}
	
	
	
	
	@Override
/*	public void display()
	{
		super.display(); //geesha lm7liket hafather.
				
		String msg="Television size is: "+size+" ,Television model is: "+model+ ", Remote-Control method: "+ remControl.getTransmitMethod();
		System.out.println(msg);
	}
*/	
	
	// manual- source-> genrate toString()-> choose all filed and also the father "inherated method->to string()" ->Genrate
	public String toString ()
	{
		return String.format("Television size is: "+size+" ,Television model is: "+model+ ", Remote-Control method: "+ remControl.getTransmitMethod() + " " + super.toString());
	
	}
	
	
	public float sizeInCM()
	{
		return (size*2.54f);
	}
	
	public int isBigger(Television other) 
	{
		float diff = this.size - other.size; 
		if(diff > 0)
		{
			return 1;
			
		}
		else if(diff<0)
		{
			return -1;
		}
		else
			return 0;	
	}
	
	
	@Override
	public int totalPowerConsumption(int numOfhours)
	{
		int totalPowCon = numOfhours*powerConsumption;
		return totalPowCon;
	}
	
	@Override
	public boolean isSmart()
	{
		if(purchaseYear > 2015)
			return true;
		return false;
	}
	
	@Override
	public boolean isFlat()
	{
		if(purchaseYear > 2010)
			return true;
		return false;
	}
		
}
