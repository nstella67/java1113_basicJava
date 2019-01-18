package oop1130;

class Screen {
	public String getData() {
		return "";
	}
}//class end

class TypeA extends Screen {
	@Override
	public String getData() {
		return "����̾� ���ҵ�";
	}
}//class end

class TypeB extends Screen {

	@Override
	public String getData() {
		return "���� �ε��� ��";
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
	
	//2) ������
	/*
	public static void dispStar(Screen scr) {
		System.out.println(scr.getData());
	}
	*/
	
	//3) ������
	public static void dispStar(Object obj) {
		Screen scr= (Screen)obj;
		System.out.println(scr.getData());
	} 
}//class end

//------------------------------------------------------
public class ObjectTest2 {
	public static void main(String[] args) {
		// ��Ӱ��迡���� ������
		// Object Ŭ���� : �ڹ��� �ֻ��� Ŭ����
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
		
		// ta = tb; �ַ�
		//Screen scr = ta;
		//tb = (TypeB)scr;	Exception�߻�
		
		
	
	}//main() end
}//class end
