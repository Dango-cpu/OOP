package com.animal;

public abstract class Animal {
	protected String name;
	protected double weight;
	
	protected Animal(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public void listAnimal() {
		System.out.println("Name: " + name + " ||| Weight: " + weight);
	}
}