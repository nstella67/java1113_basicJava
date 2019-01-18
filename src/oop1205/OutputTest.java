package oop1205;

import java.io.FileWriter;
import java.io.PrintWriter;

public class OutputTest {

	public static void main(String[] args) {
		// �������
		String fileName = "d:/java1113/workspace/sungjuk.txt";
		try {
			// �������(sunguk.txt)�� ������, ������ �����ȴ�(�б�� ����)
			//									������, �߰�/����� �� ����
			//										  append/overwrite
			//											   true/false
			FileWriter fw = new FileWriter(fileName, false);
			
			//true : ����Ŭ����
			PrintWriter out = new PrintWriter(fw, true);
			out.println("����ȭ, 90, 95, 100");
			out.println("ȫ�浿, 30, 55, 40");
			out.println("���϶�, 60, 95, 75");
			out.println("���޷�, 20, 85, 65");
			out.println("����ȭ, 100, 35, 100");
			
			out.close();
			fw.close();
			
		}catch (Exception e) {
			System.out.println("���� : "+e);
		}
		
		System.out.println("END");

	}//main() end
}//class end
