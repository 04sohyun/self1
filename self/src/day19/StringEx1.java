package day19;

import java.io.UnsupportedEncodingException;

public class StringEx1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		//byte�迭�� String��ü ����
		String str1 = new String(bytes);
		System.out.println(str1);//hello java
		
		String str2 = new String(bytes,6,4);
		System.out.println(str2);//java
		
		
		//String���κ��� byte�迭 ����
		byte[] bytes2 = "ȫ�浿".getBytes();
		
		System.out.println(bytes2.length);//6
		String str3 = new String(bytes2,"EUC-KR");
		System.out.println(str3);//ȫ�浿
		
	}
	
	
}
