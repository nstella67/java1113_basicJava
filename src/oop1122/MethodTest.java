package oop1122;

public class MethodTest {
	
	public static void test() {	//test()�Լ�����
		System.out.println("JAVA");
		return;	// ȣ���� ������ �ǵ��� �� (���ϰ�����)
	}//test() end
	
	public static void test2() {	//test2�Լ�
		
		test();		// �Լ��� ���� �θ� �� �ִ�. �� main���� ���ص���
		//test2();	//�ڽ��� �Լ� ȣ�� ����(����� �Լ�ȣ��)
		//�Լ��� ���� ȣ�����
		//main(); ����. main�Լ��� ����ڰ� ȣ��Ұ�. JVM�� ȣ��
		
		
		System.out.println("JSP");
		// return; ������ return�� ��������. 
				 // �������� �ǵ��ư��� �Ӽ��� �ִ�. �߰��� �ȵ�
	}//test2() end

	public static void main(String[] args) {	//main�Լ�
		// �޼ҵ� method�ڡڡڡڡ�
		// �Լ�(function, procedure, ���)
		// �޼ҵ�� : �ѱ� �Ұ���, ù���� ���� �Ұ���, �ǹ̺ο�
		// �ĺ��� : Ŭ������, ������, �޼ҵ��
		
		// �޼ҵ� : 1) parameter(argument value ���ް�) ����
		//			 2) ���ϰ��� ����
		//				���ϰ��� ���� �� void
		// main �Լ� �ƴѰ���
		
		// ���� : ������ �޼ҵ��() {}
			// test		: ������
			// test()	: �޼ҵ�
		
		// �Լ�����, �Լ�ȣ��(main�Լ��� ȣ���� �� ����)
//------------------------------------------------------------------------------
		test();		// �Լ�ȣ��
		
		test();		// ������ ȣ�� ����
		
		test();
		//test98();	//����, ������ ���� �Լ� ȣ�� �Ұ���
		
		test2();

	}//main() end
}//class end