package streamExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) 
	{
		List<GameCharacter> characters = Arrays.asList(
				new GameCharacter("Arthas Menethil", "Lich King", "Icecrown", 80, 1500, Continent.Northrend),
				new GameCharacter("Thrall", "Warchief", "Orgrimmar", 90, 1200, Continent.Kalimdor),
				new GameCharacter("Jaina Proudmoore", "Lord Admiral", "Kul Tiras", 120, 1000,Continent.Eastern_Kingdoms),
				new GameCharacter("Tyrande Whisperwind", "Priestess of Elune", "Teldrassil", 120, 1100,Continent.Kalimdor),
				new GameCharacter("Sylvanas Windrunner", "Dark Ranger", "Undercity", 120, 1100,Continent.Eastern_Kingdoms));
		
		
		//[------------------------------List #1----------------------------]
		List<String> namesOfGameCharacters = characters.stream()
				                     .filter((continent) -> continent.getContinent() == Continent.Kalimdor)
						             .map(name -> name.getName())
						             .collect(Collectors.toList());
		namesOfGameCharacters.forEach(list -> System.out.println(list));
		
		
		
		
		
		System.out.println();
		//[------------------------------List #2----------------------------]
		List<GameCharacter> sortedListByHitPoints = characters.stream()
				                      .sorted(Comparator.comparing(character ->character.getHitPoints()))
				                      .collect(Collectors.toList()); 	              
		sortedListByHitPoints.forEach(list -> System.out.println(list));

		
		
		
		System.out.println();
		//[------------------------------List #3----------------------------]
		List<Double> listOfhitPoints = characters.stream()
				               .filter(character -> character.getLevel() == 120) 
				               .map(points -> points.getHitPoints())
				               .collect(Collectors.toList());	
		listOfhitPoints.forEach(list -> System.out.println(list));
		int length = listOfhitPoints.size();
		double sum = listOfhitPoints.stream().reduce(0.0, (acc, next) -> acc + next);
		double avg = sum / length;
		System.out.printf("The average hit points of characters in level 120: "+ avg+"\n");
		
		
		
		
		System.out.println();
		//[------------------------------List #4----------------------------]
		List<String> listOfNames = Arrays.asList("Sami", "Ayal", "Ofek", "Jack", "Marry");
		
		List<GameCharacter> newGameCharacters = listOfNames.stream()
				            .map((gamerName)->new GameCharacter(gamerName, "Kingking", "BBBB",100,1300, Continent.Northrend))
				            .collect(Collectors.toList());
		
		newGameCharacters.forEach(list -> System.out.println(list));
	
	}
}
