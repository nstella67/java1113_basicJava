package oop1123;

public class MethodTest7 {
	public static void test() {
		test();	//����Լ�
		//main();	//����. main() �Լ��� ����ڰ� ȣ�� �Ұ���
		//			  JVM�� Ŭ������ ������ �� �ڵ� ȣ��ȴ�
	}//test() end
	
	public static int fact(int a) {
		if(a==0) {
			return 1;
		}else {
			return a*fact(a-1);
		}
	}//fact() end

	public static void main(String[] args) {
		// ����� �Լ� ȣ��
		// �ڽ��� �ڽ��� �Լ� ȣ��
		
		int result = fact(4);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end