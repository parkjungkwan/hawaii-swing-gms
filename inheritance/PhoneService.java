package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private CelPhone[] celPhones;
	private Iphone[] iPhones;
	private GalaxyNote[] galaxyNote;
	private int count;
	
	public PhoneService() {
		galaxyNote = new GalaxyNote[3];
		iPhones = new Iphone[3];
		phones = new Phone[3];
		celPhones = new CelPhone[3];
		count = 0;
	}
	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	public void add(CelPhone phone) {
		celPhones[count] = phone;
		count++;
	}
	public void add(Iphone phone) {
		iPhones[count] = phone;
		count++;
	}
	public void add(GalaxyNote phone) {
		galaxyNote[count] = phone;
		count++;
	}

	public Iphone[] getiPhones() {
		return iPhones;
	}

	public void setiPhones(Iphone[] iPhones) {
		this.iPhones = iPhones;
	}

	public GalaxyNote[] getGalaxyNote() {
		return galaxyNote;
	}

	public void setGalaxyNote(GalaxyNote[] galaxyNote) {
		this.galaxyNote = galaxyNote;
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

	

}
