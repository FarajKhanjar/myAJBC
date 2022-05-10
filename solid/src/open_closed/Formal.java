package open_closed;

public class Formal implements Formality
{
	private final String formality;

	public Formal() 
	{
		this.formality = "Good evening, sir.";
	}

	@Override
	public String getFormality() 
	{
		return formality;
	}
}
