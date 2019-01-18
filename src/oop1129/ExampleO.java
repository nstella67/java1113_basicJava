package oop1129;

public class ExampleO {
	public static void main(String[] args) {
		/* 어느 회사의 판매 실적이 다음과 같을 때 판매 실적에 대한 그래프를 그리는 프로그램
			----------------------------------------
			월      1  2  3  4  5  6  7  8  9  10 11 12
			----------------------------------------
			판매량 18 17 13 12 14 17 14 16 18 19 11 9
			----------------------------------------	*/
		System.out.println("----예제 4------------------------------------");
		System.out.println("어느 회사의 판매 실적이 다음과 같을 때");
		System.out.println("판매 실적에 대한 그래프를 그리는 프로그램");
		System.out.println("---------------------------------------");
		System.out.println("월       1    2   3    4   5   6    7    8   9   10  11  12");
		System.out.println("---------------------------------------");
		System.out.println("판매량 18  17  13  12  14  17  14  16  18  19  11  9");
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
		
		//예제
		
		
		
	}//main() end
}//class end
