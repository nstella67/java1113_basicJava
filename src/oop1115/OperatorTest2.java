package oop1115;

public class OperatorTest2 {

	public static void main(String[] args) {
		// 연산자 연습
		// 문1) 각 지폐의 갯수를 구하시오
		//int money = 56430;
		/* 출력결과
			만원 5장
			천원 6장
			백원 4장
			십원 3장
		*/
		/*
		int a,b,c,d;
		a=money/10000;
		money=money%10000;
		b=money/1000;
		money=money%1000;
		c=money/100;
		money=money%100;
		d=money/10;
		System.out.println("만원"+a+"장");
		System.out.println("천원"+b+"장");
		System.out.println("백원"+c+"장");
		System.out.println("십원"+d+"장");	
		*/
		
		// 문2) 1년 365.2422일
		/* 출력결과 : 365일 ?시간 ?분 ?초
			1분	: 60초
			1시간	: 60분=3600초
			1일	: 24시간=86400초
			1년	: 365.2422*86400=31556926.08초
		*/
		/*
		double nday=0.2422*86400;
		double h, m, s;
		h=(nday/86400);
		nday=(nday%86400);
		m=(nday/3600);
		nday=(nday%3600);
		s=(nday/60);
		System.out.println("1년 : 365일"+h+"시간"+m+"분"+s+"초");
		*/
		
		int nday=(int)(0.2422*86400);
		int hour, min, sec;
		
		hour=(nday/3600);
		nday=(nday%3600);
		
		min=(nday/60);
		sec=(nday%60);
		
		System.out.println("1년 : 365일 "+hour+"시간 "+min+"분 "+(sec+0.08)+"초");
		
		//선생님이한것
		double year = 365.2422;
		int day = (int)(year*86400);		//31556926
		
		int d = day/86400;					//365
		day = day%86400;
		
		int h = day/3600;						//시간
		day = day%3600;
		
		int m = day/60;						//분
		int s = day%60;						//초
		
		System.out.println("1년:" + year);
		System.out.println(d+"일");
		System.out.println(h+"시간");
		System.out.println(m+"분");
		System.out.println(s+"초");
		
	}//main() end
}//class end
