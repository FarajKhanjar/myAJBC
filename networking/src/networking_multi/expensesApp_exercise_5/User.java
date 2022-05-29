package networking_multi.expensesApp_exercise_5;

import java.util.HashMap;
import java.util.Map;

public class User 
{
	private static int counter;
	private final int ID;
	private double totalExpense;
	private Map<Category, Double> userMap;
	
	public User() 
	{
		ID = counter++;
		userMap = new HashMap<>();
		setTotalExpense();
		
	}

	private void setTotalExpense() 
	{
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
