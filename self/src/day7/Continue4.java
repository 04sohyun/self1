package day7;

import java.util.Scanner;

public class Continue4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("������ �Է��Ͻÿ�.");
		
		for(int i=0;i<5;i++) {
			num = scanner.nextInt();
			if(num>0)	sum+=num;
			else continue;
		}
		System.out.println("������� ��:"+sum);
	}

}
