package lambdaExpressions.personEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner 
{
	private static List<Person> people = new ArrayList<Person>();

	public static void main(String[] args) 
	{
		createPeopleList();	
		System.out.println("People List: ");
		people.forEach(onePerson->System.out.println(onePerson));
		
		System.out.println("\nList Sorted by last name: ");
		Collections.sort(people, (onePerson, secondPerson)->onePerson.lastName.compareTo(secondPerson.lastName));
		people.forEach(onePerson->System.out.println(onePerson));	
        
		System.out.println("\nList of people who doesnt have the letter o in their first name: ");
		final CharSequence LETTER_o = "o" , LETTER_O = "O";
		people.forEach(onePerson->
		{
			if(onePerson.firstName.contains(LETTER_O)==false && onePerson.firstName.contains(LETTER_o)==false) 
			{
				System.out.println(onePerson);
			}
			
		});
		
		System.out.println("\nList of people under the age of 21: ");		
		ArrayList<Person> personUnderAge = new ArrayList<>();
		people.forEach(onePerson->
		{			
		  if(onePerson.age<21)
		       personUnderAge.add(onePerson);
		});		
		personUnderAge.forEach(onePerson->System.out.println(onePerson));		
	}
	
	private static void createPeopleList()
	{				
		Person person_1 = new Person("Faraj", "Khanjar", 28.5f);
		Person person_2 = new Person("Saul", "Godman", 35);
		Person person_3	= new Person("Ofek", "Habusha", 17);
		Person person_4	= new Person("Soso", "Memo", 9.10f);
		Person person_5	= new Person("John", "Snow", 90.2f);
		
		people.add(person_1);
		people.add(person_2);
		people.add(person_3);
		people.add(person_4);
		people.add(person_5);
	}

}
