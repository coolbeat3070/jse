package oop01.syntax;

public class AverageControllerB {
	// 멤버변수 선언
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	/*리턴값을 가져오지 않는 메소드 = 함수*/ 
	// void = 리턴값이 없음
	// 멤버메소드
	
	public void setName(String name){
		this.name = name; 
	}
	
	/*총점계산*/
	public void calculateTotal(){
		tot = kor + eng;
	}
	/*평균계산*/
	public void calculateAvg(){
		avg = tot/2.0f;
	}
	
	public static void main(String[] args) {
		/* a 객체 생성 및 메모리 할당*/
		AverageControllerB hulk = new AverageControllerB();
		AverageControllerB thor = new AverageControllerB();
		AverageControllerB iron = new AverageControllerB();
		
		hulk.setName("헐크");
		hulk.kor = 80;
		hulk.eng = 70;
		hulk.calculateTotal();
		hulk.calculateAvg();
		
		thor.setName("토르");
		thor.kor = 60;
		thor.eng = 79;
		thor.calculateTotal();
		thor.calculateAvg();
		
		iron.setName("아이언맨");
		iron.kor = 88;
		iron.eng = 90;
		iron.calculateTotal();
		iron.calculateAvg();
		
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
