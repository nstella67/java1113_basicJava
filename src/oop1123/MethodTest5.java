package oop1123;

public class MethodTest5 {
	
	public static void test1(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}//test1() end
	
	public static void test2(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}//test2() end
	
	public static void test3(double a, double b) {
		System.out.println(a);
		System.out.println(b);
	}//test3() end
	
	public static void test4(char a, char b) {
		System.out.println(a);
		System.out.println(b);
	}//test4() end
	
	public static void test5(String[] a) {	//변수명 아무거나 상관없다
		for(int idx=0; idx<a.length; idx++) {
			System.out.println(a[idx]);
		}
	}//test5() end
	public static void test6(int[] a) {
		for(int idx=0; idx<a.length; idx++) {
			System.out.println(a[idx]);
		}
	}//test6() end
	public static void test7(double[] a) {
		for(int idx=0; idx<a.length; idx++) {
			System.out.println(a[idx]);
		}
	}//test7() end
	public static void test8(char[] a) {
		for(int idx=0; idx<a.length; idx++) {
			System.out.println(a[idx]);
		}
	}//test8() end
	
	public static void test9(char a, char b) {
		System.out.println(a);
		System.out.println(b);
	};//test9() end
	public static void test10(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	};//test10() end
	public static void test11(char[][] a) {
		int row = a.length;
		int col = a[0].length;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println(a[i][j]);
			}
		}//for end
	};//test11() end
	public static void test12(int[][] a) {
		int row = a.length;
		int col = a[0].length;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println(a[i][j]);
			}
		}//for end
	};//test12() end
	
	
	public static void main(String[] args) {
		// 전달값이 배열인 경우
		String[]  name = {"홍길동", "무궁화", "라일락"};
		int[]	   kor   = {10, 30, 50};
		double[] aver  = {1.2, 3.4, 5.6};
		char[]	   word = {'S', 'K', 'Y'};
		
		// 함수 호출 방식
		//	1) Call By Value		(값에 의한 호출)
		//	2) Call By Reference(참조에 의한 호출)
		
		//Call By Value 방식
		test1(name[0], name[2]);	//"홍길동", "라일락"
		test2(kor[0], kor[2]);			//10, 50
		test3(aver[0], aver[2]);		//12, 5.6
		test4(word[0], word[2]);		//'S', 'Y'
		
		//Call By Reference 방식
		test5(name);
		test6(kor);
		test7(aver);
		test8(word);		//*/
//----------------------------------------------------------------------------------
		char[][] ch = { {'H', 'E', 'L', 'L', 'O'},
						  {'H', 'A', 'P', 'P', 'Y'}
		};
		
		int[][] su = { {10, 20, 30},
						{40, 50, 60}
		};
		
		test9(ch[0][0], ch[1][4]);		//'H', 'Y' call by value
		test10(su[0][0], su[1][2])	;	//10, 60 call by value
		test11(ch);	//call by reference
		test12(su);	//call by reference

	}//main() end
}//class end