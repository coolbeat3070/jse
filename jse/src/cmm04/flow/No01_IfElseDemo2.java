package cmm04.flow;

public class No01_IfElseDemo2 {
	public static void main(String[] args) {
		int  kor=90 ,  eng=85 ,   sum=0 ;
		double  avg =0.0 ; 
		String ret = "메세지"  ;

		sum = kor + eng ;
		avg=(double)sum/2; 
			
	               //평균에 따라 조건=if처리 
	               if( avg==100) { ret="100만점 보너스지급"; }
	               else if ( avg>=70)  {  ret="시험 합격입니다"; }
	               else  {  ret="재시험 보셔야 합니다"; } 

		System.out.println("국어="+kor);
		System.out.println("영어="+eng);
		System.out.println("총점="+sum);
		System.out.println("평균="+avg);
		System.out.println( ret);
	}
}
