package oop1121;

public class MathTest {

	public static void main(String[] args) {
		// Math ���а��� Ŭ����
		/*
		// ���밪
		System.out.println(Math.abs(-3));
		System.out.println(Math.abs(5));
		
		// ū��
		System.out.println(Math.max(2, 4));
		
		// ������
		System.out.println(Math.min(2, 4));
		
		// �Լ� �ȿ� �Լ� �ߺ����� �� �� �ִ�
		System.out.println(Math.max(7, Math.max(8, 9)));
		
		System.out.println(Math.ceil(1.3));		//2.0 �ø�
		System.out.println(Math.floor(2.7));	//2.0 ����
		System.out.println(Math.round(3.8));	//4   �ݿø�
		
		System.out.println(Math.PI);
		*/
//-----------------------------------------------------------------------------------
		// ����, random�� : �ý����� �߻���Ų ��
		// ���� �߻� ���� : 0.0<= r <1.0
		
		System.out.println(Math.random());
		System.out.println(Math.random()*2);	//0.0<=r<2.0
		System.out.println((int)(Math.random()*2));	//�Ҽ��������� 0 1
		System.out.println((int)(Math.random()*3));	//0 1 2
		System.out.println((int)(Math.random()*4)); //0 1 2 3
		
	}//main() end
}//class end