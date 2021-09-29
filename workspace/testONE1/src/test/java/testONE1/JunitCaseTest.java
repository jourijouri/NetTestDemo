package testONE1;

import static org.junit.Assert.*;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class JunitCaseTest {
	public static Instant startedAt;
	public static Instant endedAt;
	@BeforeAll
	static public void initStartingTime() {
		System.out.println("Appel avant tous les tests");
	startedAt = Instant.now();
		}
	@Test
	public void test() {
	JunitTesting test = new JunitTesting();
	//int output = test.square(5);
	//assertEquals(25,output);
	int output2 = test.countA("rania");
	assertEquals(2,output2);
	
	}
	
	
	

	@AfterAll
	static public void showTestDuration() {
	System.out.println("Appel après tous les tests");
	endedAt = Instant.now();
	long duration = Duration.between(startedAt, endedAt).toMillis();
	System.out.println(MessageFormat.format("Durée des tests : {0} ms", duration));
	}
	
}
