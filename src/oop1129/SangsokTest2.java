package oop1129;

class Fruit extends Object {
	public Fruit() {	//생성자함수는 리턴형 없다. 클래스명과 동일한 함수명
		System.out.println("Fruit()...");
	}
}//class end

class Apple extends Fruit {
	//부모생성자함수 호출하는 super() 생략되어 있음
	//super(); 생략. 써도 되고 안 써도 됨
	public Apple() {
		System.out.println("Apple()...");
	}

	@Override
	public String toString() {
		// 원본 : oop1129.Apple@7852e922
		return "Apple 클래스 객체 생성!!";
	}
}//class end

class PineApple extends Apple {
	//부모생성자함수 호출하는 super() 생략되어 있음
	//super(); 생략. 써도 되고 안 써도 됨
	public PineApple() {
		System.out.println("PineApple()...");
	}
	
	@Override
	public String toString() {	//보통 private 멤버 밖으로 노출시키는 용도로 사용/에러잡는용도로사용
		return "PineApple 객체";
	}
}//class end

//---------------------------------------------------------------
public class SangsokTest2 extends Object {
	public static void main(String[] args) {
		//클래스 상속관계에서의 생성자 호출 순서

		//상속관계에 있을 때 부모먼저
		//Fruit() → Apple()
		Apple apple = new Apple();
		
		System.out.println(apple.toString());
		System.out.println(apple);
		
		System.out.println("-----------------------");
		//Fruit() → Apple() → PineApple()
		PineApple pine = new PineApple();
		
		int a =3;
		System.out.println(a);
		
		System.out.println(pine);				//객체 드러냄 oop1129.PineApple@7852e922
		System.out.println(pine.hashCode());	//주소
		System.out.println(pine.toString());	//재구성
		
		
		
	}//main() end
}//class end