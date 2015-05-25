package oop06.nestedClasses;
/*
 내부클래스 (Inner Class) 첫번째 형태
 - 인스턴스 내부 클래스
 - 멤버메소드를 클래스 내부에 선언함
 * */
public class InnerClassInstance {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public class Inner{
		public void printData(){
			System.out.println("int a :"+a);
			System.out.println("※ private int b :"+b); 
			// private 이라도 멤버변수 접근에 제한이 없다
			System.out.println("static int c :"+c);
		}
	}
}
