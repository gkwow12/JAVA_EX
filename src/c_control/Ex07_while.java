package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_while {

	public static void main(String[] args) {


		System.out.println("문장을 입력 : ");
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();  
		
		//StringTokenizer -> 공백만큼 문자의 단어를 쪼갬
		StringTokenizer st = new StringTokenizer(msg);
		
		/*
		 얼만큼 반복해야 하는지 모를 때
		while(st.hasMoreTokens()) { //단어가 끝나면 끝
			String word = st.nextToken();
			System.out.println(word);
		}*/
		
		//얼마나 반복해야 하는지 알 때
		int cnt = st.countTokens(); // 얼마나 반복해야 하는지 알려줌
		for(int i=0; i<cnt; i++) {
			String word = st.nextToken();
			System.out.println(word);
		}
		
	}

}