package b_datatype;

public class Ex01_review {

	//이진논리 연산자 (&,|,^) : 각 비트의 연산(a,b)
	public static void main(String[] args) {
		int a = 3;
		if( a > 3 & ++a>3) {
			System.out.println("조건만족");
		}	
		System.out.println("A=" + a);
		//연산했기 때문에  a=4
		if( a> 1 | ++a > 3) {
			System.out.println("조건만족");
		}
		// 앞의 값이 true이기 때문에 
		System.out.println("A=" + a);
	}
}
