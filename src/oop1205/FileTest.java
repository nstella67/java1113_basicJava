package oop1205;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// File 클래스 : 파일 관련 정보
		// 파일이름, 확장명(.xls, .ppt, .txt, .doc, .hwp, .mdb), 파일크기
		
		//D:\java1113\workspace 에 data.txt저장
		// 경로와 경로 구분 기호는 \\ or /
		/*
		String fileName = "d:\\java1113\\workspace\\data.txt";
		System.out.println(fileName);	//d:\java1113\workspace\data.txt
		*/
		String fileName = "d:/java1113/workspace/data.txt";
		//System.out.println(fileName);	//d:/java1113/workspace/data.txt
		
		try {
			File file = new File(fileName);
			if(file.exists()) {	//파일 존재 유무
				System.out.println("파일 가져왔어요~~");
				long filesize = file.length();
				System.out.println(filesize+"Byte");
				System.out.println(filesize/1024+"KB");
				
				//파일명
				String filename = file.getName();
				System.out.println(filename);
				
				//d:\java1113\workspace\data.txt
				System.out.println(file.getPath());
				
				//d:\java1113\workspace
				System.out.println(file.getParent());
				
				//문) 파일명을 변경시켜서 저장하려면
				// 		파일명과 확장명을 분리하시오
				int pos = filename.indexOf(".");
				String name = filename.substring(0, pos);
				String ext = filename.substring(pos+1);
				System.out.println("파일이름 : "+name);
				System.out.println("확장명 : "+ext);
				
				//파일삭제
				//file.delete();	
				
			}else {
				System.out.println("파일 없어요!!");
			}
		}catch (Exception e) {
			System.out.println("파일 관련 정보 실패 : "+e);
		}
		
		System.out.println("END");

	}//main() end
}//class end
