package oop1119;

public class ForTest3 {

	public static void main(String[] args) {
		// for(;;) {} 무한루프
		
		// 문 ) x값이 10으로부터 x를 여러 번 빼 후
		//		결과가 음수가 되면 x를 몇 번 뺐는가를 구하시오
		/*
		int x=3;
		int count1=0;
		for(;;) {
			count1++;
			if(10-x<0) break;
			x=x+x;
		}
		System.out.println(count1+1);	*/
		
		/* 선생님이 한 것
		int count=0;
		int su=10;
		int x=3;
		
		for(;;) {	//무한루프
			count=count+1;
			su=su-x;
			if(su<0) break;
		}
		System.out.println(count);
		System.out.println(su);	*/
		
		// 문) 어느 달팽이는 낮에는 3cm 올라가고
		//		밤에는 2.5cm 내려온다고 할 때
		//		달팽이가 13cm의 나무 꼭대기에 올라가려면
		//		며칠이 걸리는지 구하시오
		/*내가
		double day=0.5;
		int count2=0;
		for(;;) {
			count2++;
			if((day*count2)>=13) break;
		}
		System.out.println(count2);	//26
		*/
		/* 선생님이 한 것
		int day =0;				// 며칠
		double snail=0.0;		// 달팽이
		
		for(;;) {	//무한루프
			day=day+1;
			snail=snail+3.0;
			if(snail>=13) {
				break;
			}else {
				snail=snail-2.5;
			}
		}//for end
		System.out.println(day);	//21
		System.out.println(snail);	//13
		*/
		
		
		// 문) 다음식의 결과를 구하시오
		//		1-2+3-4+5... 100
		/*
		int even=2;
		int odd=1;
		int hap=1-2;
		for(;;) {
			hap=odd-even;
			if(even==100) break;
			even=even+2;
			odd=odd+2;
		}
		System.out.println(hap);	//-1
		*/
		/* 선생님이 한 것
		int hap =0;
		boolean flag=false;
		
		for(int a=1; a<=100; a++) {
			if(flag) {
				hap=hap-a;
				flag=false;
			}else {
				hap=hap+a;
				flag=true;
			}
		}
		System.out.println(hap);
		*/
		
			
		/* 문) 1     2     3     4      5    99
				ㅡ - ㅡ + ㅡ - ㅡ + ㅡ ... ㅡ  = ?
				 2    3      4    5      6    100
		*/
		/*
		double bb=1;
		double bm=2;
		double hap2=-bm/bb;
		double hap3=bb/bm;
		boolean flag=false;
		
		for(;;) {
			if(flag) {
				hap2=hap2-(++bm/++bb);
				flag=false;
			}else {
				hap3=hap3+(++bb/++bm);
				flag=true;
			}
			if(bm==100) break;
		}
		System.out.println(hap2+hap3);		//-5.3755496949804
		*/
		/* 선생님
		double hap=0;
		boolean flag=false;
		for(int a=1; a<100; a++) {
			if(flag) {
				flag=false;
				hap=hap-((double)a/(a+1));
			}else {
				flag=true;
				hap=hap+((double)a/(a+1));
			}
		}
		System.out.println(hap);	//0.6881721793101957
		*/
		
		// 문) 두 수 사이의 합을 구하시오
		// 3+4+5 = 5+4+3
		int start=5, end=3;	//3+4+5
		int hap=0;
		
		// swap 교환. 변수끼리 교환
		if(start>end) {
			int temp = end;		//빈 변수에 먼저 옮기고
			end=start;				//
			start=temp;				//
		}	//start 변수가 end보다 크면 두 변수값을 교환
		
		for(int a=start; a<=end; a++) {
			hap=hap+a;
		}
		
		System.out.println(hap);
		
	}//main() end
}//class end