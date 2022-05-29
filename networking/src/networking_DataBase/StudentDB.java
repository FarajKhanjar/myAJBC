package networking_DataBase;

import java.util.HashMap;
import java.util.Map;

public class StudentDB 
{
	private final static Map<Long, Student> students = new HashMap<>() 
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 4702429001951694294L;
		{
			Student student_1 = new Student("Alex",20);
			Student student_2 = new Student("Faraj",21);
			Student student_3 = new Student("Rot",22);
			Student student_4 = new Student("Guy",23);
			Student student_5 = new Student("Sami",24);
			
			put(1000l, student_1);
			put(1001l, student_2);
			put(1002l, student_3);
			put(1003l, student_4);
			put(1004l, student_5);
		}
	};

	public static Student getStudentById(long id) 
	{
		return students.get(id);
	}
}


