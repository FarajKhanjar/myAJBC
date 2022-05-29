package tcp.exercise_3;

import java.time.LocalDateTime;

public class TrackingDevice 
{
	private static long counter = 1;
	private final long ID;
	private Location location;
	
	public TrackingDevice() 
	{
		ID = counter++;
	}
	
	public void updateLocation(float longitude, float altitude, LocalDateTime timestamp) 
	{
		location = new Location(longitude, altitude,timestamp);
	}

	@Override
	public String toString() 
	{
		return String.format(ID+" "+location.getLongitude()+" "+location.getAltitude()+" "+location.getTimestamp());
	}

	
	
//	@Override
//	public String toString() 
//	{
//		return String.format("%s;%f;%f;%s", ID, location.getLongitude(), location.getAltitude(),location.getTimestamp());
//	}
	
	

}
