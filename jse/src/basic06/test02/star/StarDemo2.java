package basic06.test02.star;
/*
#  #  #  #  #  

#  #  #  #  

#  #  #  

#  #  

#  
 * */
public class StarDemo2 {
	public static void main(String[] args) {
		
		 for(int i=0 ; i<5 ; i++) {
			  for(int j=5; j>i; j--) { 
				  System.out.print("#  ") ; 
			  } //j end
			  System.out.println("\n") ;
		  } //i end
	}
	
}
