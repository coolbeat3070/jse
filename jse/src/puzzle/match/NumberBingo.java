package puzzle.match;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class NumberBingo {
	public static void main(String[] args) {
		 int com=0, my=0, count=0; 
		 com=(int)(Math.random()*99)+1;  //1~100
		 PrintStream  ps = System.out ;
		 InputStream  is=System.in ;
		 Scanner sc = new  Scanner( is )  ; //생성자=constructor
		 
		 while(true){
			 try{
					  count++;
					  System.out.print( count +"회 숫자 입력? ") ;
					  my = Integer.parseInt(sc.nextLine() ) ;  //키보드에서 직접입력
					  if(my>com){	 ps.println( my + " 보다 작은숫자입니다\n") ;  }
					  else if( my< com ) {  ps.println( my + " 보다 큰숫자입니다\n") ;  }
					  else if(my==com) { 
					   	System.out.println("\n빙고빙고 정답니다") ;
					  	System.out.println("정답의 난수= " + com ) ;
					  	break ; 
					  }
					  if(count==5) {
					  	System.out.println("게임의 총횟수는 5회입니다 ") ;
					  	System.out.println("정답의 난수= " + com ) ;
					  	break ; 
					  }
			 }catch(Exception ex) { 
				 System.out.println("1~100사이 숫자만 입력하세요" ) ;
				 count--; //단항연산에 count = count - 1; 
			}
		 }//while end
	} //end
}
