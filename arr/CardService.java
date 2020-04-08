package com.jse.arr;

public class CardService {
	private CardBean[] cards;
	private int count;
	public CardService() {
		cards = new CardBean[3];
		count = 0;
	}
	public void setCards(CardBean[] cards) {
		this.cards = cards;
	}
	public CardBean[] getCards() {
		return cards;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void add(CardBean card) {
		cards[count] = card;
		count++;
	}
	

}
