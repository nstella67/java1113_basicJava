package oop1204;

import java.util.Arrays;

class Sungjuk6 {
	//field
	private int no;							//번호
	private String name;					//이름
	private int[] answer = new int[5];	//답안제출
	private char[] ox = new char[5];	//OX표시
	public int score;							//점수
	public int rank;							//등수
	
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
		//제출한 answer 답안과 정답을 비교해서 OX구하기
		for(int idx=0; idx<answer.length; idx++) {
			if(answer[idx]==1) {	//==dap[idx]
				ox[idx]='O';
			}else {
				ox[idx]='X';
			}
		}//for end
		
		//맞은 갯수에 따라 점수 구하기
		score=0;
		for(int idx=0; idx<answer.length; idx++) {
			if(ox[idx]=='O'){
				score=score+20;
			}
		}//for end
	}//compute() end
	
	public void disp() {
		//출력
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
		// 성적프로그램 (OX) 표시하기
		// 객체 배열
		Sungjuk6[] student = {
				new Sungjuk6(1, "홍길동", 1, 2, 1, 1, 1),
				new Sungjuk6(2, "무궁화", 1, 1, 1, 1, 1),
				new Sungjuk6(3, "라일락", 2, 2, 4, 2, 1),
				new Sungjuk6(4, "진달래", 2, 1, 4, 1, 1),
				new Sungjuk6(5, "봉선화", 1, 1, 4, 3, 2),
		};
		
		int size = student.length;
		
		for(int idx=0; idx<size; idx++) {
			student[idx].compute();
		}
		
		//등수
		for(int a=0; a<size; a++) {
			for(int b=0; b<size; b++) {
				if(student[a].score>student[b].score) {
					student[b].rank=student[b].rank+1;
				}
			}
		}//for end
		
		//정렬
		for(int a=0; a<size-1; a++) {
			for(int b=a+1; b<size; b++) {
				if(student[a].rank>student[b].rank) {
					Sungjuk6 temp = student[b];
					student[b]=student[a];
					student[a]=temp;
				}
			}
		}//for end
		
		//출력
		System.out.println("	**시험결과** ");
		System.out.println("번호	이름		12345	점수	등수");
		for(int idx=0; idx<size; idx++) {
			student[idx].disp();
			System.out.print(student[idx].rank);
			System.out.println();
		}
		
	}//main() end
}//class end
