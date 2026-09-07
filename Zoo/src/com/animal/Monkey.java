package com.animal;

public class Monkey extends Animal{
	@SuppressWarnings("unused")
	private String favouriteFood;
	public Monkey(String name, double weight, String favouriteFood) {
		super(name, weight);
		this.favouriteFood = favouriteFood;
	}
	
	public String getFavouriteFood() {
		return "Favourite Food: " + favouriteFood;
	}
	
	@Override
	public void listAnimal() {
		System.out.println("Name: " + name + " ||| Weight: " + weight + "||| " + getFavouriteFood());
	}
}