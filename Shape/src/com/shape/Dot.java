package com.shape;

public class Dot extends AShape{
	private CartesianPoint location;
	
	public Dot(CartesianPoint location) {
		this.setLocation(location);
	}

	public CartesianPoint getLocation() {
		return location;
	}

	public void setLocation(CartesianPoint location) {
		this.location = location;
	}
}
