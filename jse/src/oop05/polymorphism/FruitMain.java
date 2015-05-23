package oop05.polymorphism;

public class FruitMain {
	public static void main(String[] args) {
		// 인터페이스는 객체를 만들 수 없다.
		// 즉 FruitInterface fi = new FruitInterface(); 에러발생
		FruitInterface apple = new AppleImpl();
		//이런식으로 타입을 선언하여 사용한다.
		FruitInterface orange; // FruitInterface 타입의 참조변수 사용
		orange = new OrangImpl(); 
			// 클래스 OrangeImpl 의 객체를 생성하여 orange 에 할당
		FruitInterface banana = new BananaImpl();
		apple.display("맛있는 ");
		orange.display("오래된 ");
		banana.display("비싼 ");
	//	orange.getCount(); 인터페이스에 선언된 메소드만 호출가능
		
	}
}
