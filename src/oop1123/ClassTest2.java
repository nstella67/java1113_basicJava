package oop1123;

import java.lang.reflect.Constructor;

import oop1114.SungjukTest;
import oop1126.ConstructorTest1;

public class ClassTest2 {

	public static void main(String[] args) {
		// 클래스의 접근제어
		
		// Sungjuk 클래스는 package 접근제어로 oop1126에 선언되어
		// 있기 때문에 다른 package에서 접근할 수 없다
		// Sungjuk sj; 에러 
		
		//ConstructorTest1 클래스는 접근제어가 public이므로
		//basicJava 프로젝트에서는 모두 접근할 수 있다
		ConstructorTest1 test;	//에러아님

	}//main() end
}//class end