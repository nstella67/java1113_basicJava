package oop1204;

import java.util.*;

public class SetMapTest {

	public static void main(String[] args) {
		// List	: ������ �ִ�(index����ִ�) List, Vector, ArrayList
		// Set		: ������ ����						Set, HashSet, Iterator
		// Map	: ������ ����						Map, HashMap, HashTable
		
		//Set
		/*
		Set set = new HashSet();	//������
		set.add(3);						//0��° ���??X �� Set�� ������ ����.
		set.add(4.5);
		set.add("Happy");
		set.add(new Integer(7));
		
		System.out.println(set.size());	//��� ���� 4
		*/
		// "Happay" ���������� set.get? �� index�� ���� ������ �ٸ� ����� ����Ѵ�
//------------------------------------------------------------------------------------------
		// Map	: Key(�̸�), Value(��)
		/*
		HashMap map = new HashMap();
		map.put("one", 100);
		map.put("two", 3.4);
		map.put("three", "SOLDESK");
		map.put("one", 200);	//ket �ߺ����� �ص� ������ �ƴ����� �������� ��Ƽ� �� ���͵��� ���ٺҰ�
		map.put("four", 100);	// value�� �ߺ� ����
		
		System.out.println(map.size());	//��� ���� 4
		System.out.println(map.get("one"));	// key �θ��� �ȴ�
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		System.out.println(map.get("four"));
		//*/
//----------------------------------------------------------------------------------------
		//interface iterator : ����� ������ ��� ��������
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
		//javax.swing.text.html.HTMLDocument.Iterator ��� class - iterator util��Ű�� �ȿ� �ִ°� �����
//-------------------------------------------------------------------------------------
		HashSet<String> set = new HashSet<>();
		set.add("list.do=net.bbs.List");
		set.add("read.do=net.bbs.Read");
		set.add("write.do=net.bbs.Write");
		//��) =�� �������� ���ڿ� �и��ؼ� map�� ����
			// key	: = ���� ���ڿ�
			// value	: = ���� ���ڿ�
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
		
		System.out.println(map.get("list.do"));		//net.bbs.List ���
		System.out.println(map.get("read.do"));	//net.bbs.Read ���
		System.out.println(map.get("write.do"));	//net.bbs.Write ���
		

	}//main() end
}//class end
