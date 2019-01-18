package oop1119;

public class ForTest {

	public static void main(String[] args) {
		// 반복문 : for, while, do~while
		// 무한 Loop
		// for(시작값 ; 종료값 ; 증감){조건이 true면 실행, false면 빠져나옴}
		// 					조건(boolean형)
		// Scope : 유효범위
		
		/* 1) 증가에 따른 반복
		for(int a=1; a<=3; a=a+1) {	// for문 안에 선언된 변수는 for문 안에서만 사용됨
			System.out.println(a+"JAVA");
		}//for end
		
		//에러, for문에 선언된 a변수는 for문안에서만 사용가능
		//System.out.println(a);
		
		
		// 2) 감소에 따른 반복
		int b;		//변수의 scope → 선언 이후 사용할 수 있다
		for(b=3; b>=1; b=b-1) {
			System.out.println(b+"JSP");
		}//for end
		System.out.println(b); //0
		*/
		
		//for(;;) {}  → 무한Loop
		//break → 반복문 탈출
		/*
		for(int a=10; a<=100; a=a+10) {
			System.out.println(a+"JAVA");
		}
		for(int b=100; b>=10; b=b-10) {
			System.out.println(b+"JSP");
		}
		*/
		/*
		for(char ch='A'; ch<='Z'; ch=(char)(ch+1)) {
			System.out.println(ch);
		}
		for(char ch='z'; ch>='a'; ch=(char)(ch-1)) {
			System.out.println(ch);
		}
		*/
		
		// 구구단
		/*
			4*1=4
			4*2=8
				...
			4*9=36
		
		int dan=4;
		for(int a=1; a<=9; a++) {
			System.out.println(dan+"*"+a+"="+dan*a);
		}//for end
		*/
		
		/* 1~5 중에서 짝수만 출력
		for(int a=1; a<=5; a+=1) {
			if(a%2==0) {
				System.out.println(a);
			}
		}//for end
		*/
		
		/* 문) 서기1년~ 서기2018년 중에서 윤년만 출력
		for(int a=1; a<=2018; a++) {
			if((a%4==0)&&(a%100!=0)||(a%400==0)) {
				System.out.println(a + " : 윤년");
			}
		}//for end
		*/
		
		// 알고리즘 기초 : 갯수, 누적
		/* 1~5 중에서 짝수의 갯수?
		int count = 0;
		for(int a=1; a<=5; a+=1) {
			if(a%2==0) {
				count = count+1;
			}
		}//for end
		System.out.println("짝수 갯수 : "+count);
		*/
		
		/* 문) 서기1년~ 서기2018년 중에서 윤년의 갯수
		int count=0;
		for(int a=1; a<=2018; a++) {
			if((a%4==0)&&(a%100!=0)||(a%400==0)) {
				count =count+1;
			}
		}//for end
		System.out.println("윤년의 갯수 : "+count);
		*/
		
		// 문) 알파벳을 한 줄에 5개씩 출력
		/*
			ABCDE			A의 아스키코드가 65, 5의 배수. 이것을 활용할 수도 있다
			FGHIJ
			KLMNO
			PQRST
			UVWXY
			Z
		*/
		/*
		int count=0;
		char ch;
		for(ch='A'; ch<='Z'; ch++) {
			count=count+1;
			if(count%5!=0) {
				System.out.print(ch);
			}else {
				System.out.println(ch);
			}
		}
		*/
		/* 선생님이 한 것
		int count=0;
		for(char ch='A'; ch<='Z'; ch++) {
			count=count+1;
			//System.out.print(ch+""+count);
			System.out.print(ch);
			//----------------------------1)
			if(count%5==0) {
				System.out.println();
			}
			//----------------------------2)
			if(count==5) {
				System.out.println();
				count=0;		//다시 돌 때 0부터 카운트
			}
		}
		*/
	}//main() end
}//class end