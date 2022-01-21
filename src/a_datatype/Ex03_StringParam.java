package a_datatype;

public class Ex03_StringParam {

	public static void main(String[] args) {
		//call by value : 함수로 인자로 기본형 데이터를 보낼 때  (그래서 int형이랑 결과가 똑같음)
		String a = "Hello";
		String b = "홍길동";
		add(a,b); //11라인으로 갔다가 다시 9라인으로 와서 프로그램 끝
		System.out.println("2>"+a); // 
		System.out.println("2>"+b); // 홍길동
	}
	static void add(String a, String b) {
		//String 특권 
		a += b;	//
		System.out.println("1>"+a); //Hello홍길동
		
		//String은 내용이 변경되면 새롭게 만듦 -> 다시 10라인으로 넘어가면 add메소드 관련은 다 사라짐 -> a = hello
		
}
}

// 우선 - static 메소드에서는 static만 참조할 수 있다.