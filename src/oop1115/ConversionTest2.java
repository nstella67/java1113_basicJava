package oop1115;

public class ConversionTest2 {

	public static void main(String[] args) {
		// ����ȯ
		/* ������ int, ������ char	���� ����ȯ �����ϴ�
		System.out.println(65);	
		System.out.println((char)65);			//'A'
		System.out.println((char)66);			//'B'
		System.out.println((char)67);			//'C'
		System.out.println((char)6700);		//? �ȳ���. ������ �������ִ�
		
		System.out.println(97);
		System.out.println((char)97);			//'a'
		System.out.println((char)98);			//'b'
		System.out.println((char)99);			//'c'
		
		System.out.println('A'<'a');				//true
		
		System.out.println('A');	
		System.out.println((int)'A');				//65
			
		System.out.println('a');	
		System.out.println((int)'a');				//97
		*/
		
		/* ASCII �ڵ尪, ����
		// �ѱ��� ������ Ű���� ��� Ű�� ASCII �ڵ尪�� �������ִ�
		System.out.println((int)'+');
		System.out.println((char)43);
		
		System.out.println((int)'\r');			//����
		System.out.println((char)13);
		
		System.out.println((int)' ');				//����
		System.out.println("#"+(char)32+"#");
		
		System.out.println('A'+1);				//66
		System.out.println((int)('A'+1));		//66
		System.out.println((char)('A'+1));	//B
		
		System.out.println((int)('a'+1));		//98
		System.out.println((char)('a'+1));		//b
		
		System.out.println((int)('a'-'A'));		//32
		System.out.println("#"+(char)('a'-'A')+"#");		//# #
		*/
		// ��) ��ҹ��ڸ� ���� �ٲپ ����Ͻÿ�
		char ch1 = 'M', ch2 = 'n';
		System.out.println((char)(ch1 + 32));
		System.out.println((char)(ch2 - 32));
		
		// ��) ����
		int a = 3, b = 5;
		char op = '+';		
		// ��°�� : 3+5=8 ������
		System.out.println(a + op + b + "=" + (a+b));			//51=8
							 // 3 + '+' + 5
							 // 3 + 43 + 5
							 // 51					  = 8
		System.out.println(a+""+op+""+b+"="+(a+b));			//""��Ʈ������ ������ �ǹ� ���ϴ�
		
				
	}//main() end
}//class end