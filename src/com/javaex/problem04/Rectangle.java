package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable{

	double width;
	double height;
	
	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		width = width*s;
		height = height*s;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}

}
