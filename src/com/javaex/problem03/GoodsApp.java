package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	ArrayList <Goods> al = new ArrayList<Goods>();
    	
    	System.out.println("재고관리 프로그램을 실행 합니다.");
    	System.out.println("구분자로 공백 한칸을 사용 합니다.");
    	System.out.println("상품 정보를 넣어주세요 예)사이다 500 10");
        
    	while(al.size()<3) {
    		System.out.println("상품 정보 입력 >>");
        	String goodsInfo = sc.nextLine();
        	
        	String[] goods = goodsInfo.split(" ");
        	
        	Goods g = new Goods();
        	g.setName(goods[0]);
        	try {
				g.setPrice(Integer.parseInt(goods[1]));
				g.setCount(Integer.parseInt(goods[2]));
				al.add(g);
			} catch (NumberFormatException e) {
				System.out.println("가격 및 수량에는 숫자만 기입 할 수 있습니다.");
				continue;
			}
        	
        }
    	
    	for(Goods g : al) {
    		g.showInfo();
    	}
       
    }

}
