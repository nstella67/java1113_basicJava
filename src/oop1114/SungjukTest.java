package oop1114;

public class SungjukTest {

	public static void main(String[] args) {
		// �������α׷�
		String name = "ȫ�浿";
		int kor = 80, eng = 90, mat =95;
		
		// ��� ���ϱ�
		double aver = (kor+eng+mat)/3;//88.3333333�ε� 88.0����
												//����ȯ �ؾ���
		
		// ����
		char grade = 'B';
		
		// ���
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+mat);
		System.out.println("��� : "+aver);
		System.out.println("���� : "+grade);
		
		// ����ȯ Datatype Conversion
		// 1) �ڵ��� ��ȯ : byte < short < int < long
		//					   float <double
		//					   ������<�Ǽ���
		// 2) ������ ��ȯ(cast ������) : �ʿ��� ������ �Ͻ��� ���

	}//main ()end
}//class end