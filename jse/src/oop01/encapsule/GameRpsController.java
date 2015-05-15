package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		
		GameRpsService service = new GameRpsService();
		
		System.out.println("가위,바위,보 게임을 시작합니다.");
		System.out.println("1.가위, 2.바위, 3.보 를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int playerValue = scanner.nextInt();
		System.out.println("당신은"+service.showRpsValue(playerValue)+"를 냈습니다.");
		int comValue = service.displayComValue();
		System.out.println("컴퓨터는"+ service.showRpsValue(comValue ) +"를 냈습니다.");
		String winner = service.showWinner();
		System.out.println( winner  + "가 이겼습니다.");
		
	}
}
