package pastry_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class BasicDeSerialization 
{

	public static void run() 
	{
		File file = new File(Path.of("myFiles", "onePastry.json").toString());
		try (FileReader fileReader = new FileReader(file)) 
		{

			JsonReader jsonReader = new JsonReader(fileReader);

			Gson gson = new Gson();
			Pastry pastry = gson.fromJson(jsonReader, Pastry.class);
			System.out.println(pastry);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
