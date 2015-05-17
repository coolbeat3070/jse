package oop01.syntax;
/*
Date :
Desc : 메서드 선언 Syntax

함수=method=메소드=function=procedure=처리 
1) 메소드는 무조건 public 으로 시작
2) 메소드는 리턴값이 있어야  하는데 없으면 void기술
3) 메소드는 함수이름다음에 괄호가 있어야 합니다 
4) 메소드는 필요한 경우 메소드이름(  매개인자 ) {  }

ex) public   void  star( ) { 코드기술  }  //Non-static함수=일반함수
ex) public  static void  nemo( ) { 코드기술  }  //static함수=정적함수
ex) public  String  book( ) { ~~ return "융프라우" ; } 
ex) public  int  price( ) { ~~ return 2300 ; }  
ex) public  void  note( ) { System.out.println( ) ;   }  

////////메소드중복=OverLoading 매개인자갯수나 타입만 다름////////////
////////메소드이름동일,  괄호안의 매개인자갯수나 타입만 다름////////////
ex) public  void  bank(  ) {  System.out.println("bank( ) 20억있당") ;   }
ex) public  void  bank( String name ) {   }
ex) public  void  bank( String name, double rate ) {   }
ex) public  void  bank( String name, int count,  double rate ) {   }
 * */
public class MethodsDemo {
	public double calculateAnswer(double wingSpan, int numberOfEngines,
			double length, double grossTons) {
				return grossTons;
		// do the calculation here
	}
}
