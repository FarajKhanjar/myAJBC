package open_closed;

public class Greeter_before 
{
	    String formality;

	    public String greet() {
	        if (formality == "formal") {
	            return "Good evening, sir.";
	        }
	        else if (formality == "casual") {
	            return "Sup bro?";
	        }
	        else if (formality == "intimate") {
	            return "";
	        }
	        else {
	            return "Hello.";
	        }
	    }

	    public void setFormality(String formality) {
	        this.formality = formality;
	    }
}
