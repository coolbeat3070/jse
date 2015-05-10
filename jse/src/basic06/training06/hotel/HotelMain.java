package basic06.training06.hotel;

public class HotelMain {
	public static void main(String[] args) {
		HotelService ht = new HotelService();
		// ht.roomReset(); //초기화
		ht.process(); // 호텔시스템 선택메뉴 메소드 호출
	}
}
