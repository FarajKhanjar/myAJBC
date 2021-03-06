package myBasicCalculator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.security.Provider;
import java.time.Duration;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import myBasicCalculator.Calculator.Operation;

class CalculatorTest 
{
	private Calculator calculator1;
	private final int CONSTNUM = 2 ;
	
	public CalculatorTest() 
	{
		calculator1 = new Calculator(2);
	}

	@Test
	void checkCalculator() 
	{
		int actualNum = calculator1.answer ;
		int expectedNum = CONSTNUM ;
		assertEquals(expectedNum,actualNum);
	}

	@Test //new test
	void checkOperationSum() 
	{
		calculator1.sum(3,5); 
		int expectedNum = calculator1.answer ;
		int actualNum = 8 ;
		assertEquals(expectedNum,actualNum);
		assertTrue(calculator1.lastOperation == Operation.ADD);
		//assertNotEquals(8,actualNum);
	}
	
	@Test //new test
	void checkOperation() 
	{
		assertNull(calculator1.lastOperation);
	}
	
	@Test //new test
	void checkArray() 
	{
		int[] expecteArr1 = {1, 2, 3};
		int[] actualArr2 = {1, 2, 3};
		assertArrayEquals(expecteArr1,actualArr2);
	}
	
	@Test //new test

	void checkDivide() 
	{		
		assertDoesNotThrow( ()->calculator1.divide(10,10));
		//assertThrows(AritmeticException.class, ()-> calculator1.divide(10,10));
	}
	
	@Test //new test
	@Disabled
	void checkDuration() 
	{	
		assertTimeoutPreemptively(Duration.ofMillis(200),()->{
              Thread.sleep(100);
			return 2;
		});
	
	}
	
}
