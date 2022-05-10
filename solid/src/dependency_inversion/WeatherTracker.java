package dependency_inversion;

public class WeatherTracker 
{
    public String currentConditions;

    public WeatherTracker(String currentConditions) 
    {
    	this.currentConditions = currentConditions;

    }

    public void notify(Notifier notifier)
    {
    	notifier.generateWeatherAlert(currentConditions);
    }
}

