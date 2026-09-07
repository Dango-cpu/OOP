package com.shape;

public class CompositeShape extends AShape{
	private AShape first;
	private AShape second;
	
	public CompositeShape(AShape first, AShape second) {
		this.setFirst(first);
		this.setSecond(second);
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    CompositeShape other = (CompositeShape) obj;
	    return this.first == other.first && this.second == other.second;
	}

	@Override
	public int hashCode() {
	    // Always override hashCode when you override equals
	    return java.util.Objects.hash(first, second);
	}

	public AShape getFirst() {
		return first;
	}

	public void setFirst(AShape first) {
		this.first = first;
	}

	public AShape getSecond() {
		return second;
	}

	public void setSecond(AShape second) {
		this.second = second;
	}
}
