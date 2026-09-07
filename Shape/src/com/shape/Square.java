package com.shape;

public class Square extends AShape{
	private CartesianPoint location;
	private int size;
	
	public Square(CartesianPoint location, int size) {
		this.setLocation(location);
		this.setSize(size);
	}

	public CartesianPoint getLocation() {
		return location;
	}

	public void setLocation(CartesianPoint location) {
		this.location = location;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
