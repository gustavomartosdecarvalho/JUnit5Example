package assertstypes;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.Duration;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import utilsexamples.MagicTrick;


public class AssertsPositivesAndNegatives {
	
	//Assert Equals example
	@Test
	@DisplayName("Check if the hidden card in the deck is an Ace of Hearts")
	public void checkHiddenCardIsEqualAceHearts() {
		//mock
		MagicTrick magic= mock(MagicTrick.class);
		doNothing().when(magic).shuffle();
		when(magic.circusCardTrick()).thenReturn("A_hearts");
		//The magic test
		magic.openDeckOfCards();
		magic.chooseCard("A_hearts");
		magic.shuffle();
		assertEquals("A_hearts", magic.circusCardTrick());
	}

	//Assert Not Equals example
	@Test
	@DisplayName("Check if the hidden card in the deck isn't  an Ace of Clubs")
	public void checkHiddenCardIsNotEqualAceClubs() {
		//mock
		MagicTrick magic= mock(MagicTrick.class);
		doNothing().when(magic).shuffle();
		when(magic.circusCardTrick()).thenReturn("A_hearts");
		//The magic test
		magic.openDeckOfCards();
		magic.chooseCard("A_clubs");
		magic.shuffle();
		assertNotEquals("A_clubs", magic.circusCardTrick());
	}

	//Assert True example
	@Test
	@DisplayName("Check if the first card in the deck is an Ace of Spades")
	public void checkFirstCardInDeckIsAceSpades() {
		//mock
		MagicTrick magic= mock(MagicTrick.class);
		doNothing().when(magic).shuffle();
		when(magic.compareCars("A_clubs", "A_clubs")).thenReturn(true);
		//The magic test
		magic.openDeckOfCards();
		magic.chooseCard("A_clubs");
		magic.shuffle();
		assertTrue(magic.compareCars("A_clubs", "A_clubs"));
	}

	//Assert False example
	@Test
	@DisplayName("Check if the first card in the deck isn't  an Ace of Diammonds")
	public void checkFirstCardInDeckIsNotAceSpades() {
		//mock
		MagicTrick magic= mock(MagicTrick.class);
		doNothing().when(magic).shuffle();
		//The magic test;
		magic.openDeckOfCards();
		magic.chooseCard("A_diammonds");
		magic.shuffle();
		assertFalse(magic.compareCars("A_diammonds", "A_clubs"));
	}

	//Assert Null example
	@Test
	@DisplayName("Check if after removing all cards the deck is null")
	public void checkRemovingAllCardsDeckIsNull() {
		//mock
		MagicTrick magic= mock(MagicTrick.class);
		when(magic.Deck()).thenReturn(null);
		//The magic test;
		magic.openDeckOfCards();
		assertNull(magic.Deck());
	}

	//Assert Not Null example
	@Test
	@DisplayName("Check if after remove some cards from the deck it is not null")
	public void checkRemovingSomeCardsDeckIsNotNull() {
		//mock
		MagicTrick magic= mock(MagicTrick.class);
		when(magic.Deck()).thenReturn("2_diammonds");
		//The magic test;
		magic.openDeckOfCards();
		assertNotNull(magic.Deck());
	}

	//Assert Array Equals example
	@Test
	@DisplayName("Check if the 4 differents cards are equals")
	public void checkKingsDifferentSuits() {
		//mock
		MagicTrick magic= mock(MagicTrick.class);
		doNothing().when(magic).shuffle();
		int[] listKings = {2, 5, 3, 7};
		when(magic.ListCards()).thenReturn(listKings);
		//The magic test;
		magic.openDeckOfCards();
		magic.shuffle();
		assertArrayEquals(new int[]{2, 5, 3, 7}, magic.ListCards());
	}

	//Assert Throws example
	@Test
	@DisplayName("Check if it have problems using invalid cards")
	public void checkProblemsUsingInvalidCards() {
		//mock
		MagicTrick magic= mock(MagicTrick.class);
		doThrow(new NullPointerException("Add operation not implemented"))
        .when(magic).compareCars(null,"99");
		//The magic test;
		magic.openDeckOfCards();
		magic.shuffle();
		assertThrows(NullPointerException.class, () -> magic.compareCars(null, "99"));
	}

	//Assert Timeout Example
	@Test
	@DisplayName("Check the time to show cards is less than 2 seconds")
	public void checkTimeToShowCards() {
		MagicTrick magic = new MagicTrick();
		magic.openDeckOfCards();
		assertTimeout(Duration.ofMillis(2000), () -> magic.shuffleManytimes());
	}

	//Assert All example
	@Test
	@DisplayName("Check if the all situations are true")
	public void checkAllSituations() {
		//mock
		MagicTrick magic= mock(MagicTrick.class);
		doNothing().when(magic).shuffle();
		when(magic.compareCars("2clubs", "2_clubs")).thenReturn(true);
		when(magic.compareCars("3clubs", "3_clubs")).thenReturn(true);
		when(magic.compareCars("4clubs", "4_clubs")).thenReturn(true);
		//The magic test
		magic.openDeckOfCards();
		magic.chooseCard("2clubs");
		magic.chooseCard("3clubs");
		magic.chooseCard("4clubs");
		magic.shuffle();
		assertAll(
				() -> magic.compareCars("2clubs", "2_clubs"),
				() -> magic.compareCars("3clubs", "3_clubs"),
				() -> magic.compareCars("4clubs", "4_clubs")
				);
	}
	
//	assertDoesNotThrow(executable);
//	assertIterableEquals(expected, actual);
//	assertLinesMatch(expectedLines, actualLines);
//	assertNotSame()
//	assertSame()
//	assertThrows(expectedType, executable)
//	assertTimeoutPreemptively(timeout, executable);
	
}
