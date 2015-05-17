package oop01.syntax;
/*
Date :
Author :
Desc : 메서드 선언 Syntax
 * */
/*
메소드 개요.
함수=method=메소드=function=procedure=처리 
1) 메소드는 리턴값이 있어야  하는데 없으면 void기술
2) 메소드는 함수이름다음에 괄호가 있어야 합니다 
3) 메소드는 필요한 경우 메소드이름(  매개인자 ) {  }
 * */
/*
메소드 Syntax.
- C언어의 함수와 동일.
- 데이터 처리 기능을 구현.
- 리턴값이 없는 메소드는 void 형을 지정함.
- 메소드가 받는 인수와 데이터 타입은 메소드를 호출하는 쪽과 일치해야함.
- Method Overloading(중복정의), Overriding(재정의) 기술로 확장.
- 메소드가 리턴하는 값과 리턴되는 값의 데이터 타입은 일치해야 함.
 * */
/*
메소드의 종류
- static함수=정적함수
- Non-static함수=일반함수
ex) public   void  star( ) { 코드기술  }  //
ex) public  static void  nemo( ) { 코드기술  }  //
ex) public  String  book( ) { ~~ return "융프라우" ; } 
ex) public  int  price( ) { ~~ return 2300 ; }  
ex) public  void  note( ) { System.out.println( ) ;   }
 * */
/*오버로딩의 예시
- 메소드중복=OverLoading 매개인자갯수나 타입만 다름
- 메소드이름동일,  괄호안의 매개인자갯수나 타입만 다름
ex) public  void  bank(  ) {  System.out.println("bank( ) 20억있당") ;   }
ex) public  void  bank( String name ) {   }
ex) public  void  bank( String name, double rate ) {   }
ex) public  void  bank( String name, int count,  double rate ) {   }
 * */
public class No04_MethodSyntax {
	/* 예제 1. Average-A*/
	/* 예제 2. Average-B*/
}
