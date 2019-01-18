package oop1121;

public class WeekdayTest {

	public static void main(String[] args) {
		// 요일 구하는 프로그램
		// 2018년 11월 21일 → 수요일
		/*
			서기1년1월1일 ~ 서기2018년11월21일 = 총날수
			총날수%7 → 0일 1월 2화 3수 4목 5금 6토
			
			1) 서기1년 ~ 2017
			 	+= 366
			 	+=265
			
			2) 1월~10월
			   31 → 1, 3, 5, 7, 8, 10, 12
			   30 → 4, 6, 9, 11
			   29 → 2
			   28 → 2
			
			3) += 21
		*/
//-------------------------------------------------------------------------
		int cYear=2018, cMont=11, cDate=21;
		int hap=0;
		
		//1) 
		for(int y=1; y<cYear; y++) {
			if(y%4==0 && y%100!=0 || y%400==0) {
				hap=hap+366;
			}else {
				hap=hap+365;
			}
		}//for end		총날수 736694
		
		//2)
		int[] mon= {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(cYear%4==0 && cYear%100!=0 || cYear%400==0) {
			mon[2]=29;
			}
		for(int m=1; m<cMont; m++) {
			hap=hap+mon[m];
		}
		
		//3)
		hap=hap+cDate;
			
		System.out.println("총날수 : "+hap);
		switch(hap%7) {
		case 0 : System.out.println("일요일"); break;
		case 1 : System.out.println("월요일"); break;
		case 2 : System.out.println("화요일"); break;
		case 3 : System.out.println("수요일"); break;
		case 4 : System.out.println("목요일"); break;
		case 5 : System.out.println("금요일"); break;
		case 6 : System.out.println("토요일"); break;
		}

		
		
		
		

	}//main() end
}//class end
