package com.river;

public class Const extends Rivers{
	protected River first;
	protected Rivers rest;
	
	public Const(River source, River mouth, River first, Rivers rest) {
		super(source, mouth);
		this.first = first;
		this.rest = rest;
	}

}