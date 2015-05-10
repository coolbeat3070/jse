package basic04.flow;

import java.util.Scanner;

public class ForDemoGugudanSimple {
	 public static void main(String[] args) {
	        int dan = 1 ;
	       Scanner  sc =  new  Scanner( System.in ) ; // 상단에 임포트 시키세요
	       System.out.print("단 입력?  ") ;
	           try{
		  dan = sc.nextInt() ; //숫자대신 문자 입력하면 에러 발생해요
	                //dan=Integer.parseInt(sc.nextLine( ));
		    for( int i=1 ; i<10 ; i++) {
	                System.out.println( dan + "*" + i + "=" + (dan*i)) ; 
	             }
	           }catch(Exception ex) {  }
	   }//main함수 끝
}
