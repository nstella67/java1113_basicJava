package oop1121;

public class ArrayTest3 {

	public static void main(String[] args) {
		// Array 배열
		int[] su= {-5, 6, 0, 4, 3};
		int size=su.length;		//5
		
		// 문1) su배열 요소의 전체의 합을 구하시오
		int hap=0;
		for(int idx=0; idx<size; idx++) {
			hap=hap+su[idx];
		}//for end
		System.out.println("전체합:"+hap);
		
		
		// 문2) 양수 중에서 짝수의 합을 구하시오
		hap=0;
		for(int idx=0; idx<size; idx++) {
			if(su[idx]>0 && (su[idx]%2==0)) {
				hap=hap+su[idx];
			}
		}//for end
		System.out.println("짝수합:"+hap);
		
		
		// 문3) 음수의 갯수를 구하시오
		int count=0;
		for(int idx=0; idx<size; idx++) {
			if(su[idx]<0) {
				count++;
			}
		}//for end
		System.out.println("음수의 갯수:"+count);
		
		
		// 문4) su[2]의 등수를 구하시오	//6,4,3,0,-5 4등
		int d=1;
		for(int idx=0; idx<size; idx++) {
			if(su[2]<su[idx]) {
				d++;
			}
		}//for end
		System.out.println("su[2]의 등수:"+d);
		
		
		// 문5) 최대값, 최소값을 구하시오 -5 6 0 4 3
		/*
		int max=su[0], min=su[0];
		for(int idx=0; idx<size; idx++) {
			if(su[idx]<su[idx+1]) {
				max=su[idx+1];
			}else {
				max=max;
			}
			if(su[0]>su[idx]) {
				min=su[idx];
			}else {
				min=su[0];
			}
		}//for end
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);*/
		
		
		
		int max=0, min=0;
		if(su[0]<su[size-1]) {
			max=su[size-1];
			min=su[0];
		}else {
			max=su[0];
			min=su[size-1];
		} //max, min 초기값
		
		for(int idx=0; idx<size; idx++) {			
			if(max<su[idx]) {
				max=su[idx];
			}//max값
			
			if(min>su[idx]) {
				min=su[idx];
			}//min값
		}//for end	
		System.out.println(max);
		System.out.println(min);
		/*선생님
		int max=su[0];
		int min=su[0];
		for(int idx=0; idx<size; idx++) {
			if(max<su[idx]) { max=su[idx]; }//max
			
			if(min>su[idx]) { min=su[idx]; }//min
		}//for end
		System.out.println(max);
		System.out.println(min);		*/
		
		
		// 문) su배열 요소 각각의 등수를 구하시오
		int[] rank= {1, 1, 1, 1, 1};
		int a=0;
		
		for(int idx=0; idx<size; idx++) {
			for(a=0; a<size; a++){
				if(su[a]<su[idx]) {
					rank[a]=rank[a]+1;
				}
				
			}
			
		}//for end
		for(a=0; a<size; a++) {
			System.out.print(rank[a]+" ");
		}
		
		/*선생님
		int[] rank= {1, 1, 1, 1, 1};
		for(int a=0; a<=4; a++) {
			for(int b=0; b<=4; b++) {
				if(su[a]<su[b]) {
					rank[a]=rank[a]+1;
				}
			}
		}
		for(int idx=0; idx<size; idx++) {
			System.out.print(rank[idx]+" ");
		}		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end