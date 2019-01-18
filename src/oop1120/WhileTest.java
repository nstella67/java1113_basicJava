package oop1120;

public class WhileTest {

	public static void main(String[] args) {
		// while(조건) {}		조건이 true일때 {}실행
		// do{} while (조건) 
		// 종료 값이 따로 없다
		
		/* --분석1-----------------------------------------
		int a=3;
		while(a<=5) {		// 먼저 조건 비교
			System.out.println("JAVA");
			a++;
		}//end
		----------------------------------------분석1---*/
		
		
		/* --분석2---------------------------------------
		int b=3;
		do {
			System.out.println("JSP");
			b++;
		}while(b<=5);		// 나중에 조건 비교
		----------------------------------------분석2---*/
		
		
		/* ---분석3----------------------------------------------------------
		 * 초기값이 false일 경우 while과 do~while은 차이가 있다.
		int a=3;
		while(a<1) {
			System.out.println("JAVA");
			a++;
		}//(1)end
		
		//do~while 문은 조건과 상관없이 무조건 1번은 수행된다.
		int b=3;
		do {
			System.out.println("JSP");
			b++;
		}while(b<1);	//(2)
		--------------------------------------------------------분석3-------*/
		
		
		/* ---분석4-------------------------------------------------------------
		 * 무한루프 → for(;;){}
		int a=1;
		while(true) {		//무한루프
			System.out.println("JAVA");
			a++;
			if(a==3) break;
		}
		------------------------------------------------------분석4----------- */
		
		
		// 문1) 1~1000까지 누적의 합을 구하는데 (1+2+3+~)
		//		  그 합이 10000이 넘으면 결과를 출력하고 프로그램 종료하시오
		/*내가
		int a=1;
		int hap=0;
		while(true) {
			hap=hap+a;
			a++;
			if(hap>10000) break;
		}
		System.out.println(hap);		*/
		
		/*선생님이 한 것
		int a=1;
		int hap=0;
		while(a<=1000) {
			hap=hap+a;
			if(hap>=10000) {
				System.out.println(hap);
				break;
			}
			a++;
		}//end								*/
		
		
		// 문2) 3의 배수의 누적합(3+6+9+~)이 1000 이상이면
		//		  3부터 어디까지 더해야 하는지 구하시오
		//		  출력결과 3+6+9+12+ ~~ +? = 1000
		/*
		int a=3;
		int hap=0;
		while(true) {
			hap=hap+a;
			if(hap>=1000) {
				System.out.print(a+"="+hap);
				break;
			}
			System.out.print(a+"+");
			a=a+3;
		}																	*/
		/*선생님
		int a=0;
		int hap=0;
		String res="";	//빈 문자열 선언할 때
		
		while(true) {		//무한루프
			a=a+3;			//3의 배수   a+=3;
			hap=hap+a;	//누적의 합 hap+=a;
			res=res+a+"+";
			if(hap>=1000) break;
		}//while end
		
		System.out.println(a);
		System.out.println(hap);
		System.out.println(res+"="+hap);				*/
		
		
		/* string 변수도 누적가능
		String str="";
		str=str+"ONE";
		System.out.println(str);
		
		str=str+"TWO";
		System.out.println(str);
		
		str=str+"THREE";
		System.out.println(str);
		
		str += "FOUR";
		System.out.println(str);			*/
		
	}//main() end
}//class end