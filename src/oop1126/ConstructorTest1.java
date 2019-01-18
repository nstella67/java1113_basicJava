package oop1126;	// �� ���� �ҽ����Ͽ� package�� �� ���� ����
						// ���� �ڽ��� Ŭ������ ����� ��ġ
//package oop1123 ����

class Score {
	//field : ������� �� ��κ� private���� ���� ����(��������) (������Ŭ�����ȿ�������밡��)
	private String name;		//ScoreŬ���� ���ο����� ���� ���
	private int kor, eng, mat;
	private int aver;
	
	//constructor : ������ �Լ� (��� ��. �ʿ��ϸ� ���)
	public Score() {	//default constructor(�⺻�������Լ�)
						//parameter(�Ű�����)�� ����
						//�⺻�������Լ��� �ڵ������ȴ�
		System.out.println("---Score()�Լ� ȣ��");
	}//Score() end
	
	//�������Լ��� �����ε�(�ߺ�����)�� �����ϴ�
	public Score(String n) {	//�Ű����� �ִ�
		name=n;
	}//Score() end
	
	public Score(int k, int e, int m) {
		kor=k;
		eng=e;
		mat=m;
	}//Score() end
	
	public Score(String n, int k, int e, int m) {
		name=n;
		kor=k;
		eng=e;
		mat=m;
	}//Score() end
	
	//method : ����Լ�
	public void init(String n, int k, int e, int m) {
		name=n;
		kor=k;
		eng=e;
		mat=m;
	}//�ʱⰪ �����ϴ� �Լ�=�������Լ��� ������ �뵵�� Ȱ��
	
	public void calc() {
		aver=(kor+eng+mat)/3;
	}
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}
	
}//class end

//----------------------------------------------------------------
public class ConstructorTest1 {

	public static void main(String[] args) {
		// constructor ������ �Լ�
			// �� Ŭ���� �̸��� ������ �Լ�
			// �� �޸��Ҵ�(��ü����)�� �ϱ� ���� �ʿ��ϴ�
			// �� �������Լ��� �����ε��� �����ϴ�
			// �� �������Լ��� �������� �������� �ʴ´�
		
		// destructor �Ҹ��� �Լ� �� �ڹٿ��� ����
		// garbage collecting ������ �ݷ���
		
		//Sungjuk sj;	// ������ package(oop1126)���� �����Ƿ� ���� ����
		
		/*
		Score one = new Score();	//()�ȿ� �ƹ��͵� ���� �� �⺻�������Լ�
		one.calc();
		one.disp();
		
		Score two = new Score("����ȭ");
		two.calc();
		two.disp();
		
		Score three = new Score(10, 20, 30);
		three.calc();
		three.disp();
		
		//������ �Լ��� �̿��ؼ� ��ü �ʱⰪ�� ������ �� �ִ�/��ü�� �ʱ�ȭ�� �� �ִ�
		Score four = new Score("���϶�", 10, 30, 50);
		four.calc();
		four.disp();
		
		Score five = new Score();
		five.init("�����", 90, 85, 90);
		five.calc();
		five.disp();
		*/
//----------------------------------------------------------------------------------------------------------
		/*
		Integer a = new Integer(5);	//a:��ü(Object)	������
		System.out.println(a.toString());
		
		//int b = 3;		//�⺻��
		//b.  ���� �ȳ���
		
		Integer b = new Integer("7");
		System.out.println(b.toString());
		*/
//----------------------------------------------------------------------------
		/*
		String c = "Happy";
		String d = new String();
		d="Hello";
		String e = new String("Soldesk");
		
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(e.toString());
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		char[] ch = {'S', 'K', 'Y'};
		String f = new String(ch);	//char�� ���ڿ�������
		System.out.println(f);
		
		//String Buffer Class
		StringBuffer sb = new StringBuffer("APPLE");
		//String str = //StringBuffer �ҷ��� �� ����. �ڷ����� �����ؾ���
		String str = new String(sb);	//stringbuffer��string���� ��ȯ������
		System.out.println(str.toString());
		System.out.println(str);
		*/
//-----------------------------------------------------------------------------------------
		/* Random Access Memory(�ֹ߼� �޸�)
			-------------------------------------------------------- 0 address
			 static ����	|			0 address�� �������� ����(����) ����
			------------	|----------------------------------------------------
			 heap ����	|	"��" 10 20 30			"��" 40 50 60
			 				| 	�ѤѤѤѤѤѤ� 		�ѤѤѤѤѤѤ�
			 				|  	��#100			 		��#200 -----------�ּ�
			------------ |----------------------------------------------------
			 stack ����	|	a=3	b=5	
			 				|	four=#100	five=#200		�ּҸ� ���� �ִ°��� Object��
			---------------------------------------------------------------------
		*/
		/*
		Score four = new Score("���϶�", 10, 20, 30);
		four.calc();	//#100�� ���� ���ؼ� ��� ���ض�.. ~�� �����ض�
		Score five = new Score("�����", 40, 50, 60);
		five.calc();		//#200 ����
		
		four.disp();
		five.disp();
		*/
		/*
		String name = "HAPPY";
		String str = new String("HAPPY");
		
		if(name==str) {	//#50==#60  value�� �ּ��̱� ������ �ٸ���
			// �����ϰ� �ִ� �ּ� ���ϰ� ���� ��
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}//if end	//�ٸ���	�޸� �ּҰ� �ٸ���. 
		
		// ����. �������� ����񱳴� �⺻���� ���� �����ϸ� �ȵȴ�
		// ���ڿ��� ������ ���ϰ��� �� ��
		// == ���� �����ڴ� ������� �� ��
		
		// equals()�� �̿��ؼ� ���� ������!
		if(name.equals(str)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		//���� object�� � �ּҸ� �����ϰ� �ִ��� Ȯ��
		String six = name;	//#50
		
		System.out.println(name.hashCode());
		System.out.println(six.hashCode());
		System.out.println(str.hashCode());
		*/
		
		// ���� ���� �����ϰ� �ִ��� �˾ƺ� �� hashCode()
		// ��ü�� �����ϰ� �ִ� ���������� ��(�ּ�)
		Score one = new Score();
		Score two = new Score();
		Score three =  one;
		System.out.println(one.hashCode());		//#50
		System.out.println(two.hashCode());		//#60
		System.out.println(three.hashCode());	//#50
			//one, three ���� �ּ� ����
		

	}//main() end
}//class end