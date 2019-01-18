package oop1130;

interface Parent {
	//void disp() {} 에러. 일반메소드는 interface에서 사용 불가
	abstract void kind();	//추상메소드
	void breathe();	//abstract 생략가능
}//interface end

class Son implements Parent {	//구현
	@Override
	public void kind() {
		System.out.println("아들");
	}
	@Override
		public void breathe() {
			System.out.println("허파 숨쉬기1");
		}
}//class end

class Daughter implements Parent {
	@Override
	public void kind() {
		System.out.println("딸");
	}

	@Override
	public void breathe() {
		System.out.println("허파 숨쉬기2");
	}	//구현
	
}//class end

//-----------------------------------------------------------
public class InterfaceTest {
	public static void main(String[] args) {
		// interface : 추상메소드로만 구성되어 있다
		// interface는 객체생성 불가
		// interface에서도 다형성이 가능하다
		// 추상클래스보다 더 추상화 되어 있다
		// 클래스입장에서 부모가 클래스	 : extends
		//					 인터페이스 : implements구현
		
		//Parent parent = new Parent(); 에러. 객체생성불가
		
		Son son = new Son();
		son.kind();
		son.breathe();
		
		Daughter daugh = new Daughter();
		daugh.kind();
		daugh.breathe();
		
		// 다형성
		Parent parent = new Son();
		parent.kind();
		parent.breathe();
		
		parent = new Daughter();
		parent.kind();
		parent.breathe();

	}//main() end
}//class end
