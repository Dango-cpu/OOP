package com.city;

public class Items extends ItemList{
	protected String first;
	protected ItemList rest;
	
	public Items(String first, ItemList rest) {
		this.first = first;
		this.rest = rest;
	}
}
