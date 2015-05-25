package cmm05.array;

public class IntArrayDemo {
	public static void main(String[] args) {
        // declares an array of integers
		// int 타입 배열선언
        int[] intArr;

        // allocates memory for 10 integers
        // 10개의 int 타입 메모리 할당
        intArr = new int[10];
        
        // initialize first element
        // 첫번째 요소의 초기화
        intArr[0] = 100;
        // initialize second element
        // 두번째 요소의 초기화
        intArr[1] = 200;
        
        intArr[2] = 300;
        intArr[3] = 400;
        intArr[4] = 500;
        intArr[5] = 600;
        intArr[6] = 700;
        intArr[7] = 800;
        intArr[8] = 900;
        intArr[9] = 1000;

        System.out.println("Element at index 0: " + intArr[0]);
                           
        System.out.println("Element at index 1: " + intArr[1]);
                           
        System.out.println("Element at index 2: " + intArr[2]);
                           
        System.out.println("Element at index 3: " + intArr[3]);
                           
        System.out.println("Element at index 4: " + intArr[4]);
                           
        System.out.println("Element at index 5: "  + intArr[5]);
                          
        System.out.println("Element at index 6: "  + intArr[6]);
                          
        System.out.println("Element at index 7: "   + intArr[7]);
                         
        System.out.println("Element at index 8: "  + intArr[8]);
                          
        System.out.println("Element at index 9: " + intArr[9]);
                           
    }
}
