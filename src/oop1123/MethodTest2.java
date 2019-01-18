package oop1123;

public class MethodTest2 {
	
	//�Լ� �ۼ� ����
	public static void test1() {
		System.out.println("JAVA");
		return;	//ȣ��������� �ǵ��ư�
					//�Ǹ����� return�� ������ �� �ִ�
	}//test1() end
	
	public static void test2(int a) {	//a:parameter�Ű�����
		System.out.println(a);
		//return; �����Ǿ� ����
	}//test2() end
	
	public static void test3(int a, int b) {	//�Ű������� �ڷ����� ������
		System.out.println(a);					//���� �Ұ���
		System.out.println(b);
	}//test3() end
	
	public static void test4(double a) {
		System.out.println(a);
	}//test4() end
	
	public static void test5(char a) {
		System.out.println(a);
	}//test5() end
	
	public static void test6(String a) {
		System.out.println(a);
	}//test6() end
	
	public static void test7(int a, double b, char c, String d) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}//test7() end

	public static void main(String[] args) {
		// �޼ҵ� ����
		// �Լ�(function, procedure)
		// ����� ���� �޼ҵ�(user defined)
		// �޼ҵ� �ۼ� : ���ϰ� ����
		//					parameter(�Ű�����) ����
		// ���ϰ��� ���� : void
		// �ĺ���	: Ŭ������, ������, �޼ҵ��
		// �Լ�����, �Լ�ȣ��
		
		// 1) parameter(�Ű�����)�� ���� ���
			// ���ް�(argument value)�� ����
			// test1();
			// test1();
		
		// 2) parameter�� �ִ� ���
			// test2(30);	//30:���ް�
			// test2(50);
			// test2(70);
		
		// 3) parameter�� 2�� �̻� �ִ� ���
			// test3(2, 4);
			// test3(7, 8);
			// test3(5, 6);
		
		// test4(5.6);			//double��
		// test5('R');			//character��
		// test6("HAPPY");	//String��
		
		test7(3, 4.5, 'B', "Hello");	//�پ��� �ڷ��� �� �� �ִ�
		

	}//main() end
	
	//�Լ� �ۼ� ����
	
}//class end