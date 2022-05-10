package open_closed;

public class Hello implements Formality
{
	private final String formality;

	public Hello() 
	{
		this.formality = "Hello.";
	}

	@Override
	public String getFormality() 
	{
		return formality;
	}

}
