package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;

public class Kid 
{	
	// fields 
	protected final String name; 
	protected LocalDate birthDate;
	
	//constructor
	public Kid(String name, LocalDate birthDate) 
	{
		this.name = name;
		this.birthDate = birthDate;
	}
	
	
}
