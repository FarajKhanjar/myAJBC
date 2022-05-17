package pastry_project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class BasicSerialization {

	public static void run() 
	{
		Pastry pastry = new Pastry("Potato Cinnamon Rolls", 550,Label.PAREVE, createPastry_1IngredientList());

		Gson gson = new Gson();
		String pastryJson = gson.toJson(pastry);
		System.out.println(pastry);
		File file = new File("myFiles/onePastry.json");
		try (FileWriter writer = new FileWriter(file))
		{
			writer.write(pastryJson);
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
}
