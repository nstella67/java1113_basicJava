package oop1119;

public class ForTest3 {

	public static void main(String[] args) {
		// for(;;) {} ���ѷ���
		
		// �� ) x���� 10���κ��� x�� ���� �� �� ��
		//		����� ������ �Ǹ� x�� �� �� ���°��� ���Ͻÿ�
		/*
		int x=3;
		int count1=0;
		for(;;) {
			count1++;
			if(10-x<0) break;
			x=x+x;
		}
		System.out.println(count1+1);	*/
		
		/* �������� �� ��
		int count=0;
		int su=10;
		int x=3;
		
		for(;;) {	//���ѷ���
			count=count+1;
			su=su-x;
			if(su<0) break;
		}
		System.out.println(count);
		System.out.println(su);	*/
		
		// ��) ��� �����̴� ������ 3cm �ö󰡰�
		//		�㿡�� 2.5cm �����´ٰ� �� ��
		//		�����̰� 13cm�� ���� ����⿡ �ö󰡷���
		//		��ĥ�� �ɸ����� ���Ͻÿ�
		/*����
		double day=0.5;
		int count2=0;
		for(;;) {
			count2++;
			if((day*count2)>=13) break;
		}
		System.out.println(count2);	//26
		*/
		/* �������� �� ��
		int day =0;				// ��ĥ
		double snail=0.0;		// ������
		
		for(;;) {	//���ѷ���
			day=day+1;
			snail=snail+3.0;
			if(snail>=13) {
				break;
			}else {
				snail=snail-2.5;
			}
		}//for end
		System.out.println(day);	//21
		System.out.println(snail);	//13
		*/
		
		
		// ��) �������� ����� ���Ͻÿ�
		//		1-2+3-4+5... 100
		/*
		int even=2;
		int odd=1;
		int hap=1-2;
		for(;;) {
			hap=odd-even;
			if(even==100) break;
			even=even+2;
			odd=odd+2;
		}
		System.out.println(hap);	//-1
		*/
		/* �������� �� ��
		int hap =0;
		boolean flag=false;
		
		for(int a=1; a<=100; a++) {
			if(flag) {
				hap=hap-a;
				flag=false;
			}else {
				hap=hap+a;
				flag=true;
			}
		}
		System.out.println(hap);
		*/
		
			
		/* ��) 1     2     3     4      5    99
				�� - �� + �� - �� + �� ... ��  = ?
				 2    3      4    5      6    100
		*/
		/*
		double bb=1;
		double bm=2;
		double hap2=-bm/bb;
		double hap3=bb/bm;
		boolean flag=false;
		
		for(;;) {
			if(flag) {
				hap2=hap2-(++bm/++bb);
				flag=false;
			}else {
				hap3=hap3+(++bb/++bm);
				flag=true;
			}
			if(bm==100) break;
		}
		System.out.println(hap2+hap3);		//-5.3755496949804
		*/
		/* ������
		double hap=0;
		boolean flag=false;
		for(int a=1; a<100; a++) {
			if(flag) {
				flag=false;
				hap=hap-((double)a/(a+1));
			}else {
				flag=true;
				hap=hap+((double)a/(a+1));
			}
		}
		System.out.println(hap);	//0.6881721793101957
		*/
		
		// ��) �� �� ������ ���� ���Ͻÿ�
		// 3+4+5 = 5+4+3
		int start=5, end=3;	//3+4+5
		int hap=0;
		
		// swap ��ȯ. �������� ��ȯ
		if(start>end) {
			int temp = end;		//�� ������ ���� �ű��
			end=start;				//
			start=temp;				//
		}	//start ������ end���� ũ�� �� �������� ��ȯ
		
		for(int a=start; a<=end; a++) {
			hap=hap+a;
		}
		
		System.out.println(hap);
		
	}//main() end
}//class end