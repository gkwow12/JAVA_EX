package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 5명의 국어점수를 입력받아
 * 90/99/84/77/87
 * 
 */


public class Ex01_성적 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor[] = new int[5];
		System.out.println("5명의 국어 점수 입력 (예 : 22/33/44/55/66)");
		Scanner sc = new Scanner(System.in);
		String strKor =sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(strKor,"/");
		for(int i=0; i<5; i++) {
			kor[i] = Integer.parseInt(st.nextToken());
		System.out.println(kor[i]);
		}
		//총점은 ~이고, 평균은 평균은 ~입니다.
		
		int sum =0;
		double result=0;
		for(int i=0; i<5; i++) {
			sum += kor[i];
			result = sum/5;
		}
		System.out.println("총점은  " + sum + " 평균은 "+ result);
		}
	}