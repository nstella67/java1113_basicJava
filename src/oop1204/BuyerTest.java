package oop1204;

import java.util.Vector;

class Product {
	public int price;			//��ǰ����
	public int bonusPoint;	//���ʽ�����(���ϸ���)
	public Product() {}
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price*0.1);	//��ǰ���� 10%
	}
}//class end

class SmartTV extends Product {
	public SmartTV() {
		super(100);	//price=100, bonusPotint=10
	}
	@Override
	public String toString() {
		return "SmartTV";	//��ǰ��
	}
}//class end

class Notebook extends Product {
	public Notebook() {
		super(200);	//price=200, bonusPotint=20
	}
	@Override
	public String toString() {
		return "Notebook";	//��ǰ��
	}
}//class end

class Handphone extends Product {
	public Handphone() {
		super(150);	//price=150, bonusPotint=15
	}
	@Override
	public String toString() {
		return "Handphone";	//��ǰ��
	}
}//class end

class Buyer {
	private int money = 1000;	//���� �����
	private int mileage = 0; 		//���ϸ���
	
	//������ ��ǰ ����
	private Vector<Product> vec = new Vector<>();
	
	public Buyer() {}
	/*
	public void buy(SmartTV a) {}
	public void buy(Notebook a) {}
	public void buy(Handphone a) {}
	*/
	public void buy(Product p) {
		if(this.money<p.price) {
			System.out.println("�ܾ׺���!!");
			return;
		}
		
		vec.add(p);
		this.money = this.money - p.price;
		this.mileage = this.mileage + p.bonusPoint;
	}
	
	public void summary() {
		String list = "";	//���� ��ǰ�� ���
		int hap=0;			//���� ��ǰ �Ѱ���
		
		if(vec.isEmpty()) {
			System.out.println("���Ż�ǰ ����!!");
			return;
		}
		for(int idx=0; idx<vec.size(); idx++) {
				Product item = vec.get(idx);
				list = list+item.toString()+", ";
				hap = hap+item.price;
		}
	
		System.out.println("���Ÿ��	: "+list);
		System.out.println("���ݾ�	: "+hap);
		System.out.println("�������	: "+this.money);
		System.out.println("���ϸ���	: "+this.mileage);
	}
	
	public void refund(Product p) {
		if(vec.remove(p)) {
			System.out.println(p.toString() + "��ǰ");
			this.money = this.money + p.price;
			this.mileage = this.mileage - p.bonusPoint;
		}else {
			System.out.println("������ ��ǰ�� �����ϴ�!!");
		}
	}//refund end
}//class end
//--------------------------------------------------------------------
public class BuyerTest {
	public static void main(String[] args) {
		// ��ǰ ���� �� ��ǰ ���α׷�
		
		// ��ǰ �����ϱ�
		SmartTV tv = new SmartTV();
		Notebook note = new Notebook();
		Handphone phone = new Handphone();
		
		//��ǰ ����
		Buyer kim = new Buyer();
		kim.buy(tv);
		kim.buy(note);
		kim.buy(phone);
		/* �ܾ׺���
		kim.buy(phone);
		kim.buy(phone);
		kim.buy(phone);
		kim.buy(phone);
		kim.buy(phone);
		*/
		
		//���
		kim.summary();
		
		System.out.println("----------------��ǰ ��");
		//��ǰ
				kim.refund(note);
				kim.summary();
		
	}//main() end
}//class end
