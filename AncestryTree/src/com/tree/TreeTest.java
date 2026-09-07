package com.tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTest {

	@Test
	public void testConstructor() {
		Person person1 = new Person("Pham Gia Minh", 2005);
		Person person2 = new Person("Pham Thanh Tang", 1978);
		Person person3 = new Person("Huynh Tu Ngoc", 1980);
	
		Const tree = new Const(person1, new Const(person2,null,null), new Const(person3,null,null));
	}

}
