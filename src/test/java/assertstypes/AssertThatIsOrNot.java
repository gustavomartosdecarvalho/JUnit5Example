package assertstypes;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertThatIsOrNot extends HooksAssertTypes {

	@Test
	@DisplayName("Check if the beginning of the Iron Age began before the era of Christ")
	public void checkBegnningIronAgeBeforeBcIsTrue() {
		assertThat(preHistory.IronAge().isBeginBC(), is(true));
	}

	@Test
	@DisplayName("Check if the Iron Age period begin in 1200")
	public void checkIronAgeBeginIn1200() {
		assertThat(preHistory.IronAge().getBegin(), is(1200));
	}

	@Test
	@DisplayName("Check if the material used in the Iron Age is iron")
	public void checkMaterialIronAgeIsIron() {
		assertThat(preHistory.IronAge().getMaterial(), is("iron"));
	}

	@Test
	@DisplayName("Check if the Iron Age period did not end before the era of Christ AD")
	public void checkIronAgeNotEndBC() {
		assertThat(preHistory.IronAge().isEndBC(), is(false));
	}

	@Test
	@DisplayName("Check if the Iron Age period end data is a number")
	public void checkIronAgeEndDataIsANumber() {
		assertThat(preHistory.IronAge().getEnd(), isA(Integer.class));
	}

	@Test
	@DisplayName("Check if the Iron Age lifestyle data is a String")
	public void checkIronAgeLifestyleDataIsANString() {
		assertThat(preHistory.IronAge().getLifestyle(), isA(String.class));
	}

	@Test
	@DisplayName("Check if the Chalcolithic Age lifestyle is not nomad")
	public void checkIronAgeLifestyleIsnotNotNomad(){
		assertThat(preHistory.Chalcolithic().getLifestyle(), not("nomad"));
	}

	@Test
	@DisplayName("Check if the Chalcolithic Age period end is not 500 BC")
	public void checkChalcolithicEndIsNot500() {
		assertThat(preHistory.Chalcolithic().getEnd(), is(not(500)));
	}

	@Test
	@DisplayName("Check if the begin of the Chalcolithic Age is equal to 3000 BC")
	public void checkChalcolithiBeginEqual3000BC() {
		assertThat(preHistory.Chalcolithic().getBegin(), equalTo(3000));
	}
	

	@Test
	@DisplayName("Check if the material used in the Chalcolithic is equal to copper")
	public void checkMaterialChalcolithicIsCopper() {
		assertThat(preHistory.Chalcolithic().getMaterial(), is(equalTo("copper")));
	}
	
	@Test
	@DisplayName("Check if the Chalcolithic period did not end after the era of Christ AD")
	public void check022() {
		assertThat(preHistory.Chalcolithic().isEndBC(), is(not(equalTo(false))));
	}


}
