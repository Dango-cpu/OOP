package com.entry;

public class Entry{
	private Date date;
	private double dist;
	private int durationRun;
	private String postRunFeeling;
	
	public Entry(Date date, double dist, int durationRun, String postRunFeeling) {
		this.date = date;
		this.dist = dist;
		this.durationRun = durationRun;
		this.postRunFeeling = postRunFeeling;
	}
	
	public double getDist() {
		return dist;
	}
	
	public int getDur() {
		return durationRun;
	}
	
	public String getPostRunFeeling() {
		return postRunFeeling;
	}
	
	public Date getDate() {
		return date;
	}
}
