package puzzle.star;
/*
 ★   ★   ★   ★   ★  

    ★   ★   ★   ★  

       ★   ★   ★  

          ★   ★  

             ★    
 * */
public class StarDemo3 {
	public static void main(String[] args) {
		int a=0, b=0 ; 
		for(a=0 ; a<5 ; a++) { //가로=행
			  for(b=0; b<5; b++) { // 세로=열
				  if( b<a) { System.out.print("   "); } 
				  else { System.out.print(" ★  ") ;  }
			  } //b end
			  System.out.println("\n") ;
		  } //a end
	}
	
}
