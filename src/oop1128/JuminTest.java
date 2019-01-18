package oop1128;

import java.util.Calendar;
import java.util.GregorianCalendar;

//http://sillytalking.tistory.com/68
class Jumin{
	private String jumin;			//field
	
	public Jumin() {}						//default constructor
	public Jumin(String jumin) {	//생성자 오버로딩
		this.jumin = jumin;			//this 나 자신
	}
	
	public boolean validate() {	//← 문제
		boolean flag = false;
		//여기에 작성하시오
		//주민번호가 맞으면 flag=true(틀리면 대입X)
		//
		int hap=0;
		for(int i=0; i<8; i++) {
			int a = Integer.parseInt(jumin.substring(i, i+1));	//각자리
			hap=hap+a*(i+2);
		}
		//System.out.println(jumin.length());//13
		for(int i=8; i<(jumin.length()-1); i++) {
			int a = Integer.parseInt(jumin.substring(i, i+1));
			hap = hap+a*(i-6);
		}
		//System.out.println(hap);//169
		//hap=(2*8)+(3*9)+(4*1)+(5*2)+(6*3)+(7*0)+(8*1)+(9*2)+(2*3)+(3*4)+(4*5)+(5*6)=169
		
		int M = (11-(hap%11))%10;
		int f = Integer.parseInt(jumin.substring(jumin.length()-1));	//마지막번호 7
		if(M==f) {
			flag=true;
		}	//*/
		
		/*선생님
		Integer[] CHECKNUM = new Integer[] {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		Integer[] save = new Integer[12];
		int hap=0;
		int size = save.length;	//12
		
		for (int idx=0; idx<size; idx++) {
			/* 방법1
			char ch = this.jumin.charAt(idx);
			save[idx] = Character.getNumericValue(ch);
			
			int num = Integer.parseInt(jumin.substring(idx, idx+1));
			save[idx] = num * CHECKNUM[idx];
			hap = hap + save[idx]; //
		}//for end
		
		int M = (11-(hap%11))%10;
		
		if(M==Integer.parseInt(jumin.substring(12))) {//주민번호검증
			flag = true;
		}	//*/
		
		return flag;
	}
	
	public void disp() {
		/*
		//1) 성별
		int gender = jumin.charAt(6);
		if(gender%2==0) {
			System.out.println("성별	: 여자");
		}else {
			System.out.println("성별	: 남자");
		}
		
		//2) 나이
		int myYear = 1900+Integer.parseInt(jumin.substring(0, 2));
		Calendar cal = Calendar.getInstance();
		int age = cal.get(Calendar.YEAR) - myYear;
		System.out.println("나이	: " + age);
		
		//3) 띠	: (%12) → 0원숭이 1닭 2개 ~~ 11양
		String str[] = new String[] {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
		
		int size = str.length;
		int tt = myYear%12;
		
		for(int idx=0; idx<size; idx++) {
			if(tt==idx) {
				System.out.println("띠	: "+str[idx]);
			}
		}//for end
		
		//4) 살아온 날 수 → Calendar 클래스 활용해서
		//하루씩 증가 count
		//after(), before() 함수 이용
		int myMonth = Integer.parseInt(jumin.substring(2, 4));
		int myDay = Integer.parseInt(jumin.substring(4, 6));
		GregorianCalendar calMy = new GregorianCalendar(myYear, myMonth, myDay);	//태어난날짜
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		GregorianCalendar calCur = new GregorianCalendar(year, month, day);	//현재날짜
		
		int count=1;
		
		do {
			calMy.add(calMy.DATE, 1);
			count++;
		}while(compareTo()>());
		*/
		//선생님
		//태어난 년, 월, 일 가져오기
		int myYear = Integer.parseInt(this.jumin.substring(0, 2));
		int myMonth = Integer.parseInt(this.jumin.substring(2, 4));
		int myDate = Integer.parseInt(this.jumin.substring(4, 6));
		
		//성별코드
		int code = Integer.parseInt(this.jumin.substring(6, 7));
		
		switch(code) {
		case 1 :
		case 2 : myYear = myYear + 1900; break;
		case 3 : 
		case 4 : myYear = myYear + 2000; break; 
		}
		
		//오늘날짜
		Calendar today = Calendar.getInstance();
		int cYear = today.get(Calendar.YEAR);		//2018
		
		//1)성별
		String gender = "";
		switch(code%2) {
		case 0 : gender = "여자"; break;
		case 1 : gender = "남자"; break;
		}
		
		//2)나이 : 2018->1989 Calendar 클래스 활용해서
		int myAge = cYear-myYear;
		
		//3)띠  : (%12) -> 0원숭이 1닭 2개 3돼지 ~ 11양
		String[] animal = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼",  "용",  "뱀", "말", "양"};
		
		//출력
		System.out.println("주민번호 : "+this.jumin);
		System.out.println("태어난 년도 : "+myYear);
		System.out.println("태어난 월 : "+myMonth);
		System.out.println("태어난 일 : "+myDate);
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+myAge);
		System.out.println("띠 : "+animal[myYear%12]);
		
		//4) 살아온날수 -> Calendar 클래스 활용해서
		//나의 데이터를 이용해서 나의 생일 날짜 정보 만들기
		Calendar myBirth = Calendar.getInstance();
		myBirth.set(Calendar.YEAR, myYear);
		myBirth.set(Calendar.MONTH, myMonth-1);
		myBirth.set(Calendar.DATE, myDate);
		
		int alive = 1;
		while(!myBirth.after(today)) {	//myBirth가 today다음날이냐? 부정
			alive++;
			myBirth.add(Calendar.DATE, 1);
		}
		
		System.out.println("살아온 날 수 : "+alive);
		
		
	}
}//class end
//----------------------------------------------------------------------------------------
public class JuminTest {

	public static void main(String[] args) {
		// 주민번호가 유효한지 검증하는 프로그램
		Jumin id = new Jumin("8912301234567");
		
		if(id.validate()) {
			System.out.println("주민번호 맞음!!");
			// 성별, 나이, 띠, 살아온 날 수
			id.disp();
		}else {
			System.out.println("주민번호 오류!!");
		}//if end
		
		}//main() end
}//class end



















