package oop03.inheritance;
/*
멤버변수의 상속
 * */
// 부모 클래스
class Car{
	String name = "자동차";
}
class Hcar extends Car2{
	String cname = "현대";
}
public class No2_MemberVarExtendDemo {
	public static void main(String[] args) {
		Hcar h = new Hcar();
		System.out.print(h.cname+"\t");
		System.out.println(h.name);
	}
}
