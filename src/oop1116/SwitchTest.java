package oop1116;

public class SwitchTest {

	public static void main(String[] args) {
		// switch~case��
		// break�� : ���ǹ��� �������� ��
		// �� : double, boolean�� ����� �� ����
		// case ���� ����� �ݵ�� �������� �ʿ�� ����
		/*
			switch(��) {
			case ��1 : ó����1; break;
			case ��2 : ó����2; break;
			case ��3 : ó����3; break;
			}
		*/
		/*
		switch(40) {
		case 10 : System.out.println("SEOUL"); break;
		case 20 : System.out.println("JEJU"); break;
		case 30 : System.out.println("BUSAN"); break;
		case <10 Ʋ��ǥ��
		case >= 3 Ʋ������
		}
		*/
		/*
		switch(20) {
		case 10 : System.out.println("SEOUL"); break;
		case 20 : System.out.println("JEJU");
		case 30 : System.out.println("BUSAN"); break;
		default : System.out.println("etc"); //break�� �ᵵ �ǰ� �Ƚᵵ ��
		}
		*/
		
		/*��) ���� 90�̻�A, 80�̻� B, 70�̻� C, 60�̻� D, ������ F
		int kor=100;
		switch(kor/10) {
		case 10	:	// break ���� ������ �귯���� �ȴ�
		case 9	: System.out.println("����:A"); break;
		case 8	: System.out.println("����:B"); break;
		case 7	: System.out.println("����:C"); break;
		case 6	: System.out.println("����:D"); break;
		default	: System.out.println("����:F");
		}
		*/
		
		/* ��) 
		int a=3, b=5;
		char op='/';
		
		switch(op) {
		case '+'	: System.out.println(a+b); break;
		case '-'	: System.out.println(a-b); break;
		case '*'	: System.out.println(a*b); break;
		case '/'	: System.out.println((double)a/b); break;
		case '%'	: System.out.println(a%b); break;
		}
		*/
		
		// ��) ����, ����
		int code=3;
		
		switch(code%2) {
		case 0 : System.out.println("����"); break;
		case 1 : System.out.println("����"); break;
		}
		
		// ���� : �����ڵ尡 1, 2�� 1900����
		//	 						3, 4�� 2000�� ���� ���
		// ����⵵ - �¾�⵵
		int myYear=15;	// 2018-2015
		
		switch(code) {
		case 1 :
		case 2 : System.out.println("����:"+(2018-1900-myYear)); break;
		case 3 :
		case 4 : System.out.println("����:"+(2018-2000-myYear)); break;
		}
		
		//�������ڵ�
		int age=0;
		
		switch(code) {
		case 1 :
		case 2 : myYear = myYear+1900; break;
		case 3 :
		case 4 : myYear = myYear+2000; break;
		}
		
		age=2018-myYear;
		System.out.println("����:"+age);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
