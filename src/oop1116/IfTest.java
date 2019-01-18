package oop1116;

public class IfTest {

	public static void main(String[] args) {
		// 제어문 : 프로그램의 흐름 제어
		// 조건문 : 삼항연산자, if문, switch문
		// 반복문 : for문, while문, do~while문
		// break문, continue문
		
		/* -------- if문 --------------------------------------------------
			if(조건) {true일때 실행}		//조건은 boolean형
			
			if(조건) {true일때}		//삼항연산자와 같음
			else {false일때}
			
			if(조건1) {조건1true일때}			//조건 갯수 제한 없다
			else if(조건2) {조건2true일때}		//조건1 false일때, 조건2true면 빠져나감
			else if(조건3) {조건3true일때}		//조건2 false일때, 조건3true면 빠져나감
			else if(조건4) {조건4true일때}		//조건3 false일때, 조건4true면 빠져나감
			else {모든조건false일때}			//안와도 됨. 안오면 false일때 실행x
		*/
		
		/* 문) 임의의 수가 양수, 음수, 제로인지?
		int a = 0;
		if(a>0) {		//0==0
			System.out.println(a+" : 양수");
		}else if(a<0) {
			System.out.println(a+" : 음수");
		}else {
			System.out.println(a+" : 제로");
		}//if end
		
		/* if문 여러 개 써도 됨
		if(a==0) {
			System.out.println(a+" : 제로");
		}//if end
		
		if(a>0) {
			System.out.println(a+" : 양수");
		}else {
			System.out.println(a+" : 음수");
		}//if end
		*/
		/* 하나의 if문
		if(양수?) {		//0==0
			System.out.println(a+" : 양수");
		}else if(음수?) {
			System.out.println(a+" : 음수");
		}else if(제로?) {
			System.out.println(a+" : 제로");
		}else {
			System.out.println(a+" : 기타");
		}//if end  */
//-----------------------------------------------------------------------------
		// 문) 절대값을 구하시오 (무조건 양수)
		int a = 0;
		if(a>0) {
			System.out.println(a+"의 절대값 : "+a);
		}else {
			System.out.println(a+"의 절대값 : "+ -a);
		}//if end
		
		// 문) 두 수 사이의 차이를 구하시오
		int x=-95, y=-95;
		if(x>y) {
			System.out.println(x+", "+y+" 사이의 차이 : "+(x-y));
		}else if(x<y) {
			System.out.println(x+", "+y+" 사이의 차이 : "+(y-x));
		}else {
			System.out.println(x+", "+y+" 사이의 차이 : "+0);
		}//if end
		
		//선생님이 한 것
		int diff = x-y;
		if(diff>0) {
			System.out.println(x+", "+y+" 사이의 차이 : "+diff);
		}else if(diff<0) {
			System.out.println(x+", "+y+" 사이의 차이 : "+-diff);
		}else {
			System.out.println(x+", "+y+" 사이의 차이 : "+0);
		}//if end
//---------------------------------------------------------------------------		
		// 문) 성별코드 1, 3, 5 → 남자
		//					 2, 4, 6
		int code = 5;
		if(code==1 || code==3 || code==5) {
			System.out.println("성별 : 남자");
		}else {		//else if(code==2 || code==4 || code==6)
			System.out.println("성별 : 여자");
		}
		
		if(code%2==1) {
			System.out.println("성별 : 남자");
		}else if(code%2==0) {
			System.out.println("성별 : 남자");
		}
		

	}//main() end

}//class end
