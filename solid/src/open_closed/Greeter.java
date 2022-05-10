package open_closed;

public abstract class Greeter implements Formality
{
	Formality formality;
	public Greeter(Formality formality)
	{
		setFormality(formality);		
	}
	
	public void setFormality(Formality formalitySay) 
	{
		this.formality =formalitySay;
	}
	
	public String getFormality(Formality formalitySay) 
	{
		return formalitySay.getFormality();
	}
}
