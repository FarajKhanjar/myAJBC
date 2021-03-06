package generics.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GenericClass<T> implements GenericInterface<T>
{
	private T t;
	
	// Constructor
	public GenericClass(T t) 
	{
		this.t = t;
	}

	@Override
	public List<T> reverseList(List<T> t) 
	{
		List<T> reverse = new ArrayList<T>(t);
       
		Collections.reverse(reverse);
		return reverse;
	}
}