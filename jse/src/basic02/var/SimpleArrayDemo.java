package basic02.var;
/*
[자바에서 배열 Syntax]
1. 무조건 같은 type이어야 합니다.  type[ ] 배열 = new  type[갯수]
2. 배열 크기가 있어야 합니다.
3. 배열 길이는 필드  length
4. 배열 new연산자로 생성하고 메모리영역 heap에 할당 
5. 배열 출력 for반복문으로 합니다.


 * */
public class SimpleArrayDemo {
	public static void main(String[] args) {
		 String[ ] juso = new String[3] ;
		 juso[0]="서울";    juso[1]="종로";     juso[2]="광화문"; 
		 double[ ] dd = new double[5] ;
		 int[ ] su = {  23,  56,  98  };
	}
	
}
