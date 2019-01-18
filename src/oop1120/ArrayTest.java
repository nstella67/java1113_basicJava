package oop1120;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 Array : 동일한 자료형의 집합
		// index 색인 : 맨 처음을 0번째, 그 다음 인덱스는 1씩 증가
		// element 요소
		// new 메모리 할당 연산자
		
		/*
		int[] kor = new int[3];		//4byte * 3개 = 12byte 할당
		kor[0]=10;
		kor[1]=20;
		kor[2]=30;
		
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		for(int idx=0; idx<=2; idx++) {
			System.out.println(kor[idx]);
		}
		
		//int a=3;  //a. 에러
		//kor 배열 요소의 갯수 .length
		System.out.println(kor.length);	//kor. 목록	//3
		for(int idx=0; idx<kor.length; idx++) {
			System.out.println(kor[idx]);
		}
		*/
//----------------------------------------------------------------------------------
		int[] kor = {10, 20, 30};
		int size=kor.length;
		
		for(int idx=0; idx<size; idx++) {
			System.out.println(kor[idx]);
		}

	}//main() end
}//class end