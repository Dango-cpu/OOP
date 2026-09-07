package com.Book;

public class ConstBook extends ABook{
	protected Entry first;
	protected ABook rest;
	
	public ConstBook(Entry first, ABook rest) {
		this.first = first;
		this.rest = rest;
	}
}
