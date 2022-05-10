package liskov_substitution;

public class UnitUpgrader 
{
	public void upgrade(PenthouseSuite penthouse) 
    {
    	upgrade((Apartment)penthouse);
    	penthouse.numberOfBedrooms+=1;    
    }
	
    public void upgrade(Apartment apartment) 
    {
        apartment.squareFootage += 40;

        if (apartment.getClass() != Studio.class)
            apartment.numberOfBedrooms += 1;
    }
}

