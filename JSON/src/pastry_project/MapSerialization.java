package pastry_project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class MapSerialization 
{
		protected static void run()
		{
			List<Ingredient> ingredients_1 = createPastry_1IngredientList();
			List<Ingredient> ingredients_2 = createPastry_2IngredientList();
			List<Ingredient> ingredients_3 = createPastry_3IngredientList();
			
			Map<Label, List<Pastry>> pastryMap = new HashMap<>();
			pastryMap.put(Label.PAREVE, Arrays.asList(new Pastry("Potato Cinnamon Rolls", 550,Label.PAREVE, ingredients_1)));
			pastryMap.put(Label.MEAT, Arrays.asList(new Pastry("Cheese-Beef Danish", 750,Label.DAIRY, ingredients_2)));
			pastryMap.put(Label.DAIRY, Arrays.asList(new Pastry("Blueberry-Cream Cheese", 400,Label.DAIRY, ingredients_3)));
			
			Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
			String pastryMapJson = gson.toJson(pastryMap);
			System.out.println(pastryMap);
			
			File file = new File("myFiles/pastries_map.json");
			try (FileWriter writer = new FileWriter(file);) 
			{
				writer.write(pastryMapJson);
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
