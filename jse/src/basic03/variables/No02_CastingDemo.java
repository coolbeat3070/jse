package basic03.variables;

class No02_CastingDemo {
	public static void main(String[] args) {
/*
Up-Casting  
	= 변환(conversion) .
	= promotion
	= 묵시적(Implicit) 자동변환(conversion)
	: 자바가 제공하는 자동변환으로 묵시적(implicit)인 동작.
	: 자동형 변환은 데이터타입의 표현범위가 작은쪽으로 
	:	많은쪽으로 변환이 될때만 가능하다.
byte -> short -> int -> long -> float -> double 
char -> int 
 * */
		byte b = 1;
		int i = 123;
		double d = 123.456;
		
		int upB = (int)b;
		double upB2 = (double)b;
		double upI = i;
		
		System.out.println("=====업캐스팅 테스트 출력=====");
		System.out.println(upB);
		System.out.println(upB2);
		System.out.println(upI);
		System.out.println();
		
/*
Down-Casting : 
	= 캐스팅(casting) .
    = 강제 형변환
    : 프로그램에서 명시적(explicit)으로 지정하는 타입변환.
	:	축소변환이 되는 경우는 반드시 명시적으로 캐스팅하여야 한다.
	 : 데이터의 손실이 발생할 수 있다.		
 * */		
		byte downD = (byte)d;
		int downD2 = (int)d;
		byte downI = (byte)i;
		
		System.out.println("=====다운캐스팅 테스트 출력=====");
		System.out.println("123.456에서 다운캐스팅으로 0.456이 손실된 결과값 "+downD+" 입니다.");
		System.out.println("123.456에서 다운캐스팅으로 0.456이 손실된 결과값 "+downD+" 입니다.");
		System.out.println("123에서 다운캐스팅 결과값 "+downI+" 입니다.");
		
/*
 boolean 타입의 변수는 어떤 다른 타입으로도 상호 변환될 수 없으며, 
 (명시적인) 캐스팅도 허용되지 않는다.
 */
	}
}
