package com.mvalho.study.pattern.abstractfactory.model;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}

}
