package a_datatype;

public class Ex03_StringBuffer {

	public static void main(String[] args) {
		
		//call by reference : 함수의 인자로 참조형을 보낼 때 
		StringBuffer a = new StringBuffer("Hello");
		StringBuffer b = new StringBuffer("홍길동");
		add(a,b);
		System.out.println("2>" + a); // 수정된 a가 나옴
		System.out.println("2>" + b); //홍길동

	}
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);
		System.out.println("1>" + a); //Hello홍길동
		//heap영역의 a 를 수정함
	}
}
