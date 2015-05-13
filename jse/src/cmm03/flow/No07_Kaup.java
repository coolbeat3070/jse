package cmm03.flow;

import java.util.Scanner;

public class No07_Kaup {
	double height;
	double weight;
	int idx;
	Scanner scanner = new Scanner(System.in);
	
	No07_Kaup() {
		
		this(0,0);
	}
	
	
	No07_Kaup(double i, double j) {
		setHeight(i);
		//this.height = i;
		setWeight(j);
		//this.weight = j;
		this.idx = (int) ((weight/(height*height))*10000);
	}
	

    public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		System.out.println("Ű�� �Է��ϼ��� : ");
		this.height = scanner.nextDouble();
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		System.out.println("�����Ը� �Է��ϼ��� : ");
		this.weight = scanner.nextDouble();
	}
	String getMsg(){
		String msg = "";
		if(idx>30){ msg = "��";}
		else if(idx>24){ msg = "��ü��";}
		else if(idx>20){ msg = "����";}
		else if(idx>15){ msg = "��ü��";}
		else if(idx>13){ msg = "����";}
		else if(idx>10){ msg = "�������";}
		else { msg = "�Ҹ���";}
		return msg;
	}
	@Override
	public String toString() {
		return "ī�������� [Ű=" + height + " cm , ������=" + weight + " kg, ī��������="
				+ getMsg() + "]";
	}
	
	public static void main(String[] args) {
		//double i = 0 , j = 0;
		//No07_Kaup kaup = new No07_Kaup();
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Ű�� �Է��ϼ���");
		//double height = scanner.nextDouble();
		//System.out.println("�����Ը� �Է��ϼ���");
		//double weight = scanner.nextDouble();
		No07_Kaup kaup = new No07_Kaup();
		System.out.printf(kaup.toString());
		System.out.println("�Ϸ�");
	}
	
	
	
	
	
	
}
