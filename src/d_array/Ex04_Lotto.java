package d_array;

public class Ex04_Lotto {

	public static void main(String[] args) {
		// 배열 선언 / 객체 생성
		int [][] lotto =new int [5][6]; //5줄 한 줄 당 6개
		// 한 타입만 가능
		
		
		//값 지정 
		for(int i=0; i<lotto.length; i++) {   //줄(5)
			for(int j=0; j<lotto[i].length; j++) {  //칸(6)
				lotto[i][j] = (int)(Math.random()*45)+1;
		}
			
		// 먼저 i 객체 생성 -> 객체 생성(번호마다 번지 수가 있음) -> i에서 각 번호에 맞는 번지 수를 찾아 입력함 -> i가 현재 5개 밖에 없어서 j는 5개만 나옴
		//그래서 j길이 만큼 나오게 하고 싶으면 [i] 꼭 하기	
			
		//출력 (배열은 무조건 for)	
		for(int i=0; i<lotto.length; i++)
			for(int j=0; j<lotto[i].length; j++) {
			System.out.print(lotto[i][j] + "/");
		}
		System.out.println();
	}
	
	
	}

}

	