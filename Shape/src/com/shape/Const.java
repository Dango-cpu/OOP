package com.shape;

public class Const extends ShapeList{
	protected AShape newshape;
	protected ShapeList rest;
	
	public Const(AShape newshape, ShapeList rest) {
		this.newshape = newshape;
		this.rest = rest;
	}
}