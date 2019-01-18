package oop1205;

public class PrintFormatsTest {

	public static void main(String[] args) {
		// ��¼���
		/* - ��ɾ� - 
			%d	10�� ������ ���
			%f		�Ǽ��� ���
			%c	������ ���
			%s	���ڿ��� ���
			\n	�ٹٲ�
			System.out.printf("�������", ��);
		*/
		System.out.printf("������: %d %d %d \n", 10, 20, 30);
		System.out.printf("#%5d# \n", 3);	//5ĭ����������	#    3# 
		System.out.printf("#%-5d# \n", 3);	//5ĭ��������		#3    # 
		
		System.out.printf("�Ǽ���: %f %f %f \n", 1.2, 3.4, 5.6);
		System.out.printf("#%6.2f# \n", 7.8);		//6ĭ�Ҽ���2�ڸ�����	#  7.80#  
		System.out.printf("#%-6.2f# \n", 7.8);	//								#7.80  # 
		
		System.out.printf("%c %c %c \n", 'S', 'K', 'Y');
		System.out.printf("#%5c# \n", 'R');	
		System.out.printf("#%-5c# \n", 'r');
		
		System.out.printf("%s %s %s \n", "Year", "Month", "Date");
		System.out.printf("#%8s# \n", "Happy");	 
		System.out.printf("#%-8s# \n", "Happy");
		
	}//main() end
}//class end
