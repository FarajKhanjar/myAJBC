package pastry_project;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class MapDeSerialization 
{
	public static void run() 
	{
			Map<Label, List<Pastry>> pastryMap = parseToPastryMap();
			pastryMap.forEach((lable, pastryList)->{
				System.out.println(lable);
				pastryList.forEach(System.out::println);
				System.out.println("");
			});
	}
	
	public static Map<Label, List<Pastry>> parseToPastryMap() 
	{
		File file = new File("myFiles/pastries_map.json");
		try (FileReader reader = new FileReader(file);) {

			JsonReader jsonReader = new JsonReader(reader);
			Gson gson = new Gson();

			Type mapType = new TypeToken<HashMap<Label, List<Pastry>>>() {}.getType();
			Map<Label, List<Pastry>> pastryMap = gson.fromJson(jsonReader, mapType);

			return pastryMap;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}