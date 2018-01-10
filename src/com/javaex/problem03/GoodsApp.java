package com.javaex.problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	ArrayList <Goods> al = new ArrayList<Goods>();
    	
    	System.out.println("재고관리 프로그램을 실행 합니다.");
    	System.out.println("구분자로 공백 한칸을 사용 합니다.");
    	System.out.println("상품 정보를 넣어주세요 예)사이다 500 10");
        
    	while(al.size()<3) { //ArrayList 객체의 사이즈가 3개가 찰 때까지 반복하겠다. 예외가 발생하여 추가 되지 않으면 계속 반복 실행 하기 위해서...
    		System.out.println("상품 정보 입력 >>");
        	String goodsInfo = sc.nextLine();
        	
        	//받아온 상품정보를 공백을 구분자로 사용하여 쪼개서 배열로 만들어 goods 에 담는다.
        	String[] goods = goodsInfo.split(" ");
        	
        	Goods g = new Goods();
        	g.setName(goods[0]);
        	try {//goods[1] or goods[2] 가 숫자로 변환 할 수 없는 문자가 들어왔을때 예외 처리를 위한 try~catch 문 사용
				g.setPrice(Integer.parseInt(goods[1]));
				g.setCount(Integer.parseInt(goods[2]));
				al.add(g);
			} catch (NumberFormatException e) {// 예외 발생시 출력 메시지 표시후 다음 반복(while)문으로 이동
				System.out.println("가격 및 수량에는 숫자만 기입 할 수 있습니다.");
				continue;
			}
        	
        }
    	
    	for(Goods g : al) {
    		g.showInfo();
    	}
    	
    	sc.close();
       
    }

}
