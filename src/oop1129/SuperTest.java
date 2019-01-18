package oop1129;

class School {
	String name = "학교";
	public School() {
		System.out.println("School()...");
	}
}//class end

class MiddleSchool extends School {
	String name = "중학교";	//자신의 멤버변수가 우선순위가 높다
	public MiddleSchool() {
		super();	//생략가능
		System.out.println("MiddleSchool()...");
	}
	
	public void disp() {
		String name = "자바중학교"; 		//일반 지역변수
		System.out.println(name);		//자바중학교
		System.out.println(this.name);	//중학교
		System.out.println(super.name);	//학교
	}
}//class end

//------------------------------------------------------------------
public class SuperTest {
	public static void main(String[] args) {
		// 부모 : super
		// super	: 자식클래스가 부모클래스 필드에 접글할 때
		// super()	: 자식클래스 생성자 함수가 부모클래서 생성자 함수 호출할 때
		// this		: 필드와 매개변수를 구분하기 위해서
		// this()	: 생성자 함수가 자신의 생성자 함수를 호출할 때
		
		
		//생성자함수 호출순서(부모→자식)
		//School() → MiddleSchool()
		MiddleSchool ms = new MiddleSchool();
		
		ms.disp();
		
	}//main() end
}//class end