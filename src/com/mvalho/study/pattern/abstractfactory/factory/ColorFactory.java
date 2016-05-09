package com.mvalho.study.pattern.abstractfactory.factory;

import com.mvalho.study.pattern.abstractfactory.model.Blue;
import com.mvalho.study.pattern.abstractfactory.model.Color;
import com.mvalho.study.pattern.abstractfactory.model.ColorType;
import com.mvalho.study.pattern.abstractfactory.model.Green;
import com.mvalho.study.pattern.abstractfactory.model.Red;
import com.mvalho.study.pattern.abstractfactory.model.Shape;
import com.mvalho.study.pattern.abstractfactory.model.ShapeType;

public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(ColorType color) {
		if(color == null) {
			return null;
		}
		
		if(color.equals(ColorType.BLUE)) {
			return new Blue();
		} else if(color.equals(ColorType.GREEN)) {
			return new Green();
		} else if(color.equals(ColorType.RED)) {
			return new Red();
		} 
		
		return null;
	}

	@Override
	public Shape getShape(ShapeType shape) {
		return null;
	}

}
