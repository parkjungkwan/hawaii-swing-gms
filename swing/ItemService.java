package com.jse.swing;

public class ItemService {
	private ItemBean[] items;
	public ItemService() {
		items = new ItemBean[10];
	}
	public void setItems(ItemBean[] items) {
		this.items = items;
	}
	public ItemBean[] getItems() {
		return items;
	}

}
