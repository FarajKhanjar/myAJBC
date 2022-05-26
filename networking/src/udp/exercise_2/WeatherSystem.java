package networking.udp.exercise_2;

import java.io.IOException;
import java.time.LocalDateTime;

public class WeatherSystem 
{
	private static String currentCity;
	private static LocalDateTime currentTime;
	
	public WeatherSystem() 
	{
		this.currentTime = LocalDateTime.now();
	}

	public static void runSystem() throws IOException
	{
		boolean inDataBaseSystem = ServerUDPSide.serviceDataBase.checkIfCityExist(ServerUDPSide.clientMsg);
		if(inDataBaseSystem)
		{
			ServerUDPSide.respondMsg = "This city is exist in our system :)\nWhat are you looking for?? (chose by index).\n1) Check Temperature\n2) Check Humidity\n3) Check both Temperature and Humidity\n";

		}
		else
		{
			ServerUDPSide.respondMsg = "---->Sorry, this city is not exist in our system. try again!";
		}
		
		ServerUDPSide.sendData();
		
		if (inDataBaseSystem) 
		{
		currentCity = ServerUDPSide.serviceDataBase.getCityName(ServerUDPSide.clientMsg);
		ServerUDPSide.receiveData();
		responseServerMsg();
		ServerUDPSide.sendData();
		} 
	}
	
	private static void responseServerMsg() throws IOException 
	{
		int chose = Integer.valueOf(ServerUDPSide.clientMsg);
		
		switch(chose) 
		{
		case 1:
			String strTem = "In "+ currentCity+" Now at: "+currentTime+"\n"
		                  + "The temperature is: "+ ServerUDPSide.serviceDataBase.getTemperature(currentCity) + "c";
			ServerUDPSide.respondMsg = strTem;
			break;
		case 2:
			String strHum = "In "+ currentCity+" Now at: "+currentTime+"\n"
	                  + "The humidity is: "+ ServerUDPSide.serviceDataBase.getHumidity(currentCity) + "%";
		    ServerUDPSide.respondMsg = strHum;
			break;
		case 3:
			String strTemHum = "In "+ currentCity+" Now at: "+currentTime+"\n"
	                  + "The temperature is: "+ ServerUDPSide.serviceDataBase.getTemperature(currentCity) + "c"
			          + "\nThe humidity is: "+ ServerUDPSide.serviceDataBase.getHumidity(currentCity) + "%";
			ServerUDPSide.respondMsg = strTemHum;
		}
		
	}
}