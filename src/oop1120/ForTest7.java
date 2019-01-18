package oop1120;

public class ForTest7 {

	public static void main(String[] args) {
		// 반복문 연습 문제
		
		/* 문1) 2g, 3g, 5g짜리 추가 각각 5개씩 있을 때
				세 가지의 추의 조합으로 무게가 40~45 사이일 때
				각 추의 갯수와 무게를 출력하는 프로그램
				
			출력결과
				2g		3g		5g		합
				1		1		1		2+3+5=10
				2		2		2		4+6+10=20
				3		3		3		6+9+15=30
				1		5		5		2+15+25=42
				2		4		5		4+12+25=41
		*/
		
		/*내거
		int a=0, b=0, c=0;
		int hap=0;
		System.out.println("2g  3g  5g   합");
		for(a=0; a<=5; a++) {
			for(b=0; b<=5; b++) {
				for(c=0; c<=5; c++) {
					hap=2*a+3*b+5*c;
					if(hap>=40&&hap<=45) {
						System.out.println(a+"    "+b+"    "+c+"    "+hap);
					}
				}
			}
		}*/
		
		/*선생님
		int hap=0;
		for(int a=1; a<=5; a++) {			//2g
			for(int b=1; b<=5; b++) {		//3g
				for(int c=1; c<=5; c++) {		//5g
					hap=(a*2)+(b*3)+(c*5);
					if(hap>=40&&hap<=45) {
						System.out.println(a+"  "+b+"  "+c+"="+hap);
					}//if end
				}
			}
		}//for end		*/
		
//------------------------------------------------------------------------------------		
		/* 문2) 누적의 합
			중간에 .... 숫자 안 찍어도 됨
			1+....+10=55
			1+....+20=210
			1+....+30=
				....
			1+....+90=
			1+....+100=5050
		*/
		
		/*내거
		int a2=0, b2=0;
		int hap2=0;
		for(a2=10; a2<=100; a2+=10) {
			hap2=0;
			for(b2=1; b2<=a2; b2++) {
				hap2=hap2+b2;
			}
			System.out.println("1+....+"+a2+"="+hap2);
		}		*/
		
		/*선생님
		int hap=0;
		for(int a=10; a<=100; a=a+10) {
			for(int b=1; b<=a; b++) {
				hap=hap+b;
			}
			System.out.println("1+....+"+a+"="+hap);
			hap=0;
		}//for end		*/
		
		
		
//-----------------------------------------------------------------------------------	
		/* 문3) 누적의 합
			중간에 .... 숫자 안 찍어도 됨
			1+....+10=55
			11+....+20=
			21+....+30=
			....
			81+....+90=
			91+....+100=
		 */
		
		/*내거
		int a3=0, b3=0;
		int hap3=0;
		for(a3=10; a3<=100; a3+=10) {
			hap3=0;
			for(b3=a3-9; b3<=a3; b3++) {
				hap3=hap3+b3;
			}
			System.out.println((b3-10)+"+....+"+a3+"="+hap3);
		}	*/
		
		/* 선생님
		int hap=0;
		for(int a=10; a<=100; a=a+10) {
			for(int b=a-9; b<=a; b++) {
				hap=hap+b;
			}
			System.out.println((a-9)+"+....+"+a+"="+hap);
			hap=0;
		}//for end		*/

	}//main() end
}//class end