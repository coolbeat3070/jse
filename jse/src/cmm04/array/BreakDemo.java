package cmm04.array;

public class BreakDemo {
	public static void main(String[] args) {

        int[] arr = 
            { 32, 87, 3, 589,
              12, 1076, 2000,
              8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == searchfor) {
                foundIt = true;
                break;  // 찾는 즉시 멈추고 for loop 을 빠져나온다
            }
        }

        if (foundIt) {
            System.out.println("검색 대상인 " + searchfor + "는" + i + " 인덱스에 위치합니다.");
        } else {
            System.out.println("검색 대상인 " + searchfor + " 는 배열에 없습니다.");
        }
    }
}
