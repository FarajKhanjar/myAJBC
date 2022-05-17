package pastry_project;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Pastry 
{
	@SerializedName("name")
    private String name;
	private int age;
	private Label lable;
	private List<Ingredient> ingredientList = new ArrayList<>();
	
	public Pastry(String name, int age, Label lable,List<Ingredient> ingredientList) 
	{
		this.name = name;
		this.age = age;
		this.lable = lable;
		this.ingredientList = ingredientList;
	}

	@Override
	public String toString() {
		return "Pastry [name=" + name + ", age=" + age + ", lable=" + lable + ", ingredientList=" + ingredientList
				+ "]";
	}

	
	
	

}
