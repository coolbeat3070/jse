package oop01.intro;
/*
Date :
Author :
Desc : (멤버)메소드를 사용하지 않는 경우 예문(Demo)
 * */
public class AverageControllerA {
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	public static void main(String[] args) {
		/* a 객체 생성 및 메모리 할당*/
		AverageControllerA hulk = new AverageControllerA();
		AverageControllerA thor = new AverageControllerA();
		AverageControllerA iron = new AverageControllerA();
		
		// 이름 저장
		hulk.name = "헐크";
		thor.name = "토르";
		iron.name = "아이언";
		
		// 점수 저장
		hulk.kor = 100;
		hulk.eng = 90;
		thor.kor = 100;
		thor.eng = 90;
		iron.kor = 100;
		iron.eng = 90;
		
		// 총점, 평균 계산
		hulk.tot = hulk.kor + hulk.eng;
		hulk.avg = hulk.tot/2;
		thor.tot = thor.kor + thor.eng;
		thor.avg = thor.tot/2;
		iron.tot = iron.kor + iron.eng;
		iron.avg = iron.tot/2;
		
		System.out.println("==="+hulk.name+"의 성적표===");
		System.out.println("국어 : " + hulk.kor+" 점");
		System.out.println("영어 : " + hulk.eng+" 점");
		System.out.println("총점 :" + hulk.tot+" 점" );
		System.out.println("평균 :" + hulk.avg+" 점" );
		System.out.println();
		
		System.out.println("==="+thor.name+"의 성적표===");
		System.out.println("국어 : " + thor.kor+" 점");
		System.out.println("영어 : " + thor.eng+" 점");
		System.out.println("총점 :" + thor.tot+" 점" );
		System.out.println("평균 :" + thor.avg+" 점" );
		System.out.println();
		
		System.out.println("==="+iron.name+"의 성적표===");
		System.out.println("국어 : " + iron.kor+" 점");
		System.out.println("영어 : " + iron.eng+" 점");
		System.out.println("총점 :" + iron.tot+" 점" );
		System.out.println("평균 :" + iron.avg+" 점" );
		System.out.println();
		
	}
}
