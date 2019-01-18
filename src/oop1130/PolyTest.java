package oop1130;

class School {
	public String name = "학교";
	public String addr = "주소";
	
	public School() {}
	public School(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}
}//class end

class HighSchool extends School {
	public HighSchool() {}
	public HighSchool(String n, String a) {
		//super.name = n;
		//super.addr = a;
		super(n, a);	//동일한 표현
	}
}//class end

class MiddleSchool extends School {
	String friend = "손흥민";
	
	public MiddleSchool() {}
	public MiddleSchool(String name, String addr) {
		super(name, addr);
	}
}//class end

//----------------------------------------------------
public class PolyTest {
	public static void main(String[] args) {
		// Polymorphism 다형 : 형태가 여러가지
		// 부모 관점에서
		// 클래스(객체) 간의 형변환
		// static : 빨리 접근할 수 있다(클래스명.~~)
		//			연산이 continue 된다(주소 공유)
		
		// (클래스/인터페이스)상속관계에서의 다형성
		
		/*
		School sch = new School();
		sch.disp();
		
		HighSchool hs = new HighSchool("자바고등학교", "관철동");
		hs.disp();
		
		MiddleSchool ms = new MiddleSchool("자바중학교", "인사동");
		ms.disp();
		*/
//----------------------------------------------------------------------
		//1) 자식클래스가 부모클래스에 대입할 수 있다
		/*
		School sch = new HighSchool("자바고등학교", "관철동");
		sch.disp();
		
		sch = new MiddleSchool("자바중학교","인사동");
		sch.disp();
		
		System.out.println(sch.name);
		System.out.println(sch.addr);
		//System.out.println(sch.friend); 에러
		// sch.friend 다형성의 대상이 아니다
		*/
		
		//2) 부모클래스도 자식클래스에 대입할 수 있다
		//	(단, 자식클래스의 모양으로 변환해야 한다)
		/*
		School school = new School();
		HighSchool hs = new HighSchool();
		MiddleSchool ms = new MiddleSchool();
		
		int a = (int)3.4;
		school = (School)hs;
		school = hs;	//다형성.
		school = (School)ms;
		school = ms;
		
		//hs = school;	//에러. 자료형이 다르다
		//hs = (HighSchool)school; Exception발생
		
		*/
//----------------------------------------------------------------------------
		// 자바클래스 최고 조상 : Object
		// 자바의 모든 클래스는 Object클래스의 후손이다
		// 자바의 모든 클래스는 Object클래스에 대입가능하다
		// 다형성
		Object obj = new School();
		obj = new HighSchool();
		obj = new MiddleSchool();
		

	}//main() end
}//class end
