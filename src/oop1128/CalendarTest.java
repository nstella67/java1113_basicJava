package oop1128;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		// 날짜 관련 클래스
		// Calendar ↔ GregorianCalendar(subclass)
		
		//현재 시스템의 날짜 정보 얻어오기
		Calendar cal = Calendar.getInstance();	//접두어get:보통 return이 있다
		//현재년도, 월, 일
		System.out.println(cal.get(1));		//2018	년
		System.out.println(cal.get(2));		//10		월-1
		System.out.println(cal.get(2)+1);	//11		월
		System.out.println(cal.get(5));		//28		일
		//상수보다 변수 사용. 밑에껄 추천
		System.out.println(cal.get(Calendar.YEAR));	//년
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		//요일(1월 2화 3수 4목 5금)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//24시간기준
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
//-------------------------------------------------------------------------------------------------------------
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal2.get(Calendar.YEAR));	//2018
		
		//현재년도에서 5년을 더하시오 → 2023년
		cal2.add(Calendar.YEAR, 5);	//빼는 함수는 따로 없다 -붙이면 됨	2023-10-28
		System.out.println(cal2.get(Calendar.YEAR));	//2023
		
		//2023-10-28 에서 3개월을 빼시오 → 7
		cal2.add(Calendar.MONTH, -3); //2023-7-28
		System.out.println(cal2.get(Calendar.MONTH));	//7
		
		cal.add(Calendar.DATE, 1);			//2023-7-29
		System.out.println(cal.get(Calendar.DATE));	//29
		
		
		//날짜 데이터 생성하기
		cal.set(1989, 5, 30);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		//2018-11-28
		cal.set(2018, Calendar.NOVEMBER, 28);		//month정보 변수로 줄 수 있다
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		//년 월 일 따로 따로 입력 가능
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.NOVEMBER);
		cal.set(Calendar.DATE, 28);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
//------------------------------------------------------------------------------------------------------------
		GregorianCalendar cal3 = new GregorianCalendar();
		if(cal3.isLeapYear(2018)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		GregorianCalendar cal4 = new GregorianCalendar(1989, 5, 30);
		System.out.println(cal4.get(Calendar.YEAR));
		System.out.println(cal4.get(Calendar.MONTH));
		System.out.println(cal4.get(Calendar.DATE));
		

	}//main() end
}//class end