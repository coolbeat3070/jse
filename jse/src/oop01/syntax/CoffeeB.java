package oop01.syntax;
/*효율적인 생산자 this() 활용*/
class Coffee2{
	public Coffee2(){
		System.out.println("돈을 넣었다.");
	}
	public Coffee2(int money){
		this();
		System.out.println(money + "원");
	}
	public Coffee2(int money, boolean exist){
		this(money);
		System.out.println("구매가능여부 :" + (exist == true ? "커피종류선택" : "커피없음"));
	}
}


public class CoffeeB {
	public static void main(String[] args) {
		Coffee2 coffee = new Coffee2(500,true);
	}
}
