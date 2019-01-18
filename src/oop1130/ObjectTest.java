package oop1130;

class Print {
	//method overloading : 내개변수의 자료형, 갯수
	//static : 클래스명으로 직접 접근 간으. 연산 continue
	/*
	public static void view(Integer a) {
		System.out.println(a.toString());
	}
	public static void view(Double a) {
		System.out.println(a.toString());
	}
	public static void view(String a) {
		System.out.println(a.toString());
	}
	*/
	
	public static void view(Object obj) {	//Object가 Integer, Double, String..다 받을 수 있다  //다형성
		System.out.println(obj.toString());
	}
	
	public static Integer dis() {
		return new Integer(7);
	}
	
	public static Double dsip2(int a) {
		return 3.4;	//autoboxing
	}
	
	public static Object disp3() {	//다형성
		return new Integer(9);
	}
	public static Object disp4() {
		return new Double(8.7);
	}
	public static Object disp5() {
		return "SOLDESK";
	}
	
	
	
	
}//class end

//-------------------------------------------------------------------
public class ObjectTest {

	public static void main(String[] args) {
		/* Object클래스
			자바클래스 최고 조상 : Object
			자바의 모든 클래스는 Object클래스의 후손이다
			자바의 모든 클래스는 Object에 대입가능하다
			다형성
		*/
		/*
		Integer inte = new Integer(3);
		System.out.println(inte);	//3
		System.out.println(inte.toString());	//3
		
		String str = new String("Happy");
		System.out.println(str);	//Happpy
		System.out.println(str.toString()); //Happy
		
		//다형성
		Object object = new Integer(5);
		System.out.println(object.toString());	//5
		System.out.println(object);	//5
		
		object = new String("Apple");
		System.out.println(object.toString());
		System.out.println(object);
		
		//String name = object;	//에러. 부모가 자식에 대입하려해서
		//다형성(부모클래스가 자식크래스에 대입할 수 있다)
		//		(단, 자식의모양으로 형변한해야 한디
		int a = (int)3.4;
		String name = (String)objct;
		System.out.println(name.toString());
		System.out.println(name);
		*/
//--------------------------------------------------------------------
		//메소드와 관련한 Object 클래스
		// autoboxing(기본형값이 전달되면 자동으로 참조형된다)
		//1) 매개변수가 Object 클래스
		/*
		Print.view(3);	
		Print.view(4.5);
		Print.view("Happy");
		
		Print.view(6);
		Print.view(7.8);
		Print.view("Apple");
		*/
		
		//2) 메소드의 리턴형이 Object 클래스
		Object obj = Print.disp3();
		System.out.println(obj.toString());	//9
		System.out.println(obj);			//9
		
		Integer inte = (Integer) Print.disp3();
		
		Double dou = (Double) Print.disp4();
		
		String str = (String) Print.disp5();
		
		System.out.println(inte.toString());	//9
		System.out.println(dou.toString());		//8.7
		System.out.println(str.toString());		//SOLDESK

	}//main() end
}//class end
