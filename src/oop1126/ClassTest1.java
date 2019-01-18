package oop1126;

class Sungjuk {	//package class Sungjuk → package생략. 쓰면 에러
	// 멤버변수(field, column, property 속성)
	//private String name;	//private : field에 많이 쓰임
	public String name;			//모두공개
	int kor, eng, mat;			//package접근제어 생략
									//현재패키지(oop1126package)내에서만 접근 가능
	private int aver;				//비공개
	
	// 멤버함수(method, function, procedure)
	void calc() {
		// 클래스 내부에서는 접근제어와 상관없이 모든 멤버들간에는 접근가능
		aver=(kor+eng+mat)/3;
	}//calc() end
	public void disp() {		//공개
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp() end
	
	private void test() {		//비공개
		
	}
}//class end

//-------------------------------------------------------------------------
public class ClassTest1 {

	public static void main(String[] args) {
		// class 클래스
		// 클래스 구성 : 멤버변수(field) + 멤버함수(method)
							//(변수만, 함수만 있을수도 있다)
		// (내부 클래스 : 클래스 안에 클래스 올 수 있다(나중에))
		/* Access Modifier(접근제어, 접근수정, Scope, 유효범위)
			1) private		: 비공개 (내부접근만 허용)
			2) package	: 현재 폴더에서만 공개/접근. 생략가능
			3) protected	: 다른 폴더에 있는 상속관계 클래스도 접근허용
			4) public		: 모두 공개
		*/
		
		// 주의사항!!
		// 한 개의 .java 소스파일에 여러 개의 클래스 정의가 가능(보통 한 개의 클래스만)
		// 이럴 경우 한 개의 클래스만 public 해야 한다
		
		// 클래스 : 사용자 정의 자료형
		// 자료형 : 기본형, 참조형(클래스)
		// 참조형 : 메모리 할당을 해야한다.
		// new 연산자 : 메모리 할당(확보) 연산자
		/*
		int a =3;	//a:변수
		Sungjuk sj = new Sungjuk();		//sj : 객체(Object. 변수가 아님)
							//Sungjuk() : 생성자함수
		sj.name = "홍길동";
		sj.kor = 50;
		sj.eng = 60;
		sj.mat = 70;
		//sj.aver	//에러. not visible. private속성은 클래스 내부에서만 접근 가능
		
		System.out.println(sj.name);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.mat);
		
		System.out.println(Integer.SIZE);	//32
		System.out.println(Math.PI);		//3.1415..
	
		sj.calc();
		sj.disp();
		//sj.test; 에러. private 속성은 접근안됨
		*/
		
		//Object Oriented Program 객체 지향 프로그램
		Sungjuk kim  = null;	//객체 이름만 선언. 내용이 없다
									// 메모리가 할당되어 있지 않다
									// 객체 초기화할때 사용
		
		//sj = null;	//기존에 잡고 있던 메모리 다 삭제
		//int a = null; 에러 변수 초기화에는 null 쓸 수 없다
		kim = new Sungjuk();	//생성자함수
		//메모리를 확보하려면 생성자함수가 꼭 와야한다
		kim.name = "무궁화";
		kim.kor=10;
		kim.eng=20;
		kim.mat=30;
		//kim.aver 에러 not visible
		
		kim.calc();
		kim.disp();
		
		Sungjuk lee = null;	//메모리없다
		//lee.disp();	//NellPointerException
		

	}//main() end
}//class end