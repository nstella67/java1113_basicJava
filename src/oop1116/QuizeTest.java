package oop1116;

public class QuizeTest {

	public static void main(String[] args) {
		// ��) ����Ÿ��� ���� �ý� ����� ����ϴ� ���α׷�
		// 2000m������ �⺻��� 900���̰�
		// 2000m �ʰ� ����� 200m ��������
		// �⺻��ݿ� 100���� �����Ͽ� ����� ����Ѵ�
		
		/* ��°��
			����Ÿ� : 3000
			��� : ?
		*/
		
		int m = 3000;
		int minm = 900;
		int addm = 100*(m-2000)/200;
		System.out.println("����Ÿ� : "+minm);	//900
		if(m<=2000) {
			System.out.println("��� : "+minm);
		}else {
			System.out.println("��� : "+(minm+addm));
		}		//1400
		
		/*������
		int distance = 3000;
		int fee=0;
		int overFee=0;
		if(distance<=2000) {
			fee=900;
		}else {
			int exceed = distance-2000;	//�ʰ��Ÿ�
			overFee=(exceed/200)*100;
			fee=900+overFee;
		}//if end
		
		System.out.println("�ѿ���Ÿ� : "+distance);	//3000
		System.out.println("�⺻��� : 900");				//900
		System.out.println("�߰���� : "+overFee);		//500
		System.out.println("��ü��� : "+fee);				//1400
		*/
		
	}//main() end
}//class end