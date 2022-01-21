package c_control;

public class Ex05_for과제 {

	public static void main(String[] args) {
		// 1번 문제
		/*for(int j=0; j<26; j++) {
			for(char ch='A'; ch<='A'+j; ch++) {
			
				System.out.print(ch);
			}
			System.out.println();
		}*/
		
		//2번문제
		/*for(int i=0; i<26; i++) {
			for(char ch='A'; ch<='Z'-i; ch++) {
				System.out.print(ch);
			}
			System.out.println(); // 
		}*/
		
		//3번문제
		/*for(int i=0; i<26; i++) {
			for(char ch=(char)('A'+i); ch<='Z'; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}*/
		
		//4번문제
		for(int i=0; i<26; i++) {
			
			for(char ch = 'Z'; ch>='Z'-i; ch--) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
