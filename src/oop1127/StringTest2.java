package oop1127;

import java.util.StringTokenizer;	//util package 자동생성
//import java.util.*;

public class StringTest2 {

	public static void main(String[] args) {
		// String			: 간단한 문자열
		// StringBuffer	: 문자열에서 연산을 하는 경우 추천
		// StringBuilder	: 문자열에서 연산을 하는 경우 추천
		// 속도 : StringBuilder → StringBuffer → String
				//StringBuffer시간 / StringBuilder시간 검색
		
		String str = "";
		str = str + "one";
		str = str + "two";
		str = str + "three";
		System.out.println(str);				//onetwothree
		System.out.println(str.length());	//11
		
		str = "";	//초기화
		System.out.println(str.length());	//0
//--------------------------------------------------------------------------------
		StringBuilder sb = new StringBuilder("");
		sb.append("one");
		sb.append("two");
		sb.append("three");
		System.out.println(sb.toString());	//onetwothree
		System.out.println(sb.length());	//11
		sb.delete(0, sb.length());	//초기화
		System.out.println(sb.length());	//0
//-------------------StringBuilder/StringBuffer 거의 동일------------------
		StringBuffer sf = new StringBuffer();
		sf.append("one");
		sf.append("two");
		sf.append("three");
		System.out.println(sf.toString());	//onetwothree
		System.out.println(sf.length());		//11
		
		sf.delete(0, sf.length());	//초기화
		System.out.println(sf.length());	//0
//--------------------------------------------------------------------------------
		// 특정문자를 기준으로 문자열 분리할 때 split()비슷
		String name = "kim, lee, park";	// , 로 구분. "SPACE"썼다가 , 썼다가 하면 안되고 통일
		
		//StringTokenizer+엔터 → util package 자동생성
		
		//분리하고자 하는 기준 문자열의 default값 : 공백
		//StringTokenizer st = new StringTokenizer(name);		//공백 기준으로 split
		StringTokenizer st = new StringTokenizer(name, ", ");	//, 기준으로 split
		
		while(st.hasMoreTokens()) {	//, 기호가 있는지?
			String word = st.nextToken();	//실제데이터(분리된 값) 가져오기
			System.out.println(word);
		}//end
		
		String stw = "Gone With The Wind";
		StringTokenizer sw = new StringTokenizer(stw);
		while(sw.hasMoreTokens()) {
			String word = sw.nextToken();
			System.out.println(word);
		}//end

	}//main() end
}//class end