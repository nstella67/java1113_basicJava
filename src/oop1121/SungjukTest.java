package oop1121;

public class SungjukTest {

	public static void main(String[] args) {
		// �������α׷�
		String[] name = {"ȫ�浿", "����ȭ", "���϶�", "���޷�", "������"};
		int[] kor = {100, 35, 75, 95, 85};
		int[] eng = {100, 40, 80, 95, 90};
		int[] mat = {95, 50, 70, 35, 85};
		int[] aver = new int[5];
		int[] rank = {1, 1, 1, 1, 1};
		int size=name.length;
		
		//����� ���Ͻÿ�
		for(int idx=0; idx<size; idx++) {
			aver[idx]=(kor[idx]+eng[idx]+mat[idx])/3;
		}
		
		//����� ���Ͻÿ�(����� ����)
		for(int a=0; a<size; a++) {
			for(int b=0; b<size; b++) {
				if(aver[a]<aver[b]) {
					rank[a]=rank[a]+1;
				}
			}
		}
		
		//���
	for(int idx=0; idx<size; idx++) {
			System.out.print(name[idx]+" ");
			System.out.print(kor[idx]+" ");
			System.out.print(eng[idx]+" ");
			System.out.print(mat[idx]+" ");
			System.out.print(aver[idx]+" ");
			System.out.print(rank[idx]+" ");
		
		// ��) ����(�հ�, �����, ���հ�)
			// ����� 70�� �Ѵ� ��� 
			// �� �� �����̶� 40�� �̸��̸� �����
			// �ƴϸ� �հ�
			// ��� 70�� �̸��� ���հ�
		if(aver[idx]<70) {
			System.out.print("���հ�");
		}else {
			if(kor[idx]<40 || eng[idx]<40 || mat[idx]<40) {
				System.out.print("�����");
			}else {System.out.print("�հ�");}
		}//if end
		
		// ��) ��� 10���� * �Ѱ���
		int[] star=new int[5];
		for(star[idx]=1; star[idx]<=aver[idx]/10; star[idx]++) {
				System.out.print("*");
		}//for end	
		//
		/*
		for(int n=1; n<=aver[idx]/10; n++) {
			System.out.print("*");
		}		*/
		
		// ��) ��� 95�̻��̸� ���л�
		if(aver[idx]>=95) {
			System.out.print("���л�");
		}
		
		System.out.println();
	}//for end
	
	}//main() end
}//class end