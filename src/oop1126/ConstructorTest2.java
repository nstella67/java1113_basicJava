package oop1126;

//사용하고자 하는 클래스가 위치해 있는 패키지를 명시하고 사용
import java.util.*;	//import는 여러 개 올 수 있다		.*모든패키지사용
import java.io.File;	//main()에서 사용시 자동으로 생성된다
import java.sql.ResultSet;	//직접명시 import java.sql.*;

class Jumsu {
	//클래스 설계 시 멤버변수는 대두분 private 속성을 사용
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//생성자 함수는 자동으로 코딩 추가할 수 있도록 한다
	//이클립스 : Source → Generate Constructor...
	public Jumsu() {}//default constructor기본생성자 함수

	public Jumsu(String name) {
		this.name = name;
	}

	public Jumsu(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
}//class end

//------------------------------------------------------------------------------
public class ConstructorTest2 {

	public static void main(String[] args) {
		// import 선언해야 쓸 수 있다

	}//main() end
}//class end