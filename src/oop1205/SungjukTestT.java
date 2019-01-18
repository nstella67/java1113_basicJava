package oop1205;
//package oop1204�� SungjukTest6 ��
class Sungjuk {
	//field
	private int no;							//��ȣ
	private String name;					//�̸�
	private int[] answer = new int[5];	//�������
	private char[] ox = new char[5];	//OXǥ��
	public int score;							//����
	public int rank;							//���
	
	public Sungjuk() {}	//default constructor
	
	public Sungjuk(int no, String name, int a, int b, int c, int d, int e) {
		this.no = no;
		this.name = name;
		this.answer[0] = a;
		this.answer[1] = b;
		this.answer[2] = c;
		this.answer[3] = d;
		this.answer[4] = e;
		this.rank = 1;
	}
	
	public void compute() {
		int[] dap = {1, 1, 1, 1, 1};
		//������ answer ��Ȱ� ������ ���ؼ� OX���ϱ�
		//���� ������ ���� ���� ���ϱ�
		
		for(int idx=0; idx<dap.length; idx++) {
			if(dap[idx]==this.answer[idx]) {
				this.ox[idx]='o';
				this.score = this.score + 20;
			}else {
				this.ox[idx]='x';
			}//if end
		}//for end
	}//compute() end
	
	public void disp() {
		//���
		System.out.print("  "+this.no+"  ");
		System.out.print(this.name+" ");
		for(int idx=0; idx<answer.length; idx++) {
			System.out.print(this.ox[idx]+" ");
		}
		System.out.print(this.score+" ");
		System.out.print(this.rank);
	}//disp() end
	
}//class end
//---------------------------------------------------------------------------
public class SungjukTestT {
	public static void main(String[] args) {
		// �������α׷� (OX) ǥ���ϱ�
		// ��ü �迭
		Sungjuk[] student = {
				new Sungjuk(1, "ȫ�浿", 1, 2, 1, 1, 1),
				new Sungjuk(2, "����ȭ", 1, 1, 1, 1, 1),
				new Sungjuk(3, "���϶�", 2, 2, 4, 2, 1),
				new Sungjuk(4, "���޷�", 2, 1, 4, 1, 1),
				new Sungjuk(5, "����ȭ", 1, 1, 4, 3, 2),
		};
		
		int size = student.length;	//5��
		
		//��������ϱ�
		for(int idx=0; idx<size; idx++) {
			student[idx].compute();
		}//for end
		
		//������ϱ�
		for(int a=0; a<size; a++) {
			for(int b=0; b<size; b++) {
				if(student[a].score<student[b].score) {
					student[a].rank=student[a].rank+1;
				}
			}
		}//for end
		
		//����(���/������ �������� �������� ����) 1122SortTest
		for(int a=0; a<size-1; a++) {
			for(int b=a+1; b<size; b++) {
				if(student[a].rank>student[b].rank) {
					Sungjuk tmp = student[a];
					student[a]=student[b];
					student[b]=tmp;
				}//swap
			}
		}//for end
		
		//���
		System.out.println("	  **��/��/��/��** ");
		System.out.println("=======================");
		System.out.println("��ȣ  �̸�  1 2 3 4 5  ����	 ���");
		System.out.println("-------------------------------------");
		for(int idx=0; idx<size; idx++) {
			student[idx].disp();
			System.out.println();
		}//for end
		
	}//main() end
}//class end
