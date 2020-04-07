package com.jse.arr;

public class CardService {
	private CardBean[] cards;
	private int i;
	public CardService() {
		cards = new CardBean[3];
		i = 0;
	}
	public void setCards(CardBean[] cards) {
		this.cards = cards;
	}
	public CardBean[] getCards() {
		return cards;
	}
	public void add(CardBean card) {
		cards[i] = card;
		i++;
	}
	

}
