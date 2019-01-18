package oop1116;

public class BitTest2 {

	public static void main(String[] args) {
		// bit 연산자
		// 비트곱 &, 비트합 |, 비트부정 ~
		
		System.out.println(5&3);	//1
		System.out.println(5|3);		//7
		System.out.println(~5);		//-6	1의 보수 값 구하는 것
		/*
			양수(unsigned 값), 음수(signed 값)
			5	→ 00000101
			-5	→ 컴퓨터가 음수를 표현하는 방식(자격증은 더 디테일하게)
					1) 1의 보수
					2) 2의 보수
					3) 부호와 절대치
						00000101	→ 5
						11111010	→ 1의 보수 방식
					  +		   1	→ 2의 보수 방식
		*/
		
		/* Shift 연산자
			left shift		<<	→ (대상값)*(2^n) (n:이동 bit수)
			right shift	>>	→ (대상값)/(2^n)
			16 	: 00010000
			<<3	: 10000000 → 128
			>>3	: 00000010 → 2
		*/
		System.out.println(16<<3);	//128 왼쪽으로 3칸 이동 = 16*2^3
		System.out.println(16>>3);	//2								16/2^3
		
	}//main() end
}//class end
