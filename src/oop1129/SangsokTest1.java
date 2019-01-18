package oop1129;

//final class AA() {} �� final Ŭ����(����Ŭ����)�� ��ӽ�ų �� ����
class AA {
	private void zero() {	//private�� ��Ӿȵ�
		System.out.println("zero()...");
	}
	public void one() {
		System.out.println("one()...");
	}
	public void two() {
		System.out.println("two()...");
	}
}//class end

class BB extends AA {	//AA Ŭ���� ���
	public void three() {
		System.out.println("three()...");
	}
}//class end

class CC extends AA {
	public void four() {
		System.out.println("four()...");
	}
}//class end

class DD extends CC {
	public void five() {
		System.out.println("five()...");
	}
}

class EE {}//class end

//class FF extends DD, EE {} �� Ŭ������ �ΰ��� ��� : ���߻�� . ����. Ŭ������ ���ϻ�Ӹ� ����

//---------------------------------------------------------------
public class SangsokTest1 {
	public static void main(String[] args) {
		// ��� : ��Ȱ��
		// Ŭ������ ���/(�������̽�, aspect�� ���)
		// ���� ������ ���� �͵鳢�� ���� ������ �ְ� ���� �� �ִ�
		// extends ���, Ȯ��
		// �������� : �θ�, ����, super
		//		     �ڽ�, �ļ�, sub, �Ļ�
		// super class �θ�Ŭ����
		// sub class   �ڽ�Ŭ����(�Ļ�)
		
		AA aa = new AA();
		//aa.zero() �� ����. private �Ӽ��� Ŭ���� ���ο����� ���� ����
		aa.one();
		aa.two();
		
		BB bb = new BB();
		bb.three();
		bb.one();
		bb.two();
		//bb.zero(); �Ⱥ���. ���� �Ұ�
//---------------------------------------------------------------
		CC cc = new CC();
		cc.four();
		cc.one();
		cc.two();
		
		DD dd = new DD();
		dd.five();
		dd.four();	//CCŬ����
		dd.one();	//AAŬ����
		dd.two();	//AAŬ����
		
	}//main() end
}//class end