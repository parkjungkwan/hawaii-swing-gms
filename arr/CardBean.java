package com.jse.arr;

public class CardBean {
	private String kind;
	private int number;
	
	public CardBean(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}

}
