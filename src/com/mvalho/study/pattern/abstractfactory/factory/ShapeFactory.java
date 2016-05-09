package com.mvalho.study.pattern.abstractfactory.factory;

import com.mvalho.study.pattern.abstractfactory.model.Circle;
import com.mvalho.study.pattern.abstractfactory.model.Color;
import com.mvalho.study.pattern.abstractfactory.model.ColorType;
import com.mvalho.study.pattern.abstractfactory.model.Rectangle;
import com.mvalho.study.pattern.abstractfactory.model.Shape;
import com.mvalho.study.pattern.abstractfactory.model.ShapeType;
import com.mvalho.study.pattern.abstractfactory.model.Square;

public class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(ShapeType shapeType) {
		if(shapeType == null) {
			return null;
		}
		
		if(shapeType.equals(ShapeType.CIRCLE)) {
			return new Circle();
		} else if(shapeType.equals(ShapeType.RECTANGLE)) {
			return new Rectangle();
		} else if(shapeType.equals(ShapeType.SQUARE)) {
			return new Square();
		}
		
		return null;
	}

	@Override
	public Color getColor(ColorType color) {
		return null;
	}
}
