package oop1121;

public class SungjukTest {

	public static void main(String[] args) {
		// 성적프로그램
		String[] name = {"홍길동", "무궁화", "라일락", "진달래", "개나리"};
		int[] kor = {100, 35, 75, 95, 85};
		int[] eng = {100, 40, 80, 95, 90};
		int[] mat = {95, 50, 70, 35, 85};
		int[] aver = new int[5];
		int[] rank = {1, 1, 1, 1, 1};
		int size=name.length;
		
		//평균을 구하시오
		for(int idx=0; idx<size; idx++) {
			aver[idx]=(kor[idx]+eng[idx]+mat[idx])/3;
		}
		
		//등수를 구하시오(평균을 기준)
		for(int a=0; a<size; a++) {
			for(int b=0; b<size; b++) {
				if(aver[a]<aver[b]) {
					rank[a]=rank[a]+1;
				}
			}
		}
		
		//출력
	for(int idx=0; idx<size; idx++) {
			System.out.print(name[idx]+" ");
			System.out.print(kor[idx]+" ");
			System.out.print(eng[idx]+" ");
			System.out.print(mat[idx]+" ");
			System.out.print(aver[idx]+" ");
			System.out.print(rank[idx]+" ");
		
		// 문) 과락(합격, 재시험, 불합격)
			// 평균이 70점 넘는 사람 
			// 중 한 과목이라도 40점 미만이면 재시험
			// 아니면 합격
			// 평균 70점 미만은 불합격
		if(aver[idx]<70) {
			System.out.print("불합격");
		}else {
			if(kor[idx]<40 || eng[idx]<40 || mat[idx]<40) {
				System.out.print("재시험");
			}else {System.out.print("합격");}
		}//if end
		
		// 문) 평균 10점당 * 한개씩
		int[] star=new int[5];
		for(star[idx]=1; star[idx]<=aver[idx]/10; star[idx]++) {
				System.out.print("*");
		}//for end	
		//
		/*
		for(int n=1; n<=aver[idx]/10; n++) {
			System.out.print("*");
		}		*/
		
		// 문) 평균 95이상이면 장학생
		if(aver[idx]>=95) {
			System.out.print("장학생");
		}
		
		System.out.println();
	}//for end
	
	}//main() end
}//class end