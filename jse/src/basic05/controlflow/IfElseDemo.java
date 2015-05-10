package basic05.controlflow;

import java.util.Scanner;

public class IfElseDemo {
	int big;
	

	public void getBig(int a, int b, int c) {

		if (a > b && a > c) {
			System.out.println("가장 큰 수는 A값인 " + a + "입니다.");
		} else if (b > a && b > c) {
			System.out.println("가장 큰 수는 B값인 " + b + "입니다.");
		} else {
			System.out.println("가장 큰 수는 C값인 " + c + "입니다.");
		}

	}
	public static void main(String[] args) {
		IfElseDemo ngb = new IfElseDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("A 값 입력하세요");
		int a = sc.nextInt();
		System.out.println("B 값 입력하세요");
		int b = sc.nextInt();
		System.out.println("C 값 입력하세요");
		int c = sc.nextInt();
		
		ngb.getBig(a, b, c);
	}
}
