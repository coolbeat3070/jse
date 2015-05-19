package oop02.inheritance;

public class No04_NoOverridingDemo {
//	Parent 의 show() 와 Child 의 show() 원형이 
// 달라서 오버라이딩이 아니다.
	public static void main(String[] args) {
		Child c = new Child();
		c.show("Parent's method");
		c.show();
	}
}
class Parent{
	void show(String str){
		System.out.println("부모의 메소드 show() 실행 " + str);
	}
}
class Child extends Parent{
	void show(){
		System.out.println("자식의 메소드 show() 실행");
	}
}