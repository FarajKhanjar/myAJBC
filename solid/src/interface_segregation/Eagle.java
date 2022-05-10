package interface_segregation;

public abstract class Eagle implements Bird 
{
    public String currentLocation;
    public int numberOfFeathers;

    public Eagle(int initialFeatherCount) 
    {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void fly() 
    {
        this.currentLocation = "in the air";
    }

    public void molt() 
    {
        this.numberOfFeathers -= 1;
    }
}
