package lambdaExpressions.example;

public class Printer implements Printable,Addable
{
	public static void main(String[] args)
	{
		Printer printer = new Printer();
		String hello = "Hello";
		//printer.print(hello);
		
/*		Printable printable = new Printable();
		{
			@Override
			public void print(String s)
			{
				System.out.println(s);
			}
		};
*/		
		Printable printable = (s)->System.out.println(s+" is printed");
		activate(printable,hello);
		
		
		Addable addable = (x,y)->x+y; //no need to write "return x+y"
		activate(addable);
		
	}
	
	public static void activate(Printable printable,String s) 
	{
		printable.print(s);
	}
	
	public static void activate(Addable addable) 
	{
		System.out.println(addable.add(4, 5));
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void print(String s) {
		// TODO Auto-generated method stub
		
	}
}
