package com.mvalho.study.pattern.abstractfactory.factory;

import com.mvalho.study.pattern.abstractfactory.model.Color;
import com.mvalho.study.pattern.abstractfactory.model.ColorType;
import com.mvalho.study.pattern.abstractfactory.model.Shape;
import com.mvalho.study.pattern.abstractfactory.model.ShapeType;

public abstract class AbstractFactory {
	public abstract Color getColor(ColorType color);
	public abstract Shape getShape(ShapeType shape);
}
