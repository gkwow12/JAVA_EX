package c_control;


/*
 * 1~50까지의 숫자 중에서 3, 6, 9 포함되면
 * 그 수만큼 짝 출력
 * 포함되지 않으면 해당 그 수를 출력 
 */

public class Ex08_369 {

	public static void main(String[] args) {
		
		for(int i =1; i<=50; i++) {
			int su = i;
			boolean su369 = false;
			
			//369판단  ex)su = 136 
			while(su != 0) {     
				int na = su%10; // 6
				if(na == 3 || na == 6|| na == 9) {
					System.out.print("짝");
					su369 = true;
					
				}
				su /=10; // 13
			}
		
			
			if(!su369) {
				System.out.println(i);  //369가 아니면 그냥 수
				
			}else {
				System.out.println();
				
			}
		}
		
	}

}