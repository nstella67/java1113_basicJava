package oop1128;

import java.util.Calendar;
/* final class
final class Animal {	//종단클래스
									//상속되지 않음	(자식클래스를 만들 수 없음)
									//부모클래스(Superclass)가 될 수 없다
									//더 이상 확장성이 없다
									//리폼할 수 없다
}//class end

//class Elepant extends Animal {}	//Animal 클래스를 상속받겠다
	//에러. Animal클래스가 final class이기 때문에. final class는 상속받을 수 없다
*/

//final 함수
class Animal {
		public void eat() {}
		public final void breathe() {}
}//class end

class Elephant extends Animal {
		@Override
		public void eat() {}
		
		/* 에러. final 함수는 상속받았을 때
		 	 더 이상 override 할 수 없다
		@Override	//→ 리폼
		public void breathe() {}		*/
		
}//class end

//----------------------------------------------------------------------------------------------
public class FinalTest {

		public static void main(String[] args) {
				// final - 변수, 함수, 클래스에 붙을 수 있다
		
				int a = 3;
				a=5;
		
				final int b = 2;	//변수를 상수화
				//b= 4;	에러
				System.out.println(b);
				//b++;	에러
				//b는 절대 바꿀 수 없다
		
				System.out.println(Calendar.HOUR);	//public static final int HOUR = 10
				//Calendar.HOUR = 20; 에러
		
		
		
		
		}//main() end
}//class end