package oop1122;

import java.util.Arrays;

public class LottoTest {

	public static void main(String[] args) {
		// Math 수학관련클래스
		// System.out.println(Math.pow(2, 3));	//2^3 2의3승
		
		// 난수 발생 범위 : 0.0<= r <1.0
		// System.out.println(Math.random());
		// System.out.println((int)Math.random());
		// System.out.println((int)(Math.random()*2));	//0 1
		// System.out.println((int)(Math.random()*4));	//0 1 2 3
		
		// 문) 주사위 범위 1~6
		//System.out.println((int)(Math.random()*6)+1);	//123456
		
		// 문) 로또번호 1~45
		// System.out.println((int)(Math.random()*45)+1);	//(0~44)+1
		
		// 로또번호 : 1~45 사이중에서 서로 다른 수 6개로 조합
		/*
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		*/
		
		/*
		int[] lotto = new int[6];
		
		for(int idx=0; idx<6; idx++) {
			
			lotto[idx]=(int)(Math.random()*45)+1;
			for(int a=0; a<idx; a++) {
				if(lotto[a]==lotto[idx]) {
					lotto[idx]=(int)(Math.random()*45)+1;
				}else {
					
				}
			}
		
			System.out.print(lotto[idx]+" ");
		}		//*/
		
		// lotto
				int[] lotto = new int[6];
				
				for(int idx=0; idx<6; idx++) {
					lotto[idx]=(int)(Math.random()*45)+1;
					for(int a=0; a<idx; a++) {
						if(a>0) {
							for(;;) {	//무한루프
								if(lotto[a]==lotto[idx]) {
									lotto[idx]=(int)(Math.random()*45)+1;
								}else {break;}
							}
						}
					}
					
					//System.out.print(lotto[idx]+" ");
					
				}//for end
				//정렬 sort
				Arrays.sort(lotto);
				
				for(int a=0; a<6; a++) {
					System.out.println(lotto[a]);
				}

				
		/* 선생님
		int[] lotto = new int[6];
		int size=lotto.length;	//6
		
		for(int a=0; a<size; a++) {
			lotto[a]=(int)(Math.random()*45)+1;
			
			for(int b=0; b<a; b++) { //회전수증가
				if(lotto[a]==lotto[b]) {
					a--;
				}//if end
			}
		}//for end
		
		//정렬 sort
		Arrays.sort(lotto);
		
		for(int a=0; a<size; a++) {
			System.out.println(lotto[a]);
		}
		*/
		
		
		
		
		
		

	}//main() end
}//class end
