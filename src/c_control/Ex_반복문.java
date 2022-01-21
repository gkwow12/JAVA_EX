package c_control;

public class Ex_반복문 {

	public static void main(String[] args) {

		for(int i=1; i<=1000; i++) {
			int su =i;
	//구글 입사 문제 하는 중
			while(su !=0) {
			int na = su%10;
			boolean su12 = false;
			if (na ==8) {
				char pal = (char)su;
				System.out.println(pal);
				su12 = true;
			}
			su/=10;
			
			
				if(su!='8') {
					System.out.println(i);
				
				} else {
					
					
				}
			}
			
		}
		
	}

}