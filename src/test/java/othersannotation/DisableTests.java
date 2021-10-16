package othersannotation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableTests {
	
	
	@Test
	public void runThisTest() {
		assertTrue(true);
	}
	
	@Test
	@Disabled("This test will not run")
	public void dontRunThisTest() {
		assertTrue(true);
	}
		
}
