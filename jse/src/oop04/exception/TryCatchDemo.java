package oop04.exception;

public class TryCatchDemo {
	public static void main(String[] args) {
		int a=5, b=0;
		int mok=0, nmg=0;
		
		try {
			mok=a/b;
			nmg=a%b;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		System.out.println(a+" / "+b+" = "+mok);
		System.out.println(a+" % "+b+" = "+nmg);
		System.out.println();
	}
}
