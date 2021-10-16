package assertstypes;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.collection.IsArrayWithSize.arrayWithSize;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.number.OrderingComparison.lessThan;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertThatOthers extends HooksAssertTypes {

	@Test
	@DisplayName("Check if one of the Chalcolithic Age activities is metallurgy and if Data is a String")
	public void check031() {
		assertThat(preHistory.Chalcolithic().getActivity()[2], allOf(is("metallurgy"), isA(String.class)));
	}

	@Test
	@DisplayName("Check if one of the Chalcolithic Age activities is agriculture and not gather")
	public void check032() {
		assertThat(preHistory.Chalcolithic().getActivity()[0], allOf(is("agriculture"), not("gather")));
	}

	@Test
	@DisplayName("Check if one of the Chalcolithic Age activities start with 'ani' and end with 'husbandry'")
	public void check033() {
		assertThat(preHistory.Chalcolithic().getActivity()[1], allOf(startsWith("ani"), endsWith("husbandry")));
	}

	@Test
	@DisplayName("Check if the Chalcolithic Age lifestyle contains String 'nta'")
	public void check034() {
		assertThat(preHistory.Chalcolithic().getLifestyle(), allOf(containsString("nta"), notNullValue()));
	}

	@Test
	@DisplayName("Check if the Chalcolithic Age activities are agriculture, animal husbandry and metallurgy")
	public void check041() {
		assertThat(Arrays.asList(preHistory.Chalcolithic().getActivity()),
				hasItems("agriculture", "animal husbandry", "metallurgy"));
	}

	@Test
	@DisplayName("Check if one of the Chalcolithic Age activities have agriculture and metallurgy")
	public void check042() {
		assertThat(Arrays.asList(preHistory.Chalcolithic().getActivity()), hasItems("agriculture", "metallurgy"));
	}

	//@SuppressWarnings("unchecked")
	//@Test
	//@DisplayName("")
	//public void check101() {
	//	assertThat(preHistory.Chalcolithic().getActivity(),
	//			is(array(equalTo("agriculture"), equalTo("animal husbandry"), equalTo("metallurgy"))));
	//}

	@Test
	@DisplayName("Check if one of the Paleolithic Age activities is hunt")
	public void check051() {
		assertThat(Arrays.asList(preHistory.Palaeolithic().getActivity()), hasItem("hunt"));
	}

	@Test
	@DisplayName("Check if one of the Paleolithic Age activities is not metallurgy")
	public void check052() {
		assertThat(Arrays.asList(preHistory.Palaeolithic().getActivity()), not(hasItem("metallurgy")));
	}

	@Test
	@DisplayName("Check if any of the Paleolithic Age activities is gather or a nullValue")
	public void check061() {
		assertThat(preHistory.Palaeolithic().getActivity()[1], anyOf(is("gather"), nullValue()));
	}

	@Test
	@DisplayName("Check if any of the Paleolithic Age activities is gather or fly")
	public void check081() {
		assertThat(preHistory.Palaeolithic().getActivity()[1], anyOf(is("gather"), is("fly")));
	}

	@Test
	@DisplayName("Check if the Paleolithic Age begin greater than 50k less than 5000k")
	public void check091() {
		assertThat(preHistory.Palaeolithic().getBegin(), both(greaterThan(50000)).and(lessThan(5000000)));
	}

	@Test
	@DisplayName("Check if the Paleolithic Age end greater than Or equal to 12k less than 10k")
	public void check092() {
		assertThat(preHistory.Palaeolithic().getEnd(), either(greaterThanOrEqualTo(12000)).or(lessThanOrEqualTo(10000)));
	}

	@Test
	@DisplayName("Check if every activity in the Neolithic Age start with 'a'")
	public void check093() {
		assertThat(Arrays.asList(preHistory.Neolithic().getActivity()), everyItem(startsWith("a")));
	}

	@Test
	@DisplayName("Check if Neolithic objects are the same instance")
	public void check094() {
		assertThat(preHistory.Neolithic(), sameInstance(preHistory.Neolithic()));
	}

	@Test
	@DisplayName("Check if the number of the Neolithic Age activities are equal to 2")
	public void check095() {
		assertThat(preHistory.Neolithic().getActivity(), arrayWithSize(2));
	}

	@Test
	@DisplayName("Check if the material used in the Neolithic is rocks")
	public void check911() {
		//String variavel = "METAL";
		String variavel = "rocks";
		assertThat(String.format("Describb Problem equal %s", variavel),preHistory.Neolithic().getMaterial(), is(variavel));
	}

}
