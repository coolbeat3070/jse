package basic06.training03.match;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGolf {
	public static void main(String[] args) {
		NumberGolfVO mg2 = new NumberGolfVO();
		System.out.println("☆☆☆☆ 최단횟수로 맞추는 사람이 승리하는 게임입니다.");
		mg2.setCom();
		int compNum = mg2.getCom();
		System.out.println("딜러의 숫자는 정해졌습니다.");
	//	System.out.println(compNum);
		int counter = 0;
		while(true){
			System.out.println("▷▷▷▷  1부터 100까지 정수 입력하세요");
			Scanner sc = new Scanner(System.in);
			int result = 0;
			int playerNum = 0;
			
			try {
				
				playerNum = sc.nextInt();
				mg2.setPlayer(playerNum);
				playerNum = mg2.getPlayer();
				if(playerNum<1 || playerNum>100 ){
					System.out.println("1부터 100 까지 정수만 입력해야 합니다.");
					continue;
				}else{
					
				}
			} catch (InputMismatchException e) {
				System.out.println("문자는 안됩니다.");
				continue;
			}
			if(playerNum==0){
				System.out.println("다시 입력해 주십시오.");
			}else{
				
				result = mg2.game(compNum, playerNum);
			}
			if(result==0){
				System.out.println("당신은 "+counter+" 회전 만에 맞췄습니다. "
						+ "\n게임을 종료합니다.");
				break;
			}else if(result==-1){
				System.out.println("플레이어값이 딜러값보다 작습니다.");
			}else if(result==1){
				System.out.println("플레이어값이 딜러값보다 큽니다.");
			}else{
				System.out.println("결정되지 않은 에러 발생입니다. !!!!!");
			}
			counter++;
			System.out.println(counter+"회전 중입니다.");
		}
	}
}
