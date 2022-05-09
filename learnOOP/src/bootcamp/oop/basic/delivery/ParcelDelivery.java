package bootcamp.oop.basic.delivery;

public class ParcelDelivery extends Delivery 
{

// field	
	protected int numItems;
	protected boolean isDoorside;
	
//constructor	
	public ParcelDelivery(String clientName, String address, int numItems, boolean isDoorside)
	{
		super(clientName, address);
		this.numItems = numItems;
		this.isDoorside = isDoorside;
	}
	
	public void deliver()
	{
		String msg = ("Hi! I have a parcel ");
	    System.out.print(msg+toString());
	}
	
	@Override
	public String toString() 
	{
		String parcelStr = super.toString();
		parcelStr += String.format("Total of items is: "+numItems+" \n");	
		if(isDoorside)
			parcelStr += "I left it for you by the door if you're not home. \n";
		else
			parcelStr += "I can not leave the parcel outside \n";
		return parcelStr;
	}
}
