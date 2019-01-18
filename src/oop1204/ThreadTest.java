package oop1204;

class MyThread1 {
	private int num;
	private String name;
	public MyThread1() {}
	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void run() {
		for(int a=0; a<this.num; a++) {
			System.out.println(name+":"+a);
		}
	}//run() end
	
	public void start() {
		run();
	}//start() end
}//class end
//-------------------------------------------------------------------
public class ThreadTest {

	public static void main(String[] args) {
		// Thread ������
		//1) �����带 ������� ���� ���
		MyThread1 t1 = new MyThread1(100, "��");
		t1.start();
		
		MyThread1 t2 = new MyThread1(100, "�ڡ�");
		t2.start();
		//t1 ������ �� ���� ������ t2�� ��ٸ�
		
		MyThread1 t3 = new MyThread1(100, "�ڡڡ�");
		t3.start();
		
	}//main() end
}//class end
