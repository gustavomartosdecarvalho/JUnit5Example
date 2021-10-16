package othersannotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.MethodName;

@TestMethodOrder(MethodName.class)
public class OrderedMethodNameTest {

	@DisplayName("Indian Ocean")
	@Test
	public void indianOcean() {
		System.out.println("s");
		assertTrue(true);
	}

	@Test
	@DisplayName("Pacific Ocean")
	public void pacificOcean() {
		System.out.println("s");
		
	}

	@Test
	@DisplayName("Atlantic Ocean")
	public void atlanticOcean() {
		System.out.println("s");
		
	}
}
