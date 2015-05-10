package basic06.test02.star;
/*
★  

★  ★  

★  ★  ★  

★  ★  ★  ★  

★  ★  ★  ★  ★   
 * */
public class StarDemo1 {
	public static void main(String[] args) {
		 int a=0, b=0 ; 
		  for(a=0 ; a<5 ; a++) { //가로=행
			  for(b=0; b<=a; b++) { // 세로=열
				System.out.print("★  ") ; 
			  } //b end
			  System.out.println("\n") ;
		  } //a end
	}
}
