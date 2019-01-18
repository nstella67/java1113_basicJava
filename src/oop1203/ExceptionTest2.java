package oop1203;

class Test {
	//1) ���� ó�� ���
	/*
	public void print() {
		try {
			int a = 3/0;
		}catch(Exception e) {}
	}
	
	public void disp() {
		try {
			int a = Integer.parseInt("SKY");
		}catch(Exception e) {}
	}
	*/
	
	
	//2) throw��
	public void print() throws Exception {
			int a = 3/0;
	}
	
	public void disp() throws Exception {
			int a = Integer.parseInt("SKY");
	}
			
		
}//class end
//---------------------------------------------------------------------
public class ExceptionTest2 {
	public static void main(String[] args) {
		// Exception ����ó��
		// throw ��
		// �޼ҵ� ȣ��� ����ó���� �Ѳ����� ��Ƽ� ó��
		
		try {
			System.out.println("OPEN");
			Test test = new Test();
			test.print();
			test.disp();
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("CLOSE");
		
		}
		System.out.println("END");
		
		
	}//main() end
}//class end
