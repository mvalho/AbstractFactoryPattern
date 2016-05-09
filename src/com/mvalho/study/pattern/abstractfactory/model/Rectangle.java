package com.mvalho.study.pattern.abstractfactory.model;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle:: draw() method.");
	}

}
