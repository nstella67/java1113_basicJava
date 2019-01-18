package oop1116;

public class BitTest2 {

	public static void main(String[] args) {
		// bit ������
		// ��Ʈ�� &, ��Ʈ�� |, ��Ʈ���� ~
		
		System.out.println(5&3);	//1
		System.out.println(5|3);		//7
		System.out.println(~5);		//-6	1�� ���� �� ���ϴ� ��
		/*
			���(unsigned ��), ����(signed ��)
			5	�� 00000101
			-5	�� ��ǻ�Ͱ� ������ ǥ���ϴ� ���(�ڰ����� �� �������ϰ�)
					1) 1�� ����
					2) 2�� ����
					3) ��ȣ�� ����ġ
						00000101	�� 5
						11111010	�� 1�� ���� ���
					  +		   1	�� 2�� ���� ���
		*/
		
		/* Shift ������
			left shift		<<	�� (���)*(2^n) (n:�̵� bit��)
			right shift	>>	�� (���)/(2^n)
			16 	: 00010000
			<<3	: 10000000 �� 128
			>>3	: 00000010 �� 2
		*/
		System.out.println(16<<3);	//128 �������� 3ĭ �̵� = 16*2^3
		System.out.println(16>>3);	//2								16/2^3
		
	}//main() end
}//class end
