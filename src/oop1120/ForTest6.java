package oop1120;

public class ForTest6 {

	public static void main(String[] args) {
		/* ȸ���� ����
		int a=0, b=0;
		for(a=1; a<=4; a++) {
			for(b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}//for end
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);	//a=5,b=5
		*/
		
		
		/* ȸ���� ����
		int a=0, b=0;
		for(a=4; a>=1; a--) {
			for(b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}//for end
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		*/
		
		// ������
		for(char a='A'; a<='Z'; a++) {
			for(char b='A'; b<=a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		for(char a='Z'; a>='A'; a--) {
			for(char b='A'; b<=a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println((int)'A');
		System.out.println((int)'Z');

	}//main() end
}//class end