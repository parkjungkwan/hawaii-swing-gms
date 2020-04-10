package com.jse.card;

public interface CardService {
	public void setCards(Card[] cards) ;
	public Card[] getCards();
	public void setCount(int count) ;
	public int getCount();
	public void add(Card card) ;
}
