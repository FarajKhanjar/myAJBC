package open_closed;

public class Runner 
{
	public static void main(String[] args) 
	{
		Formal formal = new Formal();
		System.out.println(formal.getFormality());
		
		Casual casual = new Casual();
		System.out.println(casual.getFormality());
		
		Intimate intimate = new Intimate();
		System.out.println(intimate.getFormality());
		
		Hello hello = new Hello();
		System.out.println(hello.getFormality());
	}

}
