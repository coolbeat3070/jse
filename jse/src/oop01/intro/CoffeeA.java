package oop01.intro;

/*비효율적 생산자 호출*/
class Coffee{
	public Coffee(){
		System.out.println("돈을 넣다");
	}
	public Coffee(int money){
		System.out.println(money + "원");
	}
	public Coffee(int money, boolean exist){
		System.out.println("구매 가능 여부 : " + (exist == true ? "커피종류선택" : "커피없음"));
	}
}

public class CoffeeA {
	public static void main(String[] args) {
		Coffee coffee1 = new Coffee();
		Coffee coffee2 = new Coffee(500);
		Coffee coffee3 = new Coffee(500,true);
		
	}
}
