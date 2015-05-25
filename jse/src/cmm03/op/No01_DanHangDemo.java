package cmm03.op;
/*
단항 연산자
++i 를 전위연산자
i++ 를 후위연산자라고 함
 * */
public class No01_DanHangDemo {
	public static void main(String[] args) {
		int i = 5;
		i = i + 1;
		System.out.println("i = i + 1 의 결과값 : " + i);
		
		int j = 5;
		j++;
		System.out.println("j++ 의 결과값 : " + j);
		
		int k = 5;
		++k;
		System.out.println("++k 의 결과값 : " + k);
		
	}
}
