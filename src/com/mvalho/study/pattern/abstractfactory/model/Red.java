package com.mvalho.study.pattern.abstractfactory.model;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}

}
