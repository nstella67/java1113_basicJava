package oop1205;

import java.io.BufferedReader;
import java.io.FileReader;

public class InputTest1 {

	public static void main(String[] args) {
		// ���� ���� �б�/��������	input
		try {
			//String fileName = "d:/java1113/workspace/data.txt";
			String fileName = "D:/java1113/workspace/basicJava/src/oop1205/FileTest.java";
			
			//1) ���� ��������
			FileReader fr = new FileReader(fileName);
			
			//2) ���� ���� �о����
			BufferedReader br = new BufferedReader(fr);
			int num = 0;	//���ȣ
			while(true) {
				//3) ����(\n)�� �������� �� �پ� ��������
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//System.out.println(++num + line);
				System.out.printf("%03d  %s\n", ++num, line); //3ĭ��� 0����ä���
			}//while end
			
			//�ڿ��ݳ�(��������!)
			br.close();
			fr.close();
			
		}catch (Exception e) {
			System.out.println("���� : "+e);
		}
		
		System.out.println("END");

	}//main() end
}//class end
