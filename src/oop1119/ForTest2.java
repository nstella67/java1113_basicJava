package oop1119;

public class ForTest2 {

	public static void main(String[] args) {
		// 누적합, 누적곱
		/* 1~5사이 중에서 짝수의 합을 구하시오
		int hap = 0;
		for(int a=1; a<=5; a+=1) {
			if(a%2==0) {
				hap = hap + a;
			}
		}//for end
		System.out.println(hap);
		*/
		
		/*1~100사이 중에서 홀수의 합을 구하시오
		int hap=0;
		for(int a=1; a<=100; a++) {
			if(a%2!=0) {	//a%2==1
				hap=hap+a;
			}
		}
		System.out.println(hap);
		*/
		
		/* 문) 4팩토리얼 값 구하시오. 4*3*2*1=4!
		long gop=1;		//곱하기는 기하급수적으로 증가하므로 long 자료형
		for(int a=4; a>=1; a--) {
			gop=gop*a;
		}
		System.out.println(gop); */
		/*선생님이 한 것
		long gop=1;
		int fact=4;
		for(int a=fact; a>=1; a--) {
			gop=gop*a;
		}//for end
		System.out.println(gop); */
		
		/* 문) 1~100사이에서 짝수의 합과, 홀수의 합을 각각 구하시오
		// 1)
		int even=0;		//짝수합
		int odd=0;		//홀수합
		for(int a=1; a<=100; a++) {
			if(a%2==0) {
				even=even+a;
			} else {
				odd=odd+a;
			}
		}//for end
		System.out.println("짝수의 합 : "+even);
		System.out.println("홀수의 합 : "+odd);	
		
		
		// 2) switch이론
		int even=0, odd=0;
		boolean flag=false;
		
		for(int a=1; a<=100; a++) {
			if(flag) {
				even=even+a;
				flag=false;
			}else {
				odd=odd+a;
				flag=true;
			}
		}//for end
		System.out.println("짝수의 합 : "+even);
		System.out.println("홀수의 합 : "+odd);
		*/
		
	}//main() end
}//class end