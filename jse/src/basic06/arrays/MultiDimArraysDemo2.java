package basic06.arrays;

public class MultiDimArraysDemo2 {
	public static void main(String[] args) {
		int[][] fiveDblArr = new int[5][5];
		int k=0;
		for(int i=0; i<5;i++){
			for(int j=0;j<5;j++){
				k+=5;
				fiveDblArr[i][j]=k;
				System.out.printf("%5d",fiveDblArr[i][j]);
			}
			System.out.println("\n");
		}
	}
}
