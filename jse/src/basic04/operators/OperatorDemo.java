package basic04.operators;
/*
[자바에서  연산자 종류 ]
산술   + - *  /  %
관계   >  <  ==  !=  >=  <=
논리   &&  ||   !
단항   ++  --
대입  +=   *=
 * */
public class OperatorDemo {
	public static void main(String[] args) {
		 int a=4, b=4 ;
		  int sum1=0, sum2=0 ; 
		  a++;  //단항연산  주석처리하세요
		  b++;  //단항연산  주석처리하세요
		  sum1 = (a++) + 3 ;  
		  sum2 = (++b) + 3 ;  
		  System.out.println( "a=" + a +"\t sum1=" + sum1 );
		  System.out.println( "b=" + b +"\t sum2=" + sum2 );

		int x=20, y=7 ;
		int add=0, sub=0, gob=0, mok=0, div=0 ;  //구분할때는 콤마로 하세요 
		add = a+b ; 
		sub = a-b ; 
		gob = a*b ; 
		mok = a/b ; 
		div = a%b ; 

		boolean  tr =  x>y ;
		boolean  fr=  x != y ;
		System.out.println( "결과=" +  tr   );
		System.out.println( "결과=" +  fr   );
	}
}
