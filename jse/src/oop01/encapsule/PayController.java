package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		/*
		 공식 ... 
		 income = salary - salary*TAX;
		 static final double TAX = 0.1;
		 PayVO : getter, setter
		 PayService : 계산로직
		 PayController : 입출력 만 존재합니다.
		 세개로 분할하세요.
		 이름과 급여는 입력받아서
		 세율 뺀 실 소득을 구하는 로직입니다.
		 
		 * */
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 이름을 입력하세요. ");
		String name = scanner.nextLine();
		System.out.println(" 본봉을 입력하세요. ");
		int salary = scanner.nextInt();
		PayService service = new PayService();
		
		System.out.println("===== 급여내역 =====");
		System.out.println("성명 : " + name );
		System.out.println("본봉 : " + salary);
		System.out.println("세율 : " + service.showTax());
		System.out.println("실수령액 : " + service.calculateIncome(name,salary));
	}
}
