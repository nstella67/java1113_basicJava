package oop1128;

import java.util.Calendar;
/* final class
final class Animal {	//����Ŭ����
									//��ӵ��� ����	(�ڽ�Ŭ������ ���� �� ����)
									//�θ�Ŭ����(Superclass)�� �� �� ����
									//�� �̻� Ȯ�强�� ����
									//������ �� ����
}//class end

//class Elepant extends Animal {}	//Animal Ŭ������ ��ӹްڴ�
	//����. AnimalŬ������ final class�̱� ������. final class�� ��ӹ��� �� ����
*/

//final �Լ�
class Animal {
		public void eat() {}
		public final void breathe() {}
}//class end

class Elephant extends Animal {
		@Override
		public void eat() {}
		
		/* ����. final �Լ��� ��ӹ޾��� ��
		 	 �� �̻� override �� �� ����
		@Override	//�� ����
		public void breathe() {}		*/
		
}//class end

//----------------------------------------------------------------------------------------------
public class FinalTest {

		public static void main(String[] args) {
				// final - ����, �Լ�, Ŭ������ ���� �� �ִ�
		
				int a = 3;
				a=5;
		
				final int b = 2;	//������ ���ȭ
				//b= 4;	����
				System.out.println(b);
				//b++;	����
				//b�� ���� �ٲ� �� ����
		
				System.out.println(Calendar.HOUR);	//public static final int HOUR = 10
				//Calendar.HOUR = 20; ����
		
		
		
		
		}//main() end
}//class end