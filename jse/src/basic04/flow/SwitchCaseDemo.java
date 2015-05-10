package basic04.flow;

import java.util.Scanner;

/*
[자바에서 제어문 - if, switch ]
if문형식]
 * */
public class SwitchCaseDemo {
	public static void main(String[] args) {
		System.out.println("평균 점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int avg = scan.nextInt();
		String ret="" ;  //꼭 선언하세요 안하면 에러발생합니다.
	    if( avg>=70  )  {  ret="합격" ;  }

	    if( avg>=70  )  {  ret="합격" ; }
	    else {  ret ="재시험" ;   } 
	    

	  //  평균점수에 따라서 비교  학점구하기 
	    char  grade='F';   //꼭 선언하세요 안하면 에러발생합니다.

	    if( avg>=90  )  {  grade='A' ;  }
	    else if ( avg>=80 ) { grade='B' ;  }
	    else if ( avg>=70 ) { grade='C' ; }
	    else if ( avg>=60 ) { grade='D' ; }
	    else { grade='F' ; } 
		
	  switch(  (int)avg/10  ) {   //조건=int,char좋아해, double형에러발생
	    case 10:   grade='A' ;  break  ;
	    case 9:    grade='A' ;  break  ;
	    case 8:    grade='B' ;  break  ;
	    case 7:    grade='C';  break  ;
	    case 6:    grade='D';  break  ;
	    default:   grade='F' ;  break  ;
	  }//switch End
	  
	  System.out.println("귀하는 "+ret+" 이며," + "학점은 "+grade+" 입니다.");
	}
}
