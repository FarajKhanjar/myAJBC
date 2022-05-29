package networking_DataBase;

import java.io.Serializable;

public class Student implements Serializable
{
	private static long counter = 1001;
	private final long ID;
	private String studentName;
	private int studentAge;
	
	public Student(String studentName, int studentAge) 
	{
		this.ID = counter;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public Student() {
		this("NA", -1);
	}
	
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}
	
	

}
