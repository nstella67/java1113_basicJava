package oop1119;

public class BreakTest {

	public static void main(String[] args) {
		// break ��		: �ݺ��� Ż��
		// continue ��	: �ݺ��� ���
		
		for(int a=1; a<10; a++) {
			if(a==5) break;			//a==5�϶� �ݺ��� ����������� ��.
			System.out.print(a);
		}//for end
		
		System.out.println();
		
		for(int a=1; a<10; a++) {
			if(a==5) continue;		//a==5�϶� �ݺ������� �ö󰡶�� ��.
			System.out.print(a);
		}//for end
		
	}//main() end
}//class end
