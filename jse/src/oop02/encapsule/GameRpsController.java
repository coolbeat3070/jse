package oop02.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		System.out.println("가위바위보 게임을 시작합니다.");
		while(true){
			GameRpsVO rps = new GameRpsVO();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("가위:1 바위:2 보:3 을 입력해주세요");
			
			GameRpsValidation util = new GameRpsValidation();
			
			try {
				int player = sc.nextInt();
				int a=1;
				int b=3;
				if(player<a||player>b){
					System.out.println(util.showRange(a,b));
					continue;
				}
				String playerRPS = rps.setRpsValue(player);
				System.out.println("당신은 "+playerRPS+" 를 냈습니다.");
				int computer = (int)((Math.random()*3)+1);
				String computerRPS = rps.setRpsValue(computer);
				
				GameRpsService rpsg = new GameRpsService();
				System.out.println("컴퓨터는 "+computerRPS+"이고, 결과는 "+rpsg.playGame(player, computer)+" 입니다.");
			} catch (java.util.InputMismatchException e) {
				e.printStackTrace();
				continue;
			}
			
		}
	}
	
}
