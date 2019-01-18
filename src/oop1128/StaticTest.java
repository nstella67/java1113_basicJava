package oop1128;

import java.math.MathContext;

class Sawon {
	String sabun;
	String buseo;
	int pay;
	public static String COMPANY = "(주)솔데스크";	//static 변수
	public static double TAX = 0.03;
	public static int Sudang = 10;
}//class end

class Write {
	public static void line() {	//static 함수
		System.out.println("--------------------------------------------");
	}
}//class end

//-------------------------------------------------------------------------------------------------------------
public class StaticTest {

	public static void main(String[] args) {
		// static
		// static 함수
		// static : 클래스명으로 직접 접근가능하다
			/*		클래스명.변수
		          	클래스명.함수()		*/
		
		//static변수
		System.out.println(Math.PI);
		System.out.println(Math.E);
		//static 함수
		System.out.println(Math.abs(-3));
		System.out.println(Math.min(5, 7));
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.parseInt("123"));
		
		System.out.println(Character.toUpperCase('r'));
		System.out.println(String.valueOf(5));
		
		// static → 접근, 연산, 접근법은 object로도 class로도 접근 가능하지만 class로 접근하는 걸 추천
		// static → 메모리 할당 1번, 소멸도 1번
		// static 변수의 연산은 continue된다
		Sawon kim = new Sawon();
		System.out.println(kim.COMPANY);
		System.out.println(kim.TAX);
		
		Sawon lee = new Sawon();
		System.out.println(lee.COMPANY);
		System.out.println(lee.TAX);
		
		System.out.println(Sawon.COMPANY);
		System.out.println(Sawon.TAX);
		
		// Math ma = new Math();
		// System.out.println(ma.PI);
		// System.out.println(Math.PI);
		
		Write.line();
		
		//static 	: 메모리 주소가 공유되기 때문에 할당도 1번, 소멸도 1번
		
		kim.Sudang = kim.Sudang + 1;
		System.out.println(kim.Sudang);	//11
		
		lee.Sudang = lee.Sudang + 1;
		System.out.println(lee.Sudang);		//12
		
		Sawon.Sudang = Sawon.Sudang + 1;
		System.out.println(Sawon.Sudang);//13
		System.out.println(kim.Sudang);//13
		System.out.println(lee.Sudang);//13
		

	}//main() end
}//class end