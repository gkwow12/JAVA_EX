package c_control;

import java.util.Scanner;

public class Ex02_Jumsu {

	public static void main(String[] args) {
		int score = 0;
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		score = sc.nextInt();
		System.out.println("당신의 점수는 : " + score);
		System.out.println("당신의 점수2는 : " + score/10);
		
		switch(score/10) {
		
		case 10:  //100점일 때 A학점 받을 수 있게 하려고( break 없어서 case 9로 넘어감 )
		
		case 9:
			System.out.println("A학점");
			break;
			
		case 8:
			System.out.println("B학점");
			break;
			
		case 7:
			System.out.println("C학점");
			break;
			
		default:
			System.out.println("F학점");
			
		}
	}

}
