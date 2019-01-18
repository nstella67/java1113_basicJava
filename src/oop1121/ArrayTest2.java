package oop1121;

public class ArrayTest2 {

	public static void main(String[] args) {
		// Array 배열
		// element 요소, index 색인(순서)
		// index는 0부터 시작, 1씩 증가
		// 1차원 배열 → [열/칸/column]
		// 2차원 배열 → [행/줄/row][열]
		// 3차원 배열 → [면][행][열]자바에는 없음(class사용)
		
		/* 1) 1차원 배열
		int[] kor = new int[3];
		kor[3] = 50;	//ArrayIndexOutOfBoundsException 예외
		
		double[] eng = new double[3];
		char[] ch = new char[5];
		long[] mat = new long[3];
		String[] name = new String[4];		*/
//----------------------------------------------------------------------		
		/*
		int[] kor = {10, 20, 30};// 메모리 할당 + 초기값 대입
		int size=kor.length;	//배열 요소의 갯수
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		for(int idx=0; idx<size; idx++) {
			System.out.println(kor[idx]);
		}				*/
//----------------------------------------------------------------------
		/*
		double[] aver = {1.2, 4.6, 5.3};
		int size= aver.length;
		for(int idx=0; idx<size; idx++) {
			System.out.println(aver[idx]);
		}				*/
//----------------------------------------------------------------------
		/*
		String[] name= {"홍길동", "무궁화", "라일락"};
		int size=name.length;
		for(int idx=0; idx<size; idx++) {
			System.out.println(name[idx]);
		}				*/
//----------------------------------------------------------------------
		char[] ch= {'H', 'a', 'p', 'p', 'y'};
		int size=ch.length;
		for(int idx=0; idx<size; idx++) {
			System.out.println(ch[idx]);
		}
		
		// 문1) 알파벳 'p'의 갯수를 구하시오
		int count=0;
		
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]=='p') {count++;}
		}
		System.out.println("알파벳 p의 갯수 : "+count);
		/* 선생님
		int count=0;
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]=='p') {
				count++;
			}
		}//for end
		System.out.println("'p'갯수 : "+count);		*/
		
		
		// 문2) 대문자, 소문자의 갯수를 각각 구하시오
		int countA=0, counta=0;
		
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]>='a'&&ch[idx]<='z') {
				counta++;
			}
			else {
				countA++;
			}
		}
		System.out.println("대문자:"+countA);
		System.out.println("소문자:"+counta);
		/* 선생님
		int upper=0, lower=0;
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]>='A' && ch[idx]<='Z') {
				upper++;
			}
			if(ch[idx]>='a' && ch[idx]<='z') {
				lower++;
			}
		}//for end
		System.out.println("대문자 갯수:"+upper);
		System.out.println("소문자 갯수:"+lower);		*/
		
		
		// 문3) 대소문자 서로 바꿔서 출력하시오 → hAPPY
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]>='a'&&ch[idx]<='z') {
				ch[idx]=(char)(ch[idx]-32);
			}
			else {
				ch[idx]=(char)(ch[idx]+32);
			}
		}
		for(int idx=0; idx<size; idx++) {
			System.out.print(ch[idx]);
		}
		System.out.println();
		/* 선생님
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]>='A' && ch[idx]<='Z') {
				System.out.println((char)(ch[idx]+32));
			}
			if(ch[idx]>='a' && ch[idx]<='z') {
				System.out.println((char)(ch[idx]-32));
			}
		}//for end					*/
		
		
		// 문4) 모음(a,e,i,o,u)의 갯수를 구하시오
		char[] m= {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		int sizem=m.length;
		int countM=0;
		
		for(int idx=0; idx<size; idx++) {
			for(int idxm=0; idxm<sizem; idxm++) {
				if(ch[idx]==m[idxm]) {
					countM++;
				}
			}
		}
		System.out.println("모음의 갯수 : "+countM);
		/* 선생님
		int mo=0;
		for(int idx=0; idx<size; idx++) {
			switch(ch[idx]) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': mo++;
			}
		}//for end
		System.out.println("모음의 갯수:"+mo);
		
		mo=0;
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]=='a' || ch[idx]=='e' || ch[idx]=='i' || ch[idx]=='o' || ch[idx]=='u') {
				mo++;
			}
		}
		System.out.println("모음의 갯수:"+mo);		*/

	}//main() end
}//class end