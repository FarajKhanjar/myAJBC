package udp.exercise_2;

import java.util.Map;
import java.util.HashMap;

public class SystemDataBase 
{
	private Map<String, Student> weatherMap;

	public SystemDataBase() 
	{
		weatherMap = new HashMap<>();
	}

	public void dataBase() 
	{
		Student weather_1 = new Student(City.BATUMI, 19.5f, 9.8f);
		Student weather_2 = new Student(City.LONDON, 14.5f, 10);
		Student weather_3 = new Student(City.BERLIN, 21f, 7.5f);
		Student weather_4 = new Student(City.TELAVIV, 28.3f, 13.5f);
		Student weather_5 = new Student(City.PARIS, 20.1f, 4f);
		
		weatherMap.put(City.getNameOfCity(City.BATUMI), weather_1);
		weatherMap.put(City.getNameOfCity(City.LONDON), weather_2);
		weatherMap.put(City.getNameOfCity(City.BERLIN), weather_3);
		weatherMap.put(City.getNameOfCity(City.TELAVIV),weather_4);
		weatherMap.put(City.getNameOfCity(City.PARIS),  weather_5);
	}
	
	public String getCityName(String city) 
	{
		return getWeather(city).getCity();
	}
	
	public boolean checkIfCityExist(String city) 
	{
		//System.out.println(city.toUpperCase());
		boolean checkResult = weatherMap.containsKey(city.toUpperCase());
		return checkResult;
	}
	
	private Student getWeather(String city) 
	{
		return weatherMap.get(city.toUpperCase());
	}

	public float getTemperature(String city) 
	{
		return getWeather(city).getTemperature();
	}

	public float getHumidity(String city) 
	{
		return getWeather(city).getHumidity();
	}
}