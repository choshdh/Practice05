package com.javaex.problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	//ArrayList 객체생성
    	ArrayList <Friend> al = new ArrayList<Friend>();
       
    	for(int i=0; i<3; i++) {
        	String friendInfo = sc.nextLine();
        	// 입력받은 친구정보를 공백으로 분리
        	String[] friend = friendInfo.split(" ");
        	// Friend 객체 생성하여 데이터 넣기
        	Friend f = new Friend();
        	f.setName(friend[0]);
        	f.setHp(friend[1]);
        	f.setSchool(friend[2]);

        	//ArrayList 객체에 Friend 객체 추가하기
        	al.add(f);
        }
    	
    	for(Friend f : al) {
    		f.showInfo();
    	}
    	
    }

}
