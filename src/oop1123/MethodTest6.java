package oop1123;

public class MethodTest6 {

	public static int abs(int a) {	//절대값
		if(a<0) {
			a=-a;		//return -a;
		}else if(a>=0) {
			a=a;		//return a;
		}
		return a;
	}//abs() end
	
	public static int max(int a, int b, int c) {
		int max=a;
		if(max>=b) {
			max=max;
		}else {
			max=b;
		}
		if(max>=c) {
			max=max;
		}else {
			max=c;
		}
		return max;
		
		/* 선생님
			int m=(a<b) ? b : a;
			m = (m<c) ? c : m;
			return m;
		*/
		
	}//max() end
	
	public static boolean leap(int y) {	//윤년
		boolean tf=false;
		if((y%4==0)&&(y%100!=0)||(y%400==0)) {
			tf=true;
		}
		return tf;
		
		/* 선생님
			if((y%4==0)&&(y%100!=0)||(y%400==0)) {
				return true;
			}else{
				return false;
			}
		*/
	}//leap() end
	
	public static boolean isUpper(char a) {	//대문자?
		boolean flag=false;
		if(a>='A' && a<='Z') {
			flag=true;
		}
		return flag;
		
		/* 선생님
			if(a>='A' && a<='Z') {
				return true;
			}else{
				return false;
			}
		*/
	}//isUpper() end
	public static boolean isLower(char a) {	//소문자?
		boolean isL=false;
		if(a>='a' && a<='z') {
			isL=true;
		}
		return isL;
		
		/* 선생님
		if(a>='a' && a<='z') {
			return true;
		}else{
			return false;
		}
		*/
	}//isLower() end
	
	public static char toUpper(char ch) {	//대문자로바꿔라
		if(ch>='a' && ch<='z') {
			ch=(char)(ch-32);
		}
		return ch;
		/* 선생님
			return (char)(ch-32);
		*/
	}//toUpper() end
	public static char toLower(char ch) {	//소문자로바꿔라
		if(ch>='A' && ch<='Z') {
			ch=(char)(ch+32);
		}
		return ch;
		/* 선생님
		return (char)(ch+32);
		 */
	}//toLower() end
	
	public static String toBinary(int a) {		//2진수
		/* 내
		int isB=00000000;
		if(a%128==1) {
			isB=isB+10000000;
		}
		if(a%64==1) {
			isB=isB+1000000;
		}
		if(a%32==1) {
			isB=isB+100000;
		}
		if(a%16==1) {
			isB=isB+10000;
		}
		if(a%8==1) {
			isB=isB+1000;
		}
		if(a%4==1) {
			isB=isB+100;
		}
		if(a%2==1) {
			isB=isB+10;
		}
		String B=""+isB;
		return B;	//*/
		
		// 선생님
			int[] binary = new int[8];
			int idx=0;
			while(true){
				binary[idx]=a%2;
				a=a/2;
				if(a==1) {
					idx++;
					binary[idx]=a;
					break;
				}
				idx++;
			}//while end
			
			String str="";
			for(int i=idx; i>=0; i--) {
				str=str+binary[i];
			}//for end
			
			return str;
		//*/
	}//toBinary() end
	
	public static void main(String[] args) {
		// 메소드 연습
		/*
		System.out.println(Math.abs(-3));		//절대값
		System.out.println(Math.ceil(1.4));		//올림
		System.out.println(Math.max(3, 5));	//큰값
		
		System.out.println(Character.isLowerCase('r'));
		System.out.println(Character.isUpperCase('R'));
		System.out.println(Character.isLowerCase('B'));
		System.out.println(Character.isUpperCase('a'));
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
		*/
		
		// is~	물어보는것 대부분 boolean형으로 return값이 되돌아온다
		// to~	대부분 뒤에 있는 값으로 바꾸라는 것
		// get~
		// set~
//-----------------------------------------------------------------------------------
		// 문) 절대값을 구하는 함수를 작성하시오
		int result = abs(-3);
		System.out.println(result);
		
		// 문) 세 개의 수 중에서 최대값을 출력하시오
		int m= max(3, 5, 7);
		System.out.println(m);
		
		// 문) 윤년의 갯수를 구하시오
		int count=0;
		for(int y=1; y<2018; y++) {
			if(leap(y)) {
				count++;
			}
		}//for end
		System.out.println(count);
		
		// 문) 대소문자 바꿔서 출력하시오
		char ch ='R';
		if(isUpper(ch)) {
			System.out.println(toLower(ch));
		}else if(isLower(ch)) {
			System.out.println(toUpper(ch));
		}else {
			System.out.println(ch);
		}

		// 문) 2진수로 바꿔서 출력하시오
		String str = toBinary(10);
		System.out.println(str);
	}//main() end
}//class end