package oop1128;

import java.math.MathContext;

class Sawon {
	String sabun;
	String buseo;
	int pay;
	public static String COMPANY = "(��)�ֵ���ũ";	//static ����
	public static double TAX = 0.03;
	public static int Sudang = 10;
}//class end

class Write {
	public static void line() {	//static �Լ�
		System.out.println("--------------------------------------------");
	}
}//class end

//-------------------------------------------------------------------------------------------------------------
public class StaticTest {

	public static void main(String[] args) {
		// static
		// static �Լ�
		// static : Ŭ���������� ���� ���ٰ����ϴ�
			/*		Ŭ������.����
		          	Ŭ������.�Լ�()		*/
		
		//static����
		System.out.println(Math.PI);
		System.out.println(Math.E);
		//static �Լ�
		System.out.println(Math.abs(-3));
		System.out.println(Math.min(5, 7));
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.parseInt("123"));
		
		System.out.println(Character.toUpperCase('r'));
		System.out.println(String.valueOf(5));
		
		// static �� ����, ����, ���ٹ��� object�ε� class�ε� ���� ���������� class�� �����ϴ� �� ��õ
		// static �� �޸� �Ҵ� 1��, �Ҹ굵 1��
		// static ������ ������ continue�ȴ�
		Sawon kim = new Sawon();
		System.out.println(kim.COMPANY);
		System.out.println(kim.TAX);
		
		Sawon lee = new Sawon();
		System.out.println(lee.COMPANY);
		System.out.println(lee.TAX);
		
		System.out.println(Sawon.COMPANY);
		System.out.println(Sawon.TAX);
		
		// Math ma = new Math();
		// System.out.println(ma.PI);
		// System.out.println(Math.PI);
		
		Write.line();
		
		//static 	: �޸� �ּҰ� �����Ǳ� ������ �Ҵ絵 1��, �Ҹ굵 1��
		
		kim.Sudang = kim.Sudang + 1;
		System.out.println(kim.Sudang);	//11
		
		lee.Sudang = lee.Sudang + 1;
		System.out.println(lee.Sudang);		//12
		
		Sawon.Sudang = Sawon.Sudang + 1;
		System.out.println(Sawon.Sudang);//13
		System.out.println(kim.Sudang);//13
		System.out.println(lee.Sudang);//13
		

	}//main() end
}//class end