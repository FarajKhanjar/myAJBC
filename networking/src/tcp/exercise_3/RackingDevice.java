package tcp.exercise_3;

public class RackingDevice 
{
	private String id;
	private Location location;
	
	public RackingDevice(String id, Location location) 
	{
		this.id = id;
		this.location = location;
	}

	@Override
	public String toString() {
		return "RackingDevice [id=" + id + ", location=" + location + "]";
	}
	
	

}
