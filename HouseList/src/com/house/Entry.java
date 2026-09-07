package com.house;

public class Entry {
	private String type;
	private int numRooms;
	private double price;
	private Address address;
	
	public Entry(String type, int numRooms, double price, Address address) {
		this.setType(type);
		this.setNumRooms(numRooms);
		this.setPrice(price);
		this.setAddress(address);
	}

	public int getNumRooms() {
		return numRooms;
	}

	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
