package oop1121;

public class MathTest {

	public static void main(String[] args) {
		// Math 수학관련 클래스
		/*
		// 절대값
		System.out.println(Math.abs(-3));
		System.out.println(Math.abs(5));
		
		// 큰값
		System.out.println(Math.max(2, 4));
		
		// 작은값
		System.out.println(Math.min(2, 4));
		
		// 함수 안에 함수 중복으로 쓸 수 있다
		System.out.println(Math.max(7, Math.max(8, 9)));
		
		System.out.println(Math.ceil(1.3));		//2.0 올림
		System.out.println(Math.floor(2.7));	//2.0 버림
		System.out.println(Math.round(3.8));	//4   반올림
		
		System.out.println(Math.PI);
		*/
//-----------------------------------------------------------------------------------
		// 난수, random값 : 시스템이 발생시킨 수
		// 난수 발생 범위 : 0.0<= r <1.0
		
		System.out.println(Math.random());
		System.out.println(Math.random()*2);	//0.0<=r<2.0
		System.out.println((int)(Math.random()*2));	//소숫점버리기 0 1
		System.out.println((int)(Math.random()*3));	//0 1 2
		System.out.println((int)(Math.random()*4)); //0 1 2 3
		
	}//main() end
}//class end