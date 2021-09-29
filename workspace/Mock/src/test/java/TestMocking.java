import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test; 
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import met.Calculator;
import met.CalculatorService;

public class TestMocking {
 Calculator c = null;
  // objet de type mock (mocker le service)
 //creer objet mocké --->le service qu'on veut pas tester
 CalculatorService srv = mock(CalculatorService.class);
 
@Before
public void init() {
	c = new Calculator (srv);
}


	@Test
	public void testPerform() {
		//stubbing
		when(srv.add(3, 2)).thenReturn(5);
		assertEquals(15, c.perform(3, 2));
		
	}
	@Test
	public void testPerform2() {
		when(srv.add(isA(Integer.class), isA(Integer.class))).thenReturn(5);
		assertEquals(15, c.perform(3, 2));
		
	}
	//  1-  when(appel methode mocké).thenThrow(exception);
	//assertions tester la methode lorsque nous avons cet exception
	
	//2-    doReturn("42").when(spyProperties).get("shoeSize");
	//3-  doThrow(new IOException()).when(mockStream).close();
	
}
