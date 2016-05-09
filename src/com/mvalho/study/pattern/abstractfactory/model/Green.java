package com.mvalho.study.pattern.abstractfactory.model;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

}
