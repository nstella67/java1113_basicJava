package oop1115;

public class OperatorTest2 {

	public static void main(String[] args) {
		// ������ ����
		// ��1) �� ������ ������ ���Ͻÿ�
		//int money = 56430;
		/* ��°��
			���� 5��
			õ�� 6��
			��� 4��
			�ʿ� 3��
		*/
		/*
		int a,b,c,d;
		a=money/10000;
		money=money%10000;
		b=money/1000;
		money=money%1000;
		c=money/100;
		money=money%100;
		d=money/10;
		System.out.println("����"+a+"��");
		System.out.println("õ��"+b+"��");
		System.out.println("���"+c+"��");
		System.out.println("�ʿ�"+d+"��");	
		*/
		
		// ��2) 1�� 365.2422��
		/* ��°�� : 365�� ?�ð� ?�� ?��
			1��	: 60��
			1�ð�	: 60��=3600��
			1��	: 24�ð�=86400��
			1��	: 365.2422*86400=31556926.08��
		*/
		/*
		double nday=0.2422*86400;
		double h, m, s;
		h=(nday/86400);
		nday=(nday%86400);
		m=(nday/3600);
		nday=(nday%3600);
		s=(nday/60);
		System.out.println("1�� : 365��"+h+"�ð�"+m+"��"+s+"��");
		*/
		
		int nday=(int)(0.2422*86400);
		int hour, min, sec;
		
		hour=(nday/3600);
		nday=(nday%3600);
		
		min=(nday/60);
		sec=(nday%60);
		
		System.out.println("1�� : 365�� "+hour+"�ð� "+min+"�� "+(sec+0.08)+"��");
		
		//���������Ѱ�
		double year = 365.2422;
		int day = (int)(year*86400);		//31556926
		
		int d = day/86400;					//365
		day = day%86400;
		
		int h = day/3600;						//�ð�
		day = day%3600;
		
		int m = day/60;						//��
		int s = day%60;						//��
		
		System.out.println("1��:" + year);
		System.out.println(d+"��");
		System.out.println(h+"�ð�");
		System.out.println(m+"��");
		System.out.println(s+"��");
		
	}//main() end
}//class end
