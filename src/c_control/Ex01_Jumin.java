package c_control;

public class Ex01_Jumin {

	public static void main(String[] args) {

		String id = "800112-1234567";
		
		String neundo = id.substring(0, 2);  // 0번째부터 2번째 앞에 까지	
		System.out.println("년도 : "+ neundo);
		
		String month = id.substring(2, 4); //0번째부터 4번째 앞에 까지
		String day = id.substring(4, 6); // 0번째부터 6번째 앞에 까지
		System.out.println(month +"월" + day + "일");
		
		
		
		
		
		
		
		
		
		
		
		char sung = id.charAt(7);  // 몇 번째의 문자
		//System.out.println(sung);
		
		//변수 sung에 갑시 1이거나 3이면 
	
/*if(sung =='1' | sung =='3' ) {
	System.out.println("남자");
	} else {
		System.out.println("여자");
	}*/
	char chu1 = id.charAt(8);
	
	switch(chu1) {
	case '0':
		System.out.println("서울태생");
		break;
		
	case '1':
		System.out.println("인천/부산");
		break;
	case '2':
		System.out.println("경기");
		break;
	case '9':
		System.out.println("제주");
		
		
		
	}

}
}