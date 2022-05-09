package bootcamp.oop.basic.library;

import java.io.IOException;
import java.nio.CharBuffer;

public class Readable_Book extends Book  
{
	// field	
	

	//constructor	
		public Readable_Book(int bookTypeIndex, String title, int quantity, String authorName, String gender)
		{			
			super(bookTypeIndex, title, quantity, authorName, gender);
		}
		
		public void pringMsg()
		{
			String msg = ("");
		    System.out.print(msg+toString());
		}

		@Override
		public String toString() 
		{
			String msgStr = reading_toString();	
			return msgStr;
		}
		
		public void setQuantity()
		{
			this.quantity-=1;
		}
		
		public void approach()
		{
			super.reading_toString();
		}

		@Override
		public int read(CharBuffer cb) throws IOException {
			// TODO Auto-generated method stub
			return 0;
		}

}
