package d_array;

import java.util.Calendar;

public class Ex04_배열초기화 {
	//날짜 : Date / Calendar
	public static void main(String[] args) {

		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();  //객체를 얻어오자
				
				System.out.println("년도 : " + cal.get(Calendar.YEAR));
				//월
				//일
				System.out.println("월 : " + cal.get(Calendar.MONTH)+1);
				System.out.println("일 : " + cal.get(Calendar.DATE));
				
				String[]weeks = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
				System.out.println(weeks [cal.get(Calendar.DAY_OF_WEEK)]);
	}

}