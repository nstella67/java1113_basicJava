package oop1121;

public class ArrayTest2 {

	public static void main(String[] args) {
		// Array �迭
		// element ���, index ����(����)
		// index�� 0���� ����, 1�� ����
		// 1���� �迭 �� [��/ĭ/column]
		// 2���� �迭 �� [��/��/row][��]
		// 3���� �迭 �� [��][��][��]�ڹٿ��� ����(class���)
		
		/* 1) 1���� �迭
		int[] kor = new int[3];
		kor[3] = 50;	//ArrayIndexOutOfBoundsException ����
		
		double[] eng = new double[3];
		char[] ch = new char[5];
		long[] mat = new long[3];
		String[] name = new String[4];		*/
//----------------------------------------------------------------------		
		/*
		int[] kor = {10, 20, 30};// �޸� �Ҵ� + �ʱⰪ ����
		int size=kor.length;	//�迭 ����� ����
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		for(int idx=0; idx<size; idx++) {
			System.out.println(kor[idx]);
		}				*/
//----------------------------------------------------------------------
		/*
		double[] aver = {1.2, 4.6, 5.3};
		int size= aver.length;
		for(int idx=0; idx<size; idx++) {
			System.out.println(aver[idx]);
		}				*/
//----------------------------------------------------------------------
		/*
		String[] name= {"ȫ�浿", "����ȭ", "���϶�"};
		int size=name.length;
		for(int idx=0; idx<size; idx++) {
			System.out.println(name[idx]);
		}				*/
//----------------------------------------------------------------------
		char[] ch= {'H', 'a', 'p', 'p', 'y'};
		int size=ch.length;
		for(int idx=0; idx<size; idx++) {
			System.out.println(ch[idx]);
		}
		
		// ��1) ���ĺ� 'p'�� ������ ���Ͻÿ�
		int count=0;
		
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]=='p') {count++;}
		}
		System.out.println("���ĺ� p�� ���� : "+count);
		/* ������
		int count=0;
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]=='p') {
				count++;
			}
		}//for end
		System.out.println("'p'���� : "+count);		*/
		
		
		// ��2) �빮��, �ҹ����� ������ ���� ���Ͻÿ�
		int countA=0, counta=0;
		
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]>='a'&&ch[idx]<='z') {
				counta++;
			}
			else {
				countA++;
			}
		}
		System.out.println("�빮��:"+countA);
		System.out.println("�ҹ���:"+counta);
		/* ������
		int upper=0, lower=0;
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]>='A' && ch[idx]<='Z') {
				upper++;
			}
			if(ch[idx]>='a' && ch[idx]<='z') {
				lower++;
			}
		}//for end
		System.out.println("�빮�� ����:"+upper);
		System.out.println("�ҹ��� ����:"+lower);		*/
		
		
		// ��3) ��ҹ��� ���� �ٲ㼭 ����Ͻÿ� �� hAPPY
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]>='a'&&ch[idx]<='z') {
				ch[idx]=(char)(ch[idx]-32);
			}
			else {
				ch[idx]=(char)(ch[idx]+32);
			}
		}
		for(int idx=0; idx<size; idx++) {
			System.out.print(ch[idx]);
		}
		System.out.println();
		/* ������
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]>='A' && ch[idx]<='Z') {
				System.out.println((char)(ch[idx]+32));
			}
			if(ch[idx]>='a' && ch[idx]<='z') {
				System.out.println((char)(ch[idx]-32));
			}
		}//for end					*/
		
		
		// ��4) ����(a,e,i,o,u)�� ������ ���Ͻÿ�
		char[] m= {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		int sizem=m.length;
		int countM=0;
		
		for(int idx=0; idx<size; idx++) {
			for(int idxm=0; idxm<sizem; idxm++) {
				if(ch[idx]==m[idxm]) {
					countM++;
				}
			}
		}
		System.out.println("������ ���� : "+countM);
		/* ������
		int mo=0;
		for(int idx=0; idx<size; idx++) {
			switch(ch[idx]) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': mo++;
			}
		}//for end
		System.out.println("������ ����:"+mo);
		
		mo=0;
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]=='a' || ch[idx]=='e' || ch[idx]=='i' || ch[idx]=='o' || ch[idx]=='u') {
				mo++;
			}
		}
		System.out.println("������ ����:"+mo);		*/

	}//main() end
}//class end