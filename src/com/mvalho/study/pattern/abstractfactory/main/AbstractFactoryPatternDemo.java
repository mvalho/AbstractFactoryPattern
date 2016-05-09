package com.mvalho.study.pattern.abstractfactory.main;

import com.mvalho.study.pattern.abstractfactory.factory.AbstractFactory;
import com.mvalho.study.pattern.abstractfactory.model.Color;
import com.mvalho.study.pattern.abstractfactory.model.ColorType;
import com.mvalho.study.pattern.abstractfactory.model.Shape;
import com.mvalho.study.pattern.abstractfactory.model.ShapeType;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		
		Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);
		shape3.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		Color color1 = colorFactory.getColor(ColorType.BLUE);
		color1.fill();
		
		Color color2 = colorFactory.getColor(ColorType.RED);
		color2.fill();
		
		Color color3 = colorFactory.getColor(ColorType.GREEN);
		color3.fill();
	}

}
