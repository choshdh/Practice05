package com.javaex.problem04;

public class RectTriangle extends Shape{

	double width;
	double height;
	
	public RectTriangle(double width ,double height) {
		super(3);
		this.width=width;
		this.height=height;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height/2;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width+height+(Math.sqrt(Math.pow(width,2)+Math.pow(height, 2)));
	}

}
