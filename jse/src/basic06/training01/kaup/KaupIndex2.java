package basic06.training01.kaup;

import java.util.Scanner;

/**
 *@Story  
 *열혈강의 
 *카우프지수를 통해 키가 1.8F
 *몸무게가 77F인 사람의 비만지수 구하기
 */
public class KaupIndex2 {
	double height;
	double weight;
	int idx;
	String message;
	
	
	
	public KaupIndex2() {
		super();
	}

	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setMessage(double height, double weight){
		setHeight(height);
		setWeight(weight);
		idx = (int)((weight/(height*height))*10000);
		if(idx > 30){ message = "비만";}
		else if(idx > 24){message = "과체중";}
		else if(idx > 20){message = "정상";}
		else if(idx > 15){message = "저체중";}
		else if(idx > 13){message = "마름";}
		else if(idx > 10){message = "영양실조";}
		else {message = "소모증";}
		
	}
	public String getMessage(){
		return message;
	}
	
	
	@Override
	public String toString() {
		return "카우푸 지수 [키=" + getHeight() +"cm"+ ", 몸무게=" + getWeight()+"kg" + ", 결과값="
				+ getMessage() + "]";
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력해 주세요");
		double height = scan.nextDouble();
		System.out.println("몸무게를 입력해 주세요");
		double weight = scan.nextDouble();
		KaupIndex2 ki = new KaupIndex2();
		ki.setMessage(height, weight);
		System.out.println(ki.toString());
		System.out.println("완료");
	}
	
	
	
}
