package oop1122;

public class MethodTest {
	
	public static void test() {	//test()함수정의
		System.out.println("JAVA");
		return;	// 호출한 곳으로 되돌아 감 (리턴값없음)
	}//test() end
	
	public static void test2() {	//test2함수
		
		test();		// 함수는 서로 부를 수 있다. 꼭 main에서 안해도됨
		//test2();	//자신의 함수 호출 가능(재귀적 함수호출)
		//함수는 서로 호출관계
		//main(); 에러. main함수는 사용자가 호출불가. JVM이 호출
		
		
		System.out.println("JSP");
		// return; 마지막 return은 생략가능. 
				 // 마지막엔 되돌아가는 속성이 있다. 중간은 안됨
	}//test2() end

	public static void main(String[] args) {	//main함수
		// 메소드 method★★★★★
		// 함수(function, procedure, 기능)
		// 메소드명 : 한글 불가능, 첫글자 숫자 불가능, 의미부여
		// 식별자 : 클래스명, 변수명, 메소드명
		
		// 메소드 : 1) parameter(argument value 전달값) 유무
		//			 2) 리턴값의 유무
		//				리턴값이 없다 → void
		// main 함수 아닌곳에
		
		// 형식 : 리턴형 메소드명() {}
			// test		: 변수명
			// test()	: 메소드
		
		// 함수정의, 함수호출(main함수는 호출할 수 없다)
//------------------------------------------------------------------------------
		test();		// 함수호출
		
		test();		// 여러번 호출 가능
		
		test();
		//test98();	//에러, 만들지 않은 함수 호출 불가능
		
		test2();

	}//main() end
}//class end