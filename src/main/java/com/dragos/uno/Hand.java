package com.dragos.uno;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> cards;
	private int score;
	
	public Hand(){
		cards = new ArrayList<Card>();
	};
	
	public List<Card> getCards() {
		return cards;
	}
	
	public int getSize() {
		return cards.size();
	}
	
	public int getScore() {
		return score;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public Card playCard(Card card) {
		int index = this.cards.indexOf(card);
		Card cardToPlay = cards.get(index);
//		TODO: Do we really want to remove this?
		cards.remove(index);
		return cardToPlay;
	}
	
	public boolean hasUno(){
		if (cards.size() == 1) {
			return true; 
		}
		return false;	
	}

	
	
}
