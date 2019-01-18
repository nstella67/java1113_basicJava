package oop1128;


class Sungjuk {
	//field(�������)
	String name;		//Access Modifier : package ����
	int kor, eng, mat;
	int aver;
	
	//constructort(�������Լ�)
	public Sungjuk() {}// default constructor(�⺻�������Լ�)

	public Sungjuk(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//method �Լ�
	public void calc() {
		this.aver = (this.kor+this.eng+this.mat)/3;
	}
	
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
	}
	
}//class end

class Print {
	public void view1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	public void view2(Sungjuk a, Sungjuk b) {//call by reference
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		a.disp();
		b.disp();
	}
}//class end


//-------------------------------------------------------------------------------------------------------------
public class ArrayTest {

	public static void main(String[] args) {
		/* ��ü �迭	Object Array
		System.out.println("< ��ü�� �迭�� ���� �� �ִ� >");
		int[] a = {2, 4, 6};
		Integer b1 = new Integer(1);
		Integer b2 = new Integer(3);
		Integer b3 = new Integer(5);
		
		int[] b = new int[3];
		Integer[] inte = new Integer[3];	//��ü �迭
		inte[0] = new Integer(1);
		inte[1] = new Integer(3);
		inte[2] = new Integer(5);
		System.out.println(inte[0].toString());
		System.out.println(inte[1].toString());
		System.out.println(inte[2].toString());
		System.out.println(inte[0]);	//Wrapper Class���� .toString ��������
		System.out.println(inte[1]);
		System.out.println(inte[2]);
		
		Integer i = 7;	//�⺻���� ������ ����ϴ� �� ���
							//autoboxing �⺻�� ���� �ڵ����� ��������ȯ�ȴ�
		System.out.println(i);
		System.out.println(i.toString());
		
System.out.println("-------------------------------------------------------------------");
		*/
//------------------------------------------------------------------------------------------------------------
		/*
		Integer[] inte2 = {	new Integer(1),
								new Integer(3),
								new Integer(5)	};	//��ü�迭
		
		//Integer[] inte3 = new Integer[] {1, 3, 5};	//ǥ������
		int size = inte2.length;
		for(int idx=0; idx<size; idx++) {
			System.out.println(inte2[idx].toString());
			System.out.println(inte2[idx]);
		}//for end
		
		// ��) inte2[0]�� inte2[2]�� ��� ���� ���� ��ȯ�Ͻÿ�
		System.out.println(" ��) inte2[0]�� inte2[2]�� ��� ���� ���� ��ȯ�Ͻÿ�");
		Integer tmp = inte2[0];
		inte2[0] = inte2[2];
		inte2[2] = tmp;
		for(int idx=0; idx<size; idx++) {
			System.out.println(inte2[idx]);
		}//for end
System.out.println("-------------------------------------------------------------------");
		 */
//------------------------------------------------------------------------------------------------------------
		/*
		Sungjuk[] sj =  {new Sungjuk("����ȭ", 30, 40, 50),
							new Sungjuk("���϶�", 20, 60, 80),
							new Sungjuk("ȫ�浿", 60, 70, 90)	};
		
		sj[0].calc();
		sj[1].calc();
		sj[2].calc();
		
		sj[0].disp();
		sj[1].disp();
		sj[2].disp();
		
		for(int idx=0; idx<sj.length; idx++) {
			sj[idx].calc();
			sj[idx].disp();
		}
		
		// ��) sj[0]�� sj[2]��Ҹ� ���� ��ȯ�Ͻÿ�
		Integer tmp = inte[0];
	    inte[0] = inte[2];
	    inte[2] = tmp;
	    
	    System.out.println(inte[0]);
	    System.out.println(inte[1]);
	    System.out.println(inte[2]);
		*/
//------------------------------------------------------------------------------------------
		// �޼ҵ� ȣ�� ���
		// Call by value			���� ���� ȣ��
		// Call by reference	������ ���� ȣ��
		
		Sungjuk one = new Sungjuk("����ȭ", 20, 30, 45);
		Sungjuk two = new Sungjuk("���϶�", 75, 80, 90);
		
		Print prn = new Print();
		prn.view1(one.kor, two.kor);//20, 75 call by value
		prn.view2(one, two);	//#50, #60 call by reference
		
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		
		// ��) one�� two�� ���� ��ȯ�Ͻÿ�
		Sungjuk tmp = one;
		one = two;
		two = tmp;
		

	}//main() end
}//class end