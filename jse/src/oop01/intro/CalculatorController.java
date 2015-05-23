package oop01.intro;
/*

 
 * */
public class CalculatorController {
	public static void main(String[] args) {
		CalculatorVO vo = new CalculatorVO(10, 20);
		vo.sum();
		vo.avg();
		
		CalculatorVO vo1 = new CalculatorVO(1000, 2000);
		vo1.sum();
		vo1.avg();
	}
}
