package cmm04.array;

public class BreakWithLabelDemo {
	public static void main(String[] args) {

        int[][] arr = { 
            { 32, 87, 3, 589 },
            { 12, 1076, 2000, 8 },
            { 622, 127, 77, 955 }
        };
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

    search:
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length;
                 j++) {
                if (arr[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("검색대상인 " + searchfor + " 는 " + i + ", " + j + " 위치에 있습니다.");
        } else {
            System.out.println("검색대상인 " + searchfor + " 는 존재하지 않습니다.");
        }
    }
}
