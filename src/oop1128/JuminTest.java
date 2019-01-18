package oop1128;

import java.util.Calendar;
import java.util.GregorianCalendar;

//http://sillytalking.tistory.com/68
class Jumin{
	private String jumin;			//field
	
	public Jumin() {}						//default constructor
	public Jumin(String jumin) {	//������ �����ε�
		this.jumin = jumin;			//this �� �ڽ�
	}
	
	public boolean validate() {	//�� ����
		boolean flag = false;
		//���⿡ �ۼ��Ͻÿ�
		//�ֹι�ȣ�� ������ flag=true(Ʋ���� ����X)
		//
		int hap=0;
		for(int i=0; i<8; i++) {
			int a = Integer.parseInt(jumin.substring(i, i+1));	//���ڸ�
			hap=hap+a*(i+2);
		}
		//System.out.println(jumin.length());//13
		for(int i=8; i<(jumin.length()-1); i++) {
			int a = Integer.parseInt(jumin.substring(i, i+1));
			hap = hap+a*(i-6);
		}
		//System.out.println(hap);//169
		//hap=(2*8)+(3*9)+(4*1)+(5*2)+(6*3)+(7*0)+(8*1)+(9*2)+(2*3)+(3*4)+(4*5)+(5*6)=169
		
		int M = (11-(hap%11))%10;
		int f = Integer.parseInt(jumin.substring(jumin.length()-1));	//��������ȣ 7
		if(M==f) {
			flag=true;
		}	//*/
		
		/*������
		Integer[] CHECKNUM = new Integer[] {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		Integer[] save = new Integer[12];
		int hap=0;
		int size = save.length;	//12
		
		for (int idx=0; idx<size; idx++) {
			/* ���1
			char ch = this.jumin.charAt(idx);
			save[idx] = Character.getNumericValue(ch);
			
			int num = Integer.parseInt(jumin.substring(idx, idx+1));
			save[idx] = num * CHECKNUM[idx];
			hap = hap + save[idx]; //
		}//for end
		
		int M = (11-(hap%11))%10;
		
		if(M==Integer.parseInt(jumin.substring(12))) {//�ֹι�ȣ����
			flag = true;
		}	//*/
		
		return flag;
	}
	
	public void disp() {
		/*
		//1) ����
		int gender = jumin.charAt(6);
		if(gender%2==0) {
			System.out.println("����	: ����");
		}else {
			System.out.println("����	: ����");
		}
		
		//2) ����
		int myYear = 1900+Integer.parseInt(jumin.substring(0, 2));
		Calendar cal = Calendar.getInstance();
		int age = cal.get(Calendar.YEAR) - myYear;
		System.out.println("����	: " + age);
		
		//3) ��	: (%12) �� 0������ 1�� 2�� ~~ 11��
		String str[] = new String[] {"������", "��", "��", "����", "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��"};
		
		int size = str.length;
		int tt = myYear%12;
		
		for(int idx=0; idx<size; idx++) {
			if(tt==idx) {
				System.out.println("��	: "+str[idx]);
			}
		}//for end
		
		//4) ��ƿ� �� �� �� Calendar Ŭ���� Ȱ���ؼ�
		//�Ϸ羿 ���� count
		//after(), before() �Լ� �̿�
		int myMonth = Integer.parseInt(jumin.substring(2, 4));
		int myDay = Integer.parseInt(jumin.substring(4, 6));
		GregorianCalendar calMy = new GregorianCalendar(myYear, myMonth, myDay);	//�¾��¥
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		GregorianCalendar calCur = new GregorianCalendar(year, month, day);	//���糯¥
		
		int count=1;
		
		do {
			calMy.add(calMy.DATE, 1);
			count++;
		}while(compareTo()>());
		*/
		//������
		//�¾ ��, ��, �� ��������
		int myYear = Integer.parseInt(this.jumin.substring(0, 2));
		int myMonth = Integer.parseInt(this.jumin.substring(2, 4));
		int myDate = Integer.parseInt(this.jumin.substring(4, 6));
		
		//�����ڵ�
		int code = Integer.parseInt(this.jumin.substring(6, 7));
		
		switch(code) {
		case 1 :
		case 2 : myYear = myYear + 1900; break;
		case 3 : 
		case 4 : myYear = myYear + 2000; break; 
		}
		
		//���ó�¥
		Calendar today = Calendar.getInstance();
		int cYear = today.get(Calendar.YEAR);		//2018
		
		//1)����
		String gender = "";
		switch(code%2) {
		case 0 : gender = "����"; break;
		case 1 : gender = "����"; break;
		}
		
		//2)���� : 2018->1989 Calendar Ŭ���� Ȱ���ؼ�
		int myAge = cYear-myYear;
		
		//3)��  : (%12) -> 0������ 1�� 2�� 3���� ~ 11��
		String[] animal = {"������", "��", "��", "����", "��", "��", "ȣ����", "�䳢",  "��",  "��", "��", "��"};
		
		//���
		System.out.println("�ֹι�ȣ : "+this.jumin);
		System.out.println("�¾ �⵵ : "+myYear);
		System.out.println("�¾ �� : "+myMonth);
		System.out.println("�¾ �� : "+myDate);
		System.out.println("���� : "+gender);
		System.out.println("���� : "+myAge);
		System.out.println("�� : "+animal[myYear%12]);
		
		//4) ��ƿ³��� -> Calendar Ŭ���� Ȱ���ؼ�
		//���� �����͸� �̿��ؼ� ���� ���� ��¥ ���� �����
		Calendar myBirth = Calendar.getInstance();
		myBirth.set(Calendar.YEAR, myYear);
		myBirth.set(Calendar.MONTH, myMonth-1);
		myBirth.set(Calendar.DATE, myDate);
		
		int alive = 1;
		while(!myBirth.after(today)) {	//myBirth�� today�������̳�? ����
			alive++;
			myBirth.add(Calendar.DATE, 1);
		}
		
		System.out.println("��ƿ� �� �� : "+alive);
		
		
	}
}//class end
//----------------------------------------------------------------------------------------
public class JuminTest {

	public static void main(String[] args) {
		// �ֹι�ȣ�� ��ȿ���� �����ϴ� ���α׷�
		Jumin id = new Jumin("8912301234567");
		
		if(id.validate()) {
			System.out.println("�ֹι�ȣ ����!!");
			// ����, ����, ��, ��ƿ� �� ��
			id.disp();
		}else {
			System.out.println("�ֹι�ȣ ����!!");
		}//if end
		
		}//main() end
}//class end



















