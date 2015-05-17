package oop01.syntax;

public class CalculatorVO {
	int left, right;
	
	public CalculatorVO(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum(){
		System.out.println(this.left + this.right);
	}
	
	public void avg(){
		System.out.println((this.left + this.right)/2);
	}
	
	
	
	
}
