package oop1115;

public class ConversionTest {

	public static void main(String[] args) {
		// 형변환 Datatype Conversion
		/* 1) 자동형변환
			- 정수형 : byte < short < int < long
			- 실수형 : float < double
			- 정수형 < 실수형
			
			byte a=3;
			int b=a;
			long c=b;
			System.out.println(a);	//3
			System.out.println(b);	//3
			System.out.println(c);	//3
			a=c; a=b;		//에러
			
			//4정수, 4.0실수
			float d=4.5f;		//float d=4f; 에러아님
			double e=d;		//d=e; 에러
			System.out.println(d);
			System.out.println(e);
			
			int a=3;
			double b=a;		//에러아님
			System.out.println(a);	//3
			System.out.println(b);	//3.0
			
			System.out.println(5/3);		//1
			System.out.println(5/3.0);		//1.6666666666666667
			System.out.println(5.0/3);		//1.6666666666666667
			System.out.println(5.0/3.0);	//1.6666666666666667
		
			System.out.println(5/3f);		//1.6666666
		*/
		
		/* 2) 강제형변환(cast연산자) : 필요한 곳에 일시적
			형식 : (자료형)값
			
			System.out.println((int)3.5);				//3
			System.out.println((double)4);			//4.0
			System.out.println((int)3.6+(int)4.7);	//7
			System.out.println((int)(3.6+4.7));		//8
			
			성적프로그램 소숫점도 나오게하기
			int kor=80, eng=90, mat=75;
			double aver = (kor+eng+mat)/3;	//81.0
							// 245/3 =81.6666...=81  정수형/정수형=정수형
							// 정수형에 double 붙인 것 (double)81
			System.out.println(aver);				//81.0
			double aver = (kor+eng+mat)/3.0;
			System.out.println(aver);				//81.66666666666667
			double aver = (double)(kor+eng+mat)/3;	//(double)245/3 -> 245를 실수형으로
			System.out.println(aver);				//81.66666666666667
			double aver = (double)(kor+eng+mat)/3.0;
			System.out.println(aver);				//81.66666666666667
		*/
		
		
	}//main() end
}//class end