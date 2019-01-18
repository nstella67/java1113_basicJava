package oop1119;

public class BreakTest {

	public static void main(String[] args) {
		// break 문		: 반복문 탈출
		// continue 문	: 반복문 계속
		
		for(int a=1; a<10; a++) {
			if(a==5) break;			//a==5일때 반복문 빠져나오라는 뜻.
			System.out.print(a);
		}//for end
		
		System.out.println();
		
		for(int a=1; a<10; a++) {
			if(a==5) continue;		//a==5일때 반복문으로 올라가라는 뜻.
			System.out.print(a);
		}//for end
		
	}//main() end
}//class end
