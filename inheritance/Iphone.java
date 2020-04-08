package com.jse.inheritance;

public class Iphone extends CelPhone{
	private String search;
	
	public Iphone(String phoneNumber, String name, 
			String company, boolean portable, String search) {
		super(phoneNumber, name, company, portable);
		this.search = search;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}


}
