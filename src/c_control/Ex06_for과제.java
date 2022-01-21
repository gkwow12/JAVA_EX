package c_control;

import java.util.Scanner;

public class Ex06_for과제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수를 입력하세요 ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++ ) {
			for(int x=0; x<=num-i; i++) {
				System.out.println(" ");
			
			}
		}
		
	}

}
