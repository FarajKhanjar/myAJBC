package myBasicCalculator;

public class Calculator 
{	
	int answer;
	Operation lastOperation;
	
	public Calculator(int answer) 
	{
		this.answer =answer;
	}

	public enum Operation 
	{
		ADD,
		SUBTRACT,
		MULTIPLAY,
		DIVIDE;
	}
	public void sum(int num1, int num2)
	{
		answer = num1+num2;
		lastOperation = Operation.ADD;
	}
	
	public void divide(int num1, int num2)
	{
	//	if(num2==0)
	//		throw new AritmeticException("Zero division is not allowed");
		answer = num1/num2;
		lastOperation = Operation.DIVIDE;
	}
}
