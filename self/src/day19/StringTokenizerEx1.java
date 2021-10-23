package day19;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		StringTokenizer st = new StringTokenizer(text,"/");
		
		System.out.println(st.countTokens());//3
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.print(token+", �����ִ� ��ū:");
			System.out.println(st.countTokens());
		}
	}
}
