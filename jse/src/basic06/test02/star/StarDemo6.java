package basic06.test02.star;
/*
             ★  
          ★   ★  
       ★   ★   ★  
    ★   ★   ★   ★  
 ★   ★   ★   ★   ★  

 * */
public class StarDemo6 {
	public static void main(String[] args) {
		for (int j=1; j<=5; j++) {
	        for (int i=4; i>=j; i--) {
	            System.out.print("   "); // space 3
	        }
	  
	        for (int i=1; i<=j; i++) {
	            System.out.print(" ★  ");
	        }
	        System.out.println();
	    }
	}
	 
}
