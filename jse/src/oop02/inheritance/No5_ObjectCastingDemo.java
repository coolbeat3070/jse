package oop02.inheritance;

public class No5_ObjectCastingDemo {
	public static void main(String[] args) {
		// 일반적인 객체생성
		Aclass a = new Aclass();
		Bclass b = new Bclass();
		
		// 부모타입 = new 자식타입
		Aclass a2 = new Bclass();
		// 오버라이딩시 자식클래스 메소드 우선 호출
		a2.over(1); 
		// 오버라이딩 하지 않으면 부모클래스 메소드 우선 호출
		a2.noOver(1);
		// 부모클래스 타입을 자식클래스로 강제 형변환 함
		Bclass b2 = (Bclass) a2;
		b2.over(1);
		b2.noOver("AAA");
		
		
	}
}
class Aclass{
	void over(int i){
		System.out.println("Aclass-over() :" + (i*10));
	}
	void noOver(int i){
		System.out.println("Aclass-noOver() :" + i);
	}
}
class Bclass extends Aclass{
	void over(int i){
		System.out.println("Bclass-over() :" +  (i*10000));
	}
	void noOver(String s){
		System.out.println("Bclass-noOver(String s) :" + s);
	}
	void onlyB(){
		System.out.println("onlyB()");
	}
	
}
