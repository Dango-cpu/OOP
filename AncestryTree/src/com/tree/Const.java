package com.tree;

public class Const extends AncestryTree{
	private Person person;
	private AncestryTree motherTree;
	private AncestryTree fatherTree;
	
	public Const(Person person, AncestryTree motherTree, AncestryTree fatherTree) {
		this.setPerson(person);
		this.setMotherTree(motherTree);
		this.setFatherTree(fatherTree);
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public AncestryTree getMotherTree() {
		return motherTree;
	}

	public void setMotherTree(AncestryTree motherTree) {
		this.motherTree = motherTree;
	}

	public AncestryTree getFatherTree() {
		return fatherTree;
	}

	public void setFatherTree(AncestryTree fatherTree) {
		this.fatherTree = fatherTree;
	}
}
