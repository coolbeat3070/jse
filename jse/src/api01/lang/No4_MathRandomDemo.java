package api01.lang;

import java.util.Scanner;

public class No4_MathRandomDemo {
	public static void main(String[] args) {
		int  com = (int)(Math.random( )*100) +1;  //1~100사이 숫자
		int  my=0;
		System.out.println("컴난수=" + com );
		Scanner  sc = new  Scanner(System.in) ;
		int i=0 ;
		while( true) {
		   i++; 
		   System.out.print( i +"번째 숫자입력? " ) ;
		   my= sc.nextInt();
		   if(my==com) { System.out.println("빙고정답입니다"); break; }
		   if( i==5) break ;
		} //while end
	  } //main end
}
