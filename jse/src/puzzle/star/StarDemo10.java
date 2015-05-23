package puzzle.star;

public class StarDemo10 {
	public static void main(String[] args) {
		int input = 10;
	    int num = 97;
	     
	    for (int i=1; i<input; ++i) {
	        if (i<6) {
	            for (int j=0; j<5-i; ++j) {
	                System.out.print(" ");
	            }
	            for (int j=0; j<i; ++j) {
	                System.out.print((char)num);
	                num++;
	            }
	            for (int j=0; j<i; ++j) {
	                num--;
	                System.out.print((char)num);
	                 
	            }
	        }
	         
	        else {
	            for (int j=0; j<i-5; ++j) {
	                System.out.print(" ");
	            }
	            for (int j=0; j<10-i; ++j) {
	                System.out.print((char)num);
	                num++;
	            }
	            for (int j=0; j<10-i; ++j) {
	                num--;
	                System.out.print((char)num);
	            }
	        }   
	        System.out.println();
	    }
	}
}
