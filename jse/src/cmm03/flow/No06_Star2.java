package cmm03.flow;
/*
 
�ڡڡڡڡ�
�ڡڡڡ�
�ڡڡ�
�ڡ�
��

 * */
public class No06_Star2 {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j < (6-i); j++) {
				System.out.print("��");
			}
			System.out.println("");
		}
		for(int x = 0; x < 5; x++){
			for(int y=5; y>x; y--){
				System.out.print("��");
			}
			System.out.println();
		}
	}
}
