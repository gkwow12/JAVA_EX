package c_control;

import java.util.Scanner;

public class Univercity {

	public static void main(String[] args) {

		System.out.print("학번을 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		String num	= sc.next();
		
		String year = num.substring(0, 4);
		
	
		char uni = num.charAt(4);   // uni -> 단과
		if( uni == '1') {
			System.out.print("당신은 공대");
			String major = (String) num.subSequence(5, 7);  // 학과
			
			switch(major) {
			case "11":
				System.out.print("컴퓨터학과 학생입니다.");
				break;
			case "12":
				System.out.print("소프트웨어학과 학생입니다.");
				break;
			case "13":
				System.out.print("모바일학과 학생입니다.");
				break;
			case "22":
				System.out.print("자바학과학생입니다. ");
				break;
			case "33":
				System.out.print("서버학과 학생입니다.");
				break;
			}
			}else {
				System.out.print("당신은 사회대");
				String major2 = num.substring(5, 7);
			switch(major2) {
			case "11":
				System.out.print("사회학과 학생입니다.");
				break;
			case "12":
				System.out.print("경영학과 학생입니다.");
				break;
			case "13":
				System.out.print("경제학과 학생입니다.");
				break;
			}
		}
			
		}
	}

