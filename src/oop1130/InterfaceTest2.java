package oop1130;

interface ICalc {	// ��������� + - * / %
	public int add();
	public int sub();
	public int mul();
	public int div();
	public int mod();
}//interface end

class Calc implements ICalc {	//����
	private int x, y;
	
	public Calc() {}
	public Calc(int x, int y) {
		this.x = x;
		this.y = y;
	}
                                                                             
	@Override
	public int add() {
		return this.x + this.y;
	}
	@Override
	public int sub() {
		return this.x - this.y;
	}
	@Override
	public int mul() {
		return this.x * this.y;
	}
	@Override
	public int div() {
		return this.x / this.y;
	}
	@Override
	public int mod() {
		return this.x % this.y;
	}
	
	
}//class end
//-----------------------------------------------------------
public class InterfaceTest2 {
	public static void main(String[] args) {
		// �������̽�
		// ���� ������Ʈ���� �߻��ϴ� ���� ���������� ǥ��ȭ, ����ȭ�� �� �ִ�
		
		//������
		ICalc calc = new Calc(5, 3);
		
		System.out.println(calc.add());
		System.out.println(calc.sub());
		System.out.println(calc.mul());
		System.out.println(calc.div());
		System.out.println(calc.mod());

	}//main() end
}//class end
