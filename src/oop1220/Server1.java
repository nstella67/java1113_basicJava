package oop1220;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) {
		// ��������
		ServerSocket server = null;
		try {
			//Port ��ȣ : 0~65535
			//���� ��Ʈ��ȣ : 246
			server = new ServerSocket(246);
			while(true) {
				System.out.println("\nŬ���̾�Ʈ ���� �����...");
				Socket socket = server.accept();
				System.out.println("[����]����IP : "+socket.getInetAddress().getHostAddress());
				
				// ��û�� ����� PC�� ���� ���
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				writer.write("[�̴���]/1.����̾ȷ��ҵ�/2.����Ű��/3.�����");
				writer.newLine();	//�ٹٲ�
				writer.flush();		//client�� ����
				socket.close();		//������ ���� ����
						
			}
		}catch (Exception e) {
			System.out.println("�����߻� : "+e);
		}finally {
			try {
				server.close();
			}catch (Exception e) {}
			System.out.println("���� ���α׷� ���� ����");
		}//end

	}//main() end
}//class end
