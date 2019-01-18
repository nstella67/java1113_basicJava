package oop1204;

import java.util.Vector;

class Product {
	public int price;			//상품가격
	public int bonusPoint;	//보너스점수(마일리지)
	public Product() {}
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price*0.1);	//상품가격 10%
	}
}//class end

class SmartTV extends Product {
	public SmartTV() {
		super(100);	//price=100, bonusPotint=10
	}
	@Override
	public String toString() {
		return "SmartTV";	//상품명
	}
}//class end

class Notebook extends Product {
	public Notebook() {
		super(200);	//price=200, bonusPotint=20
	}
	@Override
	public String toString() {
		return "Notebook";	//상품명
	}
}//class end

class Handphone extends Product {
	public Handphone() {
		super(150);	//price=150, bonusPotint=15
	}
	@Override
	public String toString() {
		return "Handphone";	//상품명
	}
}//class end

class Buyer {
	private int money = 1000;	//나의 총재산
	private int mileage = 0; 		//마일리지
	
	//구매한 상품 저장
	private Vector<Product> vec = new Vector<>();
	
	public Buyer() {}
	/*
	public void buy(SmartTV a) {}
	public void buy(Notebook a) {}
	public void buy(Handphone a) {}
	*/
	public void buy(Product p) {
		if(this.money<p.price) {
			System.out.println("잔액부족!!");
			return;
		}
		
		vec.add(p);
		this.money = this.money - p.price;
		this.mileage = this.mileage + p.bonusPoint;
	}
	
	public void summary() {
		String list = "";	//구매 상품명 목록
		int hap=0;			//구매 상품 총가격
		
		if(vec.isEmpty()) {
			System.out.println("구매상품 없음!!");
			return;
		}
		for(int idx=0; idx<vec.size(); idx++) {
				Product item = vec.get(idx);
				list = list+item.toString()+", ";
				hap = hap+item.price;
		}
	
		System.out.println("구매목록	: "+list);
		System.out.println("사용금액	: "+hap);
		System.out.println("남은재산	: "+this.money);
		System.out.println("마일리지	: "+this.mileage);
	}
	
	public void refund(Product p) {
		if(vec.remove(p)) {
			System.out.println(p.toString() + "반품");
			this.money = this.money + p.price;
			this.mileage = this.mileage - p.bonusPoint;
		}else {
			System.out.println("구매한 상품이 없습니다!!");
		}
	}//refund end
}//class end
//--------------------------------------------------------------------
public class BuyerTest {
	public static void main(String[] args) {
		// 상품 구매 및 반품 프로그램
		
		// 삼품 진열하기
		SmartTV tv = new SmartTV();
		Notebook note = new Notebook();
		Handphone phone = new Handphone();
		
		//상품 구매
		Buyer kim = new Buyer();
		kim.buy(tv);
		kim.buy(note);
		kim.buy(phone);
		/* 잔액부족
		kim.buy(phone);
		kim.buy(phone);
		kim.buy(phone);
		kim.buy(phone);
		kim.buy(phone);
		*/
		
		//출력
		kim.summary();
		
		System.out.println("----------------반품 후");
		//반품
				kim.refund(note);
				kim.summary();
		
	}//main() end
}//class end
