package com.city;

public abstract class Place {
	protected Location location;
	protected String name;
	
	public Place(Location location, String name) {
		this.location = location;
		this.name = name;
	}
}
