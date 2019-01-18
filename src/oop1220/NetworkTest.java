package oop1220;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class NetworkTest {

	public static void main(String[] args) {
		// ������ ���� Ŭ����
		try {
			/* 1)
			InetAddress ip = InetAddress.getByName("www.soldesk.com");
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());	//ip Ȯ��
			*/
			
			//2) HTML ���� ���� ��������
			String address = "http://www.soldesk.com";
			URL url = new URL(address);
			String line = "";
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			while(true) {
				line = br.readLine();
				if(line==null) break;
				System.out.println(line);
			}//while end
		}catch (Exception e) {
			System.out.println("����"+e);
		}

	}// main() end
}//class end