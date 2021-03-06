package oop1130;

abstract class Animal {		//추상클래스
	String name;
	void view() {}			//일반메소드
	abstract void disp();	//추상메소드
}//class end

class Elephant extends Animal {
	@Override
	void disp() {	//추상메소드가 불완전 하므로 재정의해준다
		System.out.println("점보...");
		
	}
}//class end

class Tuna extends Animal {	//추상클래스를 상속받으면
	@Override				//추상메소드를 반드시 재구성(override) 해야한다
	void disp() {
		System.out.println("니모...");
	}
}//class end
//-------------------------------------------------------
public class AbstractTest {
	public static void main(String[] args) {
		// abstract class 추상클래스
		// 추상클래스 = 일반메소드(method) + 추상메소드
		// 인터페이스 = 추상메소드로만 구성
		// 추상메소드 = 메소드의 body{} 없음 (불완전함)
		//			  메소드의 머릿말만 존재함
		
		// 추상클래스는 객체를 생성할 수 없다
		// 추상클래스로 직접 new 연사자를 사용할 수 없다
		// Animal ani = new Animal(); 에러
		
		// 추상클래스는 누군가의 부모역할만 할 수 있다(extends)
		
		Elephant jumbo = new Elephant();
		jumbo.disp();
		
		Tuna nemo = new Tuna();
		nemo.disp();
		
		//추상클래스에서의 다형성
		Animal ani = new Elephant();
		ani.disp();
		
		ani = new Tuna();
		ani.disp();
		
	}//main() end
}//class end
