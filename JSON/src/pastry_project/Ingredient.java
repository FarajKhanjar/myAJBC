package pastry_project;

public class Ingredient 
{
	//Fields:
	private String name;
	private float weight;
	
	public Ingredient(String name, float weight) 
	{
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", weight=" + weight + "]";
	}
	
	
	

}
