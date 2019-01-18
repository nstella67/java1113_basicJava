package oop1203;



public class ExceptionTest {
	public static void main(String[] args) {
		// Exception 예외처리
		// 자바클래스 실행(Run)시 발생하는 오류
		// try ~ catch문
		// throw문
		// finally
		
		//1) Exception 처리하지 않은 경우
		/*
		System.out.println(1);
		System.out.println(2/0);	//ArithmeticException발생
		System.out.println(3);		//exception이후에는 실행 안됨
		*/
		
		//2) Exception 처리한 경우
		/*
		try {	//예외가 발생할 예상이 되는 코드를 작성
			System.out.println(1);
			System.out.println(2/0);		//예외 밑은 무시. catch로 간다
			System.out.println(3);
		}catch(ArithmeticException e) {	//예외가 발생되면
													//처리할 코드를 작성
			System.out.println(e);
		}//try() end
		System.out.println("END");
		*/
		
		//3) 
		/*
		System.out.println(1);
		try {
			int[] su = new int[3];
			su[3] = 5;	//exception 발생
			System.out.println(2);
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("END");
		*/
		
		//4) 
		/*
		try {
			System.out.println(1);
			int su = Integer.parseInt("SKY");
			System.out.println(2);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}finally {	//exception 상관없이 무조건 실행
			System.out.println(5);
		}
		System.out.println("END");
		*/
		
		//5)
		/*
		try {
			System.out.println(1);
			Integer inte = null;
			int su = 3/inte;
			System.out.println(2);
		}catch(NullPointerException e) {
			System.out.println(e);
		}finally {
			System.out.println(5);
		}
		System.out.println("END");
		*/
		
		//6) 
		/*
		try {
			System.out.println(1);
			//-------------------------------------------------
			System.out.println(2/0);
			
			int[] su = new int[3];
			su[3] = 5;
			
			System.out.println(Integer.parseInt("SKY"));
			
			Integer inte = null;
			System.out.println(7/inte);
			//--------------------------------------------------
			System.out.println(9);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}//exception, catch문 여러 개 나올 수 있다
		
		System.out.println("END");
		*/
		
		//7)
		try {
			System.out.println(1);
			//-------------------------------------------------
			System.out.println(2/0);
			
			int[] su = new int[3];
			su[3] = 5;
			
			System.out.println(Integer.parseInt("SKY"));
			
			Integer inte = null;
			System.out.println(7/inte);
			//--------------------------------------------------
			System.out.println(9);
		}catch(Exception e) {	//다형성
										//모든 exception의 부모 : Exception 클래스
			System.out.println(e);
		}
		
		System.out.println("END");
		
	}//main() end
}//class end
