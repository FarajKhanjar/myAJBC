package print_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class PrintWriterDemo 
{
	public static void writerDemo() 
	{ 
		String data = "This is the data I want to write.\n";
		int age = 33;
		float money = 1233.45f;

		try(PrintWriter printer = new PrintWriter("myFiles/output3.txt"))		
		{	
			printer.printf("%sage= %d and money = %.2f",data,age,money);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
