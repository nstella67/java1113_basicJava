package oop1126;

public class OverloadTest {
	public static void print(int a) {
		System.out.println(a);
	}//print() end
	
	public static void print(double a) {		//�Լ��̸� ����
		System.out.println(a);
	}//print() end
	
	public static void print(String a) {
		System.out.println(a);
	}//print() end
	
	public static void print(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}//print() end
	
	public static void print(double a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}//print() end
	
	public static void print(double a, double b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}//print() end
	
	public static void print(String a, String b) {
		System.out.println(a+b);
	}//print() end
	
	/* ����. �Լ��� �������� �����ε��� ����� �ƴϴ�00
	public static String print(String a, String b) {}//print() end
	*/
	
	public static void main(String[] args) {
		// method overloading �޼ҵ� �����ε�(�ߺ�����)
		// �� �Լ��̸��� �ߺ��ؼ� ����� �� �ִ�
		// �� �������� : �Ű������� �ڷ����� �޶�� �Ѵ�
		//				   or �Ű������� ������ �޶�� �Ѵ�
		//		return���� �ٸ��� ����
		// �ߺ������� : overriding ��Ӱ���
		
		print(3);		//�ڵ����� ������ ã�´�
		print(2.4);		//
		print("HAPPY");
		
		print(5, 7);
		print(2.1, 5);
		print(1.2, 3.4);
		print("Hello", "World");
	}//main() end
}//class end