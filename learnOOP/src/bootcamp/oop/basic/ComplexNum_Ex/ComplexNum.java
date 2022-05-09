package bootcamp.oop.basic.ComplexNum_Ex;

public class ComplexNum { // implements Complexable{
	
	// field  
	   double realNumber;
	   double imaginaryNumber;
	   
	//constructor
	   public ComplexNum(double d, double e)
	   {
	      this.realNumber = d;
	      this.imaginaryNumber = e;
	   }
	   
	   public ComplexNum()
	   {
	      this.realNumber = 0;
	      this.imaginaryNumber = 0;
	   }
	
	//method
	   // return a new Complex Number whose value is (comNum1 + comNum2)
	    public static ComplexNum add(ComplexNum comNum1,ComplexNum comNum2) {
	    	double real = comNum1.realNumber + comNum2.realNumber;
	        double imag = comNum1.imaginaryNumber + comNum2.imaginaryNumber;
	        return new ComplexNum(real, imag);
	        
	    }
	    
	 // return a new Complex Number whose value is (comNum1 - comNum2)
	    public static ComplexNum subtract(ComplexNum comNum1,ComplexNum comNum2) {
	    	double real = comNum1.realNumber - comNum2.realNumber;
	    	double imag = comNum1.imaginaryNumber - comNum2.imaginaryNumber;
	        return new ComplexNum(real, imag);
	        
	    }
	    
	 // return a new Complex Number whose value is (comNum1 * comNum2)
	    public static ComplexNum multiply(ComplexNum comNum1,ComplexNum comNum2) {
	    	double real = (comNum1.realNumber * comNum2.realNumber) - (comNum1.imaginaryNumber * comNum2.imaginaryNumber) ;
	    	double imag = (comNum1.realNumber * comNum2.imaginaryNumber) + (comNum1.imaginaryNumber * comNum2.realNumber) ;
	        return new ComplexNum(real, imag);	        
	    }
	    
	 // return a new Complex Number whose value is (comNum1 / comNum2)
	    public static ComplexNum divide(ComplexNum comNum1,ComplexNum comNum2) {
	    	double scale1 = comNum1.realNumber*comNum1.realNumber + comNum1.imaginaryNumber*comNum1.imaginaryNumber;
	        ComplexNum firstPart =   new ComplexNum(comNum1.realNumber / scale1, -(comNum1.imaginaryNumber) / scale1);
	    	
	        double scale2 = comNum2.realNumber*comNum2.realNumber + comNum2.imaginaryNumber*comNum2.imaginaryNumber;
	        ComplexNum secondPart = new ComplexNum(comNum2.realNumber / scale1, -(comNum2.imaginaryNumber) / scale1);
	    		      	        
	    	return multiply(firstPart,secondPart);	        
	    }  
	    	
	    
	 // return a new Complex- the conjugate of this
	    public ComplexNum conjugate() {
	        return new ComplexNum(realNumber, -(imaginaryNumber));
	    }
	    
	    
	    
	 // return abs/modulus
	    public double mag() {
	        return Math.hypot(realNumber, imaginaryNumber);
	    }
	    

	    // return a new Complex Number whose value is (comNum * comNum)
	    public  ComplexNum square() {
	        double real = this.realNumber;
	        double imag = this.imaginaryNumber;
	        
	        double newReal = (real * real) - (imag * imag) ;
	        double newiImag = (real * imag) + (imag * real) ;
	        return new ComplexNum(newReal, newiImag);	            
	    }
	    
	
	    
	    
	    // return angle/phase/argument, normalized to be between -pi and pi
	    public double phase() {
	        return Math.atan2(imaginaryNumber, realNumber); //arctan
	    }
	    
	    
	 // return a new Complex object whose value is the complex sine of this
	    public ComplexNum sin() {
	        return new ComplexNum(Math.sin(realNumber) * Math.cosh(imaginaryNumber), Math.cos(realNumber) * Math.sinh(imaginaryNumber));
	    }

	    // return a new Complex object whose value is the complex cosine of this
	    public ComplexNum cos() {
	        return new ComplexNum(Math.cos(realNumber) * Math.cosh(imaginaryNumber), -Math.sin(realNumber) * Math.sinh(imaginaryNumber));
	    }
	    
		/*ComplexNum pow(ComplexNum z, int power);
		{
			double temp1 = power*phase();
			ComplexNum tmp = new ComplexNum()
			return new ComplexNum();
		}
		*/
	    
	    // a static version of plus
	    public static ComplexNum plus(ComplexNum z1, ComplexNum z2) {
	        double real = z1.realNumber + z2.realNumber;
	        double imag = z1.imaginaryNumber + z2.imaginaryNumber;
	        ComplexNum sum = new ComplexNum(real, imag);
	        return sum;
	    }

	    	
	   
	    // return a string of the Complex number.
	    public String toString() {
	        if (imaginaryNumber == 0) return realNumber + "";
	        if (realNumber == 0) return imaginaryNumber + "i";
	        if (imaginaryNumber <  0) return realNumber + " - " + (-imaginaryNumber) + "i";
	        return realNumber + " + " + imaginaryNumber + "i";
	    }
	   
	   

}
