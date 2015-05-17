package oop02.encapsule.answer;

import java.util.Scanner;

public class KaupVO {
	double height;
    double weight;
    int idx;
    String msg;
    
    
    Scanner s = new Scanner(System.in);
    KaupVO(){
        this(0 , 0);
    }
    KaupVO(double height, double weight){
        this.height = height;
        this.weight = weight;
        this.idx = (int)((weight/(height*height))*10000);
    }
    
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = s.nextInt();
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = s.nextInt();
    }
   
    String getMsg(){
        String msg ="";
        if(idx>30){
            msg = "비만";
        }else if(idx>24){
            msg="과체중";
        }else if(idx>20){
            msg="정상";
        }else if(idx>15){
            msg="저체중";
        }else if(idx>13){
            msg="마름";
        }else if(idx>10){
            msg="영양실조";
        }else{
            msg="소모증";
        }
        return msg;
    }
    @Override
    public String toString() {
        return "카우프지수 [키=" + height+"cm" + ", 몸무게=" + weight+"kg"+",건강지수:"+getMsg()+ "]";
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("키를 입력해주세요");
        double height = s.nextDouble();
        System.out.println("몸무게를 입력해주세요");
        double weight = s.nextDouble();
        KaupVO k = new KaupVO(height, weight);
        
        System.out.println(k.toString());
        System.out.print("완료");
        
    }
}
