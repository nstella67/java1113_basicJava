package oop1120;

public class ForTest5 {

	public static void main(String[] args) {
		// ���� �ݺ���
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
		/* ��1) 2��~9�� ���
		int a=0, b=0;
		for(a=2; a<=9; a++) {
			System.out.println("**"+a+"��**");
			for(b=1; b<=9; b++) {
				System.out.println(a+"*"+b+"="+(a*b));
			}
		}																	*/
		
		
		/*�簢������
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
			System.out.println();		//�ٹٲ�
		}//for end										
		
//------------------------------------------------------------		
		/* ��2)
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
			��3)
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
		
		/* �������� �� ��
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
		}		// �굵 �簢������
		
		
		

	}//main() end
}//class end