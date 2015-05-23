package oop03.inheritance;
/*
상속(inheritance)의 개념
- 코드를 상속, 자원, 재산 상속
- 기존의 구현 로직을 변경하는 것이 아니라 새로운  기능을 
	추가한 클래스를 	추가하는 것
- 상속은 한번에 하나의 클래스에서만 가능, C++ 은 다중 상속 가능
- 형식 : 자식 Class(sub Class)extends 
		부모 Class (parent Class, super Class) 
		public class Child extends Parent{}
- 자식 클래스 객체를 생성시 부모 클래스 객체의 생성자가 먼저 호출된다.
- Default Constructor (기본 생성자) 에 주의
- 상속의 경우 속성을 상속하는 경우 보다는 메소드를 상속하기 위해 
	많이 사용되며, 부모 클래스의 기능을 확장하는데 부모클래스를 
	수정하지 않고, 부모에 구현된 로직을 사용하면서 안정적으로 클래스의
	기능을 확장 할 수 있는 기볍에 해당이 됩니다.
- 상속을 계속적으로 하게 될 경우 가장 아래의 클래스는 부모로부터 
	많은 메소드를 상속받음으로 매우 많은 기능을 사용할 수 있게 된다.

 * */

/*
 자바에서 클래스 상속 extends
자바에서 인터페이스 상속  implements

public class  Father {
    private  int pwd; //필드=field 
    public Father(  ) {   } //기본생성자
    public void bank( ) {  } //Non-static일반함수 
}//Father class END

class Son extends  Father{ 
   public void game( ) {    
        bank( ); //함수호출이 가능해요
   }//end
}//Son class END

interface  Mother {
  //추상메소드로만 구성 abstract키워드는 생략가능
   public int   card( ) ;
   public void house( ) ;
}//interface END 
 * */
public class No01_InheritanceSyntax {

}
