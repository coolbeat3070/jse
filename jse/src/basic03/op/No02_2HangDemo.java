package basic03.op;
/*
[자바에서  연산자 종류 ]
산술   + - *  /  %
관계   >  <  ==  !=  >=  <=
논리   &&  ||   !
단항   ++  --
대입  +=   *=
 * */
public class No02_2HangDemo {
	public static void main(String[] args) {
		
		int x=20, y=7 ;
		int add=0, sub=0, gob=0, mok=0, nmg=0 ;  //구분할때는 콤마로 하세요 
		add = x + y ; 
		sub = x - y ; 
		gob = x * y ; 
		mok = x / y ; 
		nmg = x % y ; 

		System.out.println( " + 결과= " +  add   );
		System.out.println( " - 결과= " +  sub   );
		System.out.println( " * 결과= " +  gob   );
		System.out.println( " / 결과= " +  mok   );
		System.out.println( " % 결과= " +  nmg   );
	}
}
