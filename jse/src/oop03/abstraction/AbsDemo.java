package oop03.abstraction;

/*
Date :
Author :
Desc : 추상 클래스(abstract class) 
 * */
/*
Class 와 Method 에 사용
- 추상 클래스를 상속하는 클래스는 반드시 추상 메소드를 Overriding(rngus)으로 사용
- 클래스는 1개 이상의 추상 메소드를 가지고 있으면 자동으로 추상 클래스가 됨
- 추상 클래스는 클래스 객체를 만들수 없음
- 추상메소드가 잇는 추상 클래스를 상속받은 클래스는 반드시 추상 메소드를
	구현해야 객체를 생성할 수 있다.
- 추상 클래스는 객체를 생성할 수 없음으로 
	"추상 클래스 객체 = (추상클래스) 콘크리트 클래스" 와 같은 방법과 같이
	기능이 다 구현된 클래스 객체를 만들어 추상 클래스 객체를 넘겨 주어야 
	사용할 수 있다.
	예) Truck truck = new Truck(); <- Truck 은 Concrete Class
	Car absCar = (Car)truck; <- Car 는 Abstract Class
- 추상 클래스를 구현한 클래스는 추상 클래스 타입으로 포함된다.
- 인터페이스는 추상 메소드만 존재하나 추상클래스는 추상메소드와 
	일반멤버 메소드가 같이 공존한다.
 * */
public abstract class AbsDemo {
	public static void main(String[] args) {
		Sum01 sum01 = new Sum01();
		System.out.println(sum01.sum(10, 20));
		System.out.println(sum01.toString());
		
		Sum02 sum02 = new Sum02();
		System.out.println(sum02.sum(10, 20));
		System.out.println(sum02.toString());
	}
}
abstract class AbsSum{
	//필수적으로 강제성이 있는 메소드
		public abstract String toString();
		
		public String sum(int i, int k){
			int sum = i + k;
			return ""+sum;  // int 리턴을 String 반환 값 주는 방법---문제화
	}
}

class Sum01 extends AbsSum{
	@Override
	public String toString() {
		return "class Sum01 extends AbsSum";
	}
}
class Sum02 extends AbsSum{
	@Override
	public String toString() {
		return "class Sum02 extends AbsSum";
	}
}
