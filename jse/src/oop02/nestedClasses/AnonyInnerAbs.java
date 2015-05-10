package oop02.nestedClasses;

public class AnonyInnerAbs {
	public AnonyInnerAbsClass inn = new AnonyInnerAbsClass(){  // 추상클래스

		@Override
		public void printData() {
			System.out.println("data :"+data);
			
		}
		
	};
}
