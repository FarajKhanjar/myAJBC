package CollectionFramework.arrayList.Exercise;

import java.util.ArrayList;
import java.util.ListIterator;

public class Runner 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> input = range(1, 10);
		ArrayList<Integer> doubled = double_each(input);
		ArrayList<Integer> complexified = complexify_each(input);
		System.out.println(input);
		System.out.println(doubled);
		System.out.println(complexified);
	}

	/**
	 * A method that
	 * @param start range.
	 * @param end range.
	 * @returnArrayList initialized with integers in the range
	 */
	public static ArrayList<Integer> range(int start, int end) 
	{
        ArrayList<Integer> integers = new ArrayList<Integer>();
        

        for (int i=start; i<=end; i++) 
        {
            integers.add(i);
        }

        return integers;
    }
	
    /**
     * A method that
     * @param inputList
     * @return a new Arraylist where each element is multiplied by 2.
     */
	public static ArrayList<Integer> double_each(ArrayList<Integer> inputList) 
    {
      /*
        ArrayList<Integer> elementsList = new ArrayList<Integer>();
        for(int i : inputList) 
        {
        	elementsList.add(2*i);
        }
        return elementsList;
      */
        ArrayList<Integer> newList = new ArrayList<Integer>(inputList);
        ListIterator<Integer> iterator = newList.listIterator();
        
        int num;
        while(iterator.hasNext())
        {
        	num=iterator.next();
        	iterator.set(num*2);
        }
        
        return newList;
    }

    /**
     * A method that
     * @param inputList
     * @return a new Arraylist where each element is multiplied by 4 and than added 3.
     */
	public static ArrayList<Integer> complexify_each(ArrayList<Integer> inputList) 
    {
	/*	
        ArrayList<Integer> elementsList = new ArrayList<Integer>();
        for(int i : inputList) 
        {
            elementsList.add(((i*4) + 3));
        }
        return elementsList;
    */ 
		ArrayList<Integer> newList = new ArrayList<Integer>(inputList);
        ListIterator<Integer> iterator = newList.listIterator();
        
        int num;
        while(iterator.hasNext())
        {
        	num=iterator.next();
        	iterator.set(((num*4) + 3));
        }
        
        return newList;
    }
}
