package oop1129;

class School {
	String name = "�б�";
	public School() {
		System.out.println("School()...");
	}
}//class end

class MiddleSchool extends School {
	String name = "���б�";	//�ڽ��� ��������� �켱������ ����
	public MiddleSchool() {
		super();	//��������
		System.out.println("MiddleSchool()...");
	}
	
	public void disp() {
		String name = "�ڹ����б�"; 		//�Ϲ� ��������
		System.out.println(name);		//�ڹ����б�
		System.out.println(this.name);	//���б�
		System.out.println(super.name);	//�б�
	}
}//class end

//------------------------------------------------------------------
public class SuperTest {
	public static void main(String[] args) {
		// �θ� : super
		// super	: �ڽ�Ŭ������ �θ�Ŭ���� �ʵ忡 ������ ��
		// super()	: �ڽ�Ŭ���� ������ �Լ��� �θ�Ŭ���� ������ �Լ� ȣ���� ��
		// this		: �ʵ�� �Ű������� �����ϱ� ���ؼ�
		// this()	: ������ �Լ��� �ڽ��� ������ �Լ��� ȣ���� ��
		
		
		//�������Լ� ȣ�����(�θ���ڽ�)
		//School() �� MiddleSchool()
		MiddleSchool ms = new MiddleSchool();
		
		ms.disp();
		
	}//main() end
}//class end