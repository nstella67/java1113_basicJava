package oop1220;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) {
		// 서버구축
		ServerSocket server = null;
		try {
			//Port 번호 : 0~65535
			//나의 포트번호 : 246
			server = new ServerSocket(246);
			while(true) {
				System.out.println("\n클라이언트 접속 대기중...");
				Socket socket = server.accept();
				System.out.println("[접속]접속IP : "+socket.getInetAddress().getHostAddress());
				
				// 요청한 사용자 PC에 내용 출력
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				writer.write("[이누리]/1.보헤미안랩소디/2.스윙키즈/3.마약왕");
				writer.newLine();	//줄바꿈
				writer.flush();		//client에 전송
				socket.close();		//접속자 연결 종료
						
			}
		}catch (Exception e) {
			System.out.println("문제발생 : "+e);
		}finally {
			try {
				server.close();
			}catch (Exception e) {}
			System.out.println("서버 프로그램 실행 종료");
		}//end

	}//main() end
}//class end
