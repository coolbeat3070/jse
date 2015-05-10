package basic06.test02.star;
/*
                ★
            ★★★
        ★★★★★
    ★★★★★★★
★★★★★★★★★
    ★★★★★★★
        ★★★★★
            ★★★
                ★
 * */
public class StarDemo8 {
	public static void main(String[] args) {
		 for (int j=1; j<=5; j++) {
		        for (int i=1; i<=5-j; i++) {
		            System.out.print("    "); // space 4
		        }
		        for (int i=1; i<=(j*2)-1; i++) {
		            System.out.print("★");
		        }
		        System.out.println();
		    }
		  
		    for (int j=4; j>=1; j--) {
		        for (int i=0; i<=4 - j; i++) {
		            System.out.print("    ");
		        }
		        for (int i=1; i<=(j*2)-1; i++) {
		            System.out.print("★");
		        }
		        System.out.println();
		    }
		}
	
}
