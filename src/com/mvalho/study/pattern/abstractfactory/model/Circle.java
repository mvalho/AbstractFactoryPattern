package com.mvalho.study.pattern.abstractfactory.model;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle:: draw() method.");
	}

}
