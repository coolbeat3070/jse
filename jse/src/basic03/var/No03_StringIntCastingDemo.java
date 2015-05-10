package basic03.var;

class No03_StringIntCastingDemo {
	
	public static void main(String[] args) {
		int i = 300;
		String str = "300";
		
		// String -> int
		
		int temp = Integer.valueOf(str);
		System.out.println("Integer.valueOf() 사용 :"+temp);
		int temp2 = Integer.parseInt(str);
		System.out.println("Integer.parseInt() 사용 :"+temp2);
		
		// int -> String
		
		String temp3 = Integer.toString(i);
		System.out.println("Integer.toString() 사용 :"+temp3);
		String temp4 = String.valueOf(i);
		System.out.println("String.valueOf() 사용 :"+temp4);
		
		
		
	}
	
}
