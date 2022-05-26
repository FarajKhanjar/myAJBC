package udp.exercise_2;

import java.util.Map;
import java.util.HashMap;

public class SystemDataBase 
{
	private Map<String, Weather> weatherMap;

	public SystemDataBase() 
	{
		weatherMap = new HashMap<>();
	}

	public void dataBase() 
	{
		Weather weather_1 = new Weather(City.BATUMI, 19.5f, 9.8f);
		Weather weather_2 = new Weather(City.LONDON, 14.5f, 10);
		Weather weather_3 = new Weather(City.BERLIN, 21f, 7.5f);
		Weather weather_4 = new Weather(City.TELAVIV, 28.3f, 13.5f);
		Weather weather_5 = new Weather(City.PARIS, 20.1f, 4f);
		
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
	
	private Weather getWeather(String city) 
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