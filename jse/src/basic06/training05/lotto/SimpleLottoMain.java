package basic06.training05.lotto;

import java.util.Scanner;

public class SimpleLottoMain {
	public static void main(String[] args) {
		System.out.println("▶▶▶로또 시작");
		SimpleLotto lotto = new SimpleLotto();
		// lotto.setLottoMoney(5000);
		// lotto.getLottoNums();
		System.out.println("얼마치를 구입합니까?");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		lotto.extractLottos(money);
		System.out.println("로또번호 출력");
		lotto.printLottos();
	}
}
