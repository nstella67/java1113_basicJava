package oop1204;

import java.util.*;

public class SetMapTest {

	public static void main(String[] args) {
		// List	: 순서가 있다(index살아있다) List, Vector, ArrayList
		// Set		: 순서가 없다						Set, HashSet, Iterator
		// Map	: 순서가 없다						Map, HashMap, HashTable
		
		//Set
		/*
		Set set = new HashSet();	//다형성
		set.add(3);						//0번째 요소??X → Set은 순서가 없다.
		set.add(4.5);
		set.add("Happy");
		set.add(new Integer(7));
		
		System.out.println(set.size());	//요소 갯수 4
		*/
		// "Happay" 가져오려면 set.get? → index가 없기 때문에 다른 방법을 써야한다
//------------------------------------------------------------------------------------------
		// Map	: Key(이름), Value(값)
		/*
		HashMap map = new HashMap();
		map.put("one", 100);
		map.put("two", 3.4);
		map.put("three", "SOLDESK");
		map.put("one", 200);	//ket 중복선언 해도 에러는 아니지만 마지막만 살아서 그 전것들은 접근불가
		map.put("four", 100);	// value는 중복 가능
		
		System.out.println(map.size());	//요소 갯수 4
		System.out.println(map.get("one"));	// key 부르면 된다
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		System.out.println(map.get("four"));
		//*/
//----------------------------------------------------------------------------------------
		//interface iterator : 요소의 유무와 요소 가져오기
		/*
		Set set = new HashSet();
		set.add(3);
		set.add(4.5);
		set.add("Happy");
		set.add(new Integer(7));
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj.toString());
		}//while end
		//*/
		//javax.swing.text.html.HTMLDocument.Iterator 얘는 class - iterator util패키지 안에 있는거 써야함
//-------------------------------------------------------------------------------------
		HashSet<String> set = new HashSet<>();
		set.add("list.do=net.bbs.List");
		set.add("read.do=net.bbs.Read");
		set.add("write.do=net.bbs.Write");
		//문) =를 기준으로 문자열 분리해서 map에 저장
			// key	: = 앞의 문자열
			// value	: = 뒤의 문자열
		HashMap map = new HashMap<>();
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			String str = (String)obj;
			//System.out.println(str);
			int pos = str.indexOf("=");
			String key = str.substring(0, pos);
			String value = str.substring(pos+1);
			map.put(key, value);
		}//while end
		
		System.out.println(map.get("list.do"));		//net.bbs.List 출력
		System.out.println(map.get("read.do"));	//net.bbs.Read 출력
		System.out.println(map.get("write.do"));	//net.bbs.Write 출력
		

	}//main() end
}//class end
