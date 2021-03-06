package pastry_project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class CollectionSerialization 
{
	public static void run() 
	{
		Pastry pastry_1 = new Pastry("Potato Cinnamon Rolls", 550,Label.PAREVE, createPastry_1IngredientList());
		Pastry pastry_2 = new Pastry("Cheese-Beef Danish", 750,Label.MEAT, createPastry_2IngredientList());
		Pastry pastry_3 = new Pastry("Blueberry-Cream Cheese", 400,Label.DAIRY, createPastry_3IngredientList());
		
		List<Pastry> pastriesList = new ArrayList<>();
		pastriesList.add(pastry_1);
		pastriesList.add(pastry_2);
		pastriesList.add(pastry_3);

		Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
		String pastriesArrayJson = gson.toJson(pastriesList);
		System.out.println(pastriesList);
		
		File file = new File("myFiles/pastries_list.json");
		try (FileWriter arrayWriter = new FileWriter(file))
		{
			arrayWriter.write(pastriesArrayJson);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static List<Ingredient> createPastry_1IngredientList() 
	{
		List<Ingredient> ingredientList = new ArrayList<>();
		ingredientList.add(new Ingredient("flour",4.25f));
		ingredientList.add(new Ingredient("milk",100f));
		ingredientList.add(new Ingredient("potato",150f));
		ingredientList.add(new Ingredient("butter",30f));
		ingredientList.add(new Ingredient("eggs",75f));
		return ingredientList;
	}
	
	private static List<Ingredient> createPastry_2IngredientList() 
	{
		List<Ingredient> ingredientList = new ArrayList<>();
		ingredientList.add(new Ingredient("frozen puff",150f));
		ingredientList.add(new Ingredient("cooking apples",55f));
		ingredientList.add(new Ingredient("vanilla",1.5f));
		ingredientList.add(new Ingredient("butter",60f));
		ingredientList.add(new Ingredient("eggs",50f));
		ingredientList.add(new Ingredient("beef pesess",200f));
		return ingredientList;
	}
	
	private static List<Ingredient> createPastry_3IngredientList() 
	{
		List<Ingredient> ingredientList = new ArrayList<>();
		ingredientList.add(new Ingredient("lemon juice",45f));
		ingredientList.add(new Ingredient("sugar",250f));
		ingredientList.add(new Ingredient("blueberry",1.5f));
		ingredientList.add(new Ingredient("milk",150f));
		ingredientList.add(new Ingredient("butter",60f));
		ingredientList.add(new Ingredient("vanilla",25.5f));
		ingredientList.add(new Ingredient("eggs",100f));
		return ingredientList;
	}

}
