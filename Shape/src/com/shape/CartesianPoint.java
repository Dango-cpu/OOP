package com.shape;

public class CartesianPoint {
	private int x;
	private int y;
	
	public CartesianPoint(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    CartesianPoint other = (CartesianPoint) obj;
	    return this.x == other.x && this.y == other.y;
	}

	@Override
	public int hashCode() {
	    // Always override hashCode when you override equals
	    return java.util.Objects.hash(x, y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
