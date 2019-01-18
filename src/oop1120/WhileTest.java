package oop1120;

public class WhileTest {

	public static void main(String[] args) {
		// while(����) {}		������ true�϶� {}����
		// do{} while (����) 
		// ���� ���� ���� ����
		
		/* --�м�1-----------------------------------------
		int a=3;
		while(a<=5) {		// ���� ���� ��
			System.out.println("JAVA");
			a++;
		}//end
		----------------------------------------�м�1---*/
		
		
		/* --�м�2---------------------------------------
		int b=3;
		do {
			System.out.println("JSP");
			b++;
		}while(b<=5);		// ���߿� ���� ��
		----------------------------------------�м�2---*/
		
		
		/* ---�м�3----------------------------------------------------------
		 * �ʱⰪ�� false�� ��� while�� do~while�� ���̰� �ִ�.
		int a=3;
		while(a<1) {
			System.out.println("JAVA");
			a++;
		}//(1)end
		
		//do~while ���� ���ǰ� ������� ������ 1���� ����ȴ�.
		int b=3;
		do {
			System.out.println("JSP");
			b++;
		}while(b<1);	//(2)
		--------------------------------------------------------�м�3-------*/
		
		
		/* ---�м�4-------------------------------------------------------------
		 * ���ѷ��� �� for(;;){}
		int a=1;
		while(true) {		//���ѷ���
			System.out.println("JAVA");
			a++;
			if(a==3) break;
		}
		------------------------------------------------------�м�4----------- */
		
		
		// ��1) 1~1000���� ������ ���� ���ϴµ� (1+2+3+~)
		//		  �� ���� 10000�� ������ ����� ����ϰ� ���α׷� �����Ͻÿ�
		/*����
		int a=1;
		int hap=0;
		while(true) {
			hap=hap+a;
			a++;
			if(hap>10000) break;
		}
		System.out.println(hap);		*/
		
		/*�������� �� ��
		int a=1;
		int hap=0;
		while(a<=1000) {
			hap=hap+a;
			if(hap>=10000) {
				System.out.println(hap);
				break;
			}
			a++;
		}//end								*/
		
		
		// ��2) 3�� ����� ������(3+6+9+~)�� 1000 �̻��̸�
		//		  3���� ������ ���ؾ� �ϴ��� ���Ͻÿ�
		//		  ��°�� 3+6+9+12+ ~~ +? = 1000
		/*
		int a=3;
		int hap=0;
		while(true) {
			hap=hap+a;
			if(hap>=1000) {
				System.out.print(a+"="+hap);
				break;
			}
			System.out.print(a+"+");
			a=a+3;
		}																	*/
		/*������
		int a=0;
		int hap=0;
		String res="";	//�� ���ڿ� ������ ��
		
		while(true) {		//���ѷ���
			a=a+3;			//3�� ���   a+=3;
			hap=hap+a;	//������ �� hap+=a;
			res=res+a+"+";
			if(hap>=1000) break;
		}//while end
		
		System.out.println(a);
		System.out.println(hap);
		System.out.println(res+"="+hap);				*/
		
		
		/* string ������ ��������
		String str="";
		str=str+"ONE";
		System.out.println(str);
		
		str=str+"TWO";
		System.out.println(str);
		
		str=str+"THREE";
		System.out.println(str);
		
		str += "FOUR";
		System.out.println(str);			*/
		
	}//main() end
}//class end