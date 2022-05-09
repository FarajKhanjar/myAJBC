package bootcamp.oop.basic.library;

public class Author 
{
	// field  
		private String name;
		private String gender;
					
	//constructor
		public Author(String name, String gender) 
		{
			this.name = name;
			this.gender = gender;
		}
					
		public String getName()
		{
			return name;
		}
		
		public void setName()
		{
			this.name = name;
		}
		
		public void setgender()
		{
			this.gender = gender;
		}
		
		public String getGender()
		{
			String genderStr;
			if(gender == "m")
				genderStr=" Mr.";
			else if(gender == "f")
				genderStr=" Ms.";
			else {
				this.gender = "m";
				genderStr=" Ms.";
			}				
			return genderStr;
		}
}
