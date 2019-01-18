package oop1203;

import javax.swing.plaf.synth.SynthSpinnerUI;

import oop1203.WebProgram.Language;
import oop1203.WebProgram.Smart;

class WebProgram {	//�������� package
	String title = "Java Programming";	//field
	
	class Language {	//inner class
		String basic = "JAVA, HTML, CSS, JavaScript";
		void diaplay() {
			System.out.println("���ʼ��� : "+basic);
		}
	}//class end
	
	class Smart {	//����Ŭ����
		String basic = "Objective-C, JavaOOP, C#";
		void diaplay() {
			System.out.println("���ʼ��� : " + basic);
		}
	}//class end
	
	void print() {
		Language lang = new Language();
		lang.diaplay();
		
		Smart sm = new Smart();
		sm.diaplay();
	}
}//class end

class R {	//�ȵ���̵�OS �ڹ�
	
	static class id {	//�������ٰ���
		static String btn = "��ư";
	}//id class end
	
}//R class end

//--------------------------------------------------------------------
public class InnerTest {
	public static void main(String[] args) {
		// inner class ���� Ŭ����
		// Ŭ���� ���ο� ����� Ŭ����
		
		WebProgram web = new WebProgram();
		web.print();
		
		/* ����. ����Ŭ������ ���� ������ �� ����
		Language lang = new Language();
		Smart sm = new Smart();
		*/
		
		//����Ŭ������ �ܺο��� �ܰ������� ������ ���� �ִ�
		Language lang = new WebProgram().new Language();	//�����ƴ�
		Smart sm = new WebProgram().new Smart();
		
		lang.diaplay();
		sm.diaplay();
//--------------------------------------------------------------------
		
		System.out.println(R.id.btn);	//R, id : ����Ŭ����
		
		
	}//main() end
}//class end

