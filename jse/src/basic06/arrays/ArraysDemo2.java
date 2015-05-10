package basic06.arrays;

public class ArraysDemo2 {
	public static void main(String[] args) {
		int[] arr ; // 선언
		arr = new int[4]; // 생성
		arr[0] = 4; // 할당
		arr[1] = 5; // 할당
		arr[2] = 6; // 할당
		arr[3] = 7; // 할당
		// arr = new int[]{4,5,6,7}; // 생성 + 할당
		// int[] arr = {4,5,6,7};    // 선언 + 생성 + 할당
		System.out.println("====  for loop 출력 ===");
		for( int i=0; i<arr.length; i++){
		     System.out.print("\t"+arr[i]);
		}
		System.out.println();
		System.out.println("==== 향상된 for loop 출력 ===");
		for(int i : arr){
			System.out.print("\t"+i);
		}
	}
}
