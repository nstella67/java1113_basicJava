package oop1129;

public class ExampleO {
	public static void main(String[] args) {
		/* ��� ȸ���� �Ǹ� ������ ������ ���� �� �Ǹ� ������ ���� �׷����� �׸��� ���α׷�
			----------------------------------------
			��      1  2  3  4  5  6  7  8  9  10 11 12
			----------------------------------------
			�Ǹŷ� 18 17 13 12 14 17 14 16 18 19 11 9
			----------------------------------------	*/
		System.out.println("----���� 4------------------------------------");
		System.out.println("��� ȸ���� �Ǹ� ������ ������ ���� ��");
		System.out.println("�Ǹ� ������ ���� �׷����� �׸��� ���α׷�");
		System.out.println("---------------------------------------");
		System.out.println("��       1    2   3    4   5   6    7    8   9   10  11  12");
		System.out.println("---------------------------------------");
		System.out.println("�Ǹŷ� 18  17  13  12  14  17  14  16  18  19  11  9");
		System.out.println("---------------------------------------");
		System.out.println();
		
		int[] mon = new int[] {18, 17, 13, 12, 14, 17, 14, 16, 18, 19, 11, 9};
		int size = mon.length;	//12
		
		
		for(int star=19; star>0; star--) {
			for(int idx=0; idx<size; idx++) {
				if(mon[idx]>=star) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println(" "+star);
		}//for end
		for(int idx=0; idx<size; idx++) {
			System.out.print(" "+(int)(idx+1)+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		//����
		
		
		
	}//main() end
}//class end
