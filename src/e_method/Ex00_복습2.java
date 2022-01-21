package e_method;

import java.util.Scanner;

public class Ex00_복습2 {

	static int jumsu; 
	
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		func();
		// 
		
		method();
	}

	/** 
	 * method1
	 *  	- 점수를 입력받아 합격 여부 확인하는 메소드
	 */
	static  String func() {
		Scanner in = new Scanner(System.in);		
		 jumsu = in.nextInt();
		if( jumsu >= 80) return "합격";
		else return "불합격";
	}
	
	/**
	 *점수를 넘겨 받아 성적을 구하는 메소드
	 */
	static void method() {
		int i= jumsu;
	if(90<=i) {
		System.out.println("A학점입니다.");
	}else if(80<=i) {
		System.out.println("B학점입니다.");
	} else {
		System.out.println("불합격입니다.");
	}
	}

}
