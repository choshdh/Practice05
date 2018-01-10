package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("사칙 연산 계산기 프로그램을 실행합니다.");
    	System.out.println("구분자로 공백한칸을 사용 합니다.");
    	System.out.println("계산 할 식을 넣어주세요. 예)a + b");
    	while(true) {
    		System.out.print("식 입력>> ");
    		String get = sc.nextLine();
    		
    		//받아온 식을 공백을 구분자로 사용하여 배열로 만든다.
    		String[] getSplit = get.split(" ");
			
    		
    		if(getSplit.length==3) { //1. 위 getSplit 의 배열 크기가 3이라면 제대로식을 받아왔다고 가정하고 실행 될 수 있도록 한다.
    			int numA;
    			int numB;
    			try {
    				//받아온 피연산자가 담겨있는 getSplit[0] 과 getSplit[2]를  Wrapper 클래스인 Integer 클래스를 이용하여 문자열인 형식을 int 형식으로 변환한다
    				//변환시에 숫자로 변환 할 수 없는 문자열이 섞여있는 예외가 발생 할 수 있기때문에 try~catch 문으로 예외를 잡아내기 위하여 try~catch 구절을 사용하였다.
    				numA = Integer.parseInt(getSplit[0]);
    				numB = Integer.parseInt(getSplit[2]);
    				if(getSplit[0].equals("/q")) {
    	    			break;
    	    		}else if(getSplit[1].equals("+")) {
    	    			Add a = new Add();
    	    			a.setValue(numA,numB);
    	    			System.out.println(a.calculate());
    	    		}else if(getSplit[1].equals("-")) {
    	    			Sub s = new Sub();
    	    			s.setValue(numA,numB);
    	    			System.out.println(s.calculate());
    	    		}else if(getSplit[1].equals("*")) {
    	    			Mul m = new Mul();
    	    			m.setValue(numA,numB);
    	    			System.out.println(m.calculate());
    	    		}else if(getSplit[1].equals("/")) {
    	    			Div d = new Div();
    	    			d.setValue(numA,numB);
    	    			System.out.println(d.calculate());
    	    		}else { //연산자가 사칙연산을 수행하는 문자가 아닐경우 알 수 없는 연산자 라고 표시해줌
    	    			System.out.println("알 수 없는 연산자 입니다.");
    	    			System.out.println("입력된 연산자 : " + getSplit[1]);
    	    		}
    			} catch (NumberFormatException e) { //위에 적힌 바와 같이 피연산자가 숫자로 변환할수 없는 값이 들어왔을때의 예외를 잡아내고
    												//잘못된 피연산자가 들어왔으니 다음으로 실행되어야 할 코드를 무시하고 다음 반복(while)문으로 넘어가도록 continue를 사용하여 넘어간다.
    				System.out.println("피연산자가 잘못 입력 되었습니다.");
    				System.out.println("입력된 피연산자 a : " + getSplit[0] + " 피연산자 b : " + getSplit[2]);
    				continue;
    			}
			}else if(get.equals("/q")) { //2. 위 getSplit 의 배열 크기가 3이 아니면서(잘못된 수식이 입력된 상황) && '/q' 이라면 종료하겠다.
				break;
			}else{ //3. 위 getSplit 의 배열 크기가 3이 아니면서(잘못된 수식이 입력된 상황) && '/q' 도 아니라면 잘못된 수식이 들어온 것이니 알려주고 다음 반복(while)문으로 넘어가도록 continue.
				System.out.println("피연산자 2개와 연산자 1개를 정확히 입력해주십시오.");
				continue;
			}		
    		
    	}
    	
    	System.out.println("계산기가 종료되었습니다..");
    	
    	
    }
}
