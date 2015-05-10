package basic02.var;
/*
[자바 특수문자=Escape 반드시 "\글자" ]
	1) "\n"  라인개행
	2) "\t"  tab키
	3) "\b"  backspace키
	4) "\\"   \표시할때 
 * */
class No03_EscapeDemo {
	public static void main(String[] args) {
		
		
        System.out.print( "금수강산\t" ) ;
		System.out.print( "좋은사람\t" ) ;
		System.out.print( "겨울왕국\t" ) ;
		System.out.println();
		System.out.print( "금수강산\t" ) ;
		System.out.print( "좋은사람\t" ) ;
		System.out.print( "겨울왕국\t" ) ;
		System.out.print( "\n" ) ;
		System.out.print( "금수강산\t" ) ;
		System.out.print( "좋은사람\t" ) ;
		System.out.print( "겨울왕국\t" ) ;
	}
}
