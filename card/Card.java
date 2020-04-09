package com.jse.card;

import lombok.Data;

@Data
public class Card {
	private String kind;
	private int number;
	
	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	
}
