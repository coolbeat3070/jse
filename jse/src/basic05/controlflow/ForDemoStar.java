package basic05.controlflow;

public class ForDemoStar {
	public static void main(String[] args) {
		ForDemoStar.nemo(); // static정적함수는 클래스이름.메소드( )
		ForDemoStar gg = new ForDemoStar(); // gg는 지역변수보다는 개체=객체
		gg.star();
	}// main end

	public void star() { // Non-static일반함수
		System.out.println("void star( )메소드");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ★  ");
			} // j end
			System.out.println();
		} // i end
	} // end

	public static void nemo() { // static=정적함수
		System.out.println("void  static nemo( )메소드");
		System.out.println("#   #   #   #");
		System.out.println("#   #   #   #");
		System.out.println("#   #   #   #");
	} // end
}
