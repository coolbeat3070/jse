package basic03.op;

public class No08_ScoreAverage {
	
	public static void main(String[] args) {
		int  kor=90 ,  eng=85 ,   sum=0 ;
		double  avg =0.0 ; 

		sum = kor + eng ;
		avg=(double)sum/2;  

		System.out.println("국어="+kor);
		System.out.println("영어="+eng);
		System.out.println("총점="+sum);
		System.out.println("평균="+avg);
	}
}
