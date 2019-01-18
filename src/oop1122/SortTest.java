package oop1122;

public class SortTest {

	public static void main(String[] args) {
		// 정렬 sort
		/*
			* 정렬유형
				- 오름차순 ascending sort		ASC	기본
					1→10	A→Z	a→z
				- 내림차순 descending sort	DESC
				
			* 정렬방식
				- insertion sort	삽입정렬
				- selection sort	선택정렬
				- bubble sort				3개는공부
				- shell sort, quick sort ~~
		*/
		
		int[] su = {9, 7, 3, 5, 1};
		int size = su.length;		//5
		
		// selection sort 방식으로 오름차순 정렬
		for(int a=0; a<size-1; a++) {
			for(int b=a+1; b<size; b++) {
				if(su[a]>su[b]) {
					int temp = su[b];
					su[b]=su[a];
					su[a]=temp;
				}
			}
		}//for end
		for(int a=0; a<size; a++) {
			System.out.println(su[a]);
		}
		/* 선생님
		for(int a=0; a<=3; a++) {
			for(int b=a+1; b<=4; b++) {
				if(su[a]>=su[b]) {
					int temp = su[a];
					su[a]=su[b];
					su[b]=temp;
				}//swap
			}//기준
		}//for end
		for(int a=0; a<size; a++) {
			System.out.println(su[a]);
		}		//*/
		
		
		// 문) bubble sort 방식으로 내림차순으로 정렬하시오
		// 분석 과제
		for(int a=3; a>=0; a--) {
			for(int b=0; b<=a; b++) {
				if(su[b]<su[b+1]) {	//내림차순
					int tmp=su[b+1];
					su[b+1]=su[b];
					su[b]=tmp;
				}
			}
		}//for end
		
		for(int a=0; a<=4; a++) {
			System.out.println(su[a]);
		}//for end
		
		

	}//main() end
}//class end
