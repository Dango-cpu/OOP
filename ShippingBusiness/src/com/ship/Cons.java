package com.ship;

public class Cons extends List{
	protected Package first;
	protected List rest;
	
	public Cons(Package first, List rest) {
		this.first = first;
		this.rest = rest;
	}
}
