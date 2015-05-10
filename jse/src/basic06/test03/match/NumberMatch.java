package basic06.test03.match;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberMatch {
	public static void main(String[] args) {
		NumberMatchVO mg = new NumberMatchVO();
		System.out.println("총 3회만 입력가능합니다.");
		for(int i=0;i<3;i++){
			System.out.println("◁ 1부터 5까지 정수 입력하세요▷");
			Scanner sc = new Scanner(System.in);
			int result = 0;

			try {
				
				int input = sc.nextInt();
				mg.setPlayer(input);
			} catch (InputMismatchException e) {
				System.out.println("문자는 안됩니다.");
			}
			if(mg.getPlayer()==0){
				System.out.println("다시 입력해 주십시오.");
			}else{
				mg.setCom();
				result = mg.game(mg.getCom(), mg.getPlayer());
			}
			if(result==1){
				System.out.println("맞췄습니다. "
						+ "\n게임을 종료합니다.");
				break;
			}else if(i==2){
				System.out.println("3회 모두 참여했습니다. "
						+ "\n게임에서 패배했습니다."
						+ "\n게임을 종료합니다.");
				break;
			}
		}
		
	}
	
}
