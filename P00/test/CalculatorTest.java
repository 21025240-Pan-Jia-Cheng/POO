import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		// Arrange
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.add (a, b);
		
		//Assert
		int expected = 5555;
		assertEquals (expected, actual);
	}
	@Test
	public void testSubtract() {
		// Arrange - set it up
		int a = 10;
		int b = 5;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.subtract(a, b);
		
		//Assert
		int expected = 5;
		assertEquals (expected, actual);
		
		}
	@Test
	public void testMultiply() {
		// Arrange
		int a = 3;
		int b = 5;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.multiply(a, b);
		
		//Assert
		int expected = 15;
		assertEquals (expected, actual);
	}


	@Test
	public void testDivide() {
//		fail("Not yet implemented");
		// Arrange
		int a = 10;
		int b = 2;
		Calculator cal = new Calculator();
//	    Act
	    int actual = cal.divide(a, b);
//	    Assert
	    int expected = 5;
	    assertEquals (actual, expected);
	  }
	  
	  @Test 
	  public void testDivideWith0Denominator() {
//	    fail("Not yet implemented");
//	    Arrange 
	    int a = 100;
	    int b = 0;
	    try {
	      Calculator cal = new Calculator();
	      cal.divide(a, b);
	      //if operation completes, test is not executed properly.
	      fail("Expected an Illegal Exception to be thrown");
	    }
	    catch(IllegalArgumentException e) {
	      assertEquals("Division by zero is not allowed",
	          e.getMessage());
	    }
	    catch(Throwable t) {
	      assertEquals("Expected an IllegalArgumentException to be thrown", 
	          t.getMessage());
	    }
	    
	    }
	

	}
	

	
	


