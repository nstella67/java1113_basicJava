package oop1119;

public class ForTest {

	public static void main(String[] args) {
		// �ݺ��� : for, while, do~while
		// ���� Loop
		// for(���۰� ; ���ᰪ ; ����){������ true�� ����, false�� ��������}
		// 					����(boolean��)
		// Scope : ��ȿ����
		
		/* 1) ������ ���� �ݺ�
		for(int a=1; a<=3; a=a+1) {	// for�� �ȿ� ����� ������ for�� �ȿ����� ����
			System.out.println(a+"JAVA");
		}//for end
		
		//����, for���� ����� a������ for���ȿ����� ��밡��
		//System.out.println(a);
		
		
		// 2) ���ҿ� ���� �ݺ�
		int b;		//������ scope �� ���� ���� ����� �� �ִ�
		for(b=3; b>=1; b=b-1) {
			System.out.println(b+"JSP");
		}//for end
		System.out.println(b); //0
		*/
		
		//for(;;) {}  �� ����Loop
		//break �� �ݺ��� Ż��
		/*
		for(int a=10; a<=100; a=a+10) {
			System.out.println(a+"JAVA");
		}
		for(int b=100; b>=10; b=b-10) {
			System.out.println(b+"JSP");
		}
		*/
		/*
		for(char ch='A'; ch<='Z'; ch=(char)(ch+1)) {
			System.out.println(ch);
		}
		for(char ch='z'; ch>='a'; ch=(char)(ch-1)) {
			System.out.println(ch);
		}
		*/
		
		// ������
		/*
			4*1=4
			4*2=8
				...
			4*9=36
		
		int dan=4;
		for(int a=1; a<=9; a++) {
			System.out.println(dan+"*"+a+"="+dan*a);
		}//for end
		*/
		
		/* 1~5 �߿��� ¦���� ���
		for(int a=1; a<=5; a+=1) {
			if(a%2==0) {
				System.out.println(a);
			}
		}//for end
		*/
		
		/* ��) ����1��~ ����2018�� �߿��� ���⸸ ���
		for(int a=1; a<=2018; a++) {
			if((a%4==0)&&(a%100!=0)||(a%400==0)) {
				System.out.println(a + " : ����");
			}
		}//for end
		*/
		
		// �˰��� ���� : ����, ����
		/* 1~5 �߿��� ¦���� ����?
		int count = 0;
		for(int a=1; a<=5; a+=1) {
			if(a%2==0) {
				count = count+1;
			}
		}//for end
		System.out.println("¦�� ���� : "+count);
		*/
		
		/* ��) ����1��~ ����2018�� �߿��� ������ ����
		int count=0;
		for(int a=1; a<=2018; a++) {
			if((a%4==0)&&(a%100!=0)||(a%400==0)) {
				count =count+1;
			}
		}//for end
		System.out.println("������ ���� : "+count);
		*/
		
		// ��) ���ĺ��� �� �ٿ� 5���� ���
		/*
			ABCDE			A�� �ƽ�Ű�ڵ尡 65, 5�� ���. �̰��� Ȱ���� ���� �ִ�
			FGHIJ
			KLMNO
			PQRST
			UVWXY
			Z
		*/
		/*
		int count=0;
		char ch;
		for(ch='A'; ch<='Z'; ch++) {
			count=count+1;
			if(count%5!=0) {
				System.out.print(ch);
			}else {
				System.out.println(ch);
			}
		}
		*/
		/* �������� �� ��
		int count=0;
		for(char ch='A'; ch<='Z'; ch++) {
			count=count+1;
			//System.out.print(ch+""+count);
			System.out.print(ch);
			//----------------------------1)
			if(count%5==0) {
				System.out.println();
			}
			//----------------------------2)
			if(count==5) {
				System.out.println();
				count=0;		//�ٽ� �� �� 0���� ī��Ʈ
			}
		}
		*/
	}//main() end
}//class end