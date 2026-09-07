package com.animal;

public class Snake extends Animal{
	@SuppressWarnings("unused")
	private double length;
	public Snake(String name, double weight, double length) {
		super(name, weight);
		this.length = length;
	}
	
	public String getLength() {
		return "Length: " + length;
	}
	@Override
	public void listAnimal() {
		System.out.println("Name: " + name + " ||| Weight: " + weight + "||| " + getLength());
	}
}
