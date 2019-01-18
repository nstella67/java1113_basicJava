package oop1123;

public class MethodTest2 {
	
	//함수 작성 영역
	public static void test1() {
		System.out.println("JAVA");
		return;	//호출시점으로 되돌아감
					//맨마지막 return은 생략할 수 있다
	}//test1() end
	
	public static void test2(int a) {	//a:parameter매개변수
		System.out.println(a);
		//return; 생략되어 있음
	}//test2() end
	
	public static void test3(int a, int b) {	//매개변수의 자료형이 같더라도
		System.out.println(a);					//생략 불가능
		System.out.println(b);
	}//test3() end
	
	public static void test4(double a) {
		System.out.println(a);
	}//test4() end
	
	public static void test5(char a) {
		System.out.println(a);
	}//test5() end
	
	public static void test6(String a) {
		System.out.println(a);
	}//test6() end
	
	public static void test7(int a, double b, char c, String d) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}//test7() end

	public static void main(String[] args) {
		// 메소드 연습
		// 함수(function, procedure)
		// 사용자 정의 메소드(user defined)
		// 메소드 작성 : 리턴값 유무
		//					parameter(매개변수) 유무
		// 리턴값이 없다 : void
		// 식별자	: 클래스명, 변수명, 메소드명
		// 함수정의, 함수호출
		
		// 1) parameter(매개변수)가 없는 경우
			// 전달값(argument value)이 없다
			// test1();
			// test1();
		
		// 2) parameter가 있는 경우
			// test2(30);	//30:전달값
			// test2(50);
			// test2(70);
		
		// 3) parameter가 2개 이상 있는 경우
			// test3(2, 4);
			// test3(7, 8);
			// test3(5, 6);
		
		// test4(5.6);			//double형
		// test5('R');			//character형
		// test6("HAPPY");	//String형
		
		test7(3, 4.5, 'B', "Hello");	//다양한 자료형 올 수 있다
		

	}//main() end
	
	//함수 작성 영역
	
}//class end