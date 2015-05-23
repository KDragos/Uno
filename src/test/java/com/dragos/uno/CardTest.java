package com.dragos.uno;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {


	@Test
	public void testCanBePlayedIfWild() {
		Card testCard = new Card();
		testCard.setColor(Color.WILD);
		testCard.setType(Type.WILD);
		testCard.setValue(50);
		
		Card otherCard = new Card();
		otherCard.setColor(Color.BLUE);
		otherCard.setType(Type.NUMERIC);
		otherCard.setValue(5);
		
		assertTrue(testCard.canBePlayed(otherCard));
		assertTrue(otherCard.canBePlayed(testCard));
		
	}
	@Test
	public void testCanBePlayedIfNumberMatches() {
		Card testCard = new Card();
		testCard.setColor(Color.YELLOW);
		testCard.setType(Type.NUMERIC);
		testCard.setValue(5);
		
		Card otherCard = new Card();
		otherCard.setColor(Color.BLUE);
		otherCard.setType(Type.NUMERIC);
		otherCard.setValue(5);
		
		assertTrue(testCard.canBePlayed(otherCard));
		assertTrue(otherCard.canBePlayed(testCard));

	
	}
	@Test
	public void testCanBePlayedIfColorMatches() {
		Card testCard = new Card();
		testCard.setColor(Color.BLUE);
		testCard.setType(Type.NUMERIC);
		testCard.setValue(7);
		
		Card otherCard = new Card();
		otherCard.setColor(Color.BLUE);
		otherCard.setType(Type.NUMERIC);
		otherCard.setValue(5);
		
		assertTrue(testCard.canBePlayed(otherCard));
		assertTrue(otherCard.canBePlayed(testCard));

	}
	@Test
	public void testCanBePlayedIfTypeMatches() {
		Card testCard = new Card();
		testCard.setColor(Color.RED);
		testCard.setType(Type.DRAW2);
		testCard.setValue(25);
		
		Card otherCard = new Card();
		otherCard.setColor(Color.BLUE);
		otherCard.setType(Type.DRAW2);
		otherCard.setValue(5);
		
		assertTrue(testCard.canBePlayed(otherCard));
		assertTrue(otherCard.canBePlayed(testCard));
		
		
		
	}
	@Test
	public void testCannotBePlayed() {
		Card testCard = new Card();
		testCard.setColor(Color.RED);
		testCard.setType(Type.REVERSE);
		testCard.setValue(25);
		
		Card otherCard = new Card();
		otherCard.setColor(Color.BLUE);
		otherCard.setType(Type.DRAW2);
		otherCard.setValue(5);
		
		assertFalse(testCard.canBePlayed(otherCard));
		assertFalse(otherCard.canBePlayed(testCard));
		
		
		
		
	}
	

}
