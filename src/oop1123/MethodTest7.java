package oop1123;

public class MethodTest7 {
	public static void test() {
		test();	//재귀함수
		//main();	//에러. main() 함수는 사용자가 호출 불가능
		//			  JVM이 클래스를 실행할 때 자동 호출된다
	}//test() end
	
	public static int fact(int a) {
		if(a==0) {
			return 1;
		}else {
			return a*fact(a-1);
		}
	}//fact() end

	public static void main(String[] args) {
		// 재귀적 함수 호출
		// 자신이 자신의 함수 호출
		
		int result = fact(4);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end