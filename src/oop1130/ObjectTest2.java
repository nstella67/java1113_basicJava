package oop1130;

class Screen {
	public String getData() {
		return "";
	}
}//class end

class TypeA extends Screen {
	@Override
	public String getData() {
		return "보헤미안 랩소디";
	}
}//class end

class TypeB extends Screen {

	@Override
	public String getData() {
		return "국가 부도의 날";
	}
	
} //class end

class Picture {
	/*
	public static void dispStar(TypeA ta) {
		System.out.println(ta.getData());
	}
	public static void dispStar(TypeB tb) {
		System.out.println(tb.getData());
	}
	*/
	
	//2) 다형성
	/*
	public static void dispStar(Screen scr) {
		System.out.println(scr.getData());
	}
	*/
	
	//3) 다형성
	public static void dispStar(Object obj) {
		Screen scr= (Screen)obj;
		System.out.println(scr.getData());
	} 
}//class end

//------------------------------------------------------
public class ObjectTest2 {
	public static void main(String[] args) {
		// 상속관계에서의 다형성
		// Object 클래스 : 자바의 최상위 클래스
		/*
		Screen screen = new TypeA();
		System.out.println(screen.getData());
		
		screen = new TypeB();
		System.out.println(screen.getData());
		*/
		
		TypeA ta = new TypeA();
		TypeB tb = new TypeB();
		
		Picture.dispStar(ta);
		Picture.dispStar(tb);
		
		// ta = tb; 애러
		//Screen scr = ta;
		//tb = (TypeB)scr;	Exception발생
		
		
	
	}//main() end
}//class end
