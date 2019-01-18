package oop1119;

public class ForTest4 {

	public static void main(String[] args) {
		// 이중 반복문
		/* for문 횟수 제한 없이 여러번 중복될 수 있다
		for() {
			for() {}
		}
		*/
		/*
		for(int a=1; a<=2; a++) {
			System.out.println("JAVA");
			for(int b=1; b<=3; b++) {
				System.out.println("JSP");
			}
		}//for end
		*/
		
		for(int a=2; a<=9; a++) {
			System.out.println(a+"단");
			for(int b=1; b<=9; b++) {
				System.out.println(a+"*"+b+"="+(a*b));
			}
		}//for end
		
	}//main() end
}//class end