package interface_segregation;

public abstract class Penguin implements Bird 
{
    public String currentLocation;
    public int numberOfFeathers;

    public Penguin(int initialFeatherCount) 
    {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() 
    {
        this.numberOfFeathers -= 1;
    }

    public void swim() 
    {
        this.currentLocation = "in the water";
    }
}
