package com.javaex.problem04;

public class RectTriangle extends Shape{

	double width;
	double height;
	
	//직각 삼각형의 생성자
	public RectTriangle(double width ,double height) {
		super(3); // 직각삼각형이 생성될때마다 부모가 가진 생성자를 통하여 부모의 멤버변수인 countSides(변의수)를 삼각형 이기때문에 3으로 초기화 시켜준다.
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
		//사용함수
		//1.Math 클래스가 가지고 있는 함수 : 제곱근을 구하는 sqrt()
		//2.Math 클래스가 가지고 있는 함수 : 원하는숫자를 원하는 횟수 만큼 제곱 해주는 pow(피연산자, 제곱횟수)
		return width+height+(Math.sqrt(Math.pow(width,2)+Math.pow(height, 2))); //피타고라스의 정의를 사용하기 위해서....
	}

}
