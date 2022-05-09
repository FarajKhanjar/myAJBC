package bootcamp.basic.conditions;

import java.util.Scanner;

public class Ex_switch {

	public static void main(String[] args) {
		
		// switch statement to check the date.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year  = scanner.nextInt();
		int flag=1;
	    if(year<0)
	    {
	    	 flag=0;
	    }	
	    
		int days=31;
		
        switch (flag) {
           case 0:
	         System.out.println("Invalid year value");
	          break;
	 
           case 1:
	         System.out.println("Enter a month number: ");
	         int month = scanner.nextInt();
             if(month>12 || month<1)
             {
             	 System.out.println("Invalid month value");
             	 break;
             }
        
	    switch (month) {
	      case 1:
	        System.out.println("January "+year+" has "+days+" days.");
	        break;
	        
	      case 2:
	    	  days=29;
	    	  if(year % 4 == 0)
	    	    {
	    	        if(year % 100 == 0)
	    	        {
	    	            // if year is divisible by 400, then the year is a leap year
	    	            if ( year%400 == 0)
	    	            {
	    	            	System.out.println("February "+year+" has "+days+" days.");
	    	            }
	    	            else
	    	            {
	    	            	days=28;
	    	            	System.out.println("February "+year+" has "+days+" days.");
	    	            }
	    	        }
	    	        else
	    	        {
	    	        	System.out.println("February "+year+" has "+days+" days.");
	    	        }
	    	    }
	    	  else
	    	  {
	    		  days=28;
	    		  System.out.println("February "+year+" has "+days+" days.");
	    	  }
	        break;
	        
	      case 3:
	        System.out.println("March "+year+" has "+days+" days.");
	        break;
	        
	      case 4:
	        days =30;
	        System.out.println("April "+year+" has "+days+" days.");

	        break;
	        
	      case 5:
	        System.out.println("May "+year+" has "+days+" days.");
	        break;

	      case 6:
	    	days =30;
	        System.out.println("June "+year+" has "+days+" days.");
		    break;
		    
	      case 7:
		    System.out.println("July "+year+" has "+days+" days.");
		    break;
		    
	      case 8:
	        System.out.println("August "+year+" has "+days+" days.");
		    break;
		    
	      case 9:
		    days =30;
	        System.out.println("September "+year+" has "+days+" days.");
		    break;
		    
	      case 10:
	        System.out.println("October "+year+" has "+days+" days.");
		    break;
		    
	      case 11:
		    days =30;
	        System.out.println("November "+year+" has "+days+" days.");
		    break;
		    
	      case 12:
	        System.out.println("December "+year+" has "+days+" days.");
		    break;        
         }
      }   
	    scanner.close();
	}
}
