package oop1129;

class Parent {
	int one;
	int two;
	
	public Parent() {}
	
	public Parent(int one, int two) {
		this.one = one;
		this.two = two;
	}
}//class end

class Child extends Parent {
	int three;
	
	public Child() {
		//super() 생략되어 있음
	}
	public Child(int a, int b, int c) {
		super(a, b);	//상속받은 field에 초기값이 전달된다
							//one=a, two=b
		this.three = c;
	}
}//class end

//------------------------------------------------------------------
public class SuperTest2 {
	public static void main(String[] args) {
		// super
		// super()
		
		Child child = new Child(10, 20, 30);
		System.out.println(child.three);
		System.out.println(child.one);
		System.out.println(child.two);
		
	}//main() end
}//class end