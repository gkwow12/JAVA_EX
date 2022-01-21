package c_control;

public class Ex09_break_continue {
/*
 * break : 블럭을 벗어날 때
 * continue : 블럭의 끝으로 감
 */
	public static void main(String[] args) {
		
	  //모든 반복문을 벗어나고 싶을 때 사용 -> 벗어나고 싶은 반복문 위에와 마지막 break 뒤에 붙이기
		for(int i=0; i<2; i++) {
		
			for(int j=0; j<3; j++) {
			
				if(j==1) break ;  //break :  j가 1이 되는 순간 for문 바깥쪽으로 벗어남
								//continue : j가 1이 되는 순간 for문 블럭 안쪽으로 벗어남
		
			System.out.println("<"+i+"," +j+">");
			//System.out.printf("<%d.%d>\n",i,j);	
		}
		
		
		}
	}

}

