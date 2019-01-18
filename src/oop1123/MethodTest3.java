package oop1123;

public class MethodTest3 {
	
	//함수 작성 영역
	public static void abs(int a) {	//절대값
		if(a<0) {
			a=-a;
		}
		System.out.println(a);
	}//abs() end
	
	public static void fact(int a) {	//팩토리얼
		long gop=1;
		for(int fac=1; fac<=a; fac++) {
			gop=gop*fac;
		}//for end
		System.out.println(gop);
	}//fact(); end

	public static void leap(int a) {	//윤년
		if((a%4==0)&&(a%100!=0)||(a%400==0)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
	}//leap(2018) end
	
	public static void graph(char a, int b) {	//그래프
		for(int c=0; c<=b; c++) {
			System.out.print(a);
		}//for end
	}//graph('#', 10) end
	
	//선생님
	/*
	public static void abs(int a) {

		if(a<0) {
			System.out.println(-a);
		}else {
			System.out.println(a);
		}
	}//abs() end
	
	public static void fact(int a) {
		int gop=1;	//곱은 int형보다는 long형으로
		for(int f=a; f>=1; f--) {
			gop=gop*f;
		}
		System.out.println(gop);
	}//fact() end
	
	public static void leap(int y) {
		if((y%4==0)&&(y%100!=0)||(y%400==0)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
	}//leap() end
	
	public static void graph(char ch, int n) {
		for(int a=1; a<=n; a++) {
			System.out.print(ch);
		}
	}//graph() end
	*/
	
//---------------------------------------------------------------------------------
	public static void main(String[] args) {
		// 메소드 관련 연습문제
		
		// 문) 절대값을 구하시오
		abs(-3);
		
		// 문) 팩토리얼 값을 구하시오
		fact(4);
		
		// 문) 윤년, 평년을 구분해서 출력하시오
		leap(2018);
		
		// 문) 그래프를 출력하시오 ##########
		graph('#', 10);
	}//main() end
	//함수 작성 영역
}//class end