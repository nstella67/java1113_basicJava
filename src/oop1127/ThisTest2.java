package oop1127;

class Score {
	//fied(멤버변수)
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//constructor(생성자 함수)
	public Score() {	//default constructor기본생성자함수
		//생성자함수가 자신의 생성자함수를 호출하는 경우
		//Score("홍길동"); 에러
		this("홍길동");
	}
	
	public Score(String name) {
		calc();	//생성자함수에서 일반함수를 호출할 수 있다
	}
	
	public Score(int kor, int eng, int mat) {
		//기본 생성자 함수 호출
		//Score();	에러
		this();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		//this(); 에러. 생성자함수는 첫 줄에서 호출해야 한다
		// 메모리 확보를 해야하기 때문에
	}
	
	public void calc() {
		//this(10, 20, 30); 에러. 일반함수에서 생성자함수 호출할 수 없다
		aver = (kor+eng+mat)/3;
	}
}//class end

//-------------------------------------------------------------------------------

public class ThisTest2 {

	public static void main(String[] args) {
		// this()	: 생성자함수가 자신의 생성자함수를 호출할 때
					// 상속관계에 있을 때 
		// this		: field(멤버변수)를 가리킬 때
		// "this"	: 문자열상수
		
		
		
		
		
		
		

	}//main() end
}//class end