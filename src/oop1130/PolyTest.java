package oop1130;

class School {
	public String name = "�б�";
	public String addr = "�ּ�";
	
	public School() {}
	public School(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}
}//class end

class HighSchool extends School {
	public HighSchool() {}
	public HighSchool(String n, String a) {
		//super.name = n;
		//super.addr = a;
		super(n, a);	//������ ǥ��
	}
}//class end

class MiddleSchool extends School {
	String friend = "�����";
	
	public MiddleSchool() {}
	public MiddleSchool(String name, String addr) {
		super(name, addr);
	}
}//class end

//----------------------------------------------------
public class PolyTest {
	public static void main(String[] args) {
		// Polymorphism ���� : ���°� ��������
		// �θ� ��������
		// Ŭ����(��ü) ���� ����ȯ
		// static : ���� ������ �� �ִ�(Ŭ������.~~)
		//			������ continue �ȴ�(�ּ� ����)
		
		// (Ŭ����/�������̽�)��Ӱ��迡���� ������
		
		/*
		School sch = new School();
		sch.disp();
		
		HighSchool hs = new HighSchool("�ڹٰ���б�", "��ö��");
		hs.disp();
		
		MiddleSchool ms = new MiddleSchool("�ڹ����б�", "�λ絿");
		ms.disp();
		*/
//----------------------------------------------------------------------
		//1) �ڽ�Ŭ������ �θ�Ŭ������ ������ �� �ִ�
		/*
		School sch = new HighSchool("�ڹٰ���б�", "��ö��");
		sch.disp();
		
		sch = new MiddleSchool("�ڹ����б�","�λ絿");
		sch.disp();
		
		System.out.println(sch.name);
		System.out.println(sch.addr);
		//System.out.println(sch.friend); ����
		// sch.friend �������� ����� �ƴϴ�
		*/
		
		//2) �θ�Ŭ������ �ڽ�Ŭ������ ������ �� �ִ�
		//	(��, �ڽ�Ŭ������ ������� ��ȯ�ؾ� �Ѵ�)
		/*
		School school = new School();
		HighSchool hs = new HighSchool();
		MiddleSchool ms = new MiddleSchool();
		
		int a = (int)3.4;
		school = (School)hs;
		school = hs;	//������.
		school = (School)ms;
		school = ms;
		
		//hs = school;	//����. �ڷ����� �ٸ���
		//hs = (HighSchool)school; Exception�߻�
		
		*/
//----------------------------------------------------------------------------
		// �ڹ�Ŭ���� �ְ� ���� : Object
		// �ڹ��� ��� Ŭ������ ObjectŬ������ �ļ��̴�
		// �ڹ��� ��� Ŭ������ ObjectŬ������ ���԰����ϴ�
		// ������
		Object obj = new School();
		obj = new HighSchool();
		obj = new MiddleSchool();
		

	}//main() end
}//class end
