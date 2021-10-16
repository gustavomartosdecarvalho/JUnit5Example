package othersannotation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatTests {

	// If you use @RepeatedTest, don't use @Test
	@RepeatedTest(5)
	public void RepeatFivetimes() {
		assertTrue(true);
	}
	
	@RepeatedTest(value = 4, name = "This is the {currentRepetition} of {totalRepetitions} repetitions")
	public void RepeatFourtimes() {
		assertTrue(true);
	}
}
