package basic04.flow;
/*
정확한횟수를 모를때
   int b=0 ;
   while( true ) { 
      b++;  // 단항연산
      System.out.print ( b + "  " ) ; 
      if(b==10)break;  //꼭기술하세요 아니면 무한루프
   }
 * */
public class WhileDemo {
	public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
