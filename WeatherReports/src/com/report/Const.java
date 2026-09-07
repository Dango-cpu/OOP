package com.report;

public class Const extends Lists{
	protected WeatherRecords first;
	protected Lists rest;
	
	public Const(WeatherRecords first, Lists rest) {
		this.first = first;
		this.rest = rest;
	}
}
