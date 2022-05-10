package open_closed;

public class Intimate implements Formality
{
	private final String formality;

	public Intimate() 
	{
		this.formality = "Hello Darling!";
	}

	@Override
	public String getFormality() 
	{
		return formality;
	}
}
