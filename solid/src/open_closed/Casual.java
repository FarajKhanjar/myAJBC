package open_closed;

public class Casual implements Formality
{
	private final String formality;

	public Casual() 
	{
		this.formality = "Sup bro?";
	}

	@Override
	public String getFormality() 
	{
		return formality;
	}

}
