package bootcamp.oop.basic.airplane;

public class Credit 
{
	protected int creditBonus;
	protected int flightMilesNumber;
	protected Airplane[] airplane;
	
	public Credit(int creditBonus, int flightMilesNumber, Airplane[] airplane) 
	{
		this.creditBonus = creditBonus;
		this.flightMilesNumber = flightMilesNumber;
		this.airplane = airplane;
	}
	
	public int getCreditBonus() {
		return this.creditBonus;
	}

	public void setCreditBonus(int creditBonus) {
		this.creditBonus = creditBonus;
	}
	
	//addAirplane
	

}
