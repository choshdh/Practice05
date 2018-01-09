package com.javaex.problem04;

public abstract class Shape {

	
	int countSides;

	/**
	 * @param countSides
	 */
	public Shape(int countSides) {
		this.countSides = countSides;
	}

	public int getCountSides() {
		return countSides;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	
}
