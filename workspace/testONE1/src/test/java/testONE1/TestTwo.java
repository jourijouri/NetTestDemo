package testONE1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class TestTwo {

	@Test
	 public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(2,output);
	}

}
