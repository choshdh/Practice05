package com.javaex.problem03;

public class Goods {

    private String name;
    private int price;
    private int count;
    
	public void showInfo() {
		System.out.println(name +"(가격:" + price + "원)이 " + count + "개 입고 되었습니다.");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCount(int count) {
		this.count = count;
	}
    
    
    
}
