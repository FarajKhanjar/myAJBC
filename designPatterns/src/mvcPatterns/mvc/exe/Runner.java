package mvcPatterns.mvc.exe;

public class Runner {
	
	public static void main(String[] args) {
		
		StudentCheckerController app = new StudentCheckerController(new StudentCheckerView());
		app.run();
	}

}
