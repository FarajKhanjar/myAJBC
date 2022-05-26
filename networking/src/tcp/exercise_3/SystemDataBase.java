package tcp.exercise_3;

import java.util.Map;
import java.time.LocalDateTime;
import java.util.HashMap;

public class SystemDataBase 
{
	public static Map<String, Location> locationMap  = new HashMap<>();

	public SystemDataBase() 
	{
		locationMap = new HashMap<>();
	}

	public void run()
	{
	for(int i=0; i<10; i++)
	{
		float longitude = -34.397f;
		float altitude = 150.644f;
		LocalDateTime timestamp = LocalDateTime.now();
		
		Location location = new Location(longitude ,altitude , timestamp);
		String str = ""+i;
		RackingDevice RD = new RackingDevice(str,location);
		locationMap.put(str, location);
		
		longitude++;
		altitude++;	
	}	
	}

}