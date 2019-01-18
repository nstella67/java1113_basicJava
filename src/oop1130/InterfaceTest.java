package oop1130;

interface Parent {
	//void disp() {} ����. �Ϲݸ޼ҵ�� interface���� ��� �Ұ�
	abstract void kind();	//�߻�޼ҵ�
	void breathe();	//abstract ��������
}//interface end

class Son implements Parent {	//����
	@Override
	public void kind() {
		System.out.println("�Ƶ�");
	}
	@Override
		public void breathe() {
			System.out.println("���� ������1");
		}
}//class end

class Daughter implements Parent {
	@Override
	public void kind() {
		System.out.println("��");
	}

	@Override
	public void breathe() {
		System.out.println("���� ������2");
	}	//����
	
}//class end

//-----------------------------------------------------------
public class InterfaceTest {
	public static void main(String[] args) {
		// interface : �߻�޼ҵ�θ� �����Ǿ� �ִ�
		// interface�� ��ü���� �Ұ�
		// interface������ �������� �����ϴ�
		// �߻�Ŭ�������� �� �߻�ȭ �Ǿ� �ִ�
		// Ŭ�������忡�� �θ� Ŭ����	 : extends
		//					 �������̽� : implements����
		
		//Parent parent = new Parent(); ����. ��ü�����Ұ�
		
		Son son = new Son();
		son.kind();
		son.breathe();
		
		Daughter daugh = new Daughter();
		daugh.kind();
		daugh.breathe();
		
		// ������
		Parent parent = new Son();
		parent.kind();
		parent.breathe();
		
		parent = new Daughter();
		parent.kind();
		parent.breathe();

	}//main() end
}//class end
