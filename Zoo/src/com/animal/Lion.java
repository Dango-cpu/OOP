package com.animal;

public class Lion extends Animal{

	@SuppressWarnings("unused")
	private double meatWeight;
	public Lion(String name, double weight, double meatWeight) {
		super(name, weight);
		this.meatWeight = meatWeight;
	}
	public String getMeatWeight() {
		return "Meat per day: " + meatWeight;
	}
	@Override
	public void listAnimal() {
		System.out.println("Name: " + name + " ||| Weight: " + weight + "||| " + getMeatWeight());
	}
}
