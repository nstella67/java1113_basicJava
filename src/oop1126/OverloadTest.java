package oop1126;

public class OverloadTest {
	public static void print(int a) {
		System.out.println(a);
	}//print() end
	
	public static void print(double a) {		//함수이름 동일
		System.out.println(a);
	}//print() end
	
	public static void print(String a) {
		System.out.println(a);
	}//print() end
	
	public static void print(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}//print() end
	
	public static void print(double a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}//print() end
	
	public static void print(double a, double b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}//print() end
	
	public static void print(String a, String b) {
		System.out.println(a+b);
	}//print() end
	
	/* 에러. 함수의 리턴형은 오버로딩의 대상이 아니다00
	public static String print(String a, String b) {}//print() end
	*/
	
	public static void main(String[] args) {
		// method overloading 메소드 오버로딩(중복정의)
		// → 함수이름을 중복해서 사용할 수 있다
		// → 전제조건 : 매개변수의 자료형이 달라야 한다
		//				   or 매개변수의 갯수가 달라야 한다
		//		return형은 다르면 에러
		// 중복재정의 : overriding 상속관계
		
		print(3);		//자동으로 정수형 찾는다
		print(2.4);		//
		print("HAPPY");
		
		print(5, 7);
		print(2.1, 5);
		print(1.2, 3.4);
		print("Hello", "World");
	}//main() end
}//class end