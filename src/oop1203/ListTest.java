package oop1203;

import java.util.*;

public class ListTest {
	public static void main(String[] args) {
		// Java Collection Framework
		// �迭 Array : List �迭
		/*
			List	: ������ �ִ�. �ε����� �ִ�(0����~)
					  List, Vector, ArrayList, Collections
			Set	: ������ ����. Set, HachSet, Iterator
			Map	: ������ ����. Map, HashMap, HashTable
		*/
		/*
		int[] su = new int[3];	//�迭
		List list  = new Vector();	//������
		
		Vector vec = new Vector();
		vec.add(3);								//0��° ��
		vec.add(5.6);
		vec.add("HAPPY");
		vec.add(new Integer(7));
		vec.add(new Character('R'));
		vec.add(new String("APPLE"));
		
		System.out.println(vec.get(2));	//2��° ��� ��������
								//return�� Object
		Object obj = vec.get(5);
		String str = (String) obj;	//�ڷ��� ��ġ, ������
		System.out.println(str.toString());
		System.out.println(str);
		
		System.out.println(vec.size());		//6 	vec ����� ����
		
		for(int idx=0; idx<vec.size(); idx++) {
			System.out.println(vec.get(idx));
		}
		*/
		System.out.println("-------------------------------");
		
		//��� ����
		/*
		vec.remove(3);		//3��° ��� ����
		for(int idx=0; idx<vec.size(); idx++) {
			System.out.println(vec.get(idx));
		}
		
		vec.removeAllElements();	//��� ���� ����
		System.out.println(vec.size());		//0
		
		vec.isEmpty();	//vec�� ����ִ°�? �����̳�? boolean��
		if(vec.isEmpty()) {
			System.out.println("����ִ�");
		}else {
			System.out.println("������� �ʴ�");
		}
		*/
		
		//��) remove()�޼ҵ带 �̿��ؼ� ��� ���� ����
		/*
		for(;;) {
			vec.remove(0);
			if(vec.size()==0) break;
		}
		System.out.println(vec.size());		//0
		//������
		for(int idx=vec.size()-1; idx>=0; idx++) {
			System.out.println(vec.remove(idx));
		}
		System.out.println(vec.size());		//0
		*/
//-------------------------------------------------------------------------------
		List list = new ArrayList();		//������
		list.add(5);
		list.add(3.4);
		list.add('R');
		list.add("SOLDESK");
		list.add(new Integer(7));
		list.add(new Double(8.9));
		list.add(new String("JAVA"));
		
		for(int idx=0; idx<list.size(); idx++) {
			System.out.println(list.get(idx));
		}
		System.out.println(list.isEmpty());		//false
		
	}//main() end
}//class end
