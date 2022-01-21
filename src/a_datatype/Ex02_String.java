package a_datatype;

public class Ex02_String {

	public static void main(String[] args) {
		
		/*String a = new String("홍길동");
		String b = new String("홍길동");*/ //다른 객체이기 때문에 다르다고 나옴
		
		String a = "홍길동";
		String b = "홍길동";            //동일하다고 나옴 
		
		if(a==b) {
			System.out.println("동일"); 
		} else {
			System.out.println("다르다"); 
			
			/*if(a.equals(b)) {
				System.out.println("동일"); 
			} else {
				System.out.println("다르다");    
			}  */
			
		}
	}

}
