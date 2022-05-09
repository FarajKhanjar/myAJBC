package CollectionFramework.arrayList.Lesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Runner 
{

/*
• hasNext() - returns true if there exists an element in the list
• next() - returns the next element of the list
• nextIndex() returns the index of the element that the next() method will return
• previous() - returns the previous element of the list
• previousIndex() - returns the index of the element that the previous() method will return
• remove() - removes the element returned by either next() or previous()
• set() - replaces the element returned by either next() or previous() with the specified element		
 */

	
/*
List<data type> list = new ArrayList<data type>(); // General syntax.
For example:
a. List<String> list = new ArrayList<String>(); // Creating a list of objects of String type using ArrayList.
b. List<Integer> list = new LinkedList<Integer>(); Creating a list of objects of Integer type using LinkedList.
c. List<String> list1 = new LinkedList<String>();
d. List<obj> list = new ArrayList<obj>(); // obj is the type of object.
For example:
List<Book> list=new ArrayList<Book>(); // Book is the type of object.
 */
	
//------------------------------------------------------------------------------------------------------		
	
	
//    Basic. Ex1:
/*  public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>(); //option 1
		list.add(3);
		list.add(4);
		list.add(12);
		list.add(48);
		list.add(200);
		
		for (Integer integer : list) 
		{
			System.out.println(integer);
		}
		
		System.out.println("--------------------------");
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			Integer i =  iterator.next();
			System.out.println(i);
		}
		System.out.println("--------------------------");
	
		iterator.forEachRemaining(System.out::println); //print what remain
	}		
*/

//  Basic. Ex2:	
/*	public static void main(String[] args) 
	{
		
	// Creating an ArrayList 
	ArrayList<Integer> numbers = new ArrayList<>();
	numbers.add(1);
	numbers.add(3);
	numbers.add(2);
	System.out.println("ArrayList: " + numbers);
	// Creating an instance of ListIterator
	ListIterator<Integer> iterate = numbers.listIterator();
	iterate.next();
	iterate.next();
	// Using the previous() method
	int number1 = iterate.previous();
	System.out.println("Previous Element: " + number1);
	// Using the previousIndex()
	int index1 = iterate.previousIndex();
	System.out.println("Position of the Previous element: " + index1);
	}
*/
	
	
//------------------------------------------------------------------------------------------------------

	
//	Ex1:
/*	public static void removeAllItemsFromList(List<String> listOfStrings) 
	{
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()) 
		{
			iterator.next();
			iterator.remove();
		}			
	}
	
	public static void main(String[] args) 
	{
		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("Faraj");
		listOfStrings.add("Khanjar");
		listOfStrings.add("Java");
		listOfStrings.add("IAI");
		listOfStrings.add("03.05.2022");
		System.out.println(listOfStrings);
		removeAllItemsFromList(listOfStrings);
		System.out.println(listOfStrings);
	}
*/	
	
//------------------------------------------------------------------------------------------------------
	
	
}
