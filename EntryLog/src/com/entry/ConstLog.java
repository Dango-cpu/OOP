package com.entry;

public class ConstLog extends ALog{
	protected Entry first;
	protected ALog rest;
	
	public ConstLog(Entry first, ALog rest) {
		this.first = first;
		this.rest = rest;
	}
}
