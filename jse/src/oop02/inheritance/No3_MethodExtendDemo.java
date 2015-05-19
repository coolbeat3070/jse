package oop02.inheritance;
/*
 Method 상속 
 
 Car
 △
 | 상속
 Hcar <ㅡ new (instantiate) 
 
 
 * */
class Car2{
	String name = "자동차";
	public String gear(){
		return "수동기어";
	}
}
class Hcar2 extends Car2{
	String cname = "현대";
	public String autoGear(){
		return "오토기어";
	}
}
public class No3_MethodExtendDemo {
	public static void main(String[] args) {
		Hcar2 h = new Hcar2();
		System.out.println(h.gear());
		System.out.println(h.autoGear());
		
		Car2 c = new Car2();
		System.out.println(c.gear());
	//	System.out.println(c.autoGear()); 에러 
		// 상속하여 받을 수 있는 로직은 자식만 가능하다.
		
		
	}
}
