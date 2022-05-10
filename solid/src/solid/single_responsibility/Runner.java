package solid.single_responsibility;

public class Runner 
{

	public static void main(String[] args) 
	{
		Board_before board_before = new Board_before();
		board_before.display();
		System.out.println("\n===========After:");
		Board board = new Board(3);
		BoardPrinter boardPrinter = new BoardPrinter(board);
		boardPrinter.print();
	}
}
