package oop1121;

public class ArrayTest3 {

	public static void main(String[] args) {
		// Array �迭
		int[] su= {-5, 6, 0, 4, 3};
		int size=su.length;		//5
		
		// ��1) su�迭 ����� ��ü�� ���� ���Ͻÿ�
		int hap=0;
		for(int idx=0; idx<size; idx++) {
			hap=hap+su[idx];
		}//for end
		System.out.println("��ü��:"+hap);
		
		
		// ��2) ��� �߿��� ¦���� ���� ���Ͻÿ�
		hap=0;
		for(int idx=0; idx<size; idx++) {
			if(su[idx]>0 && (su[idx]%2==0)) {
				hap=hap+su[idx];
			}
		}//for end
		System.out.println("¦����:"+hap);
		
		
		// ��3) ������ ������ ���Ͻÿ�
		int count=0;
		for(int idx=0; idx<size; idx++) {
			if(su[idx]<0) {
				count++;
			}
		}//for end
		System.out.println("������ ����:"+count);
		
		
		// ��4) su[2]�� ����� ���Ͻÿ�	//6,4,3,0,-5 4��
		int d=1;
		for(int idx=0; idx<size; idx++) {
			if(su[2]<su[idx]) {
				d++;
			}
		}//for end
		System.out.println("su[2]�� ���:"+d);
		
		
		// ��5) �ִ밪, �ּҰ��� ���Ͻÿ� -5 6 0 4 3
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
		System.out.println("�ִ밪:"+max);
		System.out.println("�ּҰ�:"+min);*/
		
		
		
		int max=0, min=0;
		if(su[0]<su[size-1]) {
			max=su[size-1];
			min=su[0];
		}else {
			max=su[0];
			min=su[size-1];
		} //max, min �ʱⰪ
		
		for(int idx=0; idx<size; idx++) {			
			if(max<su[idx]) {
				max=su[idx];
			}//max��
			
			if(min>su[idx]) {
				min=su[idx];
			}//min��
		}//for end	
		System.out.println(max);
		System.out.println(min);
		/*������
		int max=su[0];
		int min=su[0];
		for(int idx=0; idx<size; idx++) {
			if(max<su[idx]) { max=su[idx]; }//max
			
			if(min>su[idx]) { min=su[idx]; }//min
		}//for end
		System.out.println(max);
		System.out.println(min);		*/
		
		
		// ��) su�迭 ��� ������ ����� ���Ͻÿ�
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
		
		/*������
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