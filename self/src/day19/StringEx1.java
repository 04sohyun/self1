package day19;

import java.io.UnsupportedEncodingException;

public class StringEx1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		//byte배열로 String객체 생성
		String str1 = new String(bytes);
		System.out.println(str1);//hello java
		
		String str2 = new String(bytes,6,4);
		System.out.println(str2);//java
		
		
		//String으로부터 byte배열 생성
		byte[] bytes2 = "홍길동".getBytes();
		
		System.out.println(bytes2.length);//6
		String str3 = new String(bytes2,"EUC-KR");
		System.out.println(str3);//홍길동
		
	}
	
	
}
