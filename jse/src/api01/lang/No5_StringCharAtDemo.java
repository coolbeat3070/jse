package api01.lang;

import java.lang.String;
import java.lang.System;

/*
 * java.lang.String
 * charAt()
 * 
 * */
public class No5_StringCharAtDemo {
	public static void main(String[] args) {
		String ssn = "850719-2566789";
		char isMan = ssn.charAt(ssn.indexOf("-")+1); 
		switch (isMan) {
			case '1' : System.out.println("남성");break;
			case '2' : System.out.println("여성");break;
			default : System.out.println("잘못된 값");break;
		}
		String birthday = ssn.substring(0,ssn.indexOf(ssn.charAt(ssn.indexOf("-"))));
		System.out.println(ssn.charAt(ssn.indexOf("-")-1));
		System.out.println("생년월일 : "+birthday);
	}
}
