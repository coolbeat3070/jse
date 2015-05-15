package oop01.encapsule;

import java.util.Scanner;

public class KaupService {

	public static void main(String[] args) {
		
		KaupVO vo = new KaupVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = scanner.nextDouble();
		vo.setHeight(height);
		vo.setWeight(weight);
		vo.setIdx(height, weight);
		System.out.println(vo.getMsg());
		vo.setMsg("");
		System.out.printf(vo.toString());
		System.out.println("완료");
	}
}