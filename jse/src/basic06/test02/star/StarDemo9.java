package basic06.test02.star;
/*
                ★
            ★    ★
        ★            ★
    ★                    ★
★★★★★★★★★
 
 * */
public class StarDemo9 {
	public static void main(String[] args) {
		  for (int j=1; j<=5; j++) {
		        for (int i=4; i>=j; i--) {
		            System.out.print("    ");
		        }
		         
		        if(j<5) {
		            for (int i=1; i<=(j*2)-1; i++) {
		                if(i==1 || i==(j*2)-1)
		                    System.out.print("★");
		                else
		                    System.out.print("    ");
		            }
		        } else {
		            for (int i=1; i<=(j*2)-1; i++) {
		                System.out.print("★");
		            }
		        }
		        System.out.println();
		    }
	}
}
