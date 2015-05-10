package basic04.flow;

public class SwitchCaseDemo3 {
	public static void main(String[] args)  	{
		  int  kor=90 ,  eng=85 ,   sum=0 ;
	 	 double  avg =0.0 ; 
	 	 char  grade ='F' ; 

		 sum = kor + eng ;
		 avg=(double)sum/2; 	

		  switch( ( int )avg/10  ) {
		    case 10:   grade='A';  break  ;
		    case 9:    grade='A' ;  break  ;
		    case 8:    grade='B' ;  break  ;
		    case 7:    grade='C';  break  ;
		    case 6:    grade='D';  break  ;
		    default:   grade='F';  break  ;
		  } //switch END

		System.out.println("국어="+kor);
		System.out.println("영어="+eng);
		System.out.println("총점="+sum);
		System.out.println("평균="+avg);
		System.out.println("학점="+grade);
	    } //main end
}
