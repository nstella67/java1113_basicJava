package oop1126;	// 한 개의 소스파일에 package는 한 번만 선언
						// 현재 자신의 클래스가 선언된 위치
//package oop1123 에러

class Score {
	//field : 멤버변수 → 대부분 private으로 많이 선언(정보은닉) (선언한클래스안에서만사용가능)
	private String name;		//Score클래스 내부에서만 접근 허용
	private int kor, eng, mat;
	private int aver;
	
	//constructor : 생성자 함수 (없어도 됨. 필요하면 사용)
	public Score() {	//default constructor(기본생성자함수)
						//parameter(매개변수)가 없다
						//기본생성자함수는 자동생성된다
		System.out.println("---Score()함수 호출");
	}//Score() end
	
	//생성자함수도 오버로딩(중복정의)이 가능하다
	public Score(String n) {	//매개변수 있다
		name=n;
	}//Score() end
	
	public Score(int k, int e, int m) {
		kor=k;
		eng=e;
		mat=m;
	}//Score() end
	
	public Score(String n, int k, int e, int m) {
		name=n;
		kor=k;
		eng=e;
		mat=m;
	}//Score() end
	
	//method : 멤버함수
	public void init(String n, int k, int e, int m) {
		name=n;
		kor=k;
		eng=e;
		mat=m;
	}//초기값 대입하는 함수=생성자함수와 동일한 용도로 활용
	
	public void calc() {
		aver=(kor+eng+mat)/3;
	}
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}
	
}//class end

//----------------------------------------------------------------
public class ConstructorTest1 {

	public static void main(String[] args) {
		// constructor 생성자 함수
			// → 클래스 이름과 동일한 함수
			// → 메모리할당(객체선언)을 하기 위해 필요하다
			// → 생성자함수도 오버로딩이 가능하다
			// → 생성자함수는 리턴형이 존대하지 않는다
		
		// destructor 소멸자 함수 → 자바에는 없음
		// garbage collecting 가비지 콜렉팅
		
		//Sungjuk sj;	// 동일한 package(oop1126)내에 있으므로 접근 가능
		
		/*
		Score one = new Score();	//()안에 아무것도 없음 → 기본생성자함수
		one.calc();
		one.disp();
		
		Score two = new Score("무궁화");
		two.calc();
		two.disp();
		
		Score three = new Score(10, 20, 30);
		three.calc();
		three.disp();
		
		//생성자 함수를 이용해서 객체 초기값을 전달할 수 있다/객체를 초기화할 수 있다
		Score four = new Score("라일락", 10, 30, 50);
		four.calc();
		four.disp();
		
		Score five = new Score();
		five.init("손흥민", 90, 85, 90);
		five.calc();
		five.disp();
		*/
//----------------------------------------------------------------------------------------------------------
		/*
		Integer a = new Integer(5);	//a:객체(Object)	참조형
		System.out.println(a.toString());
		
		//int b = 3;		//기본형
		//b.  에러 안나옴
		
		Integer b = new Integer("7");
		System.out.println(b.toString());
		*/
//----------------------------------------------------------------------------
		/*
		String c = "Happy";
		String d = new String();
		d="Hello";
		String e = new String("Soldesk");
		
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(e.toString());
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		char[] ch = {'S', 'K', 'Y'};
		String f = new String(ch);	//char를 문자열형으로
		System.out.println(f);
		
		//String Buffer Class
		StringBuffer sb = new StringBuffer("APPLE");
		//String str = //StringBuffer 불러올 수 없음. 자료형이 동일해야함
		String str = new String(sb);	//stringbuffer→string으로 변환시켜줌
		System.out.println(str.toString());
		System.out.println(str);
		*/
//-----------------------------------------------------------------------------------------
		/* Random Access Memory(휘발성 메모리)
			-------------------------------------------------------- 0 address
			 static 공간	|			0 address와 가까울수록 먼저(빨리) 실행
			------------	|----------------------------------------------------
			 heap 공간	|	"라" 10 20 30			"손" 40 50 60
			 				| 	ㅡㅡㅡㅡㅡㅡㅡ 		ㅡㅡㅡㅡㅡㅡㅡ
			 				|  	ㄴ#100			 		ㄴ#200 -----------주소
			------------ |----------------------------------------------------
			 stack 공간	|	a=3	b=5	
			 				|	four=#100	five=#200		주소를 갖고 있는것은 Object값
			---------------------------------------------------------------------
		*/
		/*
		Score four = new Score("라일락", 10, 20, 30);
		four.calc();	//#100에 가서 더해서 평균 구해라.. ~를 참조해라
		Score five = new Score("손흥민", 40, 50, 60);
		five.calc();		//#200 참조
		
		four.disp();
		five.disp();
		*/
		/*
		String name = "HAPPY";
		String str = new String("HAPPY");
		
		if(name==str) {	//#50==#60  value가 주소이기 때문에 다르다
			// 참조하고 있는 주소 비교하고 있을 뿐
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}//if end	//다르다	메모리 주소가 다르다. 
		
		// 주의. 참조형의 내용비교는 기본형과 같이 접근하면 안된다
		// 문자열의 내용을 비교하고자 할 때
		// == 같다 연산자는 사용하지 말 것
		
		// equals()를 이용해서 내용 비교하자!
		if(name.equals(str)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//현재 object가 어떤 주소를 참조하고 있는지 확인
		String six = name;	//#50
		
		System.out.println(name.hashCode());
		System.out.println(six.hashCode());
		System.out.println(str.hashCode());
		*/
		
		// 같은 곳을 참조하고 있는지 알아볼 때 hashCode()
		// 객체가 참조하고 있는 지문형태의 값(주소)
		Score one = new Score();
		Score two = new Score();
		Score three =  one;
		System.out.println(one.hashCode());		//#50
		System.out.println(two.hashCode());		//#60
		System.out.println(three.hashCode());	//#50
			//one, three 같은 주소 참조
		

	}//main() end
}//class end