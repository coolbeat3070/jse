package api01.lang;

public class No5_StringReplaceDemo {
	public static void main(String[] args) {
		String str = " aaa  " ;
		String msg = null;
		System.out.println("테스트용 문장 : " + str);
		msg = str.replace("aa", "b");
		System.out.println("MSG 에서 aa 를 b로 바꾸면 ? " + msg);
		msg = str.toUpperCase();
		System.out.println("MSG 에서 대문자로 바꾸면 ? " + msg);
		msg = str.trim();
		System.out.println("MSG 에서 공백을 모두 제거하면 ? " + msg);
		msg = String.valueOf(str.length());
		System.out.println("MSG 의 공백까지 포함된 칸수는 ? " + msg + "칸");
	}
	
	
	
}
