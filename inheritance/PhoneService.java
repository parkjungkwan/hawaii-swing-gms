package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private CelPhone[] celPhones;
	private int count;
	
	public PhoneService() {
		phones = new Phone[3];
		celPhones = new CelPhone[3];
		count = 0;
	}

	public CelPhone[] getCelPhones() {
		return celPhones;
	}

	public void setCelPhones(CelPhone[] celPhones) {
		this.celPhones = celPhones;
	}

	public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	public void addCelPhone(CelPhone phone) {
		celPhones[count] = phone;
		count++;
	}
	

}
