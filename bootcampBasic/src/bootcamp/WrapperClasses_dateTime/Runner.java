package bootcamp.WrapperClasses_dateTime;

import java.time.LocalDateTime;

public class Runner 
{

    private static String OS = System.getProperty("os.name").toLowerCase();

	public static void main(String[] args) 
	{
		 // Prints the current day of the week and time.
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("LocalDateTime : " + dateTime.getDayOfWeek());
		System.out.println("LocalDateTime : " + dateTime.toLocalTime().toString());
		
		// Print my User name.
		System.out.println();
		System.out.println( System.getProperty("user.name") );
	    
		// Print my OS type.
		System.out.println();
		System.out.println("my OS type is: " + OS);
		
		// Print my OS arch type. (64 or 32 bit)
		System.out.println();
		String archType = System.getProperty("os.arch");
		System.out.println("my arch type is: " + archType);
	}
}
