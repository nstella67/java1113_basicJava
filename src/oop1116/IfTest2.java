package oop1116;

public class IfTest2 {

	public static void main(String[] args) {
		// if ���ǹ�
		// �������α׷�
		String name = "ȫ�浿";
		int kor=100, eng=100, mat=100;
		int aver = (kor+eng+mat)/3;
		
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+mat);
		System.out.println("��� : "+aver);
		
		// ��) ��� 95 �̻��̸� ���л�
		if(aver>=95) {
			System.out.println("���л�");
		}//if end
		
		// ��)	���� 90�̻� "A"
		//			   80�̻� "B"
		//			   70�̻� "C"
		//			   60�̻� "D"
		//			   �������� "F"
		if(kor>=90) {
			System.out.println("���� : A");
		}else if(kor>=80) {
			System.out.println("���� : B");
		}else if(kor>=70) {
			System.out.println("���� : C");
		}else if(kor>=60) {
			System.out.println("���� : D");
		}else {
			System.out.println("���� : F");
		}//if end
		
		// ��) ����� 70�� �̻��̸� "�հ�"
		//		(��, �� ���� �߿��� �� �����̶� 40�� �̸��̸� "�����")
		//		����� 70�� �̸��̸� ������ "���հ�"
		if(aver<70) {
			System.out.println("���հ�");
		}else if((kor<40 || eng<40 || mat<40)) {
			System.out.println("�����");
		}else {
			System.out.println("�հ�");
		}
		// ���2
		if(aver>=70) {
			if(kor<40 || eng<40 || mat<40) {
				System.out.println("�����");
			}else {
				System.out.println("�հ�");
			}
		}else {
			System.out.println("���հ�");
		}
		// ���3
		if(kor>=40 && eng>=40 && mat>=40) {
			System.out.println("�հ�");
		}else if(aver>=70 && (kor<40 || eng<40 || mat<40)) {
			System.out.println("�����");
		}else {
			System.out.println("���հ�");
		}
		// ���4
		if(aver>=70) {
			if(kor>=40 && eng>=40 && mat>=40) {
				System.out.println("�հ�");
			}else {
				System.out.println("�����");
			}
		}else {
			System.out.println("���հ�");
		}
		
		// ��) ������ �������α׷�
		int a=3, b=5;
		char op='/';
		/* ��°��
			3+5=8
			3-5=-2
			3*5=15
			3/5=0.6
			3%5=3
		*/
		if(op=='+') {
			System.out.println(a+""+op+""+b+"="+(a+b));
		}else if(op=='-') {
			System.out.println(a+""+op+""+b+"="+(a-b));
		}else if(op=='*') {
			System.out.println(a+""+op+""+b+"="+(a*b));
		}else if(op=='/') {
			System.out.println(a+""+op+""+b+"="+((double)a/b));
		}else if(op=='%') {
			System.out.println(a+""+op+""+b+"="+(a%b));
		}
		
		//
		int res1 =0;
		double res2 = 0.0;
		
		if(op=='+') {
			res1 = a+b;
		}else if(op=='-') {
			res1 = a-b;
		}else if(op=='*') {
			res1 = a*b;
		}else if(op=='/') {
			res2 = (double)a/b;
		}else if(op=='%') {
			res1 = a%b;
		}//if end
		
		if(op=='/') {
			System.out.println(a+""+op+""+b+"="+res2);
		}else {
			System.out.println(a+""+op+""+b+"="+res1);
		}
		
		
	}//main() end
}//class end
