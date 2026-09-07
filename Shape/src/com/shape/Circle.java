package com.shape;

public class Circle extends AShape{
	private CartesianPoint location;
	private int radius;
	
	public Circle(CartesianPoint location, int radius) {
		this.setCentre(location);
		this.setRadius(radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public CartesianPoint getCentre() {
		return location;
	}

	public void setCentre(CartesianPoint location) {
		this.location = location;
	}
}
