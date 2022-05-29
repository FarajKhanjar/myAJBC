package networking_multi.expensesApp_exercise_5;

import java.time.LocalDateTime;

public class Expense 
{
	private LocalDateTime timestamp;
	private float amount;
	private Category category;
	
	public Expense(LocalDateTime timestamp, float amount, Category category) 
	{
		this.timestamp = timestamp;
		this.amount = amount;
		this.category = category;
	}

	@Override
	public String toString() 
	{
		return "Expense [timestamp=" + timestamp + ", amount=" + amount + ", category=" + category + "]";
	}
	
	
	

}
