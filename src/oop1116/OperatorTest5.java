package oop1116;

public class OperatorTest5 {

	public static void main(String[] args) {
		// F2 : rename Ű
		/* 1����, 1���� ������ ����
		int a = 3;
		a = a+1;		//4
		a += 1;		//5
		a++;			//6	1���� ������
		++a;			//7	1���� ������
		System.out.println(a);
		
		int b = 3;
		b = b-1;		//2
		b -= 1;		//1
		b--;			//0	1���� ������
		--b;			//-1	1���� ������
		System.out.println(b);
		
		System.out.println(a+b);	//6
		*/
		
		/*
		int a = 10, b = 10;
		int c = a++;	//(���� �ڿ� ++)���߿� 1���� , int c=a �� a=a+1
		int d = --b;		//(���� �տ� --)���� 1����,	   b=b-1 �� d=b
		System.out.println(a);	//11
		System.out.println(b);	//9
		System.out.println(c);	//10
		System.out.println(d);	//9
		*/
		
		int x=3, y=5;
		int z=++x + y++;
		/*
		x=x+1=4
		int z = x+y=4+5=9
		y=y+1=6
		*/
		System.out.println(x);	//4
		System.out.println(y);	//6
		System.out.println(z);	//9
		
	}//main() end
}//class end
