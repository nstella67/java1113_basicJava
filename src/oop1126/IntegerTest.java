package oop1126;

public class IntegerTest {

	public static void main(String[] args) {
		// Integer 클래스
		System.out.println(Integer.toBinaryString(13));	//"1101"
		System.out.println(Integer.toOctalString(13));	//"15"
		System.out.println(Integer.toHexString(13));		//"d"
		
		System.out.println(Integer.max(3, 5));				//5
		System.out.println(Math.max(3, 5));				//5
		
		System.out.println(Integer.sum(3, 5));				//8
		
		//"3" → 숫자가 아님
		System.out.println(3);			//3
		System.out.println("3");			//"3"
		System.out.println(3+5);		//8
		System.out.println("3"+5);		//"35"
		//System.out.println("3"+5+6);	//"356"
		System.out.println(3+"5");		//"35"
		System.out.println("3"+"5");	//"35"
		System.out.println("3+5");		//"3+5"
		
		// "3" → 3 숫자로 형변환
		System.out.println(Integer.parseInt("3")+5);		//8
		//에러.System.out.println((int)"3"); 참조형과 기본형은 서로 형변환x
		
		System.out.println(Integer.parseInt("3")+(Integer.parseInt("5")));
		//System.out.println(Integer.parseInt("kdfd")+5); 에러. ""안에 숫자
		
	}//main() end
}//class end