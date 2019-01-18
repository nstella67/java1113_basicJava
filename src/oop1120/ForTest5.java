package oop1120;

public class ForTest5 {

	public static void main(String[] args) {
		// 이중 반복문
		/* for() {
				for() {
				}
			}              */
		/*
		int a=0, b=0;
		for(a=1; a<=2; a++) {
			System.out.println("JAVA");
			for(b=1; b<=3; b++) {
				System.out.println("JSP");
			}
		}//for end
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);	//7
		*/
		
//---------------------------------------------------------------------------------
		/* 문1) 2단~9단 출력
		int a=0, b=0;
		for(a=2; a<=9; a++) {
			System.out.println("**"+a+"단**");
			for(b=1; b<=9; b++) {
				System.out.println(a+"*"+b+"="+(a*b));
			}
		}																	*/
		
		
		/*사각형패턴
		 	****
		 	****
		 	****
		 	****
		*/
		int a=0, b=0;
		for(a=1; a<=4; a++) {
			for(b=1; b<=4; b++) {
				System.out.print("*");
			}
			System.out.println();		//줄바꿈
		}//for end										
		
//------------------------------------------------------------		
		/* 문2)
			@###
			#@##
			##@#
			###@
			
			int a=0, b=0;
			for(a=1; a<=4; a++) {
				for(b=1; b<=4; b++) {
					if(a==b) {
						System.out.print("@");
					}else {
						System.out.print("#");
					}
				}
				System.out.println();
			}
		*/
		
//----------------------------------------------------------------		
		/*
			문3)
			12345
			23456
			34567
			45678
			56789
			
			for(a=1; a<=5; a++) {
				for(b=1; b<=5; b++) {
					if(a==1) {
						System.out.print(b);
					}else {
						System.out.print(a+b-1);
					}
				}
				System.out.println();
			}
		*/
		
		/* 선생님이 한 것
		int a=0, b=0;
		for(a=1; a<=5; a++) {
			for(b=a; b<=a+4; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		*/
		
		for(a=1; a<=4; a++) {
			for(b=1; b<=4; b++) {
				if(a<=b) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}		// 얘도 사각형패턴
		
		
		

	}//main() end
}//class end