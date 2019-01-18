package oop1126;

class Sungjuk {	//package class Sungjuk �� package����. ���� ����
	// �������(field, column, property �Ӽ�)
	//private String name;	//private : field�� ���� ����
	public String name;			//��ΰ���
	int kor, eng, mat;			//package�������� ����
									//������Ű��(oop1126package)�������� ���� ����
	private int aver;				//�����
	
	// ����Լ�(method, function, procedure)
	void calc() {
		// Ŭ���� ���ο����� ��������� ������� ��� ����鰣���� ���ٰ���
		aver=(kor+eng+mat)/3;
	}//calc() end
	public void disp() {		//����
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp() end
	
	private void test() {		//�����
		
	}
}//class end

//-------------------------------------------------------------------------
public class ClassTest1 {

	public static void main(String[] args) {
		// class Ŭ����
		// Ŭ���� ���� : �������(field) + ����Լ�(method)
							//(������, �Լ��� �������� �ִ�)
		// (���� Ŭ���� : Ŭ���� �ȿ� Ŭ���� �� �� �ִ�(���߿�))
		/* Access Modifier(��������, ���ټ���, Scope, ��ȿ����)
			1) private		: ����� (�������ٸ� ���)
			2) package	: ���� ���������� ����/����. ��������
			3) protected	: �ٸ� ������ �ִ� ��Ӱ��� Ŭ������ �������
			4) public		: ��� ����
		*/
		
		// ���ǻ���!!
		// �� ���� .java �ҽ����Ͽ� ���� ���� Ŭ���� ���ǰ� ����(���� �� ���� Ŭ������)
		// �̷� ��� �� ���� Ŭ������ public �ؾ� �Ѵ�
		
		// Ŭ���� : ����� ���� �ڷ���
		// �ڷ��� : �⺻��, ������(Ŭ����)
		// ������ : �޸� �Ҵ��� �ؾ��Ѵ�.
		// new ������ : �޸� �Ҵ�(Ȯ��) ������
		/*
		int a =3;	//a:����
		Sungjuk sj = new Sungjuk();		//sj : ��ü(Object. ������ �ƴ�)
							//Sungjuk() : �������Լ�
		sj.name = "ȫ�浿";
		sj.kor = 50;
		sj.eng = 60;
		sj.mat = 70;
		//sj.aver	//����. not visible. private�Ӽ��� Ŭ���� ���ο����� ���� ����
		
		System.out.println(sj.name);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.mat);
		
		System.out.println(Integer.SIZE);	//32
		System.out.println(Math.PI);		//3.1415..
	
		sj.calc();
		sj.disp();
		//sj.test; ����. private �Ӽ��� ���پȵ�
		*/
		
		//Object Oriented Program ��ü ���� ���α׷�
		Sungjuk kim  = null;	//��ü �̸��� ����. ������ ����
									// �޸𸮰� �Ҵ�Ǿ� ���� �ʴ�
									// ��ü �ʱ�ȭ�Ҷ� ���
		
		//sj = null;	//������ ��� �ִ� �޸� �� ����
		//int a = null; ���� ���� �ʱ�ȭ���� null �� �� ����
		kim = new Sungjuk();	//�������Լ�
		//�޸𸮸� Ȯ���Ϸ��� �������Լ��� �� �;��Ѵ�
		kim.name = "����ȭ";
		kim.kor=10;
		kim.eng=20;
		kim.mat=30;
		//kim.aver ���� not visible
		
		kim.calc();
		kim.disp();
		
		Sungjuk lee = null;	//�޸𸮾���
		//lee.disp();	//NellPointerException
		

	}//main() end
}//class end