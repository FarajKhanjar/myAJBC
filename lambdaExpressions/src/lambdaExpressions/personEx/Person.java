package lambdaExpressions.personEx;

import lambdaExpressions.example.Printable;

public class Person 
{
	protected String firstName;
	protected String lastName;
	protected float age;
	
	public Person(String firstName, String lastName, float age) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
}
