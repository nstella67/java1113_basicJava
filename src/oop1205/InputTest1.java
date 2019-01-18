package oop1205;

import java.io.BufferedReader;
import java.io.FileReader;

public class InputTest1 {

	public static void main(String[] args) {
		// 파일 내용 읽기/가져오기	input
		try {
			//String fileName = "d:/java1113/workspace/data.txt";
			String fileName = "D:/java1113/workspace/basicJava/src/oop1205/FileTest.java";
			
			//1) 파일 가져오기
			FileReader fr = new FileReader(fileName);
			
			//2) 파일 내용 읽어오기
			BufferedReader br = new BufferedReader(fr);
			int num = 0;	//행번호
			while(true) {
				//3) 엔터(\n)를 기준으로 한 줄씩 가져오기
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//System.out.println(++num + line);
				System.out.printf("%03d  %s\n", ++num, line); //3칸잡고 0으로채우기
			}//while end
			
			//자원반납(순서주의!)
			br.close();
			fr.close();
			
		}catch (Exception e) {
			System.out.println("실패 : "+e);
		}
		
		System.out.println("END");

	}//main() end
}//class end
