package oop1116;

public class IfTest2 {

	public static void main(String[] args) {
		// if 조건문
		// 성적프로그램
		String name = "홍길동";
		int kor=100, eng=100, mat=100;
		int aver = (kor+eng+mat)/3;
		
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("평균 : "+aver);
		
		// 문) 평균 95 이상이면 장학생
		if(aver>=95) {
			System.out.println("장학생");
		}//if end
		
		// 문)	국어 90이상 "A"
		//			   80이상 "B"
		//			   70이상 "C"
		//			   60이상 "D"
		//			   나머지는 "F"
		if(kor>=90) {
			System.out.println("국어 : A");
		}else if(kor>=80) {
			System.out.println("국어 : B");
		}else if(kor>=70) {
			System.out.println("국어 : C");
		}else if(kor>=60) {
			System.out.println("국어 : D");
		}else {
			System.out.println("국어 : F");
		}//if end
		
		// 문) 평균이 70점 이상이면 "합격"
		//		(단, 세 과목 중에서 한 과목이라도 40점 미만이면 "재시험")
		//		평균이 70점 미만이면 무조건 "불합격"
		if(aver<70) {
			System.out.println("불합격");
		}else if((kor<40 || eng<40 || mat<40)) {
			System.out.println("재시험");
		}else {
			System.out.println("합격");
		}
		// 방법2
		if(aver>=70) {
			if(kor<40 || eng<40 || mat<40) {
				System.out.println("재시험");
			}else {
				System.out.println("합격");
			}
		}else {
			System.out.println("불합격");
		}
		// 방법3
		if(kor>=40 && eng>=40 && mat>=40) {
			System.out.println("합격");
		}else if(aver>=70 && (kor<40 || eng<40 || mat<40)) {
			System.out.println("재시험");
		}else {
			System.out.println("불합격");
		}
		// 방법4
		if(aver>=70) {
			if(kor>=40 && eng>=40 && mat>=40) {
				System.out.println("합격");
			}else {
				System.out.println("재시험");
			}
		}else {
			System.out.println("불합격");
		}
		
		// 문) 간단한 계산기프로그램
		int a=3, b=5;
		char op='/';
		/* 출력결과
			3+5=8
			3-5=-2
			3*5=15
			3/5=0.6
			3%5=3
		*/
		if(op=='+') {
			System.out.println(a+""+op+""+b+"="+(a+b));
		}else if(op=='-') {
			System.out.println(a+""+op+""+b+"="+(a-b));
		}else if(op=='*') {
			System.out.println(a+""+op+""+b+"="+(a*b));
		}else if(op=='/') {
			System.out.println(a+""+op+""+b+"="+((double)a/b));
		}else if(op=='%') {
			System.out.println(a+""+op+""+b+"="+(a%b));
		}
		
		//
		int res1 =0;
		double res2 = 0.0;
		
		if(op=='+') {
			res1 = a+b;
		}else if(op=='-') {
			res1 = a-b;
		}else if(op=='*') {
			res1 = a*b;
		}else if(op=='/') {
			res2 = (double)a/b;
		}else if(op=='%') {
			res1 = a%b;
		}//if end
		
		if(op=='/') {
			System.out.println(a+""+op+""+b+"="+res2);
		}else {
			System.out.println(a+""+op+""+b+"="+res1);
		}
		
		
	}//main() end
}//class end
