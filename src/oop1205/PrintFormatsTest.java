package oop1205;

public class PrintFormatsTest {

	public static void main(String[] args) {
		// 출력서식
		/* - 명령어 - 
			%d	10진 정수형 출력
			%f		실수형 출력
			%c	문자형 출력
			%s	문자열형 출력
			\n	줄바꿈
			System.out.printf("출력포맷", 값);
		*/
		System.out.printf("정수형: %d %d %d \n", 10, 20, 30);
		System.out.printf("#%5d# \n", 3);	//5칸오른쪽정렬	#    3# 
		System.out.printf("#%-5d# \n", 3);	//5칸왼쪽정렬		#3    # 
		
		System.out.printf("실수형: %f %f %f \n", 1.2, 3.4, 5.6);
		System.out.printf("#%6.2f# \n", 7.8);		//6칸소숫점2자리까지	#  7.80#  
		System.out.printf("#%-6.2f# \n", 7.8);	//								#7.80  # 
		
		System.out.printf("%c %c %c \n", 'S', 'K', 'Y');
		System.out.printf("#%5c# \n", 'R');	
		System.out.printf("#%-5c# \n", 'r');
		
		System.out.printf("%s %s %s \n", "Year", "Month", "Date");
		System.out.printf("#%8s# \n", "Happy");	 
		System.out.printf("#%-8s# \n", "Happy");
		
	}//main() end
}//class end
