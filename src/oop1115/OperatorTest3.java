package oop1115;

public class OperatorTest3 {

	public static void main(String[] args) {
		// 연산자 연습
		/*
		// 임의의 수가 짝수인지?
		int a =4; 
		System.out.println(a%2==0);
								//4%2
								//0	==0	true
		
		System.out.println(a%2!=1);
								//4%2
								//0   !=1		true
		
		// 임의의 수가 3의 배수인지?
		System.out.println(a%3==0);
								//4%3
								//1   ==0	false
		
		// 임의의 수가 4의 배수인지?
		System.out.println(a%4==0);
								//4%4
		
		// 문) 해당 년도가 윤년인지?
		int year = 2018;
		System.out.println(year%4==0);
		*/
		
		/* 2의 배수이면서 5의 배수인지?
		int a=34;
		System.out.println((a%2==0)&&(a%5==0));
								//34%2			34%4
								//0					=4
								//F				&& T
								//F
		*/
		
		/* 국어점수가 80~89 사이인지?
		int kor =85;
		System.out.println((kor>=80)&&(kor<=89));
								//85>=80		85<=89
								//T			&& T
								//T
		*/
		
		/* 윤년 구하는 공식
		// 4년마다 윤년이지만 그중에서
		// 100년에 한번 씩은 윤년이 아니다
		// 그중에 400년으로 나누어 떨어지는 해는 윤년이다
		int y = 2016;
		System.out.println(y%4==0);
		System.out.println((y%4==0)&&(y%100!=0));						// 4년마다이며 100년마다는 아닌
		System.out.println((y%4==0)&&(y%100!=0)||(y%400==0));		//4년마다임 100년마다는 아닌, 400년마다는 맞
		*/
		
		/* 임의의 문자가 알파벳 R, r 인지?
		char ch='b';
		System.out.println((ch=='r')||(ch=='R'));
		*/
		
		/* 임의의 수가 2의 배수이거나 3의 배수인지?
		int a =347;
		System.out.println((a%2==0)||(a%3==0));
		*/
		
		/* 임의의 문자가 대문자('A'~'Z')인지?
		char ch='b';
		System.out.println((ch>='A')&&(ch<='Z'));
								//'b'>='A'		'b'<='Z'
								// T		  &&  F
								// F
		*/
		
		// 임의의 수가 3의 배수가 아니라면? 3의 배수: false
		int a=8;
		System.out.println(a%3!=0);
							  // 3%3
							  // 0    !=0
							  // F
		System.out.println(!(a%3==0));
							  //   3%3
							  //   0    ==0
							  // ! T
							  // F
		
		
	}//main() end
}//class end
