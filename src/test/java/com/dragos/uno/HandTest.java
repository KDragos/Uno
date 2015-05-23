package com.dragos.uno;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class HandTest {

	@Test
	public void testAddCard() {
		Hand testHand = new Hand();
		Card testCard = new Card();
		testCard.setColor(Color.BLUE);
		testCard.setValue(5);
		testCard.setType(Type.NUMERIC);
		testHand.addCard(testCard);
		
		assertEquals(1, testHand.getSize());
		List<Card> newCards = testHand.getCards();
		
	}

	@Test
	public void testPlayCard() {
		fail("Not yet implemented");
	}

	@Test
	public void testHasUno() {
		fail("Not yet implemented");
	}

}
