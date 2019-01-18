package oop1121;

public class WeekdayTest {

	public static void main(String[] args) {
		// ���� ���ϴ� ���α׷�
		// 2018�� 11�� 21�� �� ������
		/*
			����1��1��1�� ~ ����2018��11��21�� = �ѳ���
			�ѳ���%7 �� 0�� 1�� 2ȭ 3�� 4�� 5�� 6��
			
			1) ����1�� ~ 2017
			 	+= 366
			 	+=265
			
			2) 1��~10��
			   31 �� 1, 3, 5, 7, 8, 10, 12
			   30 �� 4, 6, 9, 11
			   29 �� 2
			   28 �� 2
			
			3) += 21
		*/
//-------------------------------------------------------------------------
		int cYear=2018, cMont=11, cDate=21;
		int hap=0;
		
		//1) 
		for(int y=1; y<cYear; y++) {
			if(y%4==0 && y%100!=0 || y%400==0) {
				hap=hap+366;
			}else {
				hap=hap+365;
			}
		}//for end		�ѳ��� 736694
		
		//2)
		int[] mon= {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(cYear%4==0 && cYear%100!=0 || cYear%400==0) {
			mon[2]=29;
			}
		for(int m=1; m<cMont; m++) {
			hap=hap+mon[m];
		}
		
		//3)
		hap=hap+cDate;
			
		System.out.println("�ѳ��� : "+hap);
		switch(hap%7) {
		case 0 : System.out.println("�Ͽ���"); break;
		case 1 : System.out.println("������"); break;
		case 2 : System.out.println("ȭ����"); break;
		case 3 : System.out.println("������"); break;
		case 4 : System.out.println("�����"); break;
		case 5 : System.out.println("�ݿ���"); break;
		case 6 : System.out.println("�����"); break;
		}

		
		
		
		

	}//main() end
}//class end
