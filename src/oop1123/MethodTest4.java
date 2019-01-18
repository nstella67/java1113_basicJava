package oop1123;

public class MethodTest4 {
	
	//함수 작성 영역
	public static int test1(int a, int b) {
		int hap = a+b;
		return hap;	//hap:되돌아갈때 가지고 가는 값
		//리턴값은 오로지 1개만 올 수 있다
	}//test1() end
	
	public static double test2(double a, double b) {
		return a+b;	//9.0
	}//test2() end
	
	public static char test3(char ch) {
		return (char)(ch+32);
	}//test3() end
	
	public static String test4(String a, String b) {
		return a+b;	//"HelloWorld"
	}//test4() end
	
//---------------------------------------------------------------------------------
	public static void main(String[] args) {
		// 리턴값이 있는 경우(리턴형) → return+값
		// 리턴값이 없다 void
		
		int result = test1(3, 5);
		System.out.println(result);
		
		double sum = test2(3.4, 5.6);
		System.out.println(sum);
		
		System.out.println(test3('R'));
		
		String str = test4("Hello", "World");
		System.out.println(str);		
		
	}//main() end
	//함수 작성 영역
}//class end