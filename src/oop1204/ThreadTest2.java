package oop1204;

class MyThread2 extends Thread {	//Ŭ������ ���ϻ�Ӹ� ����
												// �ٸ� Ŭ������ ��ӹ��� ���Ѵ�
												//Runnable interface(���߻�Ӱ���) Ȱ�뵵�� �� ����
	private int num;
	private String name;
	public MyThread2() {}
	public MyThread2(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int a=0; a<this.num; a++) {
			System.out.println(name+":"+a);
		}
	}//run() end
}//class end
//---------------------------------------------------------------------
public class ThreadTest2 {
	public static void main(String[] args) {
		// Thread Ŭ����
		//2) �����带 ����� ���
		
		MyThread2 t1 = new MyThread2(100, "��");
		t1.start();
		
		MyThread2 t2 = new MyThread2(100, "�ڡ�");
		t2.start();
		
		MyThread2 t3 = new MyThread2(100, "�ڡڡ�");
		t3.start();
		
	}//main() end
}//class end
