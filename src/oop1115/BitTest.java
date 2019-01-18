package oop1115;

public class BitTest {

	public static void main(String[] args) {
		// bit 연산자
		// 하드웨어 제어용으로 많이 쓰임. 자바에서는 잘 안쓰임. C에서 많이 쓰임
		// 정보처리기사는 이론으로 더 공부해야 함
		// 비트곱		&
		// 비트합		|
		// 비트부정		~
		/*
			512 256 128 64 32 16 8 4 2 1
										 1 0 1 → 5
										 1 1 1 → 7
									   1 1 0 1 → 13
								1  0  0 0 1 1 → 35
			5 → 00000101
			3 → 00000011
			   & 00000001 → 1
				|  00000111 → 7
		*/
		System.out.println(5&3);	//1
		System.out.println(5|3);		//7
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
