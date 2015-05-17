package cmm04.array;

public class Juso {
	public void arrayTest(){
		String[] juso = {"시청","서울","잠실"};
		int[] arr = new int[3];
		arr[0] = 23;
		arr[1] = 35;
		arr[2] = 17;
		
		for(int i=0;i<juso.length;i++){
			System.out.print(juso[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.println("arr["+i+"] = "+arr[i]+"");
		}
	}
	public static void main(String[] args) {
		Juso j = new Juso();
		j.arrayTest();
	}
}
