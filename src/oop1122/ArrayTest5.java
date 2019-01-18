package oop1122;

public class ArrayTest5 {

	public static void main(String[] args) {
		// 
		
		int[][] su = {
				{4, 6, 8},
				{1, 3, 5},
				{7, 2, 9}
		};
		
		int row = su.length;	//3
		int col = su[0].length;	//3
		
		// ��) ��ġ���
		/*��°��
			417
			632
			859
		*/
		for(int a=0; a<row; a++) {
			for(int b=0; b<col; b++) {
				if(a!=b) {
					int temp = su[a][b];
					su[a][b]=su[b][a];
					su[b][a]=temp;
				}
			}
		}
		
		for(int a=0; a<row; a++) {
			for(int b=0; b<col; b++) {
				System.out.print(su[a][b]);
			}
			System.out.println();
		}
		/* ������
		for(int a=0; a<row; a++) {
			for(int b=0; b<col; b++) {
				System.out.print(su[b][a]+" ");
			}
			System.out.println();
		}//for end		*/
		
		
		// ��) �밢�� ������ �� ����� ���� ���Ͻÿ�
		//		�밢�� ��	4+3+9		[0][0]+[1][1]+[2][2]
		//		�밢�� ��	8+3+7		[0][2]+[1][1]+[2][0]
		int hap1=0, hap2=0;
		
		for(int a=0; a<row; a++) {
			for(int b=0; b<col; b++) {
				if(a==b) {
					hap1=hap1+su[a][b];
				}else if((a+b)==2) {
					hap2=hap2+su[a][b];
				}
			}
		}
		System.out.println(hap1);
		System.out.println(hap2+su[1][1]);
		
		/* ������
		int hap1=0;	//��
		int hap2=0;	//��
		
		for(int a=0; a<=2; a++) {
			hap1=hap1+su[a][a];
			hap2=hap2+su[a][2-a];
		}//for end
		
		System.out.println(hap1);	//16
		System.out.println(hap2);	//18	*/
//-------------------------------------------------------------------------------
		// ��� ���� ����� ��, ���� ���Ͻÿ�
		int[][] aa= { {1, 2}, {3, 4} };
		int[][] bb= { {2, 4}, {6, 8} };
		
		int[][] cc= { {0, 0}, {0, 0} };	//��{3, 6}, {9, 12}
		int[][] dd= { {0, 0}, {0, 0} };	//��{-1, -2}, {-3, -4}
		
		for(int a=0; a<2; a++) {
			for(int b=0; b<2; b++) {
				cc[a][b]=aa[a][b]+bb[a][b];
				dd[a][b]=aa[a][b]-bb[a][b];
			}
		}
		
		for(int a=0; a<2; a++) {
			for(int b=0; b<2; b++) {
				System.out.print(cc[a][b]+" ");
			}
			System.out.println();
		}
		
		for(int a=0; a<2; a++) {
			for(int b=0; b<2; b++) {
				System.out.print(dd[a][b]+" ");
			}
			System.out.println();
		}
		/* ������
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				cc[i][j]=aa[i][j]+bb[i][j];	//��
				dd[i][j]=aa[i][j]-bb[i][j];	//��
			}
		}//for end
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(cc[i][j]+" ");	//��
			}
			System.out.println();
		}//for end
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(dd[i][j]+" ");	//��
			}
			System.out.println();
		}//for end		*/

	}//main() end
}//class end