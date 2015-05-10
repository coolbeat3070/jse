package basic06.arrays;
/*
 https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 * */
public class MultiDimArraysDemo {
	int[][] arr;
	public MultiDimArraysDemo( ) {
		arr = new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		
	}
	public void test1(){
		
		arr = new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		int n=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print((arr[i][j]=n+=100)+"  ");
			}
			System.out.println();
		}
	}
	public void test2(){
		String[][] product={{"분필","가격:200","재고:없음"},
				   {"자","가격:1000","재고:30개","위치:4번코너"}};
				  
				  for(int i=0; i<product.length; i++){
				   for(int j =0; j<product[i].length; j++){
				    System.out.println(product[i][j]);
				   }
				   System.out.println();
				  }
	}
	public static void main(String[] args) {
		MultiDimArraysDemo da = new MultiDimArraysDemo();
		// da.test1();
		da.test2();
	}
}
