package basic05.array;

public class ArrayDemo {
	public static void main(String[] args) {
        // declares an array of integers
		// int 타입 배열선언
        int[] anArray;

        // allocates memory for 10 integers
        // 10개의 int 타입 메모리 할당
        anArray = new int[10];
        
        // initialize first element
        // 첫번째 요소의 초기화
        anArray[0] = 100;
        // initialize second element
        // 두번째 요소의 초기화
        anArray[1] = 200;
        
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
    }
}
