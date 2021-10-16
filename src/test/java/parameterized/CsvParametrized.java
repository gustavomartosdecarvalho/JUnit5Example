package parameterized;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CsvParametrized {
	
	@ParameterizedTest
	//Bug in Eclipse
	//@CsvFileSource(files = "src/test/resources/WorksAlexandreDumas.csv")
	@CsvFileSource(resources = "/parameterized/WorksAlexandreDumas.csv")
	public void VerifyWorksbyAlexandreDumas(int year, String name, String author) {
		assertAll(
				() -> assertTrue(author.equals("Alexandre Dumas")),
				() -> assertTrue(1828 < year),
				() -> assertTrue(year < 1870)
				);
	}
	
	@ParameterizedTest
	@CsvSource({"Athos, 5", "Porthos, 7", "Aramis, 6"})
	public void VerifyLengthNamesMusketeers(String name, int size) {
		assertEquals(name.length(), size);
	}
	
}
