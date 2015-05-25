package oop06.nestedClasses;

public class InnerClassAnonyAbs2 {
	public InnerClassAnonyAbs inn = new InnerClassAnonyAbs(){  // 추상클래스

		@Override
		public void printData() {
			System.out.println("data :"+data);
			
		}
		
	};
}
