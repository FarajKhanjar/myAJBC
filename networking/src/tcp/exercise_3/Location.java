package tcp.exercise_3;

import java.time.LocalDateTime;

public class Location 
{
	private float longitude;
	private float altitude;
	private LocalDateTime timestamp;
	
	public Location(float longitude, float altitude, LocalDateTime timestamp) 
	{
		this.longitude = longitude;
		this.altitude = altitude;
		this.timestamp = timestamp;
	}

	@Override
	public String toString() 
	{
		return "Location [longitude=" + longitude + ", altitude=" + altitude + ", timestamp=" + timestamp + "]";
	}
	
	
	
	

}
