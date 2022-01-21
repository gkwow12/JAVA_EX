package a_datatype;

public class Ex03_PrimitiveParam {

	public static void main(String[] args) {
		//call by value : 함수에 인자로 기본형 데이터를 보낼 때
		int a = 10;
		int b = 20;
		add(a,b);
		System.out.println("2>"+a); //10
		System.out.println("2>"+b); //20
	}
	static void add(int a, int b) {
	 a+=b;
	 System.out.println("1>"+a); //30
	 
	 //값이 add 메소드에 넘어옴 -> a=30 -> 다시 위로 올라가면 add 메소드 값은 사라짐 -> a=10 b=20 값이 나옴
 }
}
