package oop1203;

import java.util.*;

public class ListTest {
	public static void main(String[] args) {
		// Java Collection Framework
		// 배열 Array : List 계열
		/*
			List	: 순서가 있다. 인덱스가 있다(0부터~)
					  List, Vector, ArrayList, Collections
			Set	: 순서가 없다. Set, HachSet, Iterator
			Map	: 순서가 없다. Map, HashMap, HashTable
		*/
		/*
		int[] su = new int[3];	//배열
		List list  = new Vector();	//다형성
		
		Vector vec = new Vector();
		vec.add(3);								//0번째 값
		vec.add(5.6);
		vec.add("HAPPY");
		vec.add(new Integer(7));
		vec.add(new Character('R'));
		vec.add(new String("APPLE"));
		
		System.out.println(vec.get(2));	//2번째 요소 가져오기
								//return형 Object
		Object obj = vec.get(5);
		String str = (String) obj;	//자료형 일치, 다형성
		System.out.println(str.toString());
		System.out.println(str);
		
		System.out.println(vec.size());		//6 	vec 요소의 갯수
		
		for(int idx=0; idx<vec.size(); idx++) {
			System.out.println(vec.get(idx));
		}
		*/
		System.out.println("-------------------------------");
		
		//요소 삭제
		/*
		vec.remove(3);		//3번째 요소 삭제
		for(int idx=0; idx<vec.size(); idx++) {
			System.out.println(vec.get(idx));
		}
		
		vec.removeAllElements();	//요소 전부 삭제
		System.out.println(vec.size());		//0
		
		vec.isEmpty();	//vec이 비어있는가? 공백이냐? boolean형
		if(vec.isEmpty()) {
			System.out.println("비어있다");
		}else {
			System.out.println("비어있지 않다");
		}
		*/
		
		//문) remove()메소드를 이용해서 요소 전부 삭제
		/*
		for(;;) {
			vec.remove(0);
			if(vec.size()==0) break;
		}
		System.out.println(vec.size());		//0
		//선생님
		for(int idx=vec.size()-1; idx>=0; idx++) {
			System.out.println(vec.remove(idx));
		}
		System.out.println(vec.size());		//0
		*/
//-------------------------------------------------------------------------------
		List list = new ArrayList();		//다형성
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
