package oop1203;

import java.util.*;

class Mountain {
	String name;	//산이름
	int height;		//산높이
	
	public Mountain() {}

	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
}//class end
//--------------------------------------------------------------------------
public class GenericTest {
	public static void main(String[] args) {
		// Generics 제네릭스
		// E Element 요소 : 참조형으로 선언
		// K Key 
		// V Value 
		// (T)
		
		/*
		Vector<String> vec = new Vector<>();
		vec.add("one");
		vec.add("two");
		vec.add("three");
		//vec.add(3);					에러
		//vec.add(5.6);					에러
		//vec.add(new Integer(9));	에러
		vec.add(new String("five"));
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(7);
		//list.add(new Double(4.2));	에러
		//list.add("seven");				에러
		list.add(new Integer(9));
		*/
//---------------------------------------------------------------------------------
		Mountain one = new Mountain("관악산", 900);
		Mountain two = new Mountain("치악산", 1200);
		Mountain three = new Mountain("설악산",1300);
		
		ArrayList<Mountain> list = new ArrayList<>();
		list.add(one);
		list.add(two);
		list.add(three);
		//list.add("SOLDESK");	에러
		
		for(int idx=0; idx<list.size(); idx++) {
			Mountain vo = list.get(idx);
			System.out.println(vo.name + " " + vo.height);
		}
		

	}//main() end
}//class end
