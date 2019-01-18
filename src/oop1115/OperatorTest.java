package oop1115;

public class OperatorTest {

	public static void main(String[] args) {
		// 연산자 : 이식성이 풍부하다
		// 최우선 연산자 : ()
		// 후순위 연산자 : = 대입연산자
		// 산술, 비교(관계), 논리연산자  → 이 순서대로 우선순위
		
		/* 1) 산술연산자 : + - * /
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3);			//1 몫연산자
		System.out.println(5/3.0);		//1.6666666666666667
		
		System.out.println(3/5);			//0
		System.out.println(3.0/5);		//0.6
		System.out.println(3/5.0);		//0.6
		
		System.out.println(5%3);		//2 나머지연산자
		System.out.println(3%5);		//3
		
		//임의의 수에 대한 나머지
		int a=10;							//나올 수 있는 나머지
		System.out.println(a%2);		//0 1
		System.out.println(a%3);		//0 1 2
		System.out.println(a%4);		//0 1 2 3
		System.out.println(a%6);		//0 1 2 3 4 5
		System.out.println(a%45);		//0~44
		*/
		
		
		/* 2) 비교(관계)연산자 : true, false값으로 반환된다
		System.out.println(3<5);			//true
		System.out.println(3>5);			//false
		
		System.out.println(3<=5);			//true
		System.out.println(3>=5);			//false
		
		System.out.println(3<=3);			//true
		System.out.println(3>=3);			//true
		
		System.out.println(3==5);			//false
		System.out.println(3!=5);			//true
		*/
		
		// 3) 논리연산자 : true, false(boolean형)로 반환된다
		/*
			AND	그리고	~이면서		논리곱	&&
			OR	또는		~이거나		논리합	||
			NOT	부정		~아니라면				!
							  AND  OR			   곱  합
			True	True		T		T		1 1	1	1
			True	False		F		T		1 0	0	1
			False	True		F		T		0 1	0	1
			False	False		F		F		0 0	0	0
		*/

	}//main() end
}//class end
