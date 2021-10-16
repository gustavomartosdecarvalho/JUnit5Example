package othersannotation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("This is the Father class")
public class NestingTests {

	@BeforeAll
	public static void setUpBeforeAll() {
		System.out.println("- Begin all tests sequence\n");
	}

	@BeforeEach
	public void setUpDadBeforeEach() {
		System.out.println("\n- - Before each tests father");
	}

	@AfterEach
	public void tearDownDadAfterEach() {
		System.out.println("- - After each tests father\n");
	}

	@AfterAll
	public static void tearDownDadAfterAll() {
		System.out.println("\n- After all tests father");
	}
	
	@Test
	public void dadTest() {
		System.out.println("- - - - Some tests father");
	}
	
	@Nested
	@DisplayName("This is the Son One class")
	class nestingSonOne {

		@BeforeEach
		public void setUpSonOneBeforeEach() {
			System.out.println("- - - Before each tests Son One");
		}
		
		@Test
		public void SonOneTest() {
			System.out.println("- - - - Some tests Son One");
		}

		@AfterEach
		public void tearDownSonOneAfterEach() {
			System.out.println("- - - After each tests Son One");
		}
	}
	
	@Nested
	@DisplayName("This is the Son Two class")
	class nestingSonTwo {

		@BeforeEach
		public void setUpSonOneBeforeEach() {
			System.out.println("- - - Before each tests Son Two");
		}
		
		@Test
		public void SonTwoTest() {
			System.out.println("- - - - Some tests Son Two");
		}
		
		@Test
		public void OtherTwoTest() {
			System.out.println("- - - - Other tests Son Two");
		}

		@AfterEach
		public void tearDownSonOneAfterEach() {
			System.out.println("- - - After each tests Son Two");
		}
	}
}
