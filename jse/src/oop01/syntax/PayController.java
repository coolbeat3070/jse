package oop01.syntax;
/*
Date : 
Author :
Desc :
 * */
class Pay{
	/*
멤버변수, 인스턴스변수, 필드라고 부릅니다.
	 * */
	String name; // 이름
	int salary; // 급여
	int tax; // 세금, 세율은 10% 로 0.1 
	int income; // 실제 수입액
}

public class PayController {
	public static void main(String[] args) {
		/*
인스턴스 생성 문법
클래스(타입) + 인스턴스명 = new 생성자;
p1, p2, p3 를 객체, 객체변수, 인스턴스변수라고 하며
메모리(힙heap) 에 적재 됩니다.
		 * */
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();
		
		p1.salary = 400; 
		p1.name = "아이언맨";
		p1.tax = (int)(p1.salary*0.1);
		p1.income = p1.salary - p1.tax;
		
		p2.salary = 200; 
		p2.name = "헐크";
		p2.tax = (int)(p2.salary*0.1);
		p2.income = p2.salary - p2.tax;
		
		p3.salary = 300; 
		p3.name = "토르";
		p3.tax = (int)(p3.salary*0.1);
		p3.income = p3.salary - p3.tax;
		
		System.out.println("==="+p1.name+"5월 급여내역===");
		System.out.println("본봉 : " + p1.salary+" 만원");
		System.out.println("세금 : " + p1.tax+" 만원");
		System.out.println("실수령액 :" + p1.income+" 만원" );
		System.out.println();
		
		System.out.println("==="+p2.name+"5월 급여내역===");
		System.out.println("본봉 : " + p2.salary+" 만원");
		System.out.println("세금 : " + p2.tax+" 만원");
		System.out.println("실수령액 :" + p2.income+" 만원" );
		System.out.println();
		
		System.out.println("==="+p3.name+"5월 급여내역===");
		System.out.println("본봉 : " + p3.salary+" 만원");
		System.out.println("세금 : " + p3.tax+" 만원");
		System.out.println("실수령액 :" + p3.income+" 만원" );
		
	}
}
