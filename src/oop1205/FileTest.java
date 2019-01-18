package oop1205;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// File Ŭ���� : ���� ���� ����
		// �����̸�, Ȯ���(.xls, .ppt, .txt, .doc, .hwp, .mdb), ����ũ��
		
		//D:\java1113\workspace �� data.txt����
		// ��ο� ��� ���� ��ȣ�� \\ or /
		/*
		String fileName = "d:\\java1113\\workspace\\data.txt";
		System.out.println(fileName);	//d:\java1113\workspace\data.txt
		*/
		String fileName = "d:/java1113/workspace/data.txt";
		//System.out.println(fileName);	//d:/java1113/workspace/data.txt
		
		try {
			File file = new File(fileName);
			if(file.exists()) {	//���� ���� ����
				System.out.println("���� �����Ծ��~~");
				long filesize = file.length();
				System.out.println(filesize+"Byte");
				System.out.println(filesize/1024+"KB");
				
				//���ϸ�
				String filename = file.getName();
				System.out.println(filename);
				
				//d:\java1113\workspace\data.txt
				System.out.println(file.getPath());
				
				//d:\java1113\workspace
				System.out.println(file.getParent());
				
				//��) ���ϸ��� ������Ѽ� �����Ϸ���
				// 		���ϸ�� Ȯ����� �и��Ͻÿ�
				int pos = filename.indexOf(".");
				String name = filename.substring(0, pos);
				String ext = filename.substring(pos+1);
				System.out.println("�����̸� : "+name);
				System.out.println("Ȯ��� : "+ext);
				
				//���ϻ���
				//file.delete();	
				
			}else {
				System.out.println("���� �����!!");
			}
		}catch (Exception e) {
			System.out.println("���� ���� ���� ���� : "+e);
		}
		
		System.out.println("END");

	}//main() end
}//class end
