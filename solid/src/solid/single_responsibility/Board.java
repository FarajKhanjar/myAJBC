package solid.single_responsibility;

import java.util.ArrayList;

public class Board 
{
    public ArrayList<String> spots;
    protected final int size;
    
    public Board(int size) 
    {
    	this.size = size;
        this.spots = new ArrayList<String>();
        for (int i = 0; i < size*size; i++) 
        {
            this.spots.add(String.valueOf(i));
        }        
    }
}