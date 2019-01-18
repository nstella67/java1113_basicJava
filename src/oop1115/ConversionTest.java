package oop1115;

public class ConversionTest {

	public static void main(String[] args) {
		// ����ȯ Datatype Conversion
		/* 1) �ڵ�����ȯ
			- ������ : byte < short < int < long
			- �Ǽ��� : float < double
			- ������ < �Ǽ���
			
			byte a=3;
			int b=a;
			long c=b;
			System.out.println(a);	//3
			System.out.println(b);	//3
			System.out.println(c);	//3
			a=c; a=b;		//����
			
			//4����, 4.0�Ǽ�
			float d=4.5f;		//float d=4f; �����ƴ�
			double e=d;		//d=e; ����
			System.out.println(d);
			System.out.println(e);
			
			int a=3;
			double b=a;		//�����ƴ�
			System.out.println(a);	//3
			System.out.println(b);	//3.0
			
			System.out.println(5/3);		//1
			System.out.println(5/3.0);		//1.6666666666666667
			System.out.println(5.0/3);		//1.6666666666666667
			System.out.println(5.0/3.0);	//1.6666666666666667
		
			System.out.println(5/3f);		//1.6666666
		*/
		
		/* 2) ��������ȯ(cast������) : �ʿ��� ���� �Ͻ���
			���� : (�ڷ���)��
			
			System.out.println((int)3.5);				//3
			System.out.println((double)4);			//4.0
			System.out.println((int)3.6+(int)4.7);	//7
			System.out.println((int)(3.6+4.7));		//8
			
			�������α׷� �Ҽ����� �������ϱ�
			int kor=80, eng=90, mat=75;
			double aver = (kor+eng+mat)/3;	//81.0
							// 245/3 =81.6666...=81  ������/������=������
							// �������� double ���� �� (double)81
			System.out.println(aver);				//81.0
			double aver = (kor+eng+mat)/3.0;
			System.out.println(aver);				//81.66666666666667
			double aver = (double)(kor+eng+mat)/3;	//(double)245/3 -> 245�� �Ǽ�������
			System.out.println(aver);				//81.66666666666667
			double aver = (double)(kor+eng+mat)/3.0;
			System.out.println(aver);				//81.66666666666667
		*/
		
		
	}//main() end
}//class end