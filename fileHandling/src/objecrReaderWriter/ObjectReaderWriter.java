package objecrReaderWriter;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.Writer;
import objecrReaderWriter.Dog;

public class ObjectReaderWriter 
{
	public static void writeObjDemo() 
	{ 		
		Dog dog1 = new Dog("Jerry","Poodle");
		Dog dog2 = new Dog("Spock","Cocker-Spaniel");
		Dog dog3 = new Dog("Zoey","Sibirian Huskey");
		
		try (FileOutputStream file = new FileOutputStream("myFiles/objFile2.ser");
				ObjectOutputStream output = new ObjectOutputStream(file)) 
		{
			output.writeObject(dog1);
			output.writeObject(dog2);
			output.writeObject(dog3); // String			
		}
		catch (IOException e) 
		{
			System.out.println(e);
		}
	}
		
	/*	public static void writeSimpleDemo() 
		{ 
			int num = 10 ;
		double dNum = 123.45;
		String str = "Hi there";
		
		try (FileOutputStream file = new FileOutputStream("myFiles/objFile1.dat");
				ObjectOutputStream output = new ObjectOutputStream(file)) 
		{
			output.writeInt(num);
			output.writeDouble(dNum);
			output.writeObject(str); // String			
		}
		catch (IOException e) 
		{
			System.out.println(e);
		}
		}
		
	*/
	
	
	public static void readObjDemo() 
	{ 
		
		try (FileInputStream file = new FileInputStream("myFiles/objFile2.ser");
				ObjectInputStream input = new ObjectInputStream(file)) 
		{
			Dog dog1 = (Dog) input.readObject();
			dog1.breed = "Something else";
			System.out.println("Dog1 : "+dog1);
			System.out.println("Dog2 : "+(Dog)input.readObject());
			System.out.println("Dog3 : "+(Dog)input.readObject());
			System.out.println("Dog4 : "+(Dog)input.readObject());
			 
		} 
		catch (EOFException e) 
		{
		System.out.println("No more data, dog4 not avalable");
		}
		catch (IOException | ClassNotFoundException e) 
		{
		e.printStackTrace();
		}
		
	}
		
	/*	public static void readSimpleDemo() 
	{ 
	    try (FileInputStream file = new FileInputStream("myFiles/objFile1.dat");
				ObjectInputStream input = new ObjectInputStream(file)) 
		{
			System.out.println("int data : "+input.readInt());
			System.out.println("double data : "+input.readDouble());
			System.out.println("string data : "+input.readObject());
			 
		} 		
		catch (IOException | ClassNotFoundException e) 
		{
		e.printStackTrace();
		}
	}
	*/
		
}
