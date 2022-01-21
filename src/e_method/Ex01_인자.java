package e_method;

public class Ex01_인자 {

	public static void main(String[] args) {
		
		
		Object[] result = method();
		
	}
	static void method() {  
	//데이터
		String name = "홍길동";
		int age =33;
		double height = 150.99;
		
		Object[] obj = new Object[3];
		
		obj[0] = name;
		obj[1] = new Integer(age);
		obj[2] = new (height);
		
		//* return 할 때 리컨값은 단 한 개만 가능!!!!!!*
}
}