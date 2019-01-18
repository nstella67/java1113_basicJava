package oop1127;

public class StringTest {

	public static void main(String[] args) {
		/*
		// String 클래스
		
		String name = "홍길동";
		String str = new String("Gone With The Wind");
		
		
		
		//글자갯수
		System.out.println(str.length());	//18 
		
		//글자순서(0부터 시작)
		System.out.println(str.indexOf("d"));//17 글자의 위치(순서값0~17)
		//동일한 문자가 여러 개일 때 처음으로 나오는 글자의 인덱스 값 반환
		System.out.println(str.indexOf("W"));	//5
		//찾고자 하는 문자가 없는 경우 -1로 반환
		System.out.println(str.indexOf("R"));	//-1
		
		//0번째 글자
		System.out.println(str.charAt(0));	//'G' 
		//마지막글자
		System.out.println(str.charAt(17));	//'d' 
		System.out.println(str.charAt(str.length()-1));	//문자열의 마지막 글자
		// 마지막 글자 위치는 다 다르므로 length()이용
		
		//빈 문자열?
		System.out.println(str.isEmpty());	//false
		//전부 다 대/소문자로 바꿔주는 것
		System.out.println(str.toUpperCase());	//전부대문자로GONE WITH THE WIND
		System.out.println(str.toLowerCase());	//전부소문자로gone with the wind
		
		//문자열 치환(바꾸기)
		System.out.println(str.replace('n', 'N'));	//n→N GoNe With The WiNd
		//System.out.println(str.replace('\n', '<br>')); //\n(엔터)→<br>
		
		//특정 문자를 기준으로 문자열 분리
		String word[]=str.split(" ");
		for(int idx=0; idx<word.length; idx++) {
			System.out.println("#"+word[idx]+"#");
		}//for end
		
		//.csv → 특정기호로 데이터를 구분해서 저장 문서
//----------------------------------------------------------------------------------------------------
		// 문자열 자르기 ★★★
		//3번째 글자부터 ~마지막까지 자르기
		System.out.println(str.substring(3));
		//3번째~(8-1)까지 글자 자르기 - 내가 자르고싶은 글자보다 하나 더 줘야 함
		System.out.println(str.substring(3, 8));
								//substring(시작위치, 끝위치+1)
		
		//문) 첫글자
		System.out.println(str.substring(0, 1));
		//문) 마지막글자
		System.out.println(str.substring(17, 18));
		System.out.println(str.substring(str.length()-1, str.length()));
		System.out.println(str.substring(str.length()-1));
		
		//맨 앞뒤 공백제거(공백갯수상관없음)
		System.out.println("#"+"   S k  y  ".trim()+"#");		//#S k  y#
		*/
//----------------------------------------------------------------------------------------------------
		//문) 이메일 주소에 @문자가 있는지 확인
			//@문자가 있다면 @를 기준으로 앞뒤 문자열을 분리해라
			//-------출력--------------
			//아이디	: webmaster
			//서버		: solsesk.com
		System.out.println("** ** 문) 이메일 주소 ** **");
		String email = "webmaster@soldesk.com";
		String em = new String (email);
		
		System.out.println("이메일 : "+email);
		if(em.indexOf("@")==-1) {
			System.out.println("이메일 주소가 잘못됐습니다.");
		}else {
			System.out.println("이메일이 맞습니다.");
		}
		
		String idp[]=em.split("@");
		
		for(int idx=0; idx<idp.length; idx++) {
			if(idx==0) {
				System.out.println("아이디	: "+idp[idx]);
			}else {
				System.out.println("서버	: "+idp[idx]);	
			}
		}//for end
		
		/*선생님
		String email = "webmaster@soldesk.com";
		if(email.indexOf("@")==-1) {
			System.out.println("이메일 주소 틀림!!");
		}else {
			System.out.println("이메일 주소 맞음!!");
			System.out.println(email.substring(0, 9));
			System.out.println(email.substring(10, 21));
			System.out.println(email.substring(10));
			//1)
			int pos = email.indexOf("@");//9
			String id = email.substring(0, pos);
			String server = email.substring(pos+1);
			System.out.println(id);
			System.out.println(server);
			//2)
			String word[] = email.split("@");
			for(int idx=0; idx<word.length; idx++) {
				System.out.println(word[idx]);
			}
		}//if end
		*/
		
System.out.println("=========================");
		
		//문) 주민번호 : 성별, 나이
			// 성별	: 남자
			// 나이	: 29
			// 8+9+1+2+3+0+1+2+3+4+5+6+7=?
		System.out.println("** 문) 주민번호 : 성별, 나이 **");
		String jumin = "8912301234567";
		System.out.println("주민번호 : " + jumin);
		int sung = Integer.parseInt(jumin.substring(6, 7));
		if(sung%2==0) {
			System.out.println("성별	: 여자");
		}else {
			System.out.println("성별	: 남자");
		}//if() end 성별
		
		System.out.println("나이	: "+(2018-1900-Integer.parseInt(jumin.substring(0, 2))));
		
		int hap=0;
		for(int i=0; i<jumin.length(); i++) {
			int a = Integer.parseInt(jumin.substring(i, i+1));	//각번호
			hap=hap+a;
		}
		System.out.println("8+9+1+2+... = "+hap);
		
		/*선생님
		String jumin = "8912301234567";
		int hap=0;
		for(int idx=0; idx<jumin.length(); idx++) {
			//hap=hap+jumin.charAt(idx);	//675
			//hap=hap+(int)(jumin.charAt(idx));	//675
			//'8'+'9'+'1'+'2'+'3'+...char형
			//'8' → 8
			char ch=jumin.charAt(idx);
			hap=hap+Character.getNumericValue(ch);
		}//for end
		System.out.println(hap);
		
		//성별코드
			int code = Integer.parseInt(jumin.substring(6, 7));
			
			//태어난 년도
			int myYear = Integer.parseInt(jumin.substring(0, 2));
			switch(code) {
			case 1 :
			case 2 : myYear = myYear + 1900; break;
			case 3 :
			case 4 : myYear = myYear + 1900; break;
			}
			
			//나이
			int age = 2018-myYear;
			
			//성별
			String gender = "";
			switch(code%2) {
			case 0 : gender = "여자"; break;
			case 1 : gender = "남자"; break;
			}
			
			System.out.println("주민번호 : "+jumin);
			System.out.println("성별 : "+gender);
			System.out.println("나이 : "+age);
		*/
		

	}//main() end
}//class end