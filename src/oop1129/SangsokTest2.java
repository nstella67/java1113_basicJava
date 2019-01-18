package oop1129;

class Fruit extends Object {
	public Fruit() {	//�������Լ��� ������ ����. Ŭ������� ������ �Լ���
		System.out.println("Fruit()...");
	}
}//class end

class Apple extends Fruit {
	//�θ�������Լ� ȣ���ϴ� super() �����Ǿ� ����
	//super(); ����. �ᵵ �ǰ� �� �ᵵ ��
	public Apple() {
		System.out.println("Apple()...");
	}

	@Override
	public String toString() {
		// ���� : oop1129.Apple@7852e922
		return "Apple Ŭ���� ��ü ����!!";
	}
}//class end

class PineApple extends Apple {
	//�θ�������Լ� ȣ���ϴ� super() �����Ǿ� ����
	//super(); ����. �ᵵ �ǰ� �� �ᵵ ��
	public PineApple() {
		System.out.println("PineApple()...");
	}
	
	@Override
	public String toString() {	//���� private ��� ������ �����Ű�� �뵵�� ���/������¿뵵�λ��
		return "PineApple ��ü";
	}
}//class end

//---------------------------------------------------------------
public class SangsokTest2 extends Object {
	public static void main(String[] args) {
		//Ŭ���� ��Ӱ��迡���� ������ ȣ�� ����

		//��Ӱ��迡 ���� �� �θ����
		//Fruit() �� Apple()
		Apple apple = new Apple();
		
		System.out.println(apple.toString());
		System.out.println(apple);
		
		System.out.println("-----------------------");
		//Fruit() �� Apple() �� PineApple()
		PineApple pine = new PineApple();
		
		int a =3;
		System.out.println(a);
		
		System.out.println(pine);				//��ü �巯�� oop1129.PineApple@7852e922
		System.out.println(pine.hashCode());	//�ּ�
		System.out.println(pine.toString());	//�籸��
		
		
		
	}//main() end
}//class end