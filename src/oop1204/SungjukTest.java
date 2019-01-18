package oop1204;

import java.util.Arrays;

class Sungjuk6 {
	//field
	private int no;							//��ȣ
	private String name;					//�̸�
	private int[] answer = new int[5];	//�������
	private char[] ox = new char[5];	//OXǥ��
	public int score;							//����
	public int rank;							//���
	
	public Sungjuk6() {}	//default constructor
	
	public Sungjuk6(int no, String name, int a, int b, int c, int d, int e) {
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
		for(int idx=0; idx<answer.length; idx++) {
			if(answer[idx]==1) {	//==dap[idx]
				ox[idx]='O';
			}else {
				ox[idx]='X';
			}
		}//for end
		
		//���� ������ ���� ���� ���ϱ�
		score=0;
		for(int idx=0; idx<answer.length; idx++) {
			if(ox[idx]=='O'){
				score=score+20;
			}
		}//for end
	}//compute() end
	
	public void disp() {
		//���
		System.out.print(no);
		System.out.print("	");
		System.out.print(name);
		System.out.print("	");
		for(int idx=0; idx<answer.length; idx++) {
			System.out.print(ox[idx]);
		}
		System.out.print("	");
		System.out.print(score);
		System.out.print("	");
	}//disp() end
	
}//class end
//---------------------------------------------------------------------------
public class SungjukTest {
	public static void main(String[] args) {
		// �������α׷� (OX) ǥ���ϱ�
		// ��ü �迭
		Sungjuk6[] student = {
				new Sungjuk6(1, "ȫ�浿", 1, 2, 1, 1, 1),
				new Sungjuk6(2, "����ȭ", 1, 1, 1, 1, 1),
				new Sungjuk6(3, "���϶�", 2, 2, 4, 2, 1),
				new Sungjuk6(4, "���޷�", 2, 1, 4, 1, 1),
				new Sungjuk6(5, "����ȭ", 1, 1, 4, 3, 2),
		};
		
		int size = student.length;
		
		for(int idx=0; idx<size; idx++) {
			student[idx].compute();
		}
		
		//���
		for(int a=0; a<size; a++) {
			for(int b=0; b<size; b++) {
				if(student[a].score>student[b].score) {
					student[b].rank=student[b].rank+1;
				}
			}
		}//for end
		
		//����
		for(int a=0; a<size-1; a++) {
			for(int b=a+1; b<size; b++) {
				if(student[a].rank>student[b].rank) {
					Sungjuk6 temp = student[b];
					student[b]=student[a];
					student[a]=temp;
				}
			}
		}//for end
		
		//���
		System.out.println("	**������** ");
		System.out.println("��ȣ	�̸�		12345	����	���");
		for(int idx=0; idx<size; idx++) {
			student[idx].disp();
			System.out.print(student[idx].rank);
			System.out.println();
		}
		
	}//main() end
}//class end
