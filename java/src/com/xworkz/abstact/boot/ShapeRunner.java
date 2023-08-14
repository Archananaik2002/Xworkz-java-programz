package com.xworkz.abstact.boot;

import com.xworkz.abstact.app.Circle;
import com.xworkz.abstact.app.Shape;

public class ShapeRunner {
	public static void main(String[] args) {
		
		Shape shape=new Circle();
		shape.calculateArea();
		shape.calculatePerimeter();
		shape.description();
		shape.display();
		shape.draw();
		shape.getName();
		shape.printInfo();
		shape.resize();
		shape.translate();
		shape.rotate();
	}

}
