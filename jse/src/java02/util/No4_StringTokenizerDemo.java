package java02.util;

import java.util.StringTokenizer;

public class No4_StringTokenizerDemo {
	StringTokenizer tok;
	public No4_StringTokenizerDemo(String str) {
		tok = new StringTokenizer(str);
	}
	public No4_StringTokenizerDemo(String str, String delim) {
		tok = new StringTokenizer(str, delim);
	}
	public No4_StringTokenizerDemo(String str, String delim, Boolean returnDelims) {
		tok = new StringTokenizer(str, delim, returnDelims);
	}
	public void print(){
		System.out.println("Token count : "+ tok.countTokens());
		while(tok.hasMoreTokens()){
			String token = tok.nextToken();
			System.out.println(token);
		}
		System.out.println("----------------------------");
	}
	public static void main(String[] args) {
		No4_StringTokenizerDemo stex = new No4_StringTokenizerDemo("Happy Day");
		stex.print();
	}
}
