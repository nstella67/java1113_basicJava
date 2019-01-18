package oop1203;



public class ExceptionTest {
	public static void main(String[] args) {
		// Exception ����ó��
		// �ڹ�Ŭ���� ����(Run)�� �߻��ϴ� ����
		// try ~ catch��
		// throw��
		// finally
		
		//1) Exception ó������ ���� ���
		/*
		System.out.println(1);
		System.out.println(2/0);	//ArithmeticException�߻�
		System.out.println(3);		//exception���Ŀ��� ���� �ȵ�
		*/
		
		//2) Exception ó���� ���
		/*
		try {	//���ܰ� �߻��� ������ �Ǵ� �ڵ带 �ۼ�
			System.out.println(1);
			System.out.println(2/0);		//���� ���� ����. catch�� ����
			System.out.println(3);
		}catch(ArithmeticException e) {	//���ܰ� �߻��Ǹ�
													//ó���� �ڵ带 �ۼ�
			System.out.println(e);
		}//try() end
		System.out.println("END");
		*/
		
		//3) 
		/*
		System.out.println(1);
		try {
			int[] su = new int[3];
			su[3] = 5;	//exception �߻�
			System.out.println(2);
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("END");
		*/
		
		//4) 
		/*
		try {
			System.out.println(1);
			int su = Integer.parseInt("SKY");
			System.out.println(2);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}finally {	//exception ������� ������ ����
			System.out.println(5);
		}
		System.out.println("END");
		*/
		
		//5)
		/*
		try {
			System.out.println(1);
			Integer inte = null;
			int su = 3/inte;
			System.out.println(2);
		}catch(NullPointerException e) {
			System.out.println(e);
		}finally {
			System.out.println(5);
		}
		System.out.println("END");
		*/
		
		//6) 
		/*
		try {
			System.out.println(1);
			//-------------------------------------------------
			System.out.println(2/0);
			
			int[] su = new int[3];
			su[3] = 5;
			
			System.out.println(Integer.parseInt("SKY"));
			
			Integer inte = null;
			System.out.println(7/inte);
			//--------------------------------------------------
			System.out.println(9);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}//exception, catch�� ���� �� ���� �� �ִ�
		
		System.out.println("END");
		*/
		
		//7)
		try {
			System.out.println(1);
			//-------------------------------------------------
			System.out.println(2/0);
			
			int[] su = new int[3];
			su[3] = 5;
			
			System.out.println(Integer.parseInt("SKY"));
			
			Integer inte = null;
			System.out.println(7/inte);
			//--------------------------------------------------
			System.out.println(9);
		}catch(Exception e) {	//������
										//��� exception�� �θ� : Exception Ŭ����
			System.out.println(e);
		}
		
		System.out.println("END");
		
	}//main() end
}//class end
