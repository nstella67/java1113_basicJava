package oop1203;

interface IMessage {
	public void msgPrint();
}//interface() end

class Message implements IMessage {//��ü object
								   //��ü.����		��ü.field
								   //��ü.�޼ҵ�		��ü.method()
	@Override
	public void msgPrint() {
		System.out.println("Message Ŭ����");
	}
}//class end

//----------------------------------------------------------------------
public class AnonymousTest {
	public static void main(String[] args) {
		// �͸�Ŭ���� Anonymous class
		// �߻�Ŭ���� abstract class : �߻�޼ҵ尡 1���� �ִ� Ŭ����
		// interface : �߻�޼ҵ�θ� ����
		// �߻�޼ҵ� : �޼ҵ��� {}�� ����
		// �߻�Ŭ������ �������̽��� ��ü������ �� ����
		
		//1) �⺻
		Message message = new Message();
		message.msgPrint();
		
		//2) ������
		IMessage imess = new Message();
		imess.msgPrint();
		
		//3) �͸�Ŭ���� : �ʿ��� ������ �Ͻ��� ó��
		//	 �̺�Ʈ(Ŭ��,..)�� �߻��� ���� ó��(�ȵ���̵� �ڹ�, jQuery Ȱ��)
		IMessage msg = new IMessage() {
			@Override
			public void msgPrint() {
				System.out.println("Anonymous �͸� ���� Ŭ����");
			}
		};
		
		msg.msgPrint();
		

	}//main() end
}//class end

