package oop02.inheritance;
/*
모든 클래스는 Object 클래스를 기본적으로 상속 받는다.
 * */
public class No06_Object extends Object{
	public static void main(String[] args) {
		No06_Object obj = new No06_Object();
		
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
	}
}
// hashCode() : Object class , Reference Value 추출
// toString() : Object class , Class Name , Reference Value(16진수) 추출
