package com.jse.phone;

public class Phone {
	private String phoneNumber,name,company;
	public Phone(String phoneNumber,
			String name, String company) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.company = company;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Phone : phoneNumber=" + phoneNumber + ", name=" + name + ", company=" + company ;
	}
}


class CelPhone extends Phone{
	private boolean portable;
	private String move;
	public CelPhone(String phoneNumber, String name, 
			String company, boolean portable) {
		super(phoneNumber, name, company);
		this.portable=portable;
		setPortable(this.portable);
	}
	
	
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		this.move = (portable) ? "휴대 가능" : "휴대 불가능";
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}


	@Override
	public String toString() {
		return super.toString() + ", portable=" + portable + ", move=" + move ;
	}
	
}
class Iphone extends CelPhone{
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
	@Override
	public String toString() {
		return super.toString() + ", search = "+ search;
	}
}
class GalaxyNote extends Iphone {
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
	@Override
	public String toString() {
		return super.toString() + ", bigSize = "+ bigSize;
	}

}