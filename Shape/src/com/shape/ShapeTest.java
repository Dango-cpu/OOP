package com.shape;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class ShapeTest {

	@Test
	public void test() {
		Dot dot1 = new Dot(new CartesianPoint(3, 4));
		Circle circle1 = new Circle(new CartesianPoint(2, 2), 6);
		Square square1 = new Square(new CartesianPoint(4, 5), 3);
		CompositeShape shape1 = new CompositeShape(circle1, square1);
		Empty empty = new Empty();
		
		
		org.junit.Assert.assertEquals(new CartesianPoint(2, 2), circle1.getCentre());
		org.junit.Assert.assertEquals(new CartesianPoint(4, 5), square1.getLocation());
		org.junit.Assert.assertEquals(new CartesianPoint(3, 4), dot1.getLocation());
		org.junit.Assert.assertEquals(new CompositeShape(circle1, square1), shape1);
		
		
		Const log1 = new Const(shape1, empty);
		Const log2 = new Const(dot1, log1);
		
		org.junit.Assert.assertNotNull(log1);
		org.junit.Assert.assertNotNull(log2);
	}

}
