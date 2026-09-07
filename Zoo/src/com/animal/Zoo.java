package com.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private List<Animal> animals;
	
	public Zoo() {
		this.animals = new ArrayList<>();
	}
	
	public void addAnimals(Animal animal){
		if (animal != null) {
			animals.add(animal);	
		}
	}
	
	public List<Animal> getAnimals(){
		return animals;
	}
	
	public void listAnimal() {
		System.out.println("List of animals: ");
		for (Animal animal : animals) {
			System.out.println("Name: " + animal.name + " ||| Weight: " + animal.weight);
		}
	}
}