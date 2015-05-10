package basic01.hello;
/*
자바 프로그램의 구조
	public : 접근 제한자
	class : 예약어 ... 현재 만들어지는 모듈 표시 cf) interface
	Hello : 클래스 이름... 대문자 표기
	static : 예약어 ... 객체를 생성하지 않고도 메모리 할당이 이루어져 사용할 수 있음
	void : 예약어 ... 처리결과를 리턴하지 않음
	main : JVM 에 의해서 최초 자동으로 호출되는 메소드. 반드시 한개만 존재
	String[] : 문자열을 저장하는 배열
	args : 배열명. 도스상에서 입력한 인수를 가져옴
 * */
class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, World !!");
	}
}


