package com.javaex.problem04;

public abstract class Shape { //1.추상 메소드가 존재하기 때문에 추상 클래스로 밖에 존재 할 수 없으며.
							  //2.추상 클래스이기때문에 스스로 객체화 될 수 없다.
							  //3.즉, 자식에게 상속 되었을때만 객체화 될 수 있다 = 자식을 통해서만 객체화 가능
	//도형의 변의 수
	int countSides;
	
	//생성자를 이용한 도형 객체의 변의수 초기화
	public Shape(int countSides) {
		this.countSides = countSides;
	}

	public int getCountSides() {
		return countSides;
	}
	
	// 함수가 해야할 기능의 이름만 정의한 추상 메소드
	public abstract double getArea();
	public abstract double getPerimeter();
	
	
}
