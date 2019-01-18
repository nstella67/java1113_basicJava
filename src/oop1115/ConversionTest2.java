package oop1115;

public class ConversionTest2 {

	public static void main(String[] args) {
		// 형변환
		/* 정수형 int, 문자형 char	서로 형변환 가능하다
		System.out.println(65);	
		System.out.println((char)65);			//'A'
		System.out.println((char)66);			//'B'
		System.out.println((char)67);			//'C'
		System.out.println((char)6700);		//? 안나옴. 범위가 정해져있다
		
		System.out.println(97);
		System.out.println((char)97);			//'a'
		System.out.println((char)98);			//'b'
		System.out.println((char)99);			//'c'
		
		System.out.println('A'<'a');				//true
		
		System.out.println('A');	
		System.out.println((int)'A');				//65
			
		System.out.println('a');	
		System.out.println((int)'a');				//97
		*/
		
		/* ASCII 코드값, 문자
		// 한글을 제외한 키보드 모든 키의 ASCII 코드값이 정해져있다
		System.out.println((int)'+');
		System.out.println((char)43);
		
		System.out.println((int)'\r');			//엔터
		System.out.println((char)13);
		
		System.out.println((int)' ');				//공백
		System.out.println("#"+(char)32+"#");
		
		System.out.println('A'+1);				//66
		System.out.println((int)('A'+1));		//66
		System.out.println((char)('A'+1));	//B
		
		System.out.println((int)('a'+1));		//98
		System.out.println((char)('a'+1));		//b
		
		System.out.println((int)('a'-'A'));		//32
		System.out.println("#"+(char)('a'-'A')+"#");		//# #
		*/
		// 문) 대소문자를 서로 바꾸어서 출력하시오
		char ch1 = 'M', ch2 = 'n';
		System.out.println((char)(ch1 + 32));
		System.out.println((char)(ch2 - 32));
		
		// 문) 계산기
		int a = 3, b = 5;
		char op = '+';		
		// 출력결과 : 3+5=8 나오게
		System.out.println(a + op + b + "=" + (a+b));			//51=8
							 // 3 + '+' + 5
							 // 3 + 43 + 5
							 // 51					  = 8
		System.out.println(a+""+op+""+b+"="+(a+b));			//""스트링오면 연결의 의미 강하다
		
				
	}//main() end
}//class end