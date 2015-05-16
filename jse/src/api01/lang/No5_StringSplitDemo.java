package api01.lang;

import java.lang.String;
import java.lang.System;

public class No5_StringSplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(",");
		for(int i=0;i<fruits.length;i++){
			System.out.print("\t"+fruits[i]);
		}
	}
}
