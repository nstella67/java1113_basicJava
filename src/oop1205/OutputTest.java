package oop1205;

import java.io.FileWriter;
import java.io.PrintWriter;

public class OutputTest {

	public static void main(String[] args) {
		// 파일출력
		String fileName = "d:/java1113/workspace/sungjuk.txt";
		try {
			// 출력파일(sunguk.txt)이 없으면, 파일이 생성된다(읽기는 오류)
			//									있으면, 추가/덮어쓰기 중 선택
			//										  append/overwrite
			//											   true/false
			FileWriter fw = new FileWriter(fileName, false);
			
			//true : 버퍼클리어
			PrintWriter out = new PrintWriter(fw, true);
			out.println("무궁화, 90, 95, 100");
			out.println("홍길동, 30, 55, 40");
			out.println("라일락, 60, 95, 75");
			out.println("진달래, 20, 85, 65");
			out.println("봉선화, 100, 35, 100");
			
			out.close();
			fw.close();
			
		}catch (Exception e) {
			System.out.println("실패 : "+e);
		}
		
		System.out.println("END");

	}//main() end
}//class end
