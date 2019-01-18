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
	      server = new ServerSocket(2010); // 2010-��Ʈ��ȣ 
	      System.out.println("\nŬ���̾�Ʈ ������ ������Դϴ�.");

	      while (true) { // ������ �Ǳ� ���� ���� ���� 
	        Socket socket = server.accept(); 
	        System.out.println("[����] ���ӵ� IP: " + socket.getInetAddress().getHostAddress()); // ���� ���� ����

	        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // �޸� ���� 
	         
	        String line = reader.readLine();  // ����� 
	        String[] str = line.split("/");  
	        System.out.println("--------------------------------------------"); 
	        System.out.println(str[0]); 
	        System.out.println(str[1]); 
	        System.out.println(str[2]); 
	        System.out.println(str[3]); 
	        System.out.println("--------------------------------------------");

	        try { 
	          socket.close(); // ������ ���� ���� 
	        } catch (IOException e) { 
	        } 
	      } 
	    } catch (IOException e) { 
	      System.out.println(e.toString()); 
	    } finally { 
	      try { 
	        server.close(); // ����(����) ���� 
	      } catch (IOException e) { 
	      } 
	    } 
	    System.out.println("���� ���α׷� ������ �����մϴ�."); 

	}//main() end
}//class end
