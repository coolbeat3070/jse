package basic07.training05.lotto;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class MultiLottosMain {
	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();

		System.out.println("▶▶▶로또 시작");
		MultiLottos lotto = new MultiLottos();
		System.out.println("얼마치를 구입합니까?");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int[][] arr = new int[lotto.getCount(money)][6];
		lotto.extractLottos(money);
		System.out.println("로또번호 출력");
		vc = lotto.getLottos();
		Iterator<String> it = vc.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
			it.remove();
		}
	}
}
