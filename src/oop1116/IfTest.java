package oop1116;

public class IfTest {

	public static void main(String[] args) {
		// ��� : ���α׷��� �帧 ����
		// ���ǹ� : ���׿�����, if��, switch��
		// �ݺ��� : for��, while��, do~while��
		// break��, continue��
		
		/* -------- if�� --------------------------------------------------
			if(����) {true�϶� ����}		//������ boolean��
			
			if(����) {true�϶�}		//���׿����ڿ� ����
			else {false�϶�}
			
			if(����1) {����1true�϶�}			//���� ���� ���� ����
			else if(����2) {����2true�϶�}		//����1 false�϶�, ����2true�� ��������
			else if(����3) {����3true�϶�}		//����2 false�϶�, ����3true�� ��������
			else if(����4) {����4true�϶�}		//����3 false�϶�, ����4true�� ��������
			else {�������false�϶�}			//�ȿ͵� ��. �ȿ��� false�϶� ����x
		*/
		
		/* ��) ������ ���� ���, ����, ��������?
		int a = 0;
		if(a>0) {		//0==0
			System.out.println(a+" : ���");
		}else if(a<0) {
			System.out.println(a+" : ����");
		}else {
			System.out.println(a+" : ����");
		}//if end
		
		/* if�� ���� �� �ᵵ ��
		if(a==0) {
			System.out.println(a+" : ����");
		}//if end
		
		if(a>0) {
			System.out.println(a+" : ���");
		}else {
			System.out.println(a+" : ����");
		}//if end
		*/
		/* �ϳ��� if��
		if(���?) {		//0==0
			System.out.println(a+" : ���");
		}else if(����?) {
			System.out.println(a+" : ����");
		}else if(����?) {
			System.out.println(a+" : ����");
		}else {
			System.out.println(a+" : ��Ÿ");
		}//if end  */
//-----------------------------------------------------------------------------
		// ��) ���밪�� ���Ͻÿ� (������ ���)
		int a = 0;
		if(a>0) {
			System.out.println(a+"�� ���밪 : "+a);
		}else {
			System.out.println(a+"�� ���밪 : "+ -a);
		}//if end
		
		// ��) �� �� ������ ���̸� ���Ͻÿ�
		int x=-95, y=-95;
		if(x>y) {
			System.out.println(x+", "+y+" ������ ���� : "+(x-y));
		}else if(x<y) {
			System.out.println(x+", "+y+" ������ ���� : "+(y-x));
		}else {
			System.out.println(x+", "+y+" ������ ���� : "+0);
		}//if end
		
		//�������� �� ��
		int diff = x-y;
		if(diff>0) {
			System.out.println(x+", "+y+" ������ ���� : "+diff);
		}else if(diff<0) {
			System.out.println(x+", "+y+" ������ ���� : "+-diff);
		}else {
			System.out.println(x+", "+y+" ������ ���� : "+0);
		}//if end
//---------------------------------------------------------------------------		
		// ��) �����ڵ� 1, 3, 5 �� ����
		//					 2, 4, 6
		int code = 5;
		if(code==1 || code==3 || code==5) {
			System.out.println("���� : ����");
		}else {		//else if(code==2 || code==4 || code==6)
			System.out.println("���� : ����");
		}
		
		if(code%2==1) {
			System.out.println("���� : ����");
		}else if(code%2==0) {
			System.out.println("���� : ����");
		}
		

	}//main() end

}//class end
