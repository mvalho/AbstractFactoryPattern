package com.mvalho.study.pattern.abstractfactory.main;

import com.mvalho.study.pattern.abstractfactory.factory.AbstractFactory;
import com.mvalho.study.pattern.abstractfactory.factory.ColorFactory;
import com.mvalho.study.pattern.abstractfactory.factory.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		
		return null;
	}
}
