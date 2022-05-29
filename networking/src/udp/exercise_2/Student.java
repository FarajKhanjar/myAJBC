package udp.exercise_2;

import java.util.Objects;

public class Student 
{
	private City city;
	private float temperature;
	private float humidity;

	public Student(City city, float temperature, float humidity) 
	{
		this.city = city;
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public String getCity() 
	{
		return City.getNameOfCity(city);
	}
	
	public float getHumidity() 
	{
		return humidity;
	}
	
	
	public float getTemperature() 
	{
		return temperature;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city);
	}
}