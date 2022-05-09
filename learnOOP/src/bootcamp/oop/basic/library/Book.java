package bootcamp.oop.basic.library;

public abstract class Book implements Readable 
{
	// field  
	protected String title;
	protected int quantity;
	protected Author bookAuthor;
	protected Type bookType;
	
	//constructor
	public Book(int bookTypeIndex, String title, int quantity, String authorName, String gender)
	{
		this.bookType = Type.values()[bookTypeIndex];
		this.title = title;
		this.quantity = quantity;
		bookAuthor = new Author(authorName,gender);
	}
	
	//method
	public void approach()
	{
		
	}
	
	public String getBookTitle()
	{
		return this.title;
	}
	
	public Type getBookType()
	{
		return this.bookType;
	}
	
	public int getBookQuantity()
	{
		return this.quantity;
	}
	
	public void setBookQuantity(int quantity)
	{
		if(quantity>=0) {
			this.quantity = quantity;
		}
		else {
			quantity=0;
		}
	}
		


	public String reading_toString()
	{
		return String.format("The title of the book is: "+title+" ,Its a "+getBookType()+" Book! \nThe quantity in the library is: "+quantity+". \n"
				+ "His author is:"+bookAuthor.getGender()+bookAuthor.getName()+". \n");
	}


public enum Type //class that have the constant/enam values
{
	COOKING,
	NOVEL,
	DICTIONARIE;	
}


}
