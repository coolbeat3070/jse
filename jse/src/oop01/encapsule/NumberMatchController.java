package oop01.encapsule;

import java.util.Scanner;

public class NumberMatchController {
	public static void main(String[] args) {
		NumberMatchService service = new NumberMatchService();
		int player;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~2까지의 수를 입력하세요.");
		player = scanner.nextInt();
		service.game(player);
		
	}
}
