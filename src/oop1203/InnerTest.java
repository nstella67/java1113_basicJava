package oop1203;

import javax.swing.plaf.synth.SynthSpinnerUI;

import oop1203.WebProgram.Language;
import oop1203.WebProgram.Smart;

class WebProgram {	//접근제어 package
	String title = "Java Programming";	//field
	
	class Language {	//inner class
		String basic = "JAVA, HTML, CSS, JavaScript";
		void diaplay() {
			System.out.println("기초수업 : "+basic);
		}
	}//class end
	
	class Smart {	//내부클래스
		String basic = "Objective-C, JavaOOP, C#";
		void diaplay() {
			System.out.println("기초수업 : " + basic);
		}
	}//class end
	
	void print() {
		Language lang = new Language();
		lang.diaplay();
		
		Smart sm = new Smart();
		sm.diaplay();
	}
}//class end

class R {	//안드로이드OS 자바
	
	static class id {	//직접접근가능
		static String btn = "버튼";
	}//id class end
	
}//R class end

//--------------------------------------------------------------------
public class InnerTest {
	public static void main(String[] args) {
		// inner class 내부 클래스
		// 클래스 내부에 선언된 클래스
		
		WebProgram web = new WebProgram();
		web.print();
		
		/* 에러. 내부클래스는 직접 접근할 수 없다
		Language lang = new Language();
		Smart sm = new Smart();
		*/
		
		//내부클래스는 외부에서 단계적으로 접근할 수는 있다
		Language lang = new WebProgram().new Language();	//에러아님
		Smart sm = new WebProgram().new Smart();
		
		lang.diaplay();
		sm.diaplay();
//--------------------------------------------------------------------
		
		System.out.println(R.id.btn);	//R, id : 내부클래스
		
		
	}//main() end
}//class end

