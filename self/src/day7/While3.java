package day7;

import java.io.IOException;

public class While3 {
	public static void main(String[] args) {
		System.out.println("2~9������ ���ڸ� �Է��Ͻÿ�.");
		
		try {
			int num = System.in.read()-'0';
			System.out.println("������ "+num+"��");
			if(num>=2 && num<=9) {
				int i =1;
				while(i<=9) {
					System.out.println(num+"*"+i+"="+(num*i));
					i++;
				}
			}else System.out.println("2~9������ ���ڸ� �Է��Ͻÿ�.");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�����߻�");
		}
	}

}
