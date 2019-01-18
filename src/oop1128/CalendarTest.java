package oop1128;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		// ��¥ ���� Ŭ����
		// Calendar �� GregorianCalendar(subclass)
		
		//���� �ý����� ��¥ ���� ������
		Calendar cal = Calendar.getInstance();	//���ξ�get:���� return�� �ִ�
		//����⵵, ��, ��
		System.out.println(cal.get(1));		//2018	��
		System.out.println(cal.get(2));		//10		��-1
		System.out.println(cal.get(2)+1);	//11		��
		System.out.println(cal.get(5));		//28		��
		//������� ���� ���. �ؿ��� ��õ
		System.out.println(cal.get(Calendar.YEAR));	//��
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		//����(1�� 2ȭ 3�� 4�� 5��)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//24�ð�����
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
//-------------------------------------------------------------------------------------------------------------
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal2.get(Calendar.YEAR));	//2018
		
		//����⵵���� 5���� ���Ͻÿ� �� 2023��
		cal2.add(Calendar.YEAR, 5);	//���� �Լ��� ���� ���� -���̸� ��	2023-10-28
		System.out.println(cal2.get(Calendar.YEAR));	//2023
		
		//2023-10-28 ���� 3������ ���ÿ� �� 7
		cal2.add(Calendar.MONTH, -3); //2023-7-28
		System.out.println(cal2.get(Calendar.MONTH));	//7
		
		cal.add(Calendar.DATE, 1);			//2023-7-29
		System.out.println(cal.get(Calendar.DATE));	//29
		
		
		//��¥ ������ �����ϱ�
		cal.set(1989, 5, 30);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		//2018-11-28
		cal.set(2018, Calendar.NOVEMBER, 28);		//month���� ������ �� �� �ִ�
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		//�� �� �� ���� ���� �Է� ����
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.NOVEMBER);
		cal.set(Calendar.DATE, 28);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
//------------------------------------------------------------------------------------------------------------
		GregorianCalendar cal3 = new GregorianCalendar();
		if(cal3.isLeapYear(2018)) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}
		
		GregorianCalendar cal4 = new GregorianCalendar(1989, 5, 30);
		System.out.println(cal4.get(Calendar.YEAR));
		System.out.println(cal4.get(Calendar.MONTH));
		System.out.println(cal4.get(Calendar.DATE));
		

	}//main() end
}//class end