package oop1129;

import java.nio.channels.Pipe;

import javax.management.loading.PrivateClassLoader;

class Korea {	//extends Object�� ��������
	String name = "�ѱ�";
	void disp() {
		System.out.println("Korea...");
	}
}//class end

class Seoul extends Korea {
	String name = "����";

	@Override	//annotation �ּ�	�������̵� : �Լ� ������
	void disp() {
		System.out.println("Seoul...");
	}
}//class end

class Jeju extends Korea{
	@Override
	void disp() {
		//super.disp(); �θ�
		System.out.println("Jeju...");
	}
}//class end

class Busan extends Korea {
	@Override
	public String toString() {	//
		return "�λ�";
	}
}//class end

class Suwon extends Object {
	private String id = "webmaster";
	private String password = "1234";
	
	@Override
	public String toString() {
		return "Suwon [id=" + this.id + ", password="+this.password + "]";
	}
}//class end

class Incheon extends Korea {
	private String name = "�ֵ���ũ";
	private String addr = "���α� ��ö��";
	
	//toString() �ڵ��߰� : Source �� Generate toString()
	@Override
	public String toString() {
		return "Incheon [name=" + name + ", addr=" + addr + "]";	//�ڵ��ڵ�
	}
	
	
}//class end

//-------------------------------------------------------------------------------
public class OverrideTest /*(extends Object ����)*/ {
	public static void main(String[] args) {
		// Method Override	������
						  //�� ��Ӱ��迡�� �޼ҵ带 �ٽ� ����(����)
		// Method Overload	�ߺ����� :  �Լ����ߺ�
		
		/*�������̵� ��
		Seoul seoul = new Seoul();
		System.out.println(seoul.name);	//�ѱ�
		seoul.disp();					//Korea...
		
		//�������̵� ��
		Seoul seoul = new Seoul();
		System.out.println(seoul.name);	//����
		seoul.disp();					//Seoul...
		
		Jeju jeju = new Jeju();
		System.out.println(jeju.name);	//�ѱ� �� �������̵� �� �� ���� �θ� �״�� �����޴´�
		jeju.disp();					//Jeju...
		*/
//-------------------------------------------------------------------------------
		/*  �ڹ��� �⺻ ��Ű�� : java.lang
		     �ڹ��� �ְ����� Ŭ���� : Object
		     �ڹٿ��� Ŭ���� ������ �� ������ Object Ŭ������ ��ӹ޴´�!
		*/
		
		Busan busan = new Busan();
		System.out.println(busan.toString());
		System.out.println(busan);	//��ü�����ε� ȣ�Ⱑ��
		//objectŬ�������� �������� toString()�� ��������
		
		Suwon suwon = new Suwon();
		System.out.println(suwon.toString());
		System.out.println(suwon);
		
		Incheon incheon = new Incheon();
		System.out.println(incheon.toString());
		System.out.println(incheon);
		
		
	}//main() end
}//class end