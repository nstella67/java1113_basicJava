package oop1116;

public class OperatorTest6 {

	public static void main(String[] args) {
		// ���׿�����
		/* ����, ���׿�����
		int a = 3;
		a = a*2;		//���׿�����
		a = a*-1;	//���׿�����
		a = -a;		// a = a*-1�� ���� ǥ��		���׿�����
		System.out.println(a);
		*/
		
		// ���׿����� (����)? �� : ���� �� ���� 3��
		// ���� : boolean��
		
		/* ����
		// ��) ������ ���� ���, ����?
		int a = 4;
		String str = (a>0)? "���" : "����";
					  // 3>0 ? �� �� �� "���"
		System.out.println(a+" : "+str);
		
		// ��) ������ ���� ¦��, Ȧ��?
		str = (a%2==0)? "¦��" : "Ȧ��";
		System.out.println(a+" : "+str);
		
		// ��) ������ ���� 2�� ����̸鼭 5�� �������?
		str = (a%2==0 && a%5==0)? "10�ǹ���´�" : "10�ǹ���ƴϴ�";
		System.out.println(a+" : "+str);
		
		// ��) ������ �⵵�� ����, ���?
		str = (a%4==0 && a%100!=0 || a%400==0)? "����" : "���";
		System.out.println(a+" : "+str);
		*/
		
		// ��) ������ ���ڸ� ��ҹ��� ���� �ٲ㼭 ���
		char ch = 'm';
		char cc = (ch>='a' && ch<='z')? (char)(ch-32) : (char)(ch+32);
		System.out.println(ch+" -> "+cc);
		
		// ��) �� ���� �� �߿��� �ִ� ���
		int a=3, b=9, c=7;
		int max = (a>b)? a : b;
		max = (max>c)? max : c;
		System.out.println(a+", "+b+", "+c+" �� �ִ� : "+max);
		
		
	}//main() end
}//class end
