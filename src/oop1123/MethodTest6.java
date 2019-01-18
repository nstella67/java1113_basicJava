package oop1123;

public class MethodTest6 {

	public static int abs(int a) {	//���밪
		if(a<0) {
			a=-a;		//return -a;
		}else if(a>=0) {
			a=a;		//return a;
		}
		return a;
	}//abs() end
	
	public static int max(int a, int b, int c) {
		int max=a;
		if(max>=b) {
			max=max;
		}else {
			max=b;
		}
		if(max>=c) {
			max=max;
		}else {
			max=c;
		}
		return max;
		
		/* ������
			int m=(a<b) ? b : a;
			m = (m<c) ? c : m;
			return m;
		*/
		
	}//max() end
	
	public static boolean leap(int y) {	//����
		boolean tf=false;
		if((y%4==0)&&(y%100!=0)||(y%400==0)) {
			tf=true;
		}
		return tf;
		
		/* ������
			if((y%4==0)&&(y%100!=0)||(y%400==0)) {
				return true;
			}else{
				return false;
			}
		*/
	}//leap() end
	
	public static boolean isUpper(char a) {	//�빮��?
		boolean flag=false;
		if(a>='A' && a<='Z') {
			flag=true;
		}
		return flag;
		
		/* ������
			if(a>='A' && a<='Z') {
				return true;
			}else{
				return false;
			}
		*/
	}//isUpper() end
	public static boolean isLower(char a) {	//�ҹ���?
		boolean isL=false;
		if(a>='a' && a<='z') {
			isL=true;
		}
		return isL;
		
		/* ������
		if(a>='a' && a<='z') {
			return true;
		}else{
			return false;
		}
		*/
	}//isLower() end
	
	public static char toUpper(char ch) {	//�빮�ڷιٲ��
		if(ch>='a' && ch<='z') {
			ch=(char)(ch-32);
		}
		return ch;
		/* ������
			return (char)(ch-32);
		*/
	}//toUpper() end
	public static char toLower(char ch) {	//�ҹ��ڷιٲ��
		if(ch>='A' && ch<='Z') {
			ch=(char)(ch+32);
		}
		return ch;
		/* ������
		return (char)(ch+32);
		 */
	}//toLower() end
	
	public static String toBinary(int a) {		//2����
		/* ��
		int isB=00000000;
		if(a%128==1) {
			isB=isB+10000000;
		}
		if(a%64==1) {
			isB=isB+1000000;
		}
		if(a%32==1) {
			isB=isB+100000;
		}
		if(a%16==1) {
			isB=isB+10000;
		}
		if(a%8==1) {
			isB=isB+1000;
		}
		if(a%4==1) {
			isB=isB+100;
		}
		if(a%2==1) {
			isB=isB+10;
		}
		String B=""+isB;
		return B;	//*/
		
		// ������
			int[] binary = new int[8];
			int idx=0;
			while(true){
				binary[idx]=a%2;
				a=a/2;
				if(a==1) {
					idx++;
					binary[idx]=a;
					break;
				}
				idx++;
			}//while end
			
			String str="";
			for(int i=idx; i>=0; i--) {
				str=str+binary[i];
			}//for end
			
			return str;
		//*/
	}//toBinary() end
	
	public static void main(String[] args) {
		// �޼ҵ� ����
		/*
		System.out.println(Math.abs(-3));		//���밪
		System.out.println(Math.ceil(1.4));		//�ø�
		System.out.println(Math.max(3, 5));	//ū��
		
		System.out.println(Character.isLowerCase('r'));
		System.out.println(Character.isUpperCase('R'));
		System.out.println(Character.isLowerCase('B'));
		System.out.println(Character.isUpperCase('a'));
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
		*/
		
		// is~	����°� ��κ� boolean������ return���� �ǵ��ƿ´�
		// to~	��κ� �ڿ� �ִ� ������ �ٲٶ�� ��
		// get~
		// set~
//-----------------------------------------------------------------------------------
		// ��) ���밪�� ���ϴ� �Լ��� �ۼ��Ͻÿ�
		int result = abs(-3);
		System.out.println(result);
		
		// ��) �� ���� �� �߿��� �ִ밪�� ����Ͻÿ�
		int m= max(3, 5, 7);
		System.out.println(m);
		
		// ��) ������ ������ ���Ͻÿ�
		int count=0;
		for(int y=1; y<2018; y++) {
			if(leap(y)) {
				count++;
			}
		}//for end
		System.out.println(count);
		
		// ��) ��ҹ��� �ٲ㼭 ����Ͻÿ�
		char ch ='R';
		if(isUpper(ch)) {
			System.out.println(toLower(ch));
		}else if(isLower(ch)) {
			System.out.println(toUpper(ch));
		}else {
			System.out.println(ch);
		}

		// ��) 2������ �ٲ㼭 ����Ͻÿ�
		String str = toBinary(10);
		System.out.println(str);
	}//main() end
}//class end