package preandpos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeEachAndAfterEach {

	private static int[] numbers = {2,3,5,7,11,13};
	
	@BeforeEach
	public void setUp() {
		numbers[2] = 17;
		numbers[1] = 19;
		numbers[4] = 36;
	}
	
	@Test
	public void numberOneIsGreaterThanNumberTwo() {
		assertTrue(numbers[1] > numbers[2]);
	}
	
	@Test
	public void numberZeroIsTwo() {
		assertEquals(2,numbers[0]);
	}
	
	@Test
	public void numberOneIsNineteen() {
		assertEquals(19,numbers[1]);
	}
	
	@Test
	public void numberTwoIsSeventeen() {
		assertEquals(17,numbers[2]);
	}
	
	@Test
	public void numberFourIsLessThanThirtySeven() {
		assertTrue(numbers[5] < 37);
	}
	
	@AfterEach
	public void tearDown() {
		numbers[4] = 37;
	}
	
}
