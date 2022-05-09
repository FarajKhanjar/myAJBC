package fileHandling.readWriteExercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CountAndPrintText 
{
	public static void readAndCountText() 
	{
		String line = "";
		int lineCount = 0;
		int wordCount = 0;
		String current_line = null;
		String current_word = null;

		//Read file.
		try {
			
			FileReader file = new FileReader("myFiles/input1.txt");
			BufferedReader input = new BufferedReader(file);
			
			//Read line from file.
			while ((line = input.readLine()) != null) 
			{							
				lineCount++; // Counter.

				if(lineCount == 18)
				{
					current_line = input.readLine();
				}

				String[] words = line.split(" ");

				//add word count length
				wordCount += words.length;
				
				if(wordCount > 578 && current_word==null)
				{
					int index = wordCount - 578;	
					current_word = words[words.length - index - 1];				
				}							
			}

			//save in file method
			writeAndSaveText(wordCount,lineCount,current_line,current_word);			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void writeAndSaveText(int wordCount,int lineCount,String textLine18, String wordIndex578) 
	{ 
		try (PrintWriter printer = new PrintWriter("myFiles/savintInFileEx1.txt"))			
		{			
			printer.printf("Number of Words is : %d.\n",wordCount);
			printer.printf("Number of lines is : %d.\n",lineCount);
			printer.printf("Text Of line 18:\n%s",textLine18);
			printer.printf("\nWord Of index 578: %s",wordIndex578);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}