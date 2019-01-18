package oop1130;

class Unit {
	int currentHP;	//������ ü��
	int x;			//������ x��ǥ
	int y;			//������ y��ǥ
}//class end

interface Movable {
	void move(int x, int y);
}//interface end

interface Attackable {
	void attack(Unit u);
}//interface end

//�������̽��� ���߻���� �����ϴ�
interface Fightable extends Movable, Attackable {
	//�߻�޼ҵ� 2�� ����ִ�
}//interface end

class Fight extends Unit implements Fightable {
	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit u) {
		
	}
}//class end

//-----------------------------------------------------------
public class InterfaceTest3 {
	public static void main(String[] args) {
		// �������̽����� ���
		
	}//main() end
}//class end
