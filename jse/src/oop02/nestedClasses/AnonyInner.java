package oop02.nestedClasses;

public class AnonyInner {
	String data = "";
	public void test(){
		new AnonyTestInterface() {
			
			@Override
			public void printData() {
				System.out.println("data :"+data);
				
			}
		}.printData();;
	}
}
