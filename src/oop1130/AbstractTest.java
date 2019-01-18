package oop1130;

abstract class Animal {		//�߻�Ŭ����
	String name;
	void view() {}			//�Ϲݸ޼ҵ�
	abstract void disp();	//�߻�޼ҵ�
}//class end

class Elephant extends Animal {
	@Override
	void disp() {	//�߻�޼ҵ尡 �ҿ��� �ϹǷ� ���������ش�
		System.out.println("����...");
		
	}
}//class end

class Tuna extends Animal {	//�߻�Ŭ������ ��ӹ�����
	@Override				//�߻�޼ҵ带 �ݵ�� �籸��(override) �ؾ��Ѵ�
	void disp() {
		System.out.println("�ϸ�...");
	}
}//class end
//-------------------------------------------------------
public class AbstractTest {
	public static void main(String[] args) {
		// abstract class �߻�Ŭ����
		// �߻�Ŭ���� = �Ϲݸ޼ҵ�(method) + �߻�޼ҵ�
		// �������̽� = �߻�޼ҵ�θ� ����
		// �߻�޼ҵ� = �޼ҵ��� body{} ���� (�ҿ�����)
		//			  �޼ҵ��� �Ӹ����� ������
		
		// �߻�Ŭ������ ��ü�� ������ �� ����
		// �߻�Ŭ������ ���� new �����ڸ� ����� �� ����
		// Animal ani = new Animal(); ����
		
		// �߻�Ŭ������ �������� �θ��Ҹ� �� �� �ִ�(extends)
		
		Elephant jumbo = new Elephant();
		jumbo.disp();
		
		Tuna nemo = new Tuna();
		nemo.disp();
		
		//�߻�Ŭ���������� ������
		Animal ani = new Elephant();
		ani.disp();
		
		ani = new Tuna();
		ani.disp();
		
	}//main() end
}//class end
