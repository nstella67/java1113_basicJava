package oop1127;

public class StringTest {

	public static void main(String[] args) {
		/*
		// String Ŭ����
		
		String name = "ȫ�浿";
		String str = new String("Gone With The Wind");
		
		
		
		//���ڰ���
		System.out.println(str.length());	//18 
		
		//���ڼ���(0���� ����)
		System.out.println(str.indexOf("d"));//17 ������ ��ġ(������0~17)
		//������ ���ڰ� ���� ���� �� ó������ ������ ������ �ε��� �� ��ȯ
		System.out.println(str.indexOf("W"));	//5
		//ã���� �ϴ� ���ڰ� ���� ��� -1�� ��ȯ
		System.out.println(str.indexOf("R"));	//-1
		
		//0��° ����
		System.out.println(str.charAt(0));	//'G' 
		//����������
		System.out.println(str.charAt(17));	//'d' 
		System.out.println(str.charAt(str.length()-1));	//���ڿ��� ������ ����
		// ������ ���� ��ġ�� �� �ٸ��Ƿ� length()�̿�
		
		//�� ���ڿ�?
		System.out.println(str.isEmpty());	//false
		//���� �� ��/�ҹ��ڷ� �ٲ��ִ� ��
		System.out.println(str.toUpperCase());	//���δ빮�ڷ�GONE WITH THE WIND
		System.out.println(str.toLowerCase());	//���μҹ��ڷ�gone with the wind
		
		//���ڿ� ġȯ(�ٲٱ�)
		System.out.println(str.replace('n', 'N'));	//n��N GoNe With The WiNd
		//System.out.println(str.replace('\n', '<br>')); //\n(����)��<br>
		
		//Ư�� ���ڸ� �������� ���ڿ� �и�
		String word[]=str.split(" ");
		for(int idx=0; idx<word.length; idx++) {
			System.out.println("#"+word[idx]+"#");
		}//for end
		
		//.csv �� Ư����ȣ�� �����͸� �����ؼ� ���� ����
//----------------------------------------------------------------------------------------------------
		// ���ڿ� �ڸ��� �ڡڡ�
		//3��° ���ں��� ~���������� �ڸ���
		System.out.println(str.substring(3));
		//3��°~(8-1)���� ���� �ڸ��� - ���� �ڸ������ ���ں��� �ϳ� �� ��� ��
		System.out.println(str.substring(3, 8));
								//substring(������ġ, ����ġ+1)
		
		//��) ù����
		System.out.println(str.substring(0, 1));
		//��) ����������
		System.out.println(str.substring(17, 18));
		System.out.println(str.substring(str.length()-1, str.length()));
		System.out.println(str.substring(str.length()-1));
		
		//�� �յ� ��������(���鰹���������)
		System.out.println("#"+"   S k  y  ".trim()+"#");		//#S k  y#
		*/
//----------------------------------------------------------------------------------------------------
		//��) �̸��� �ּҿ� @���ڰ� �ִ��� Ȯ��
			//@���ڰ� �ִٸ� @�� �������� �յ� ���ڿ��� �и��ض�
			//-------���--------------
			//���̵�	: webmaster
			//����		: solsesk.com
		System.out.println("** ** ��) �̸��� �ּ� ** **");
		String email = "webmaster@soldesk.com";
		String em = new String (email);
		
		System.out.println("�̸��� : "+email);
		if(em.indexOf("@")==-1) {
			System.out.println("�̸��� �ּҰ� �߸��ƽ��ϴ�.");
		}else {
			System.out.println("�̸����� �½��ϴ�.");
		}
		
		String idp[]=em.split("@");
		
		for(int idx=0; idx<idp.length; idx++) {
			if(idx==0) {
				System.out.println("���̵�	: "+idp[idx]);
			}else {
				System.out.println("����	: "+idp[idx]);	
			}
		}//for end
		
		/*������
		String email = "webmaster@soldesk.com";
		if(email.indexOf("@")==-1) {
			System.out.println("�̸��� �ּ� Ʋ��!!");
		}else {
			System.out.println("�̸��� �ּ� ����!!");
			System.out.println(email.substring(0, 9));
			System.out.println(email.substring(10, 21));
			System.out.println(email.substring(10));
			//1)
			int pos = email.indexOf("@");//9
			String id = email.substring(0, pos);
			String server = email.substring(pos+1);
			System.out.println(id);
			System.out.println(server);
			//2)
			String word[] = email.split("@");
			for(int idx=0; idx<word.length; idx++) {
				System.out.println(word[idx]);
			}
		}//if end
		*/
		
System.out.println("=========================");
		
		//��) �ֹι�ȣ : ����, ����
			// ����	: ����
			// ����	: 29
			// 8+9+1+2+3+0+1+2+3+4+5+6+7=?
		System.out.println("** ��) �ֹι�ȣ : ����, ���� **");
		String jumin = "8912301234567";
		System.out.println("�ֹι�ȣ : " + jumin);
		int sung = Integer.parseInt(jumin.substring(6, 7));
		if(sung%2==0) {
			System.out.println("����	: ����");
		}else {
			System.out.println("����	: ����");
		}//if() end ����
		
		System.out.println("����	: "+(2018-1900-Integer.parseInt(jumin.substring(0, 2))));
		
		int hap=0;
		for(int i=0; i<jumin.length(); i++) {
			int a = Integer.parseInt(jumin.substring(i, i+1));	//����ȣ
			hap=hap+a;
		}
		System.out.println("8+9+1+2+... = "+hap);
		
		/*������
		String jumin = "8912301234567";
		int hap=0;
		for(int idx=0; idx<jumin.length(); idx++) {
			//hap=hap+jumin.charAt(idx);	//675
			//hap=hap+(int)(jumin.charAt(idx));	//675
			//'8'+'9'+'1'+'2'+'3'+...char��
			//'8' �� 8
			char ch=jumin.charAt(idx);
			hap=hap+Character.getNumericValue(ch);
		}//for end
		System.out.println(hap);
		
		//�����ڵ�
			int code = Integer.parseInt(jumin.substring(6, 7));
			
			//�¾ �⵵
			int myYear = Integer.parseInt(jumin.substring(0, 2));
			switch(code) {
			case 1 :
			case 2 : myYear = myYear + 1900; break;
			case 3 :
			case 4 : myYear = myYear + 1900; break;
			}
			
			//����
			int age = 2018-myYear;
			
			//����
			String gender = "";
			switch(code%2) {
			case 0 : gender = "����"; break;
			case 1 : gender = "����"; break;
			}
			
			System.out.println("�ֹι�ȣ : "+jumin);
			System.out.println("���� : "+gender);
			System.out.println("���� : "+age);
		*/
		

	}//main() end
}//class end