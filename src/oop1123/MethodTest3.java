package oop1123;

public class MethodTest3 {
	
	//�Լ� �ۼ� ����
	public static void abs(int a) {	//���밪
		if(a<0) {
			a=-a;
		}
		System.out.println(a);
	}//abs() end
	
	public static void fact(int a) {	//���丮��
		long gop=1;
		for(int fac=1; fac<=a; fac++) {
			gop=gop*fac;
		}//for end
		System.out.println(gop);
	}//fact(); end

	public static void leap(int a) {	//����
		if((a%4==0)&&(a%100!=0)||(a%400==0)) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}
	}//leap(2018) end
	
	public static void graph(char a, int b) {	//�׷���
		for(int c=0; c<=b; c++) {
			System.out.print(a);
		}//for end
	}//graph('#', 10) end
	
	//������
	/*
	public static void abs(int a) {

		if(a<0) {
			System.out.println(-a);
		}else {
			System.out.println(a);
		}
	}//abs() end
	
	public static void fact(int a) {
		int gop=1;	//���� int�����ٴ� long������
		for(int f=a; f>=1; f--) {
			gop=gop*f;
		}
		System.out.println(gop);
	}//fact() end
	
	public static void leap(int y) {
		if((y%4==0)&&(y%100!=0)||(y%400==0)) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}
	}//leap() end
	
	public static void graph(char ch, int n) {
		for(int a=1; a<=n; a++) {
			System.out.print(ch);
		}
	}//graph() end
	*/
	
//---------------------------------------------------------------------------------
	public static void main(String[] args) {
		// �޼ҵ� ���� ��������
		
		// ��) ���밪�� ���Ͻÿ�
		abs(-3);
		
		// ��) ���丮�� ���� ���Ͻÿ�
		fact(4);
		
		// ��) ����, ����� �����ؼ� ����Ͻÿ�
		leap(2018);
		
		// ��) �׷����� ����Ͻÿ� ##########
		graph('#', 10);
	}//main() end
	//�Լ� �ۼ� ����
}//class end