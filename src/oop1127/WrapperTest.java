package oop1127;

import java.lang.*;	//자바의 기본 패키지. 생략가능

import javax.swing.plaf.synth.SynthSpinnerUI;

public class WrapperTest {

	public static void main(String[] args) {
		// Wrapper 클래스
		// 기본형 타입으 객체화할 수 있는 클래스들
		// boolean, byte, short, int, long, float, double, char	: 기본형
		// Boolean, Byte, Short, Integer, Long, Float, Double, Character
    		// : 참조형. 클래스
			// 기본형의 타입을 객체화 시켜주는 클래스 : Wrapper 클래스
		
		/*
		boolean flag = true;	//기본형
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("flase");
		
		//flag. 에러
		System.out.println(b1.toString());	//"true"
		System.out.println(b2.toString());	//"false"
		*/
		/*
		byte b = 1;
		Byte b1 = new Byte(b);
		Byte b2 = new Byte("5");
		System.out.println(b);						//1
		System.out.println(b1.longValue());		//1
		System.out.println(b2.doubleValue());		//5.0
		*/
		
		int i = 3;
		Integer i1 = new Integer(5);
		Integer i2 = new Integer("7");
		System.out.println(i);				//3
		System.out.println(i1.toString());	//"5"
		System.out.println(i2.byteValue());	//7
		
		//static : 클래스명.filed
				// 클래스명.method
		System.out.println(Integer.MAX_VALUE);	//표현가능 최대값
		System.out.println(Integer.SIZE);		//메모리 32byte
		System.out.println(Integer.parseInt("9"));	//"9"→9 : 문자열→상수값으로 형변환
		System.out.println(Integer.valueOf(5));	//5→new Integer(5) 참조형으로 바꿔줌
		
		/*
		double d = 1.2;
		Double d1 = new Double(3.4);
		Double d2 = new Double("5.6");
		//문)세 개의 실수형 값 중에서 정수만 모두 더하시오 1+3+5
		int hap = (int)d+d1.intValue()+d2.intValue();
		System.out.println(hap);	//9
		*/
		/*
		char c = 'R';
		Character c1 = new Character('B');
		System.out.println(c);
		System.out.println(c1.toString());	//B → "B"
		*/
		//static : 클래스명.field
				// 클래스명.method
		//method명 : 접두어 is~~
		//						 to~~
		//						 get~~
		//						 set~~
		System.out.println(Character.isWhitespace(' '));		//공백이냐
		System.out.println(Character.isDigit('8'));
		System.out.println(Character.isDigit('#'));
		System.out.println(Character.isUpperCase('R'));
		System.out.println(Character.isLowerCase('R'));
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		
		//문) 대소문자를 서로 바꿔서 술력하시로
			//(단, Character 클래스의 메소드를 이용하시오)
		char[] ch = {'H', 'a', 'p', 'p', 'y'};
		int size = ch.length;
		for(int idx=0; idx<size; idx++) {
			char c=ch[idx];
			if(Character.isUpperCase(c)) {
				System.out.println(Character.toLowerCase(c));
			}else if (Character.isLowerCase(c)) {
				System.out.println(Character.toUpperCase(c));
			}else {
				System.out.println(c);
			}
		}//for end
		
		
		
		
		
		
		

	}//main() end
}//class end