package oop1220;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.net.ServerSocket; 
import java.net.Socket;

public class Server2 {

	public static void main(String[] args) {
		ServerSocket server = null;

	    try { 
	      server = new ServerSocket(2010); // 2010-포트번호 
	      System.out.println("\n클라이언트 접속을 대기중입니다.");

	      while (true) { // 데몬이 되기 위한 무한 루프 
	        Socket socket = server.accept(); 
	        System.out.println("[접속] 접속된 IP: " + socket.getInetAddress().getHostAddress()); // 접속 정보 추출

	        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 메모리 저장 
	         
	        String line = reader.readLine();  // 대기중 
	        String[] str = line.split("/");  
	        System.out.println("--------------------------------------------"); 
	        System.out.println(str[0]); 
	        System.out.println(str[1]); 
	        System.out.println(str[2]); 
	        System.out.println(str[3]); 
	        System.out.println("--------------------------------------------");

	        try { 
	          socket.close(); // 접속자 연결 종료 
	        } catch (IOException e) { 
	        } 
	      } 
	    } catch (IOException e) { 
	      System.out.println(e.toString()); 
	    } finally { 
	      try { 
	        server.close(); // 서버(소켓) 종료 
	      } catch (IOException e) { 
	      } 
	    } 
	    System.out.println("서버 프로그램 실행을 종료합니다."); 

	}//main() end
}//class end
