package oop1203;

import java.util.*;

class Mountain {
	String name;	//���̸�
	int height;		//�����
	
	public Mountain() {}

	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
}//class end
//--------------------------------------------------------------------------
public class GenericTest {
	public static void main(String[] args) {
		// Generics ���׸���
		// E Element ��� : ���������� ����
		// K Key 
		// V Value 
		// (T)
		
		/*
		Vector<String> vec = new Vector<>();
		vec.add("one");
		vec.add("two");
		vec.add("three");
		//vec.add(3);					����
		//vec.add(5.6);					����
		//vec.add(new Integer(9));	����
		vec.add(new String("five"));
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(7);
		//list.add(new Double(4.2));	����
		//list.add("seven");				����
		list.add(new Integer(9));
		*/
//---------------------------------------------------------------------------------
		Mountain one = new Mountain("���ǻ�", 900);
		Mountain two = new Mountain("ġ�ǻ�", 1200);
		Mountain three = new Mountain("���ǻ�",1300);
		
		ArrayList<Mountain> list = new ArrayList<>();
		list.add(one);
		list.add(two);
		list.add(three);
		//list.add("SOLDESK");	����
		
		for(int idx=0; idx<list.size(); idx++) {
			Mountain vo = list.get(idx);
			System.out.println(vo.name + " " + vo.height);
		}
		

	}//main() end
}//class end
