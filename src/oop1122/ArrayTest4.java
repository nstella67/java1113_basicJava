package oop1122;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 2���� �迭
		// [��][��]
		/*
			[1][0] [1][1] [1][2]
			  40    50     60
			  10    20     30
			[0][0] [0][1] [0][2]
		*/
		// �� : ��, ��, row
		// �� : ĭ, column
		/*
		int[][] su = new int[2][3];	//4byte*6 = 24byte
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;
		su[1][0] = 40;
		su[1][1] = 50;
		su[1][2] = 60;
		
		System.out.println(su[0][0]);
		System.out.println(su[0][1]);
		System.out.println(su[0][2]);
		
		System.out.println(su[1][0]);
		System.out.println(su[1][1]);
		System.out.println(su[1][2]);
		*/
//-------------------------------------------------------------------------
		/*
		int[][] su = {
						{10, 20, 30},
						{40, 50, 60} 
					   };	//����
		*/
		/*
		System.out.println(su.length);		//2 : ���� ����
		System.out.println(su[0].length);	//3 : [0]���� ���� ����
		System.out.println(su[1].length);	//3 : [1]���� ���� ����
		*/
		/*
		int row = su.length;	//2
		int col = su[0].length;	//3
		
		for(int a=0; a<row; a++) {
			for(int b=0; b<col; b++) {
				System.out.println(su[a][b]);
			}
		}//for end
		*/
//--------------------------------------------------------------------------
		char[][] ch = {
				{'Y', 'e', 'a', 'r'},
				{'M', 'o', 'n', 't', 'h'},
				{'D', 'a', 't', 'e'}
		};
		
		int row = ch.length;

		// ��) ������ ������ ���Ͻÿ�
		int count=0;
		
		char[] mo= {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		int sizeM=mo.length;
		
		for(int a=0; a<row; a++) {
			for(int idx=0; idx<ch[a].length; idx++) {
				for(int b=0; b<sizeM; b++) {
					if(ch[a][idx]==mo[b]) {
						count++;
					}
				}
			}
		}//for end
		System.out.println(count);
		// ������
		/*
			ch[0].length �� 4
			ch[1].length �� 5
			ch[2].length �� 4
		*/
		/*
		int count=0;
		for(int a=0; a<row; a++) {
			int col = ch[a].length;
			for(int b=0; b<col; b++) {
				char c = ch[a][b];
				if(c>='A' && c<='Z') {	//�빮��?
					c = (char)(c+32);		//�ҹ��ڷ� �ٲ�
				}//if end
				
				switch(c) {
				case 'a' :
				case 'e' : 
				case 'i' : 
				case 'o' : 
				case 'u' : count++;
				}
			}
		}//for end
		System.out.println(count);	*/
		
		
		
		// ��) ��ҹ��� ���� �ٲ㼭 ����Ͻÿ�
			// yEAR
			// mONTH
			// dATE
		for(int a=0; a<row; a++) {
			for(int idx=0; idx<ch[a].length; idx++) {
				if(ch[a][idx]>='a' && ch[a][idx]<='z') {
					ch[a][idx]=(char)(ch[a][idx]-32);
				}
				else if(ch[a][idx]>='A' && ch[a][idx]<='Z') {
					ch[a][idx]=(char)(ch[a][idx]+32);
				}
				System.out.print(ch[a][idx]);
			}
			System.out.println();
		}//for end
		
		/*
		for(int a=0; a<row; a++) {
			for(int idx=0; idx<ch[a].length; idx++) {
				System.out.print(ch[a][idx]);
			}
			System.out.println();
		}
		*/
		/* ������
				for(int a=0; a<row; a++) {
					for(int b=0; b<ch[a].length; b++) {
						char c = ch[a][b];
						if(c>='A' && c<='Z') {
							System.out.print((char)(c+32));
						}else if(c>='a' && c<='z') {
							System.out.print((char)(c-32));
						}
					}
					System.out.println();
				}//for end		*/
	}//main() end
}//class end