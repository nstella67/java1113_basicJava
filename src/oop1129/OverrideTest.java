package oop1129;

import java.nio.channels.Pipe;

import javax.management.loading.PrivateClassLoader;

class Korea {	//extends Object는 생략가능
	String name = "한국";
	void disp() {
		System.out.println("Korea...");
	}
}//class end

class Seoul extends Korea {
	String name = "서울";

	@Override	//annotation 주석	오버라이딩 : 함수 재정의
	void disp() {
		System.out.println("Seoul...");
	}
}//class end

class Jeju extends Korea{
	@Override
	void disp() {
		//super.disp(); 부모꺼
		System.out.println("Jeju...");
	}
}//class end

class Busan extends Korea {
	@Override
	public String toString() {	//
		return "부산";
	}
}//class end

class Suwon extends Object {
	private String id = "webmaster";
	private String password = "1234";
	
	@Override
	public String toString() {
		return "Suwon [id=" + this.id + ", password="+this.password + "]";
	}
}//class end

class Incheon extends Korea {
	private String name = "솔데스크";
	private String addr = "종로구 관철동";
	
	//toString() 자동추가 : Source → Generate toString()
	@Override
	public String toString() {
		return "Incheon [name=" + name + ", addr=" + addr + "]";	//자동코딩
	}
	
	
}//class end

//-------------------------------------------------------------------------------
public class OverrideTest /*(extends Object 생략)*/ {
	public static void main(String[] args) {
		// Method Override	재정의
						  //→ 상속관계에서 메소드를 다시 수정(리폼)
		// Method Overload	중복정의 :  함수명중복
		
		/*오버라이딩 전
		Seoul seoul = new Seoul();
		System.out.println(seoul.name);	//한국
		seoul.disp();					//Korea...
		
		//오버라이딩 후
		Seoul seoul = new Seoul();
		System.out.println(seoul.name);	//서울
		seoul.disp();					//Seoul...
		
		Jeju jeju = new Jeju();
		System.out.println(jeju.name);	//한국 → 오버리이딩 안 한 것은 부모꺼 그대로 물려받는다
		jeju.disp();					//Jeju...
		*/
//-------------------------------------------------------------------------------
		/*  자바의 기본 패키지 : java.lang
		     자바의 최고조상 클래스 : Object
		     자바에서 클래스 생성할 때 무조건 Object 클래스를 상속받는다!
		*/
		
		Busan busan = new Busan();
		System.out.println(busan.toString());
		System.out.println(busan);	//객체명으로도 호출가능
		//object클래스에서 물려받은 toString()은 생략가능
		
		Suwon suwon = new Suwon();
		System.out.println(suwon.toString());
		System.out.println(suwon);
		
		Incheon incheon = new Incheon();
		System.out.println(incheon.toString());
		System.out.println(incheon);
		
		
	}//main() end
}//class end