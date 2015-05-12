package basic05.array;

public class ForLoopArraysDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum=0;
		//sum = arr[0] + arr[1] + arr[2]; 
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		
		System.out.println("매개변수 1개의 합계 : "+sum);
	}
	
}
