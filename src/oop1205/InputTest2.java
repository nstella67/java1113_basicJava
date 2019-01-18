package oop1205;

import java.io.*;

public class InputTest2 {

	public static void main(String[] args) {
		// InputStream��� Reader��� ��
		try {
			String fileName = "d:/java1113/workspace/data.txt";
			
			/*1) FileInputStream : 1����Ʈ ���
			FileInputStream fis = new FileInputStream(fileName);
			int data = 0;
			while(true) {
				data = fis.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);	//�ѱ� �� ����/�����Ư�����ڸ�����
			}//while end
			fis.close();
			//*/
			
			//2) FileReader : char���(2����Ʈ). �ѱ� �� ����
			FileReader fr = new FileReader(fileName);
			int data = 0;
			while(true) {
				data = fr.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}//while end
			fr.close();
			
		}catch (Exception e) {
			System.out.println("���� : "+e);
		}
		System.out.println();
		System.out.println("END");
		
	}//main() end
}//class end
