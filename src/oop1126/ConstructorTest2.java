package oop1126;

//����ϰ��� �ϴ� Ŭ������ ��ġ�� �ִ� ��Ű���� ����ϰ� ���
import java.util.*;	//import�� ���� �� �� �� �ִ�		.*�����Ű�����
import java.io.File;	//main()���� ���� �ڵ����� �����ȴ�
import java.sql.ResultSet;	//������� import java.sql.*;

class Jumsu {
	//Ŭ���� ���� �� ��������� ��κ� private �Ӽ��� ���
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//������ �Լ��� �ڵ����� �ڵ� �߰��� �� �ֵ��� �Ѵ�
	//��Ŭ���� : Source �� Generate Constructor...
	public Jumsu() {}//default constructor�⺻������ �Լ�

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
		// import �����ؾ� �� �� �ִ�

	}//main() end
}//class end