package oop1116;

public class OperatorTest6 {

	public static void main(String[] args) {
		// 삼항연산자
		/* 단항, 이항연산자
		int a = 3;
		a = a*2;		//이항연산자
		a = a*-1;	//이항연산자
		a = -a;		// a = a*-1과 같은 표현		단항연산자
		System.out.println(a);
		*/
		
		// 삼항연산자 (조건)? 참 : 거짓 → 항이 3개
		// 조건 : boolean형
		
		/* 문제
		// 문) 임의의 수가 양수, 음수?
		int a = 4;
		String str = (a>0)? "양수" : "음수";
					  // 3>0 ? → 참 → "양수"
		System.out.println(a+" : "+str);
		
		// 문) 임의의 수가 짝수, 홀수?
		str = (a%2==0)? "짝수" : "홀수";
		System.out.println(a+" : "+str);
		
		// 문) 임의의 수가 2의 배수이면서 5의 배수인지?
		str = (a%2==0 && a%5==0)? "10의배수맞다" : "10의배수아니다";
		System.out.println(a+" : "+str);
		
		// 문) 임의의 년도가 윤년, 평년?
		str = (a%4==0 && a%100!=0 || a%400==0)? "윤년" : "평년";
		System.out.println(a+" : "+str);
		*/
		
		// 문) 임의의 문자를 대소문자 서로 바꿔서 출력
		char ch = 'm';
		char cc = (ch>='a' && ch<='z')? (char)(ch-32) : (char)(ch+32);
		System.out.println(ch+" -> "+cc);
		
		// 문) 세 개의 수 중에서 최댓값 출력
		int a=3, b=9, c=7;
		int max = (a>b)? a : b;
		max = (max>c)? max : c;
		System.out.println(a+", "+b+", "+c+" 중 최댓값 : "+max);
		
		
	}//main() end
}//class end
