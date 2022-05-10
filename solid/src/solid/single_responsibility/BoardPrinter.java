package solid.single_responsibility;

import java.util.Iterator;

public class BoardPrinter 
{
	Board board;

	public BoardPrinter(Board board) 
	{
		this.board = board;
	}
	
	public void print()
	{
		String fotmatBoard="";
		
		for (int i = 0; i < this.board.size*this.board.size; i++) 
		{
			String boarderNewLine=" ";
			if((i+1)%board.size==0)
			{
				boarderNewLine+="\n";
			}
			else
			{
				boarderNewLine+="| ";
			}
			fotmatBoard+=board.spots.get(i);
			fotmatBoard+=boarderNewLine;
		}
		System.out.println(fotmatBoard);
		
	}
	

}
