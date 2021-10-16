package preandpos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import utilsexamples.PageObjectExample;

public class SeleniumAutomationFakeExample {
	
	PageObjectExample pgoExample;
	
	@BeforeEach
	public void setUp() {
		pgoExample = new PageObjectExample();
		pgoExample.openDriver();
		pgoExample.loginInTheSystem("user", "example");
	}
	
	@Test
	public void TestA() {
		pgoExample.navaigatetO("Page A");
		pgoExample.TypeFieldA("Field A");
		pgoExample.selectFieldClick();
		pgoExample.btnFunctionAClick();
		assertTrue(pgoExample.ValidateTestA());
	}
	
	@Test
	public void TestB() {
		pgoExample.navaigatetO("Page B");
		pgoExample.TypeFieldB("Field B");
		pgoExample.chkRadioClick();
		pgoExample.btnFunctionBClick();
		pgoExample.TypeFieldC("Field C");
		assertTrue(pgoExample.ValidateTestA());
	}
	
	@AfterEach
	public void tearDown() {
		pgoExample.closeDriver();
	}

}
