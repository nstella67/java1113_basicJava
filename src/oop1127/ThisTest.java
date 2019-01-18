package oop1127;

class Sungjuk {
	// class = field(�������) + method(����Լ�)

	// field ����
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	// constructor(������ �Լ�)
	// default constructor(�⺻������)�� �ڵ������ȴ�
	// (��, ������ �Լ��� �����ε��� �Ǹ� �ڵ��������� �ʴ´�)
	// �⺻�����ڴ� �ڵ��������� �ʴ� ��찡 �ֱ� ������
	// �ʿ䰡 ��� ���������� �ڵ��ϱ� ����!!
	public Sungjuk() {}	//�⺻������ �Լ�
	
	public Sungjuk(int kor, int eng, int mat) {
		//�� �Լ� �ȿ����� ���Ǵ� kor : �Ϲ� ��������
		this.kor = kor;	//field�� �������� ����
		this.eng = eng;
		this.mat = mat;
	}
	public Sungjuk(String n, int k, int e, int m){//class �̸��� ������ �Լ� ���� �� �� �� �ִ�
		name = n;
		kor = k;
		eng = e;
		mat = m;
	}
	
	// method
	public void calc() {
		aver = (kor+eng+mat)/3;
	}
	
	public void disp() {
		String name = "�ֵ���ũ";	//�Ϲ���������(field�� �ƴ�)
		System.out.println(name);	//�Ϲݺ���name. Ư���� ����� ������ ���������� �켱����
		System.out.println(this.name);	//field name
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
	}
}//class end

//--------------------------------------------------------------------------------
public class ThisTest {

	public static void main(String[] args) {
		/*scope	: ��ȿ����
					  �������� global variable
					  �������� local variable	�� �켱������ ����
		*/
		// this		: �� �ڽ��� ����Ű�� ����
		//			: field�� �Ϲ� ���������� ����
		// this()
		
		Sungjuk one = new Sungjuk();	//one ��ü(obect)
		
		Sungjuk two = new Sungjuk("ȫ�浿", 10, 15, 25);
		two.calc();
		two.disp();
		
	}//main() end
}//class end