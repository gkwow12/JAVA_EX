package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_성적_평균 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	   
		 // 학생 수 입력
		System.out.println("학생 수를 입력하세요.");
		int stu = sc.nextInt();
		int studentN[][] = new int[stu][3];  
		
		//학생 성적 입력
		for(int i=0; i<studentN.length; i++)  {
		System.out.print((i+1) + "번째 성적 입력 : ");
		 String num = sc.next(); 
		 StringTokenizer n = new StringTokenizer(num,"/");
		 	for(int j=0; j<3; j++) {
		 	int score = Integer.parseInt(n.nextToken());
		 		studentN[i][j] = score;
		 	}
		}
			
		
		
			// 성적 계산
		 	for(int i=0; i<studentN.length; i++) {
		 		int sum = 0;
		 		for(int j=0; j<3; j++) {
				 
		 			//총합
		 			sum += studentN[i][j];
			 } 
		 			// 평균
		 			double avg = (double)sum/3.0;
			
			System.out.println((i+1) + "번째 학생의 총점은" + sum + "평균은" + avg);
		 }
		
		 	
	}
}
