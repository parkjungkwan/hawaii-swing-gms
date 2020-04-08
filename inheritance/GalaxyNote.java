package com.jse.inheritance;

public class GalaxyNote extends Iphone {
	private String bigSize;

	public GalaxyNote(String phoneNumber, String name, 
			String company, boolean portable, String search, String bigSize) {
		super(phoneNumber, name, company, portable, search);
		this.bigSize = bigSize;
	}

	public String getBigSize() {
		return bigSize;
	}

	public void setBigSize(String bigSize) {
		this.bigSize = bigSize;
	}


}
