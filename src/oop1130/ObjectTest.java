package oop1130;

class Print {
	//method overloading : ���������� �ڷ���, ����
	//static : Ŭ���������� ���� ���� ����. ���� continue
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
	
	public static void view(Object obj) {	//Object�� Integer, Double, String..�� ���� �� �ִ�  //������
		System.out.println(obj.toString());
	}
	
	public static Integer dis() {
		return new Integer(7);
	}
	
	public static Double dsip2(int a) {
		return 3.4;	//autoboxing
	}
	
	public static Object disp3() {	//������
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
		/* ObjectŬ����
			�ڹ�Ŭ���� �ְ� ���� : Object
			�ڹ��� ��� Ŭ������ ObjectŬ������ �ļ��̴�
			�ڹ��� ��� Ŭ������ Object�� ���԰����ϴ�
			������
		*/
		/*
		Integer inte = new Integer(3);
		System.out.println(inte);	//3
		System.out.println(inte.toString());	//3
		
		String str = new String("Happy");
		System.out.println(str);	//Happpy
		System.out.println(str.toString()); //Happy
		
		//������
		Object object = new Integer(5);
		System.out.println(object.toString());	//5
		System.out.println(object);	//5
		
		object = new String("Apple");
		System.out.println(object.toString());
		System.out.println(object);
		
		//String name = object;	//����. �θ� �ڽĿ� �����Ϸ��ؼ�
		//������(�θ�Ŭ������ �ڽ�ũ������ ������ �� �ִ�)
		//		(��, �ڽ��Ǹ������ �������ؾ� �ѵ�
		int a = (int)3.4;
		String name = (String)objct;
		System.out.println(name.toString());
		System.out.println(name);
		*/
//--------------------------------------------------------------------
		//�޼ҵ�� ������ Object Ŭ����
		// autoboxing(�⺻������ ���޵Ǹ� �ڵ����� �������ȴ�)
		//1) �Ű������� Object Ŭ����
		/*
		Print.view(3);	
		Print.view(4.5);
		Print.view("Happy");
		
		Print.view(6);
		Print.view(7.8);
		Print.view("Apple");
		*/
		
		//2) �޼ҵ��� �������� Object Ŭ����
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
