package oop1114;

public class SungjukTest {

	public static void main(String[] args) {
		// 성적프로그램
		String name = "홍길동";
		int kor = 80, eng = 90, mat =95;
		
		// 평균 구하기
		double aver = (kor+eng+mat)/3;//88.3333333인데 88.0나옴
												//형변환 해야함
		
		// 학점
		char grade = 'B';
		
		// 출력
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("평균 : "+aver);
		System.out.println("학점 : "+grade);
		
		// 형변환 Datatype Conversion
		// 1) 자동형 변환 : byte < short < int < long
		//					   float <double
		//					   정수형<실수형
		// 2) 강제형 변환(cast 연산자) : 필요한 곳에서 일시적 사용

	}//main ()end
}//class end