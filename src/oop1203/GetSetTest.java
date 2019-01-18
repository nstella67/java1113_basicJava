package oop1203;

class Score {
	//field�� ��κ� private �Ӽ��� ���� �����Ѵ�
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	public Score() {}//default constructor
	
	//private �Ӽ��� field �����ϴ� ��� method Ȱ���Ѵ�
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
		// getter�Լ�
		// setter�Լ�
		// ���ξ� set, get���� �����ϰ�
		// field�� ù ���ڸ� �빮�ڷ� �ٲ� �� �޼ҵ� �̸��� �����Ѵ�
		
		Score score = new Score();
		//���� private �Ӽ��� �������ٸ� ����(�ܺο��� ������ �� ����)
		//score.name
		
		score.setName("����ȭ");
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
