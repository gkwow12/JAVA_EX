package d_method;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01_성적_예제문제 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		
		//학생 수, 성적 입력
		System.out.println("학생 수를 입력하세요");
		int student = sc.nextInt();
		
		// 읽어온 학생 수/ 과목 수 배열에 저장
		int [][] studentScore = new int[4][3];
		
		// 성적 입력받기
		for(int i=0; i<studentScore.length; i++) {
			System.out.print((i+1) +" 번째 학생의 성적을 입력하세요.: ");
			String score = sc.next();
			
			// 입력받은 성적 잘라서 배열에 저장
			StringTokenizer scor = new StringTokenizer(score, "/");
				for(int j=0; j<studentScore[i].length; j++) {
					int sco = Integer.parseInt(scor.nextToken());
					studentScore[i][j] = sco; 										
			}
		}
		System.out.println();
		
			
		// 점수 계산
		for(int i=0; i<=studentScore.length; i++) {
			
			// 여기서 초기화해서 모든 점수를 다 더하지 않게 함
			int sum=0;
			double avg =0;
			for(int j=0; j<3; j++) {
			sum += studentScore[i][j];
			}
			// 과목 평균은 바깥 쪽 for문에서 하기
			avg =(double) (double)sum/3.0;
			System.out.println((i+1) + "번째 학생의 총점은" + sum +", 평균은 " + avg +"입니다.");
		}
		System.out.println();

	}

}
