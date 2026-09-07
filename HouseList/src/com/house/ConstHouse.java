package com.house;

public class ConstHouse extends AHouse{
	protected Entry first;
	protected AHouse rest;
	
	public ConstHouse(Entry first, AHouse rest) {
		this.first = first;
		this.rest = rest;
	}
}
