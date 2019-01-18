package oop1205;

import java.io.*;

public class InputTest2 {

	public static void main(String[] args) {
		// InputStream기반 Reader기반 비교
		try {
			String fileName = "d:/java1113/workspace/data.txt";
			
			/*1) FileInputStream : 1바이트 기반
			FileInputStream fis = new FileInputStream(fileName);
			int data = 0;
			while(true) {
				data = fis.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);	//한글 다 깨짐/영어랑특수문자만나옴
			}//while end
			fis.close();
			//*/
			
			//2) FileReader : char기반(2바이트). 한글 안 깨짐
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
			System.out.println("실패 : "+e);
		}
		System.out.println();
		System.out.println("END");
		
	}//main() end
}//class end
