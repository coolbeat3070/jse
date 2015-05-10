package basic03.op;

class No04_2HangDemo {
	public static void main(String[] args) {
		int result = 5 + 5;
        System.out.println("5 + 5 = " + result);
        
        int value = result;
        result = value - 5;
        System.out.println(value + " - 5 = " + result);
        
        value = result;
        result = value * 5;
        System.out.println(value + " * 5 = " + result);
        
        value = result;
        result = value / 5;
        System.out.println(value + " / 5 = " + result);
        
        value = result;
        result = value + 5;
        System.out.println(value + " + 5 = " + result);
        
        value = result;
        result = value % 3;
        System.out.println(value + " % 3 = " + result);
	}
}
