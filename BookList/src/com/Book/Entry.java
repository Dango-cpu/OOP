package com.Book;

public class Entry {
	private String title;
	private String authorName;
	private double price;
	private int pubYear;
	
	public Entry(String title, String authorName, double price, int pubYear) {
		this.setTitle(title);
		this.setAuthorName(authorName);
		this.setPrice(price);
		this.setPubYear(pubYear);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}
}
