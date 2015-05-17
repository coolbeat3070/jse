package oop02.encapsule.question;
/*
객체지향언어의 4가지 특성
1. 은닉화(캡슐화) ◀ 이번 Chapter 학습
2. 상속
3. 추상화
4. 다형성
 * */

/* 
은닉화는 
속성과 기능을 객체내부에 포함시키는 것
다시 속성을 가지는 객체( *VO ) 와
기능을 가지는 객체 ( *Service ) 로 세분화 한다.
main() 을 가지는 부분은 따로 독립시켜 IO(input & output) 만 담당하게 한다. 
은닉화의 목적은 DB 에 저장되는 영구보전 되야할 정보 (멤변)을 
외부로부터 보호하고(private 선언)
오로지 메서드만으로 접근시키는 것이다.
또한, 접근 메서드도 getter(= read) 와 setter(= write) 로 구분하여
접근 권한에 따라 단지 읽기만 하는 권한(read only) 와
쓰고, 수정이 가능한 권한 (read & write) 로 나누는 역할도 할 수 있다.
*/
public class No01_Kaup {

}
