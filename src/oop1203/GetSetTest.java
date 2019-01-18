package oop1203;

class Score {
	//field는 대부분 private 속성을 많이 유지한다
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	public Score() {}//default constructor
	
	//private 속성의 field 접근하는 경우 method 활용한다
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return this.eng;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getMat() {
		return this.mat;
	}
	
	public void setAver(int aver) {
		this.aver = aver;
	}
	public int getAver() {
		return this.aver;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", aver=" + aver + "]";
	}
	
	
	
}//class end
//-------------------------------------------------------------
public class GetSetTest {
	public static void main(String[] args) {
		// getter함수
		// setter함수
		// 접두어 set, get으로 시작하고
		// field의 첫 그자를 대문자로 바꾼 후 메소드 이름을 구성한다
		
		Score score = new Score();
		//에러 private 속성은 내부접근만 가능(외부에서 접근할 수 없다)
		//score.name
		
		score.setName("무궁화");
		score.setKor(10);
		score.setEng(20);
		score.setMat(30);
		
		System.out.println(score.getName());
		System.out.println(score.getKor());
		System.out.println(score.getEng());
		System.out.println(score.getMat());
		
		
		System.out.println(score.toString());
		System.out.println(score);
		
	}//main() end
}//class end
