package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable{

	double width;
	double height;
	
	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		super(4); // 사각형이 생성될때마다 부모가 가진 생성자를 통하여 부모의 멤버변수인 countSides(변의수)를 사각형 이기때문에 4로 초기화 시켜준다.
		this.width = width;
		this.height = height;
	}

	//메소드 오버라이딩
	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		width = width*s;
		height = height*s;
	}

	//메소드 오버라이딩
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	//메소드 오버라이딩
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}

}
