package c_control;

public class Ex04_for연습 {

	public static void main(String[] args) {

		for(char i='z'; i>='a'; i-=2 ) {  //a보다 낮아지면 멈춤
			System.out.print(i);
		}
		
		System.out.println();
			for(int i=0; i<5; i++) {
				System.out.print(i);
			}
		System.out.println();
		
		for(int j=0; j<4; j++) {
			for(int i=0; i<5; i++) {
				System.out.println(i);
			}
		}
	}

}
//a~z 한줄에 츌룍