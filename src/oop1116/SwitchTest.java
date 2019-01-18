package oop1116;

public class SwitchTest {

	public static void main(String[] args) {
		// switch~case문
		// break문 : 조건문을 빠져나갈 때
		// 값 : double, boolean은 사용할 수 없다
		// case 값의 목록은 반드시 순차적일 필요는 없다
		/*
			switch(값) {
			case 값1 : 처리식1; break;
			case 값2 : 처리식2; break;
			case 값3 : 처리식3; break;
			}
		*/
		/*
		switch(40) {
		case 10 : System.out.println("SEOUL"); break;
		case 20 : System.out.println("JEJU"); break;
		case 30 : System.out.println("BUSAN"); break;
		case <10 틀린표현
		case >= 3 틀린포현
		}
		*/
		/*
		switch(20) {
		case 10 : System.out.println("SEOUL"); break;
		case 20 : System.out.println("JEJU");
		case 30 : System.out.println("BUSAN"); break;
		default : System.out.println("etc"); //break는 써도 되고 안써도 됨
		}
		*/
		
		/*문) 국어 90이상A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
		int kor=100;
		switch(kor/10) {
		case 10	:	// break 없기 때문에 흘러가면 된다
		case 9	: System.out.println("국어:A"); break;
		case 8	: System.out.println("국어:B"); break;
		case 7	: System.out.println("국어:C"); break;
		case 6	: System.out.println("국어:D"); break;
		default	: System.out.println("국어:F");
		}
		*/
		
		/* 문) 
		int a=3, b=5;
		char op='/';
		
		switch(op) {
		case '+'	: System.out.println(a+b); break;
		case '-'	: System.out.println(a-b); break;
		case '*'	: System.out.println(a*b); break;
		case '/'	: System.out.println((double)a/b); break;
		case '%'	: System.out.println(a%b); break;
		}
		*/
		
		// 문) 성별, 나이
		int code=3;
		
		switch(code%2) {
		case 0 : System.out.println("여자"); break;
		case 1 : System.out.println("남자"); break;
		}
		
		// 나이 : 성별코드가 1, 2면 1900년대생
		//	 						3, 4면 2000년 이후 출생
		// 현재년도 - 태어난년도
		int myYear=15;	// 2018-2015
		
		switch(code) {
		case 1 :
		case 2 : System.out.println("나이:"+(2018-1900-myYear)); break;
		case 3 :
		case 4 : System.out.println("나이:"+(2018-2000-myYear)); break;
		}
		
		//선생님코딩
		int age=0;
		
		switch(code) {
		case 1 :
		case 2 : myYear = myYear+1900; break;
		case 3 :
		case 4 : myYear = myYear+2000; break;
		}
		
		age=2018-myYear;
		System.out.println("나이:"+age);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
