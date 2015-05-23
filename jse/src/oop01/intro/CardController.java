package oop01.intro;

public class CardController {
	public static void main(String[] args) {
		/*
		 클변은 객체 생성 없이 "클래스名.클변" 으로 직접 사용 가능
		 * */  
		System.out.println("카드 높이 : " + CardVO.height);
		System.out.println("카드 너비 : " + CardVO.width);
		
		CardVO myCard = new CardVO();
		myCard.kind = "Heart";
		myCard.number = 7;
		
		CardVO comCard = new CardVO();
		comCard.kind = "Spade";
		comCard.number = 4;
		
		/* Spade - Diamond - Heart - Clover 순서로 이김*/
		System.out.println("컴퓨터가" + comCard.kind 
				+ comCard.number +"로 이겼습니다." ); 
		
	}
}
