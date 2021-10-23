package day19;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(text,"/");
		
		System.out.println(st.countTokens());//3
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.print(token+", 남아있는 토큰:");
			System.out.println(st.countTokens());
		}
	}
}
