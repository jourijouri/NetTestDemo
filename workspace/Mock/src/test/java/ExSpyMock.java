import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

 
import java.util.ArrayList;
import java.util.List;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
 

public class ExSpyMock {
 
   
    private List<String> mockList  = Mockito.mock(ArrayList.class);
 
    @Spy
    private List<String> spyList = new ArrayList<String>();
 
    @Test
    public void testMockList() {
        //by default, calling the methods of mock object will do nothing
        mockList.add("test");

             assertEquals(0, mockList.size());
        assertNull(mockList.get(0));
    }
 
    @Test
    public void testSpyList() {
        //spy object will call the real method when not stub
        spyList.add("test");

       
        assertEquals(1, spyList.size());
        assertEquals("test", spyList.get(0));
    }
    @Test
    public void whenStubASpy_thenStubbed() {
        List<String> list = new ArrayList<String>();
        List<String> spyList = Mockito.spy(ArrayList.class);

        assertEquals(0, spyList.size());

        Mockito.doReturn(100).when(spyList).size();
        assertEquals(100, spyList.size());
    }
    @Test
    public void whenStubMock_thenStubbed() {
       
        List<String> mockList = Mockito.mock(ArrayList.class);

        assertEquals(0, mockList.size());

        Mockito.doReturn(100).when(mockList).size();
        assertEquals(100, mockList.size());
    }
    

}

