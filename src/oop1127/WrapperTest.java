package oop1127;

import java.lang.*;	//�ڹ��� �⺻ ��Ű��. ��������

import javax.swing.plaf.synth.SynthSpinnerUI;

public class WrapperTest {

	public static void main(String[] args) {
		// Wrapper Ŭ����
		// �⺻�� Ÿ���� ��üȭ�� �� �ִ� Ŭ������
		// boolean, byte, short, int, long, float, double, char	: �⺻��
		// Boolean, Byte, Short, Integer, Long, Float, Double, Character
    		// : ������. Ŭ����
			// �⺻���� Ÿ���� ��üȭ �����ִ� Ŭ���� : Wrapper Ŭ����
		
		/*
		boolean flag = true;	//�⺻��
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("flase");
		
		//flag. ����
		System.out.println(b1.toString());	//"true"
		System.out.println(b2.toString());	//"false"
		*/
		/*
		byte b = 1;
		Byte b1 = new Byte(b);
		Byte b2 = new Byte("5");
		System.out.println(b);						//1
		System.out.println(b1.longValue());		//1
		System.out.println(b2.doubleValue());		//5.0
		*/
		
		int i = 3;
		Integer i1 = new Integer(5);
		Integer i2 = new Integer("7");
		System.out.println(i);				//3
		System.out.println(i1.toString());	//"5"
		System.out.println(i2.byteValue());	//7
		
		//static : Ŭ������.filed
				// Ŭ������.method
		System.out.println(Integer.MAX_VALUE);	//ǥ������ �ִ밪
		System.out.println(Integer.SIZE);		//�޸� 32byte
		System.out.println(Integer.parseInt("9"));	//"9"��9 : ���ڿ����������� ����ȯ
		System.out.println(Integer.valueOf(5));	//5��new Integer(5) ���������� �ٲ���
		
		/*
		double d = 1.2;
		Double d1 = new Double(3.4);
		Double d2 = new Double("5.6");
		//��)�� ���� �Ǽ��� �� �߿��� ������ ��� ���Ͻÿ� 1+3+5
		int hap = (int)d+d1.intValue()+d2.intValue();
		System.out.println(hap);	//9
		*/
		/*
		char c = 'R';
		Character c1 = new Character('B');
		System.out.println(c);
		System.out.println(c1.toString());	//B �� "B"
		*/
		//static : Ŭ������.field
				// Ŭ������.method
		//method�� : ���ξ� is~~
		//						 to~~
		//						 get~~
		//						 set~~
		System.out.println(Character.isWhitespace(' '));		//�����̳�
		System.out.println(Character.isDigit('8'));
		System.out.println(Character.isDigit('#'));
		System.out.println(Character.isUpperCase('R'));
		System.out.println(Character.isLowerCase('R'));
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		
		//��) ��ҹ��ڸ� ���� �ٲ㼭 �����Ͻ÷�
			//(��, Character Ŭ������ �޼ҵ带 �̿��Ͻÿ�)
		char[] ch = {'H', 'a', 'p', 'p', 'y'};
		int size = ch.length;
		for(int idx=0; idx<size; idx++) {
			char c=ch[idx];
			if(Character.isUpperCase(c)) {
				System.out.println(Character.toLowerCase(c));
			}else if (Character.isLowerCase(c)) {
				System.out.println(Character.toUpperCase(c));
			}else {
				System.out.println(c);
			}
		}//for end
		
		
		
		
		
		
		

	}//main() end
}//class end