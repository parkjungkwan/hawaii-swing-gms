package com.jse.inheritance;

public class CelPhone extends Phone{
	private boolean portable;
	private String move;
	private String finger;
	public CelPhone(String phoneNumber, String name, String company, boolean portable) {
		super(phoneNumber, name, company);
		this.portable=portable;
		setPortable(this.portable);
	}
	
	
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		if(portable) {
			this.move = "휴대 가능";
		}else {
			this.move = "휴대 불가능";
		}
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}


	@Override
	public String toString() {
		return super.toString() + ", portable=" + portable + ", move=" + move + ", finger=" + finger;
	}
	
}
