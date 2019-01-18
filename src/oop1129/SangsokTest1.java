package oop1129;

//final class AA() {} → final 클래스(종단클래스)는 상속시킬 수 없다
class AA {
	private void zero() {	//private은 상속안됨
		System.out.println("zero()...");
	}
	public void one() {
		System.out.println("one()...");
	}
	public void two() {
		System.out.println("two()...");
	}
}//class end

class BB extends AA {	//AA 클래스 상속
	public void three() {
		System.out.println("three()...");
	}
}//class end

class CC extends AA {
	public void four() {
		System.out.println("four()...");
	}
}//class end

class DD extends CC {
	public void five() {
		System.out.println("five()...");
	}
}

class EE {}//class end

//class FF extends DD, EE {} → 클래스를 두개를 상속 : 다중상속 . 에러. 클래스는 단일상속만 가능

//---------------------------------------------------------------
public class SangsokTest1 {
	public static void main(String[] args) {
		// 상속 : 재활용
		// 클래스의 상속/(인터페이스, aspect의 상속)
		// 계층 구조가 같은 것들끼리 서로 정보를 주고 받을 수 있다
		// extends 상속, 확장
		// 계층구조 : 부모, 조상, super
		//		     자식, 후손, sub, 파생
		// super class 부모클래스
		// sub class   자식클래스(파생)
		
		AA aa = new AA();
		//aa.zero() → 에러. private 속성은 클래스 내부에서만 접근 가능
		aa.one();
		aa.two();
		
		BB bb = new BB();
		bb.three();
		bb.one();
		bb.two();
		//bb.zero(); 안보임. 접근 불가
//---------------------------------------------------------------
		CC cc = new CC();
		cc.four();
		cc.one();
		cc.two();
		
		DD dd = new DD();
		dd.five();
		dd.four();	//CC클래스
		dd.one();	//AA클래스
		dd.two();	//AA클래스
		
	}//main() end
}//class end