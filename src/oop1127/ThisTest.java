package oop1127;

class Sungjuk {
	// class = field(멤버변수) + method(멤버함수)

	// field 선언
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	// constructor(생성자 함수)
	// default constructor(기본생성자)는 자동생성된다
	// (단, 생성자 함수가 오버로딩이 되면 자동생성되지 않는다)
	// 기본생성자는 자동생성되지 않는 경우가 있기 때문에
	// 필요가 없어도 강제적으로 코딩하길 강추!!
	public Sungjuk() {}	//기본생성자 함수
	
	public Sungjuk(int kor, int eng, int mat) {
		//이 함수 안에서만 사용되는 kor : 일반 지역변수
		this.kor = kor;	//field와 지역변수 구분
		this.eng = eng;
		this.mat = mat;
	}
	public Sungjuk(String n, int k, int e, int m){//class 이름과 동일한 함수 여러 개 올 수 있다
		name = n;
		kor = k;
		eng = e;
		mat = m;
	}
	
	// method
	public void calc() {
		aver = (kor+eng+mat)/3;
	}
	
	public void disp() {
		String name = "솔데스크";	//일반지역변수(field가 아님)
		System.out.println(name);	//일반변수name. 특별한 언급이 없으면 지역변수가 우선순위
		System.out.println(this.name);	//field name
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
	}
}//class end

//--------------------------------------------------------------------------------
public class ThisTest {

	public static void main(String[] args) {
		/*scope	: 유효범위
					  전역변수 global variable
					  지역변수 local variable	→ 우선순위가 높다
		*/
		// this		: 나 자신을 가리키는 대명사
		//			: field와 일반 지역변수를 구분
		// this()
		
		Sungjuk one = new Sungjuk();	//one 객체(obect)
		
		Sungjuk two = new Sungjuk("홍길동", 10, 15, 25);
		two.calc();
		two.disp();
		
	}//main() end
}//class end