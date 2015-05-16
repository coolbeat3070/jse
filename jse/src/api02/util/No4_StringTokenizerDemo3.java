package api02.util;

import java.util.StringTokenizer;

public class No4_StringTokenizerDemo3 {
	public static void main(String[] args) {
		System.out.println("▶StringTokenizer Exercise");
		String date = "2015/08//15";
		StringTokenizer st = new StringTokenizer(date,"/");
		int index=0;
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println("sp["+index+"] : "+token);
			index++;
			
		}
	}
}
