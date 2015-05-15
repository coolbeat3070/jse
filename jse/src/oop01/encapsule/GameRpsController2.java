package oop01.encapsule;
/*package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		System.out.println("가위바위보 게임을 시작합니다.");
		boolean flag = true;
		while(flag){
			GameRpsService service = new GameRpsService();
			Scanner scanner = new Scanner(System.in);
			System.out.println("가위:1 바위:2 보:3 을 입력해보세요.");
			GameRPSValidation valid = new GameRPSValidation();
			try{
				int player = scanner.nextInt();
				int a = 1;
				int b = 3;
				if(player<1||player>3){
					System.out.println(valid.showRange(a,b));
					continue;
				} 
				String playerRPS = vo.setRpsValue(player);
				System.out.println("당신은 "+playerRPS+"를 냈습니다.");
				int computer = (int)((Math.random()*3)+1);
				String computerRPS = vo.setRpsValue(computer);
				
				GameRpsService service = new GameRpsService();
				System.out.println("컴퓨터는" + computerRPS +"이고,"
						+ "결과는 "+service.playGame(player,computer)+"입니다.");
			}catch(Exception ex){
				ex.printStackTrace();
				continue;
			}
		}
		
	}
}
*/