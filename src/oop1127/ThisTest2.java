package oop1127;

class Score {
	//fied(�������)
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//constructor(������ �Լ�)
	public Score() {	//default constructor�⺻�������Լ�
		//�������Լ��� �ڽ��� �������Լ��� ȣ���ϴ� ���
		//Score("ȫ�浿"); ����
		this("ȫ�浿");
	}
	
	public Score(String name) {
		calc();	//�������Լ����� �Ϲ��Լ��� ȣ���� �� �ִ�
	}
	
	public Score(int kor, int eng, int mat) {
		//�⺻ ������ �Լ� ȣ��
		//Score();	����
		this();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		//this(); ����. �������Լ��� ù �ٿ��� ȣ���ؾ� �Ѵ�
		// �޸� Ȯ���� �ؾ��ϱ� ������
	}
	
	public void calc() {
		//this(10, 20, 30); ����. �Ϲ��Լ����� �������Լ� ȣ���� �� ����
		aver = (kor+eng+mat)/3;
	}
}//class end

//-------------------------------------------------------------------------------

public class ThisTest2 {

	public static void main(String[] args) {
		// this()	: �������Լ��� �ڽ��� �������Լ��� ȣ���� ��
					// ��Ӱ��迡 ���� �� 
		// this		: field(�������)�� ����ų ��
		// "this"	: ���ڿ����
		
		
		
		
		
		
		

	}//main() end
}//class end