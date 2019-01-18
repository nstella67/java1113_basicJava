package oop1127;

import java.util.StringTokenizer;	//util package �ڵ�����
//import java.util.*;

public class StringTest2 {

	public static void main(String[] args) {
		// String			: ������ ���ڿ�
		// StringBuffer	: ���ڿ����� ������ �ϴ� ��� ��õ
		// StringBuilder	: ���ڿ����� ������ �ϴ� ��� ��õ
		// �ӵ� : StringBuilder �� StringBuffer �� String
				//StringBuffer�ð� / StringBuilder�ð� �˻�
		
		String str = "";
		str = str + "one";
		str = str + "two";
		str = str + "three";
		System.out.println(str);				//onetwothree
		System.out.println(str.length());	//11
		
		str = "";	//�ʱ�ȭ
		System.out.println(str.length());	//0
//--------------------------------------------------------------------------------
		StringBuilder sb = new StringBuilder("");
		sb.append("one");
		sb.append("two");
		sb.append("three");
		System.out.println(sb.toString());	//onetwothree
		System.out.println(sb.length());	//11
		sb.delete(0, sb.length());	//�ʱ�ȭ
		System.out.println(sb.length());	//0
//-------------------StringBuilder/StringBuffer ���� ����------------------
		StringBuffer sf = new StringBuffer();
		sf.append("one");
		sf.append("two");
		sf.append("three");
		System.out.println(sf.toString());	//onetwothree
		System.out.println(sf.length());		//11
		
		sf.delete(0, sf.length());	//�ʱ�ȭ
		System.out.println(sf.length());	//0
//--------------------------------------------------------------------------------
		// Ư�����ڸ� �������� ���ڿ� �и��� �� split()���
		String name = "kim, lee, park";	// , �� ����. "SPACE"��ٰ� , ��ٰ� �ϸ� �ȵǰ� ����
		
		//StringTokenizer+���� �� util package �ڵ�����
		
		//�и��ϰ��� �ϴ� ���� ���ڿ��� default�� : ����
		//StringTokenizer st = new StringTokenizer(name);		//���� �������� split
		StringTokenizer st = new StringTokenizer(name, ", ");	//, �������� split
		
		while(st.hasMoreTokens()) {	//, ��ȣ�� �ִ���?
			String word = st.nextToken();	//����������(�и��� ��) ��������
			System.out.println(word);
		}//end
		
		String stw = "Gone With The Wind";
		StringTokenizer sw = new StringTokenizer(stw);
		while(sw.hasMoreTokens()) {
			String word = sw.nextToken();
			System.out.println(word);
		}//end

	}//main() end
}//class end