package com.mvalho.study.pattern.abstractfactory.model;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square:: draw() method.");
	}

}
