package basic03.variables;
/*
[자바 특수문자=Escape 반드시 "\글자" ]
	1) "\n"  라인개행
	2) "\t"  tab키
	3) "\b"  backspace키
	4) "\\"   \표시할때 
 * */
public class EscapeDemo {
	public static void main(String[] args) {
		int  kor=90, eng=85 , sum=0 ;  
		sum=kor + eng ;  
	
		System.out.println(   ) ;//단순라인개행 
        		System.out.print( "금수강산\t" ) ;
		System.out.print( "좋은사람\t" ) ;
		System.out.print( "겨울왕국\t" ) ;
		
		System.out.println("\n성적처리"  ); 
		System.out.println("국어\t영어\t총점") ;
		System.out.println( kor +"\t" + eng +"\t" + sum ) ;
	}
}
