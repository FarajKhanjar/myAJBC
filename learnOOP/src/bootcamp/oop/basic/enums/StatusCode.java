package bootcamp.oop.basic.enums;

public class StatusCode {
	
	private String msg;
	private final Status status;
	
	public StatusCode(String msg, Status status)
	{
		this.msg= msg;
		this.status = status;
	}
	
	public void checkIfMsgSent() 
	{
		System.out.println("Testing Sent: "+msg);
		
		switch(status)
		{
		case PASS:
			System.out.println("Yes! we did it!!!!");
			break;
			
		case FAIL:
			System.out.println("ohhh Nooo :( ");
			break;
			
		case MISSING_INFO:
			System.out.println("you missed an info");
			break;
			
		case ILLEAGA_NAME:
			System.out.println("!!!!");
			break;
			
		default:
			break;
		}
	}
	
	public static enum Status //class that have the constant/enam values
	{
		MISSING_INFO(100,"Hey"),
		ILLEAGA_NAME(101,"All"),
		PASS(400,"I'm"),
		FAIL(500,"Okay");
		
		int code;
		String txt;
		
	//constructor:
		Status(int code, String txt) 
		{
			this.code = code;
			this.txt = txt;
		}
		
	}

}
