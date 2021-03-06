package stream_reader_writer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class StreamReaderWriter 
{
	public static void readerDemo() 
	{ 
		String data = "This is the data I want to write.\n";
		String data1 = "Adding data.\n";
		char[] array = new char[100];
		try
		{
			FileInputStream file = new FileInputStream("myFiles/input.txt");		
			InputStreamReader input = new InputStreamReader(file, Charset.forName("UTF8"));
			System.out.println("Is the data avaliable in the stream ?" +input.ready());
		
			input.read(array);
			file.close();
			input.close();
			System.out.println(array);

		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public static void writerDemo() 
	{ 
		String data = "This is the data I want to write.\n";
		String data1 = "Adding data.\n";
		char[] array = new char[100];
		try(FileOutputStream file = new FileOutputStream("myFiles/output1.txt");
			OutputStreamWriter output = new OutputStreamWriter(file)) 
		{
			output.write(data);
			//output.append(data1);
			//System.out.println('Success');
			
			output.close();
			file.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
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

}
