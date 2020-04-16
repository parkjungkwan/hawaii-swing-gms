package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public void add(CelPhone phone);
	public void add(GalaxyNote phone);
	public void add(Iphone phone);
	public GalaxyNote[] galaxyNoteList();
	public Iphone[] iphoneList();
	public Phone[] phoneList();
	public CelPhone[] celPhoneList();
	public GalaxyNote detail(GalaxyNote phone);
	public Iphone detail(Iphone phone);
	public int count();
	public void update(Phone phone);
	public void delete(Phone phone);
}
