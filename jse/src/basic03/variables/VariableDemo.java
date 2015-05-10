package basic03.variables;
/*
변수의 작성 규칙
1. 알파벳 대소문자, 숫자, _ (underscore) , $ 만 사용가능
2. 첫 문자가 숫자이면 안됨
3. 키워드(예약어)와 같으면 안됨

 * */
public class VariableDemo {
	
	// 논리형, 1바이트, 초기값 : false
	boolean result = true;
	// 문자형, 2바이트, 초기값 = \u0000
	char capitalC = 'C';
	// 정수형
	byte b = 100;  // 8비트, -128 ~ 127
	short s = 10000;  // 16비트, 초기값 0
	int i = 100000;  // 32비트, 초기값 0
	long l = 100L;  // 64비트, 초기값 0
	// 부동 소수점 타입
	float f = 100.0f; // 32비튼
	double d = 100.00d; // 64비트
	
	/*
	  \b (backspace), 
	  \t (tab), 
	  \n (line feed), 
	  \f (form feed), 
	  \r (carriage return), 
	  \" (double quote), 
	  \' (single quote), and 
	  \\ (backslash).
	 * */
}
