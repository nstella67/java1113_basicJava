package oop1204;

class MyThread3 implements Runnable {
	private int num;
	private String name;
	public MyThread3() {}
	public MyThread3(int num, String name) {
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
public class ThreadTest3 {
	public static void main(String[] args) {
		// Runnable interface
		//3) �����带 ����� ���
		
		Thread t1 = new Thread(new MyThread3(100, "��"));		//Thread ũ������ MyThread ����
		t1.start();	//JVM�� ������ �����ڸ� ȣ���ϰ� run()�޼ҵ� ȣ��
		
		Thread t2 = new Thread(new MyThread3(100, "�ڡ�"));		//Thread ũ������ MyThread ����
		t2.start();
		
		Thread t3 = new Thread(new MyThread3(100, "�ڡڡ�"));		//Thread ũ������ MyThread ����
		t3.start();
		
	}//main() end
}//class end
