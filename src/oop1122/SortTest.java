package oop1122;

public class SortTest {

	public static void main(String[] args) {
		// ���� sort
		/*
			* ��������
				- �������� ascending sort		ASC	�⺻
					1��10	A��Z	a��z
				- �������� descending sort	DESC
				
			* ���Ĺ��
				- insertion sort	��������
				- selection sort	��������
				- bubble sort				3���°���
				- shell sort, quick sort ~~
		*/
		
		int[] su = {9, 7, 3, 5, 1};
		int size = su.length;		//5
		
		// selection sort ������� �������� ����
		for(int a=0; a<size-1; a++) {
			for(int b=a+1; b<size; b++) {
				if(su[a]>su[b]) {
					int temp = su[b];
					su[b]=su[a];
					su[a]=temp;
				}
			}
		}//for end
		for(int a=0; a<size; a++) {
			System.out.println(su[a]);
		}
		/* ������
		for(int a=0; a<=3; a++) {
			for(int b=a+1; b<=4; b++) {
				if(su[a]>=su[b]) {
					int temp = su[a];
					su[a]=su[b];
					su[b]=temp;
				}//swap
			}//����
		}//for end
		for(int a=0; a<size; a++) {
			System.out.println(su[a]);
		}		//*/
		
		
		// ��) bubble sort ������� ������������ �����Ͻÿ�
		// �м� ����
		for(int a=3; a>=0; a--) {
			for(int b=0; b<=a; b++) {
				if(su[b]<su[b+1]) {	//��������
					int tmp=su[b+1];
					su[b+1]=su[b];
					su[b]=tmp;
				}
			}
		}//for end
		
		for(int a=0; a<=4; a++) {
			System.out.println(su[a]);
		}//for end
		
		

	}//main() end
}//class end
