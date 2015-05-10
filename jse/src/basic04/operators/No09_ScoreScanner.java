package basic04.operators;

import java.util.Scanner;

public class No09_ScoreScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 ? ");
		int kor=0,eng=0;
		kor=sc.nextInt();
		System.out.println("영어점수 ? ");
		eng=sc.nextInt();
		
		System.out.println("국어="+kor);
		System.out.println("영어="+eng);
		System.out.println("합계="+(kor+eng));
	}
}
