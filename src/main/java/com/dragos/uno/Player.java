package com.dragos.uno;

public class Player {
	private boolean hasHand;
	private Hand hand; 
	private String name;
	private int score;
	
	public Card playCard () {
		return null;
	}
	
	public void drawCard(Card card) {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return 0;
	}
	
	public String callUno(){
		return "Uno!";
	}
	
}
