package d_array;

public class Ex02_배열개념 {

	public static void main(String[] args) {
		
		// 정수형 배열 변수 선언( 변수명 : a)
		int[]a;
		// 배열은 new 통해서 객체 생성
		a=new int[4];
		//int []a = new int[4]
		
		a[2] = 100;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//for-each문
		for(int temp :a) {  //a 배열을 temp에 int형으로 하나씩 넣는 것
			System.out.println(temp);
		}
	}

}