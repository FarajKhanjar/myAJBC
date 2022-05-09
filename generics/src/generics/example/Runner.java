package generics.example;

import java.util.Arrays;
import java.util.List;

public class Runner 
{	
	public static void main(String[] args) 
	{	
		GenericClass<Integer> generic = new GenericClass<>(0);
		List<Integer> data = Arrays.asList(1000, 1500, 2000, 2500, 3000);
		List<Integer> reverseList = generic.reverseList(data);
		
		System.out.println(reverseList);

	}

}
