package oop1130;

class Unit {
	int currentHP;	//유닛의 체력
	int x;			//유닛의 x좌표
	int y;			//유닛의 y좌표
}//class end

interface Movable {
	void move(int x, int y);
}//interface end

interface Attackable {
	void attack(Unit u);
}//interface end

//인터페이스는 다중상속이 가능하다
interface Fightable extends Movable, Attackable {
	//추상메소드 2개 살아있다
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
		// 인터페이스간의 상속
		
	}//main() end
}//class end
