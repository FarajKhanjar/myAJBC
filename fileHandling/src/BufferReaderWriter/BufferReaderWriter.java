package BufferReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferReaderWriter 
{
	public static void readerDemo() 
	{ 
		char[] array = new char[1000];
		
		try (FileReader file = new FileReader("myFiles/input1.txt");
				BufferedReader input = new BufferedReader(file)) 	 
		{
			
			System.out.println("Is the data avaliable in the stream ?" +input.ready());
			input.read(array);

			System.out.println(array);
		}
		catch (FileNotFoundException e) 
		{
			System.out.println(e);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
		
	public static void writerDemo() 
	{ 
		String data = "This is the data I want to write.\n";
		String data1 = "Adding more data";
		try (FileWriter file = new FileWriter("myFiles/output2.txt",true);
				BufferedWriter output = new BufferedWriter(file))
		{			
			output.write(data);
			output.append(data1);

		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
