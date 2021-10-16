package parameterized;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SimpleParametrized {
	
	@ParameterizedTest
	@ValueSource(strings = {"Writer", "Historian", "Philosopher"})
	public void VoltaireProfessions(String value) {
		assertNotNull(value);
	}

	@ValueSource(ints = {1694, 1718, 1759, 1778})
	@DisplayName("Voltaire´s Years")
	@ParameterizedTest(name = "{index} - Valid Number: {0}")
	public void VoltaireYears(int value) {
		assertTrue(value >= 1694 && value <= 1778);
	}
	
	
}
