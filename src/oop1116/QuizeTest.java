package oop1116;

public class QuizeTest {

	public static void main(String[] args) {
		// 문) 운행거리에 따라 택시 요금을 계산하는 프로그램
		// 2000m까지는 기본요금 900원이고
		// 2000m 초과 운행시 200m 단위마다
		// 기본요금에 100원씩 가산하여 요금을 계산한다
		
		/* 출력결과
			운행거리 : 3000
			요금 : ?
		*/
		
		int m = 3000;
		int minm = 900;
		int addm = 100*(m-2000)/200;
		System.out.println("운행거리 : "+minm);	//900
		if(m<=2000) {
			System.out.println("요금 : "+minm);
		}else {
			System.out.println("요금 : "+(minm+addm));
		}		//1400
		
		/*선생님
		int distance = 3000;
		int fee=0;
		int overFee=0;
		if(distance<=2000) {
			fee=900;
		}else {
			int exceed = distance-2000;	//초과거리
			overFee=(exceed/200)*100;
			fee=900+overFee;
		}//if end
		
		System.out.println("총운행거리 : "+distance);	//3000
		System.out.println("기본요금 : 900");				//900
		System.out.println("추가요금 : "+overFee);		//500
		System.out.println("전체요금 : "+fee);				//1400
		*/
		
	}//main() end
}//class end