package rdv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExceptionTesting {
	public ClinicCalendar c1;

	@Test
	
	void testExpectedException() {
		//test qui prevoit (expect) l'exeption 
	 //tester que cette exception est generee pour ce traitement,
		
	  Assertions.assertThrows(NumberFormatException.class, () -> {
	    Integer.parseInt("one");
	  
	  });
	 
	}
	
	@Test
	
	void testException1() {
		c1 = new ClinicCalendar();
		Assertions.assertThrows(Exception.class, () -> {
		c1.addAppointment("rania", "joudi", "12", "07/06/2013");
		 });
		
		
	}
	
	
	@Test
	void testExpectedExceptionFail() {
	  //Code does not throw any exception
	  //This assetion will fail
	  Assertions.assertThrows(IllegalArgumentException.class, () -> {
	    Integer.parseInt("one");
	  });
	 
	}
	@Test
	public void whenExceptionThrown_thenAssertionSucceeds() {
	    Exception exception = assertThrows(NumberFormatException.class, () -> {
	        Integer.parseInt("one");
	    });

	    String expectedMessage = "For input string";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
}
