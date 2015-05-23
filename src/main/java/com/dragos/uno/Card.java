package com.dragos.uno;

public class Card {
	private Color color;
	private int value;
	private Type type;
	private int scoreVal;
	

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getScoreVal() {
		return scoreVal;
	}

	public void setScoreVal(int scoreVal) {
		this.scoreVal = scoreVal;
	}
	
	public boolean canBePlayed(Card discardCard){
//		Wild = can always be true.
		if (this.color == Color.WILD || discardCard.color == Color.WILD) {
			return true;
		}
//		If color matches = true. 
		if (this.color == discardCard.color) {
			return true;
		}
//		if value matches = true.
		if (this.value == discardCard.value) {
			return true;
		}
//		if type matches = true
		if (this.type == discardCard.type) {
			return true; 
		}
//		otherwise false.
		return false;
	}
	
	
}
