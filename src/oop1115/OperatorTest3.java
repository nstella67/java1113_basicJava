package oop1115;

public class OperatorTest3 {

	public static void main(String[] args) {
		// ������ ����
		/*
		// ������ ���� ¦������?
		int a =4; 
		System.out.println(a%2==0);
								//4%2
								//0	==0	true
		
		System.out.println(a%2!=1);
								//4%2
								//0   !=1		true
		
		// ������ ���� 3�� �������?
		System.out.println(a%3==0);
								//4%3
								//1   ==0	false
		
		// ������ ���� 4�� �������?
		System.out.println(a%4==0);
								//4%4
		
		// ��) �ش� �⵵�� ��������?
		int year = 2018;
		System.out.println(year%4==0);
		*/
		
		/* 2�� ����̸鼭 5�� �������?
		int a=34;
		System.out.println((a%2==0)&&(a%5==0));
								//34%2			34%4
								//0					=4
								//F				&& T
								//F
		*/
		
		/* ���������� 80~89 ��������?
		int kor =85;
		System.out.println((kor>=80)&&(kor<=89));
								//85>=80		85<=89
								//T			&& T
								//T
		*/
		
		/* ���� ���ϴ� ����
		// 4�⸶�� ���������� ���߿���
		// 100�⿡ �ѹ� ���� ������ �ƴϴ�
		// ���߿� 400������ ������ �������� �ش� �����̴�
		int y = 2016;
		System.out.println(y%4==0);
		System.out.println((y%4==0)&&(y%100!=0));						// 4�⸶���̸� 100�⸶�ٴ� �ƴ�
		System.out.println((y%4==0)&&(y%100!=0)||(y%400==0));		//4�⸶���� 100�⸶�ٴ� �ƴ�, 400�⸶�ٴ� ��
		*/
		
		/* ������ ���ڰ� ���ĺ� R, r ����?
		char ch='b';
		System.out.println((ch=='r')||(ch=='R'));
		*/
		
		/* ������ ���� 2�� ����̰ų� 3�� �������?
		int a =347;
		System.out.println((a%2==0)||(a%3==0));
		*/
		
		/* ������ ���ڰ� �빮��('A'~'Z')����?
		char ch='b';
		System.out.println((ch>='A')&&(ch<='Z'));
								//'b'>='A'		'b'<='Z'
								// T		  &&  F
								// F
		*/
		
		// ������ ���� 3�� ����� �ƴ϶��? 3�� ���: false
		int a=8;
		System.out.println(a%3!=0);
							  // 3%3
							  // 0    !=0
							  // F
		System.out.println(!(a%3==0));
							  //   3%3
							  //   0    ==0
							  // ! T
							  // F
		
		
	}//main() end
}//class end
