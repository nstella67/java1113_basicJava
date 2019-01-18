package oop1128;


class Sungjuk {
	//field(멤버변수)
	String name;		//Access Modifier : package 생략
	int kor, eng, mat;
	int aver;
	
	//constructort(생성자함수)
	public Sungjuk() {}// default constructor(기본생성자함수)

	public Sungjuk(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//method 함수
	public void calc() {
		this.aver = (this.kor+this.eng+this.mat)/3;
	}
	
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
	}
	
}//class end

class Print {
	public void view1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	public void view2(Sungjuk a, Sungjuk b) {//call by reference
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		a.disp();
		b.disp();
	}
}//class end


//-------------------------------------------------------------------------------------------------------------
public class ArrayTest {

	public static void main(String[] args) {
		/* 객체 배열	Object Array
		System.out.println("< 객체도 배열을 가질 수 있다 >");
		int[] a = {2, 4, 6};
		Integer b1 = new Integer(1);
		Integer b2 = new Integer(3);
		Integer b3 = new Integer(5);
		
		int[] b = new int[3];
		Integer[] inte = new Integer[3];	//객체 배열
		inte[0] = new Integer(1);
		inte[1] = new Integer(3);
		inte[2] = new Integer(5);
		System.out.println(inte[0].toString());
		System.out.println(inte[1].toString());
		System.out.println(inte[2].toString());
		System.out.println(inte[0]);	//Wrapper Class에서 .toString 생략가능
		System.out.println(inte[1]);
		System.out.println(inte[2]);
		
		Integer i = 7;	//기본형에 가깝게 사용하는 것 허용
							//autoboxing 기본형 값이 자동으로 참조형변환된다
		System.out.println(i);
		System.out.println(i.toString());
		
System.out.println("-------------------------------------------------------------------");
		*/
//------------------------------------------------------------------------------------------------------------
		/*
		Integer[] inte2 = {	new Integer(1),
								new Integer(3),
								new Integer(5)	};	//객체배열
		
		//Integer[] inte3 = new Integer[] {1, 3, 5};	//표현가능
		int size = inte2.length;
		for(int idx=0; idx<size; idx++) {
			System.out.println(inte2[idx].toString());
			System.out.println(inte2[idx]);
		}//for end
		
		// 문) inte2[0]와 inte2[2]의 요소 값을 서로 교환하시오
		System.out.println(" 문) inte2[0]와 inte2[2]의 요소 값을 서로 교환하시오");
		Integer tmp = inte2[0];
		inte2[0] = inte2[2];
		inte2[2] = tmp;
		for(int idx=0; idx<size; idx++) {
			System.out.println(inte2[idx]);
		}//for end
System.out.println("-------------------------------------------------------------------");
		 */
//------------------------------------------------------------------------------------------------------------
		/*
		Sungjuk[] sj =  {new Sungjuk("무궁화", 30, 40, 50),
							new Sungjuk("라일락", 20, 60, 80),
							new Sungjuk("홍길동", 60, 70, 90)	};
		
		sj[0].calc();
		sj[1].calc();
		sj[2].calc();
		
		sj[0].disp();
		sj[1].disp();
		sj[2].disp();
		
		for(int idx=0; idx<sj.length; idx++) {
			sj[idx].calc();
			sj[idx].disp();
		}
		
		// 문) sj[0]와 sj[2]요소를 서로 교환하시오
		Integer tmp = inte[0];
	    inte[0] = inte[2];
	    inte[2] = tmp;
	    
	    System.out.println(inte[0]);
	    System.out.println(inte[1]);
	    System.out.println(inte[2]);
		*/
//------------------------------------------------------------------------------------------
		// 메소드 호출 방식
		// Call by value			값에 의한 호출
		// Call by reference	참조에 의한 호출
		
		Sungjuk one = new Sungjuk("무궁화", 20, 30, 45);
		Sungjuk two = new Sungjuk("라일락", 75, 80, 90);
		
		Print prn = new Print();
		prn.view1(one.kor, two.kor);//20, 75 call by value
		prn.view2(one, two);	//#50, #60 call by reference
		
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		
		// 문) one와 two를 서로 교환하시오
		Sungjuk tmp = one;
		one = two;
		two = tmp;
		

	}//main() end
}//class end